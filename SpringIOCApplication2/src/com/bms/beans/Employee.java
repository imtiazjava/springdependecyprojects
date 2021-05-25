package com.bms.beans;
public class Employee {
	private int id;
	private String name;
	private String email;
   public  Employee(String name) {
	   this.name=name;
	   System.out.println("first constructor is invoked");
   }
   
   public Employee(int id) {
	   this.id =id;
	   System.out.println("second constructor is invoked");
   }
   
   public  Employee(int id ,String name) {
	   this.id = id;
	   this.name=name;
	   System.out.println("third constructor is invoked");
   }
   
   public Employee(String name,String email) {
	   this.name = name;
	   this.email = email;
	   System.out.println("fourth constructor is invoked");
   }
   
   public Employee(int id, String name,String email) {
	   this.id = id;
	   this.name = name;
	   this.email = email;
	   System.out.println("fourth constructor is invoked");
   }
   
   @Override
public String toString() {
	// TODO Auto-generated method stub
	return id+","+name+","+email;
}



}
