package the_equal;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Random;

public class StockRunner {
public static void main(String[] args) {
	Random random=new Random();
	int[] arr=new int[1000000];
	StopWatch stp=new StopWatch();
	long a=stp.start();
	for(int i=0;i<1000000;i++) {
		arr[i]=random.nextInt(1000000);
	}
	Arrays.sort(arr);
long b=stp.end();
System.out.println(b-a+" b-a");
System.out.println(stp.elapsed()+" elapsedTime");
}

public static int random100() {
	
Random random= new Random(1000);//Returns 100 as a random number.
	int a=0;
	while(true) {
		 a=random.nextInt(101);
	
	if(a==100) {
		System.out.println(a);
	break;
	}
	}
	return a;
}

}
