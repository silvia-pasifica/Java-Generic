import java.util.*;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int temp = 0;
	
	public void addScore (Generic generic ) {

		int input = 0;
		String name = "";
		System.out.println("Input student name: ");
		name = sc.nextLine();
		generic.<String>add(name); //boxing
		temp++;
		
		System.out.print("Input student score: ");
		try {
			input = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		sc.nextLine();
		
		generic.<Integer>add(input); //boxing
		temp++;
	
		
	}
	
	public void viewScoreList(Generic generic) {
	
		System.out.printf( "| %-15s | %-5s |\n", "Name", "Score");
		
		for (int i = 0; i < temp; i++ ) {
			if (i%2 == 0) {
				System.out.printf( "| %-15s | ", generic.get(i)); //unboxing
			}
			else {
				System.out.printf("%-5s |\n", generic.get(i)); //unboxing
			}
		}
	}
	

	public Main() {
		// TODO Auto-generated constructor stub
		Generic<Integer> scoreList = new Generic<>();
		boolean isRun = true;
		int inp = 0;
		
		do {
			do {
				System.out.println("Menu");
				System.out.println("=================");
				System.out.println("1. Add Score");
				System.out.println("2. View Score List");
				System.out.print(">> ");
				try {
					inp = sc.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
				}
				sc.nextLine();
				
				switch (inp) {
				case 1:
					addScore(scoreList);
					System.out.println("Press enter to continue...");
					sc.nextLine();
					break;
				case 2:
					viewScoreList(scoreList);
					System.out.println("Press enter to continue...");
					sc.nextLine();
					break;

				default:
					break;
				}
			} while (inp < 1 || inp > 2);
			
			
		} while (isRun);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
		
	}

}

