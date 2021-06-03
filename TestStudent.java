package Java14.School.cst_3519;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TestStudent {

    
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        try {
            
            File studentFileObject = new File("Student.txt");
           
            BufferedReader br = new BufferedReader(new FileReader(studentFileObject));
         
            String line;
           
            while ((line = br.readLine()) != null) {
               
                String[] dataFromFile = line.split(" ");
               
                GraduateStudent stud = new GraduateStudent();
                stud.setFirstName(dataFromFile[0]);
                stud.setLastName(dataFromFile[1]);
                stud.setID(Integer.parseInt(dataFromFile[2]));
                stud.setStatus(dataFromFile[3].charAt(0));

                System.out.println("Graduate(G) or UnderGraduate(U) " + stud.getFirstName() + " " + stud.getLastName() + " : ");
                char ch = scanner.next().charAt(0);
                
                System.out.print("credit for " + stud.getFirstName() + " " + stud.getLastName() + " : ");
                stud.setCredit(scanner.nextInt());
                scanner.nextLine();
               
                System.out.print("(part-time or full-time) Student " + stud.getFirstName() + " " + stud.getLastName() + " : ");

                String partFull = scanner.nextLine();
                
                System.out.println(stud.toString());
                if(ch == 'G'){
                    
                    System.out.println("Tuition fee : " + (stud.Tuition(partFull)));
                }
                else{
                    Student1 underGraduate = (Student1) stud;
                    
                    System.out.println("Tuition fee : " + (underGraduate.Tuition(partFull)));
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
