package grades;

import java.util.*;

public class GradesApplication {

    public static void outputStudentInfo(String userInput, HashMap<String, Student> students){
        if (students.containsKey(userInput)){
            ArrayList<Integer> grades = students.get(userInput).getGrades();
            System.out.printf("Name: %s - GitHub Username: %s%n", students.get(userInput).getName() , userInput);
            System.out.printf("Current Average: %.2f%n", students.get(userInput).getGradeAverage());
            System.out.println("Grades:");
            for(int i = 0; i < grades.size(); i++){
                if (i == grades.size() -1){
                    System.out.println(grades.get(i));
                } else {
                    System.out.print(grades.get(i) + ", ");
                }
            }
        } else {
            System.out.println("Sorry, no student found with username " + userInput);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student zgulde = new Student("Zach");
//        System.out.println(zgulde.getName());
        zgulde.addGrade(99);
        zgulde.addGrade(88);
        zgulde.addGrade(77);

        Student ryanorsinger = new Student("Ryan");
        ryanorsinger.addGrade(85);
        ryanorsinger.addGrade(90);
        ryanorsinger.addGrade(95);

        Student jreich5 = new Student("Justin");
        jreich5.addGrade(100);
        jreich5.addGrade(99);
        jreich5.addGrade(98);

        Student fmendozaro = new Student("Fernando");
        fmendozaro.addGrade(90);
        fmendozaro.addGrade(99);
        fmendozaro.addGrade(80);

        Student MontealegreLuis = new Student("Luis");
        MontealegreLuis.addGrade(92);
        MontealegreLuis.addGrade(70);
        MontealegreLuis.addGrade(95);

        new HashMap<>();
        students.put("zgulde", zgulde );
        students.put("ryanorsinger", ryanorsinger );
        students.put("jreich5", jreich5 );
        students.put("fmendozaro", fmendozaro );
        students.put("MontealegreLuis", MontealegreLuis );

//        System.out.println(students.getName());

//        for(Map.Entry<String, Student> studentsEntry : students.entrySet()){
//            System.out.println(studentsEntry.getKey() + " - " + "GitHub Username: " + studentsEntry.getValue().getName());
//        }

        Set<String> gitHubUserNames = students.keySet();
        for(String gitHubUserName : gitHubUserNames){
            System.out.printf(" |%s| ", gitHubUserName);
        }
        Collection<Student> studentsObject = students.values();
        for(Student student : studentsObject){
//            System.out.println(student.getName());
        }
        System.out.println("");
        System.out.println("What student would you like to see more information on?");
        String userInput = sc.nextLine();
//        String again = sc.nextLine();
        outputStudentInfo(userInput, students);

//        if(gitHubUserNames.contains(userInput)){
//            System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.2f", students.get(userInput).getName() ,userInput, students.get(userInput).getGradeAverage());
//            System.out.println("Would you like to see another student?");
//        }else{
//            System.out.println("Sorry, no student found with username" + userInput);
//        }

        while(true){
            System.out.println("Would you like to see another student?");
            System.out.println("");
            String userChoice = sc.nextLine();
            userChoice = userChoice.toLowerCase();
            if(userChoice.equalsIgnoreCase("no")){

                System.out.println("Goodbye");
                break;
            }else {
                System.out.println("What student would you like to see?");
//                System.out.println("");
                userInput = sc.nextLine();
                outputStudentInfo(userInput, students);
            }
        }
    }
}
