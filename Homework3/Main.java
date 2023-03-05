import java.util.*;
public class Main{
public static void main(String[] args) {
    
    tuitionCentre PandaiOne = new tuitionCentre();
    Tutor Khalid = new Tutor();
    Student Dove = new Student();
    Student Sam = new Student();

    //set tuitioncentre attributes 
    PandaiOne.setAddress("Jalan Permai Damai 7/5");
    PandaiOne.setHeadmaster("Encik Ahmad");
    PandaiOne.setStudents(Dove);
    PandaiOne.setStudents(Sam);
    PandaiOne.setTutors(Khalid);

    //set student (Dove) attributes

    Dove.setName("Dove");
    Dove.setAddress("Jalan Damai 99");
    Dove.setIc("030225139999");
    Dove.setSchoolname("Sekolah School");
    Dove.setYear("17");
    Scanner input = new Scanner(System.in);
    
    for (int i = 0; i < 5; i++){
        System.out.println(Dove.getName() + ": Enter score for subject " + (i+1) + ": ");
        Dove.setScores(input.nextFloat(), i);
    }
    

    //set next student (Sam) attributes
    Sam.setName("Sam");
    Sam.setAddress("Jalan Damai 69");
    Sam.setIc("030225139559");
    Sam.setSchoolname("School of Sekolah");
    Sam.setYear("17");
    
    for (int i = 0; i < 5; i++){
        System.out.println(Sam.getName() + ": Enter score for subject " + (i+1) + ": ");
        Sam.setScores(input.nextFloat(), i);
    }
    
    //set tutor (Khalid) attributes

    Khalid.setName("Khalid");
    Khalid.setAddress("Jalan Permai 111");
    Khalid.setDateJoined("10/2/2020");
    Khalid.setIc("030217103333");
    Khalid.setNumYearsCentre(3);
    Khalid.setNumYearsExp(10);
    Khalid.setQualification("PhD in Psychology with Honours");

    //run required methods in report

    System.out.println("Number of students in PandaiOne: " + PandaiOne.numStudents());
    System.out.println("Number of tutors in PandaiOne: " + PandaiOne.numTutors());
    System.out.println("Average marks in PandaiOne: " + PandaiOne.avgMarks());
    System.out.println("Minimum marks in PandaiOne: " + PandaiOne.minMarks());
    System.out.println("Maximum marks in PandaiOne: " + PandaiOne.maxMarks());
    System.out.println("Enter name of tutor to search: ");
    String reqTutor = input.next(); 
    System.out.println("Qualification of tutor: " + PandaiOne.tutorBG(reqTutor));

    input.close();
}}