package wowgit;

import wowgit.Maths;

public class Maths {
	
	public void add(int a,int b){
		int result =a+b;
		System.out.println("Sum of two numbers =" + result);
		}

	
	public void sub(int a,int b){
		int result =a-b;
		System.out.println("Sum of two numbers =" + result);
		}

	
	public void mul(int a,int b){
		int result =a*b;
		System.out.println("Sum of two numbers =" + result);
		}
	
	
	public void div(int a,int b){
		int result =a/b;
		System.out.println("Sum of two numbers =" + result);
		}

	public void add1(int a,int b),int c){
		int result =a+b+c;
		System.out.println("Sum of two numbers =" + result);
		}

	public void greet() {
		System.out.println(" Super bosss");
	}
	
	
	
	

	


	

		public static void main(String[] args){
	        Maths obj=new Maths();
		obj.add(3,0);
		obj.sub(3,0);

		obj.mul(3,0);

		obj.div(3,0);

		obj.add1(3,0,0);
		obj.greet();


		
		

	      

		}

}



