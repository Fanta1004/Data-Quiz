//Scanner import
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
    int testScore = 0;

    System.out.println("Good morning class, today you will be taking the data types quiz.");
    
    System.out.println("This is a true or false test so if the statement is true, type true. If it is false type false.");
    
    System.out.println("You may begin.");
    

   //Q1
		
    System.out.println("1) A boolean is a variable that stores numbers with decimals in it.");
		
    boolean q2 = scan.nextBoolean();
		if(q2 == false){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q2 == true){
			System.out.println("Wrong.");
		}
  
  
  
  //Q2
		
    System.out.println("2) An integer stores whole numbers between -2,147,483,648 and 2,147,483,647.");
		
    boolean q1 = scan.nextBoolean();
		if(q1 == true){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q1 == false){
			System.out.println("Wrong.");
		}
  

  
  //Q3
		
    System.out.println("3) A double Stores fractional numbers. Sufficient for storing 15 decimal digits.");
		boolean q3 = scan.nextBoolean();
		if(q3 == true){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q3 == false){
			System.out.println("Wrong.");
		}

  
  

  
  //Q4
		
    System.out.println("4) char Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807?");
		boolean q5 = scan.nextBoolean();
		if(q5 == true){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q5 == false){
			System.out.println("Wrong.");
		}


  //Q5
		
    System.out.println("5) A float Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits?");
		boolean q4 = scan.nextBoolean();
		if(q4 == true){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q4 == false){
			System.out.println("Wrong.");
		}  
  
  
  //Q6
    
    System.out.println("6) A short Stores whole numbers from -32,768 to 32,767?");
		boolean q7 = scan.nextBoolean();
		if(q7 == true){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q7 == false){
			System.out.println("Wrong.");

  
  //Q7
    
    System.out.println("7) A Byte Stores whole numbers from -128 to 127?");
		boolean q8 = scan.nextBoolean();
		if(q8 == true){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q8 == false){
			System.out.println("Wrong.");

		  
  
  //Q8
    
    System.out.println("8) A long  Stores a single character/letter?");
		boolean q6 = scan.nextBoolean();
		if(q6 == true){
			testScore += 1;
  		System.out.println("Right!");
		}else if (q6 == false){
			System.out.println("Wrong.");
		}
    
    System.out.println("You got a " + testScore + " out of 8!");  
    
    
    }
  }
  
  
  }
}