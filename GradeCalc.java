import java.util.Scanner;

public class GradeCalc {
    

public static void main(String[] args) {
    System.out.println("Enter the number of subjects");

    Scanner ip = new Scanner(System.in); 

    int totalSubs = ip.nextInt();
    float avgmarks = 0;
    int totalmarks=0;

    int[] marks = new int[totalSubs];
    for( int i = 0;i < totalSubs;i++){
        System.out.print("Enter the marks : ");
        marks[i]=ip.nextInt();
        totalmarks += marks[i];
    }

    avgmarks = (float) totalmarks / (totalSubs * 100) * 100;;
    System.out.println("Total Marks : "+ totalmarks);
    System.out.println("Average Percentage : "+ avgmarks);
   System.out.println( grades(avgmarks));
}

public static String grades(float avgmarks)
    {
        if (avgmarks >= 90) 
        {
            return "A+";
        }
        else if (avgmarks >= 80)
        {
            return "A";
        }
        else if (avgmarks >= 70)
        {
            return "B";
        }
        else if (avgmarks >= 60)
        {
            return "C";
        } 
        else if (avgmarks >= 50) 
        {
            return "D";
        } 
        else 
        {
            return "F";
        }
    
}
}