package com.dal.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


import com.dal.model.Employee;

public class EmployeeController implements EmployeeInterface,Serializable {
	//Employee emp = new Employee();
	
	Employee emp;
	List<Employee> emplist = new ArrayList<Employee>();
	public void addEmployee()
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eid");
		int eid= sc.nextInt();
		emp.setEid(eid);
		
		System.out.println("Enter Ename");
		String ename= sc.next();
		emp.setEname(ename);
		System.out.println("Employee Added Succesfully");
	}
	
	public void viewEmployee() {
		System.out.println(emp);
	}
	
	public void serialEmp() {

		try{
			//Employee emp1 =  (Employee) emp;
			//System.out.println("Test 1111");
			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			//System.out.println("Test 2222");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//System.out.println("Test 333");
			oos.writeObject(emp);
		//	oos.writeObject(emp.getEid());
		//	oos.writeObject(emp.getEname());
			
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("No file" + e);
			}
			catch(Exception e1)
			{
			System.out.println("No file" + e1);
			}
		}
	
	public void deSerialEmp() {
		
		try{
		
	
		FileInputStream fis = new FileInputStream("dedalus.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println(ois.readObject());
		System.out.println("DeSerilized from file dedalus.txt");
		
		//System.out.println(emp1.getEname());
		ois.close();
		fis.close();
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("No file" + fnf);
		}
		catch(ClassNotFoundException cnf)
		{
			System.out.println("No Emp class" + cnf);
		}
		catch(Exception cnf)
		{
			System.out.println("No Emp class.." + cnf);
		}

	}
	
	@Override
	public void sortByEid() {
		Collections.sort(emplist);
		System.out.println("After sorting by EID");
		System.out.println(emplist);
	}

	@Override
	public void sortByEname() {
		Collections.sort(emplist, Employee.NameComparator);
		System.out.println(emplist);
		
	}
	

}
