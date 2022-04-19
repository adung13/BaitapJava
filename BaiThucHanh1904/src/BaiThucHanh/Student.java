package BaiThucHanh;

public class Student extends Person {

	private double mark;
	
	public Student() {
		

	public Student(String name, int age, String address, double mark) {
		super(name, age, address);
	
		this.mark = mark;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
  
}
