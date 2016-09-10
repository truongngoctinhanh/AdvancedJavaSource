package Task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainForManagemenInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String reply = "y" ;
            ArrayList<Teacher> arrayTea = new ArrayList<Teacher>();
            ArrayList<Student> arrayStu = new ArrayList<Student>();
            //Enter information of human
            while (reply.equals("y")) {
            	System.out.println("Enter information: ");
                System.out.print("Enter full name: ");
                String name = input.readLine();
                System.out.print("Enter date of birth: ");
                String date = input.readLine();
                System.out.print("Enter address: ");
                String add = input.readLine();
                System.out.print("Enter phone number: ");
                String phone = input.readLine();
                
                //Choose kind of Human (Teacher or Student)
                System.out.println("-------------------------------------");
                System.out.println("Press 1 if you choose Teacher ");
                System.out.println("Press 2 if you choose Student ");
                System.out.println("Please choose 1 / 2 : ");                
                int rep = Integer.parseInt(input.readLine());
                if (rep != 1 && rep != 2) {
                    throw new ArithmeticException("Invalid values! Please choose again!");
                }
                
                //Add information of Teacher or Student
                if (rep == 1){
                	System.out.print("Enter the homeroom class is: ");
                	String home = input.readLine();
                	System.out.print("Enter coefficients of salary: ");
                	double coe = Double.parseDouble(input.readLine());
                	System.out.print("Enter allowance: ");
                	double all = Double.parseDouble(input.readLine());
                	arrayTea.add(new Teacher(home, coe, all, name, date, add, phone));
                	System.out.println("Information of teacher created!");
                }else{
                	System.out.print("Enter the grade: ");
                	String grade = input.readLine();
            		System.out.print("Enter point of semester 1: ");
            		double sem1 = Double.parseDouble(input.readLine());
            		System.out.print("Enter point of semester 2: ");
                	double sem2 = Double.parseDouble(input.readLine());
                	arrayStu.add(new Student(grade, sem1, sem2, name, date, add, phone));
                	System.out.println("Information of Student created!");
                }
                
                
                System.out.println("------------------------------------------");
                System.out.println("Do you want to continue ? ");
                System.out.println("Please choose y / n ? ");
                reply = input.readLine().toLowerCase();
                if(!reply.equals("y") && !reply.equals("n")) throw new ArithmeticException("Choice value is not valid!");
            }
            
            //Show salary of Teacher
            for (Teacher Tea : arrayTea) {
                Tea.showInformation();
                System.out.println("The salary of Teacher: " + Tea.calculateSalary());
            }
            
            //Show GPA of student
            for (Student Stu : arrayStu) {
                Stu.showInformation();
                System.out.println("The GPA of student: " + Stu.calculateGPA());
            }
        } catch (IOException | NumberFormatException | ArithmeticException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
	}

}
