package com.sritech.Programs;

public class AreaOfTriangle {
	public static void main(String[] args) {
	    System.out.println("Area of Triangle");
	    //Find area of triangle
	    double base=30.0;
	    double height=15.0;
	
	    double area=calculateArea(base,height);
	    System.out.println("The area of trianlge is::"+area);
	    }

	    public static double calculateArea(double base,double height){
	    return 0.5*base*height;// return 225.o
	    }


}
