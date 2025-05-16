package HeartLines;
import java.util.*;

public class Tasks 
{
    String describe;
    String taskGet;
    int tGet;
	int date;
	char ans = 'Y';
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> taskList = new ArrayList<>();
	public void createTask()
	{
		while(ans == 'y' || ans =='Y')
			{
			System.out.println("Describe your task!");
			describe = sc.nextLine();
			taskList.add(describe);
			System.out.println("Task: "+describe+" created.");
			System.out.println("Would you like to add another? Y/N");
			String input = sc.nextLine();
            if (!input.isEmpty()) 
            {
                ans = input.charAt(0);
            } else
            {
                ans = 'n';
            }
			
			}
		 System.out.println("Your task list:");
	        for (String task : taskList) {
	            System.out.println("- " + task);
	        }

	        sc.close();
		

	}
}
