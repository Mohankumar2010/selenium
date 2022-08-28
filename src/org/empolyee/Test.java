package org.empolyee;
public class Test {
	public Test() {
		this(300);
 System.out.println("default constructor");
	}
public Test (int id) {
	this("Mohan",9486181144l);
	System.out.println(id);
}
public Test(String name,long phone) {
	System.out.println(name);
	System.out.println(phone);
}
public static void main(String[] args) {
	Test t=new Test();
}
}
