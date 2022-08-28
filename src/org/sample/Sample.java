package org.sample;
public class Sample {
	public Sample() {
		System.out.println("default constructor");
}
	public Sample(int id) {
		System.out.println("para constructor");
		System.out.println(id);
		}
    public void Sample() {
    	System.out.println("method");
    } 	
    public static void main(String[] args) {
		Sample s=new Sample();
		Sample s1=new Sample(300);
		s.Sample();
	    	
    }
}
