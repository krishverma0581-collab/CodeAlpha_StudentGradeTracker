import java.util.*;
public class java 
{
    public static void main(String[] args)
    {
        Gradetracker tracker=new Gradetracker();
        Scanner in=new Scanner(System.in);
        
        while(true)
        {
            tracker.displaymenu();
            int choice=in.nextInt();
            in.nextLine();
            
            if(choice==5)
            {
                System.out.println("Exiting... Thank You! ");
                break;
            }
              tracker.userchoice(choice);
        }
          in.close();
    }
}
