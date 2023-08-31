package csc_assignment;
import java.util.*;
public class PA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
		System.out.println("How many lists: "); 
		int lists = scan.nextInt();
      	scan.nextLine();
      
		for (int i = 0; i < lists; i ++){ 
			System.out.println("Please enter how many numbers you want in the list, followed by those numbers: ");
          	
          	String[] input = scan.nextLine().split(" ");
          
          	int count = Integer.parseInt(input[0]);
          	
          	ArrayList<Integer> num = new ArrayList<Integer>();
          	for (int a = 1 ; a <= count ; a ++){
               
              	int x = Integer.parseInt(input[a]);
              	num.add(x);
            }

          	
           data.add(num);
		}
		
      	
      	System.out.println("How many indexes: ");
 
      	int indexes = scan.nextInt();
        scan.nextLine();
      	
      	for(int t = 0; t < indexes; t++){
 
      		try {
      		System.out.println("What is the position? ");
      		String[] line = scan.nextLine().split(" ");
      		int first = Integer.parseInt(line[0]);
      		int second = Integer.parseInt(line[1]);
      		
      		 ArrayList<Integer> in = data.get(first-1);
      		 int out = in.get(second-1);
      		 System.out.println(out);
      		 
      		}catch(Exception e ) {
      		 System.out.println("Error!");
      		
      		}
          
        }
      	scan.close();	
	}
}


	

