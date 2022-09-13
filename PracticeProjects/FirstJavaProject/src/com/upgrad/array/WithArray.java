package com.upgrad.array;
import java.util.ArrayList;
import java.util.Objects;

// EXAMPLE ONE
//public class WithArray {
//    public static void main(String[] args) {
//        String studentList[] = {"Sujit", "Abhishek", "Siddharth", "Karanpreet"};
//        printStudentList(studentList);
//    }
//
//    public static void printStudentList(String[] student){
//        for(String s : student){
//            System.out.println(s);
//        }
//    }
//}

// EXAMPLE TWO
//public class WithArray {
//    public static void main(String[] args) {
//        Students studentsList[] = {
//                new Students("Abhishek", 1),
//                new Students("Sujit", 2),
//                new Students("Karanpreet", 3),
//                new Students("Somya", 4),
//        };
//
//        printStudents(studentsList);
//    }
//    public static void printStudents(Students[] students){
//        for(Students student : students){
//            System.out.println(student.getDetail());
//        }
//    }
//}
//
//class Students{
//    public String name;
//    public int rollNo;
//
//    public Students(String name, int rollNo){
//        this.name = name;
//        this.rollNo = rollNo;
//    }
//
//    public String getDetail(){
//        return "Name : " + this.name + "\n" + "Rollno : " + this.rollNo;
//    }
//}

// EXAMPLE THREE WITH ARRAYLIST
//public class WithArray {
//    public static void main(String[] args) {
//        ArrayList studentList = new ArrayList();
//
//        studentList.add(new Students("Abhishek", 1));
//        studentList.add(new Students("Somya", 2));
//        studentList.add(new Students("Sujit", 3));
//        studentList.add(new Students("Karanpreet", 4));
//        studentList.add("Hari");
//        printStudent(studentList);
//    }
//
//    public static void printStudent(ArrayList students){
//        for(Object o : students){
//            Students s = (Students) o; // Type cast with class name
//            System.out.println(s.getDetail());
//        }
//    }
//}
//
//class Students{
//    public String name;
//    public int rollNo;
//
//    public Students(String name, int rollNo){
//        this.name = name;
//        this.rollNo = rollNo;
//    }
//
//    public String getDetail(){
//        return "Name : " + this.name + "\n" + "Roll No : " + this.rollNo;
//    }
//}
// EXAMPLE FOUR WITH ARRAYLIST WITH TYPE-SAFE
public class WithArray {
    public static void main(String[] args) {
       ArrayList<Students> studentList = new ArrayList<Students>(); // inside angular bracket we have to call the datatype of the Object.
//
//        studentList.add(new Students("Abhishek", 1));
//        studentList.add(new Students("Somya", 2));
//        studentList.add(new Students("Sujit", 3));
//        studentList.add(new Students("Karanpreet", 4));
//        studentList.add(new Students("Hari", 5));


//        studentList.add(new Students("Sujit", 1));
//        studentList.add(new Students("Siddharth", 2));
//        studentList.add(1, new Students("Karanpreet", 3));
//        studentList.add(new Students("Hari", 4));
//        studentList.add(1, new Students("Tricha", 5));

            studentList.add(new Students("Sujit", 1));
            studentList.add(new Students("Siddharth", 2));
            studentList.add(new Students("Karanpreet", 3));
            studentList.add(3,new Students("Hari", 4));
            studentList.add(4, new Students("Tricha", 5));

        printStudent(studentList);
    }

    public static void printStudent(ArrayList<Students> students){
        for(Students s : students){
            System.out.println(s.getDetail());
        }
    }
}

class Students{
    public String name;
    public int rollNo;

    public Students(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getDetail(){
        return "Name : " + this.name + "\n" + "Roll No : " + this.rollNo;
    }
}
