package com.excelr;

public class Employee {
	private int e_id;
	private String e_name;
	private double e_sal;
	private String e_image;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public double getE_sal() {
		return e_sal;
	}
	public void setE_sal(double e_sal) {
		this.e_sal = e_sal;
	}
	public String getE_image() {
		return e_image;
	}
	public void setE_image(String e_image) {
		this.e_image = e_image;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_sal=" + e_sal + ", e_image=" + e_image + "]";
	}
	

}
