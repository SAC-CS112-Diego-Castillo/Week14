import java.util.InputMismatchException;
import java.util.Scanner;

import java.lang.*;


public class Main {

	public static void main(String[] args){

		int i =0;
		int speed = 0;

        int speed2 = 0;

        int speed3 = 0;


		
		      Scanner input = new Scanner(System.in);

		      int iLoop = 10;  // determines if more input is needed
		      

		      do

		      {      

		         try
		         {
		             HumanPowerCycles[] HumanPowerCycles = new HumanPowerCycles[1];
		             for(i =0; i< HumanPowerCycles.length; i++){
		        	 System.out.println("Set current gear of Unicycle: 1 2 or 3 ");

			            int gear = input.nextInt();

			            if (gear > 3) 

			            {

			            	 throw new IllegalArgumentException("max gears is 3 " + gear);

			            

			            }

			            else if(gear == 1) {
			            	speed = 5;
			            }
			            else if (gear == 2){
			            	speed = 6;
			            }
			            else 
			            	speed = 8;
			            
			            System.out.println("Enter gear for Bicycle: 1 2 3 4 or 5 ");

			            int gear2 = input.nextInt();
			            if (gear2 > 5) 

			            {

			            	 throw new IllegalArgumentException("max gears is 5 " + gear2);

			            

			            }

			            else  if(gear2 == 1){
			            	speed2 =6;
			            	
			            }
			            else if(gear2 ==2){
			            	speed2 = 7;
			            }

			            else if (gear2 == 3){

			            

			            speed2 = 8;                    // renamed speed to speed2 

			            }

			            else if(gear2 == 4){

			            //System.out.println("Speed = 9");

			            speed2 = 9;                      // renamed speed to speed2 

			            }

			            else
			            	speed2 = 10;

			            System.out.println("Enter gear for Tricycle: 1 2 3 4 or 5 ");

			            int gear3 = input.nextInt();
			            if (gear3 > 5) 

			            {

			            	 throw new IllegalArgumentException("max gears is 5 " + gear3);

			            

			            }

			            else if(gear3 == 1){

			                    

			                    speed3 = 6;

			                    }

			                    else if (gear3 == 2){

			                    //System.out.println(" speed = 7");

			                    speed3 = 7;

			                    }

			                    else if (gear3 == 3){

			                    //System.out.println(" speed = 8");

			                    speed3 = 8;

			                    }

			                    else if (gear3 == 4){

			                    speed3 = 9;

			                    // System.out.println(" speed = 9");

			                    }

			                    else if (gear3 == 5){

			                    speed3 = 10;

			                    }
			                
		         
			                    for(int r =0; r<HumanPowerCycles.length; r++){
			                    	Unicycle W1u = new Unicycle(1,3,"W1u","red",speed);

			                		Bicycle W2b = new Bicycle(2,5,"W2b","blue",speed2);

			                		Tricycle W3t = new Tricycle(2,5,"W3t","green",speed3);


			    		System.out.println("Unicycle\n" + W1u.toString());

			    		


			    		System.out.println("Bicycle\n" + W2b.toString());

			    		


			    		System.out.println("Tricycle\n" + W3t.toString());

			    		 // input successful; end looping
		         }
			                    }
		         }
		 
			            catch (InputMismatchException inputMismatchException)

				         {

				            System.err.printf("%nException: %s%n", inputMismatchException);

				            input.nextLine(); // discard input so user can try again

				            System.out.printf("You must enter integers. Please try again.%n%n");

				         }

				         catch(ArithmeticException arithmeticException)
				         {
				       	  System.err.printf("\nException: %s\n", arithmeticException);
				       	  input.nextLine();
				       	 System.out.println("You must enter intergers. Please try again.\n");
				         }
				         catch (Exception a ) {
				   			System.out.printf("%nException: %s%n", a);
				   		
				   		System.out.printf("Exception");
				         }

			         }     while (iLoop <=10);

		
		
		}

		

	}

