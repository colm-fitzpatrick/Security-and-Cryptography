import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class pseudorandom extends java.util.Random {
	
	private long seed;
	public long random1 ()
	{	
		Random randomno = new Random();
		
		long m = 1;
		long m2 = 1000000000;
		m = randomno.nextLong();
		m = m/m2;
		m = m/1000;
		return m;
	}
	
	
	private static long random2(){
		long aStart = 1L;
		long aEnd = 922337L;
		Random aRandom = new Random();
		
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		//get the range, casting to long to avoid overflow problems
		long range = aEnd - aStart + 1;
		// compute a fraction of the range, 0 <= frac < range
		long fraction = (long)(range * aRandom.nextDouble());
		long randomNumber =  (fraction + aStart);    
		return randomNumber;
	}
	
	private static boolean isPrime(long num) {
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		for (int i = 3; i * i < num; i += 2)
			if (num % i == 0) return false;
		return true;
	}
	
	public static void main(String[] arguments) {
		long r1,r2,r3;
		boolean result;
		int len;
		pseudorandom p = new pseudorandom();
		List<Long> listA = new ArrayList<Long>();
		
			
		for (int i=1;i<1000;i++){
			if(listA.size() < 10){
				r1 = p.random1();
				r2 = p.random2();
				System.out.println(r1);
				System.out.println(r2);
			
				if(r1<1){
					r1 = Math.abs(r1);
				}
				
				r3 = (r1/3) + (r2/4);
				if(r3<1){
					r3 = Math.abs(r1);
				}
				result = p.isPrime(r3);
				if (result == true){
					listA.add(r3);
				}
			}
		}
			
			System.out.println(listA);
		
		
	}
}