package arrayAufgaben;

public class Umsatzsteigerung {

	public static int count5PercentJumps(int[] gains) {
	    if (gains == null || gains.length < 2) {
	        return -1; 
	    }
	    
	    int count = 0;
	    for (int i = 1; i < gains.length; i++) {
	        if ((gains[i] - gains[i - 1]) > (gains[i - 1] * 0.05)) {
	        	count ++;
	        }
	     }
	    return count;
	}
	
	public static void main (String[]args) {
	int [] dailyGains= { 1000, 2000, 500, 9000, 9010};
	System.out.println(count5PercentJumps(dailyGains));	
	}
}