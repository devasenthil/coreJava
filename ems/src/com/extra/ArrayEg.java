package com.extra; 
import static java.lang.Math.*;

class Employeee{

	private int eid;
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	

}

class ArrayEg
{
	public static void main(String[] args)
  	{
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;	
		arr[2]=3;

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		for(int i : arr)
		{
			System.out.println(i);
		}

		Employeee e1 = new Employeee();
		e1.setEname("Malar");
		Employeee e2 = new Employeee();
		e2.setEname("Bala");

		Employeee[] empArr = new Employeee[2];
		
		empArr[0]=e1;
		empArr[1]=e2;

		for(Employeee i : empArr)
		{
			System.out.println(i);
		}


		System.out.println(PI);

	}

}

















