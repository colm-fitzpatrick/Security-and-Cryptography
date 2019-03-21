import java.math.BigInteger;
import java.util.Random;
 
public class Linear_Congruential_Random_Numbers
{
    public static void main(String args[])
    {
        BigInteger n = new BigInteger(16, new Random(){});
        Random rand = new Random();
        BigInteger m = new BigInteger("65536");//2^16
		StringBuilder sb2 = new StringBuilder();
 
        for(int i=0; i<3; i++)
        {
            sb2.append(n);
            BigInteger a = new BigInteger(16, new Random(){});
            BigInteger c = new BigInteger(16, new Random(){});
            n = ((a.multiply(a)).add(c)).mod(m);
        }
		String str2 = sb2.toString();
		Double bbsrandomnum2= Double.parseDouble(str2);
		System.out.println(bbsrandomnum2);
    }
}