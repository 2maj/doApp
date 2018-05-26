package dooApp;
import java.util.Arrays;
public class DoApp {

	static boolean exists(long[] ints, long k) {
		int length = ints.length;
		int end = length;
		int begin = 0;
		int middle = (end+begin)/2;
		boolean find=false;
		
		while(((end-1) != begin) && find==false){
			
          if(k > ints[middle]){
        	begin = middle;
            //System.out.println("K >"+ ints[middle]);
          }else if(k < ints[middle]){
            end = middle;
            //System.out.println("K <"+ ints[middle]);   
		   }else{
            find = true;
            //System.out.println("K ="+ ints[middle]);
		    }
          middle = (end+begin)/2;   
		}
		return find;
	}
		


}