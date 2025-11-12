import java.util.ArrayList;
public class Student
{
  private String name;
  private ArrayList<Integer> grades;


  public Student(String name)
   {
     this.name=name;
     this.grades=new ArrayList<>();
   }
  
  public void addgrade(int grade)
  {
      grades.add(grade);
  }
  
  public double getcalc()
   {
      if(grades.isEmpty())
       {
          return 0;
       }
      int sum=0;
      
      
      for(int grade:grades)
         {
          sum+=grade;
         }
      return (double) sum/grades.size();
   }
  
  public int gethighestgrade()
  {
      int highest =Integer.MIN_VALUE;
      for (int grade:grades)
      {
          if(grade>highest)
          {
              highest = grade;
          }
      }
      return highest;
  }
  
  
  public int getlowestgrade()
  {
      int lowest= Integer.MAX_VALUE;
      for(int grade:grades)
      {
          if(grade<lowest)
          {
              lowest=grade;
          }
      }
      return lowest;
  }
  
  public String getName()
  {
      return name;
  }
  
  public ArrayList<Integer> getGrades()
  {
      return grades;
  }
  
  public void displayinfo()
          {
            System.out.println("Name :" + name);
            System.out.println("Grades: "+grades);
          }
  
}