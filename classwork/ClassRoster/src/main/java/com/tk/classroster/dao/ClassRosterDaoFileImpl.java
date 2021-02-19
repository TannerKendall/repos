/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster.dao;

import com.tk.classroster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class ClassRosterDaoFileImpl implements ClassRosterDao {
    
    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";
    
    private Map<String, Student> students = new HashMap<>();

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterDaoException {
        loadRoster();
        Student newStudent = students.put(studentId, student);
        writeRoster();
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterDaoException {
       loadRoster();
       return new ArrayList(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterDaoException {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterDaoException {
        loadRoster();
        Student removedStudent = students.remove(studentId);
        writeRoster();
        return removedStudent;
    }
    
    private Student unmarshallStudent(String studentAsText) {
        // studentAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // 1234::Ada::LoveLace::Java-September1842
        //
        // We then split that line on our DELIMITER - which is ::
        // Leaving us with an array of String, stored in studentTokens.
        // Which should look like this:
        //
        // --------------------------------------
        // |    |   |        |                  |
        // |1234|Ada|Lovelace|Java-September1842|
        // |    |   |        |                  |
        // --------------------------------------
        //  [0]  [1]    [2]          [3]
        
        String[] studentTokens = studentAsText.split(DELIMITER);
        
        //Given the pattern above, the student Id is in index 0 of the array.
        
        String studentId = studentTokens[0];
        
        // Which we can the use to create a new Student object to satisfy
        // the requirements of the Student constructor.
        
        Student studentFromFile = new Student(studentId);
        
        // However there are 3 remaining tokens that need to be set into the
        // new student object. Do this manually by using the appropriate setters
        
        //Index 1
        studentFromFile.setFirstName(studentTokens[1]);
        //Index 2
        studentFromFile.setLastName(studentTokens[2]);
        //Index 3
        studentFromFile.setCohort(studentTokens[3]);
        
        // We have now created a student! Return it!
        return studentFromFile;
    }
    
    private void loadRoster() throws ClassRosterDaoException {
        Scanner scanner;
        
        try {
            // Create Scanner for reading the file
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterDaoException("-_- Could not load roster data into memory.", e);
        }
        
        // currentLine holds the most recent line read from the file.
        String currentLine;
        
        // currentStudent holds the most recent student unmarshalled.
        Student currentStudent;
        
        // Go through ROSTER_FILE line by line, decoding each line into a
        // Student object by calling the unmarshallStudent method.
        // Process while we have more lines in the file
        while(scanner.hasNextLine()) {
            // get the next line in the file
            currentLine = scanner.nextLine();
            // unmarshall the line into a student
            currentStudent = unmarshallStudent(currentLine);
            
            // We are going to use the student id as the map key key for our student object.
            // Put currentStudent into the map using student id as key.
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        // close scanner
        scanner.close();
    }
    
    private String marshallStudent(Student aStudent) {
        
        // We need to turn a Student object into a line of text for our file.
        // For example, we need an in memory object to end up like this:
        // 4321::Charles::Babbage::Java-September1842
        // It's not a complicated process. Just get out each property,
        // and concatenate with our DELIMITER as a kind of spacer. 
        
        // Start with the student id, since that's supposed to be first.
        String studentAsText = aStudent.getStudentId() + DELIMITER;
        
        // Add the rest of the properties in the correct order.
        
        // First name
        studentAsText += aStudent.getFirstName() + DELIMITER;
        
        // Last name
        studentAsText += aStudent.getLastName() + DELIMITER;
        
        // Cohort, SKIP DELIMITER HERE
        studentAsText += aStudent.getCohort();
        
        //We have now turned a student to text! Return it!
        return studentAsText;
    }
    
    /**
     * Writes all students in the roster out to a ROSTER_FILE. See loadRoster
     * for file format.
     * 
     * @throws ClassRosterDaoException if an error occurs writing to the file
     */
    private void writeRoster() throws ClassRosterDaoException {
        
        // Note for APPRENTICES: We are not handling the IOException - but 
        // We are translating it to an application specific exception and then
        // simple throwing it (i.e 'reporting it') to the code that called us.
        // It is responsibility of the calling code to handle any errors that occur.
        
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterDaoException("Could not save student data.", e);
        }
        
        // Write out the student objects to the roster file.
        // NOTE: We could just grab the student map, get the Collection of students
        // and itereate over them but we've already created a mehod that gets a List
        // of Students so we'll use it.
        
        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for (Student currentStudent : studentList) {
            // Turn a Student into a String
            studentAsText = marshallStudent(currentStudent);
            // Write the Student object to the file
            out.println(studentAsText);
            // Force Print Writer to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }
    
    
    
}
