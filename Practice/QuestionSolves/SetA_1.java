package QuestionSolves;

// Student Course Manager

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class CourseList {
// A map to store course names and the list of students enrolled in them
	Map<String, HashSet<String>> courseToStudentsMap = new HashMap<>();

// Constructor to read data from the file and populate the courseToStudentsMa p
	public CourseList(String filePath) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)))) {
			String currentLine;

// Read each line from the file
			while ((currentLine = bufferedReader.readLine()) != null) {
// Split the line into course name and list of students
				String[] courseAndStudents = currentLine.split(" \t ");
				String courseName = courseAndStudents[0]; // Extract course name

// Get or create the HashSet for students enrolled in the course
				HashSet<String> studentSet = courseToStudentsMap.computeIfAbsent(courseName, k -> new HashSet<>());

// Add all the students from the current line to the set
				studentSet.addAll(Arrays.asList(courseAndStudents[1].split(" ,")));

			}
		} catch (IOException e) {
// Handle file read errors
			System.out.println(" Error reading file : " + e.getMessage());
			System.exit(-1);
		}

	}

// Method to print the list of students for a given course
	public void printStudents(String courseName) {
		var studentList = courseToStudentsMap.get(courseName); // Retrieve students for the course
		if (studentList == null) {
// Course not found in the map
			System.out.println(" No such course is listed . ");
		} else {
// Print the list of students
			System.out.println(" Students of course " + courseName + " : ");
			studentList.forEach(System.out::println);
		}

	}

// Method to print a summary of courses with the number of students enrolled
	public void printSummary() {
		courseToStudentsMap.forEach((course, students) -> System.out.println(course + " : " + students.size()));
	}

}

public class SetA_1 {
	public static void main(String[] args) {
// Initialize the CourseList with the path to the data file
		var courseList = new CourseList("/home/nilanjana/Java Programs/studentData.txt");

// Print a summary of all courses and their student count
		courseList.printSummary();

// Print the students of a specific course
		courseList.printStudents("CSE311");

	}

}




