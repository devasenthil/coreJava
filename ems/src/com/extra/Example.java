package com.extra;

import java.util.Scanner;

import com.dal.controller.EmployeeController;
import com.dal.controller.EmployeeInterface;
import java.io.*;

/*class Employee implements Serializable{
    private int eno;
private String ename;
	 
public Employee()
{		 
	 System.out.println("From Employee Constructor");
}
public Employee(int eno,String ename)
{		 
	this.eno =eno;
	this.ename = ename;
}
public void setEno(int eno)
{
	 this.eno=eno;
}
public int getEno()
{
	 return eno;
}
public void setEname(String ename)
{
	 this.ename=ename;
}
public String getEname()
{
	 return ename;
}		 

public String toString()
{
	 return "Employee  [ " + this.eno +"  " + this.ename+  "  ]";
}
}*/


public class Example implements Serializable {
	
	public static void main(String[] args) throws IOException
	{
	
		try{
		String uname=null;
		String pwd = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Username:");
		uname=br.readLine();
		System.out.println("Enter password:");
		pwd= br.readLine();

		if(uname.equals("deeps") && pwd.equals("pass"))
		{
			//System.out.println("Welcome " + uname);
			System.out.println("Welcome");
			EmployeeInterface ec = new EmployeeController();
			Scanner sc = new Scanner(System.in);
			String choice = null;
			do {
				System.out.println("Enter your choice");
				System.out.println("1. Add Employee");
				System.out.println("2. View Employee");
				System.out.println("3. Serialize");
				System.out.println("4. DeSerialize");
				int ch = sc.nextInt();
				switch (ch) {
				case 1: {
					ec.addEmployee();
					break;
				}
				case 2: {
					ec.viewEmployee();
					break;
				}
				case 3: {
					ec.serialEmp();
					break;
				}
				case 4: {
					ec.deSerialEmp();
					break;
				}
				
				default: {
					System.out.println("Enter right choice");
					break;
				}
				}
				System.out.println("Do u want to continue Y or y");
				choice = sc.next();
			} while (choice.equals("Y") || choice.equals("y"));
			System.out.println("Exited");
			System.exit(0);
			
			///////
		}
		else{
			throw new UserNotFoundException();
		
		}
		}
		catch(UserNotFoundException unf)
		{
			System.out.println(unf);
		}

	}

}
