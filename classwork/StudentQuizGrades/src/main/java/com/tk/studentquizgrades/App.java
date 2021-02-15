/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.studentquizgrades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author Tanner Kendall
 */
public class App {
    public static void main(String[] args) {
        
        UserIO inputReader = new UserIO();
        HashMap<String, ArrayList> students = new HashMap<>();
        ArrayList<Integer> quizScores = new ArrayList<>();
        
        int task = 0;
        boolean on = true;
        
        System.out.println("===================");
        System.out.println("STUDENT QUIZ GRADES");
        System.out.println("===================");
        
        do {
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("1: View a list of the students");
            System.out.println("2: Add a student");
            System.out.println("3: Remove a student");
            System.out.println("4: View scores for a student");
            System.out.println("5: View average quiz score for a student");
            System.out.println("6: Quit");
            task = inputReader.readInt("Enter Number:", 1, 6);
            
            switch (task) {
                case 1:
                    //view list of students
                    System.out.println("========");
                    System.out.println("STUDENTS");
                    System.out.println("========");
                    Set<String> studentList = students.keySet();
                    for(String currentStudent : studentList) {
                        System.out.println(currentStudent);
                        System.out.println(students.get(currentStudent));
                        System.out.println("==========");
                    }
                    break;

                case 2:
                    //add a student
                    String name = inputReader.readString("Please enter student name:");
                    quizScores.add(inputReader.readInt("Enter score for quiz 1: ", 0, 100));
                    quizScores.add(inputReader.readInt("Enter score for quiz 2: ", 0, 100));
                    quizScores.add(inputReader.readInt("Enter score for quiz 3: ", 0, 100));
                    students.put(name, quizScores);
                    quizScores = new ArrayList<>();
                    break;
                case 3:
                    //remove a student
                    students.remove(inputReader.readString("Please enter the name of the student you would like to remove:"));
                    break;
                case 4:
                    //view scores for student
                    System.out.println(students.get(inputReader.readString("Please enter the name of the student who's scores you would like to see.")));
                    break;
                case 5:
                    //view average quiz scores
                    int sum = 0;
                    String findAvg = inputReader.readString("Who's average quiz scores would you like to see?");
                    ArrayList<Integer> average = students.get(findAvg);
                    for (int currentScore : average) {
                        sum += currentScore; 
                    }
                    double avg = sum / 3;
                    System.out.println(findAvg + "'s average quiz score is " + avg);
                    average = new ArrayList<>();
                    break;
                case 6:
                    //quit
                    on = false;
                    break;
                
            }
            
            
            
        } while (on);
        
        
    }
}
