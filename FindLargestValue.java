package com.sritech.Programs;

public class FindLargestValue {
	 public static void main(String[] args) {
		  //Check whether a character is vowel or consonant
		       int num1=2;
		       int num2=5;
		       int num3=9;
		       int largest = finalLargest(num1,num2,num3);
		       System.out.println("The largest number is:"+largest);
		       }
		       
		  public static int finalLargest(int a,int b,int c){
		       int largest;
		          if(a>=b && a>=c){
		               largest = a;
		          }
		            else if(b>=a && b>=c){
		                largest =b;
		            }
		              else{
		                largest = c;
		             }
		                return largest;
		     }
		}



