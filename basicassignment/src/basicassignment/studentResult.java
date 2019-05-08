package basicassignment;
import java.util.Scanner;
public class studentResult {
  public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	
	  System.out.println("Enter the number of student");
	  int student=input.nextInt(); 
	  System.out.println("Enter the number of subject");
	  int subject=input.nextInt(); 
	  int[][] array=new int[student][subject];
	  
	for(int i=0;i<student;i++){
     for(int j=0; j<subject;j++){
	array[i][j]=input.nextInt();
	}
	}
	input.close();
	
	for(int i=0;i<student;i++){
	     for(int j=0; j<subject;j++){
		System.out.print(array[i][j]+" ");
		
}
	     System.out.println();
		}
	
	for(int i=0;i<student;i++)
	{
		int total=0;
		double average=0.0;
	     for(int j=0; j<subject;j++)
	     {
	         total=array[i][j]+total;
	     }
	     average=(double)total/subject;
	     System.out.println("Student"+" "+(i+1)+" "+"total marks is = "+total+ " average marks is= "+average) ;
	 }
	for(int i=0;i<subject;i++)
	{
		int total=0;
		double average=0.0;
	     for(int j=0; j<student;j++)
	     {
	         total=array[i][j]+total;
	     }
	     average=(double)total/subject;
	     String averageMarks = String.format(("%.2f"), average);
	     System.out.println("Total marks of subject"+" "+(i+1)+" = "+total+ " and average marks of all students of subject "+(i+1)+" is= "+averageMarks) ;
	}
	
}
}
