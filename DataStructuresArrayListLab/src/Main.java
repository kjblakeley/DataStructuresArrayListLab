import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> theList = new ArrayList();

		while (true){
			
			System.out.print("Enter option 1, 2, or 3: ");
			int x = sc.nextInt();
			
			if (x==1){
				System.out.println("Enter value to be stored in the list:");
				int y = sc.nextInt();
				theList.add(y);
				System.out.println(theList);
				
			}if (x==2){
				System.out.println("Enter value to be removed from the list:");
				int y = sc.nextInt();
				if(theList.contains(y)){
					for(int i = 0; i < theList.size(); i++)
						if(theList.get(i).equals(y)){
							theList.remove(i--);
						}
				}
				
				
			}if (x==3){
				System.out.println(theList.size());
				System.out.println(theList);
				
			}
		}
	}
}
