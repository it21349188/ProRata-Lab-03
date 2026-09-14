import java.util.Scanner;
  public class Lab3Q1{
	
    public static void main(String[] args){
	
	 //defining the scanner object
	
	    Scanner input = new Scanner(System.in);
	
	    System.out.println("Enter the price of 1kg: ");
	    double price = input.nextDouble();
	
	    System.out.println("Enter the number of kilograms you need to buy: ");
	    double howManyKgs = input.nextDouble();
	
	    double amount = price * howManyKgs ;
		
	    //calculate discount
	    double discount = amount * 0.1;
	    double totAmount =amount - discount;
	
	    System.out.println("The total amount is : "+totAmount);
	
	}//end of main method
  }