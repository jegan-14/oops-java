package ExpNo12;
import java.util.*;
public class GenericFunction {
	public static void main(String[]args){
        Integer arr[]={23,71,90,45,18,7,10,3,333,228};
         GenericFunction obj=new  GenericFunction ();
         obj.min(arr);
      
    }
	public <T extends Comparable<T>>void min(T[] arr) {
	    T min = arr[0];
	    for (T i : arr) {
	        if (i.compareTo(min) < 0) {
	            min = i;
	        }
	    }
     System.out.println("The minimum number in the list is "+ min);      
    }
}
