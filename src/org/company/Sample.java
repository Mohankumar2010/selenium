package org.company;

public class Sample extends Hello {
	public Sample() {
		super(300);
		System.out.println("default constructor");
	}
	public Sample(int id) {
		super(600);
		System.out.println("int para constructor");
		System.out.println(id);
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		Sample s1=new Sample (300);
	}

}
