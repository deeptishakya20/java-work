package basicassignment;

public class bubbleSort {
	   public static void main(String args[]) {
		   
			
		    int[] array=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
			int temp=0;
		    for(int i=0;i<array.length;i++) {
		    	                                                                                       
		        for(int j=1;j<array.length-1;j++) {
		        
		        if(array[j-1]>array[j]) {
		          temp=array[j-1];
		          array[j-1]=array[j];
		          array[j]=temp;
		        }
		        
		        }
		    }
		    System.out.println("Elements of sorted array are:");
		   for(int i=0;i<array.length;i++)
		    System.out.print(array[i]+" ");
	   }

}
