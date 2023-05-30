
public class EulerTo50 {

	public static void main(String[] args) {
		Q5_SmallestMultiple();
	}
	//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

	public static void Q5_SmallestMultiple() {
		
		//primes within 20
		String factors = "";
		
		for (int i = 1; i < 21; i++) {
			factors += primeFactors(i)+ ", ";
	
		}
		String[] factorsList = factors.split(",");
		for (int i = 1; i < 20; i++) {
			System.out.print(factorsList[i] + " " +(i+1));
		}
		
		

	}

	public static String primeFactors(int n)
    {
		String end = "";
        // Print the number of 2s that divide n
		if (n == 1){
			return end += 1;
		}
        while (n%2==0)
        {
            
            end += 2;
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                end += i;
                n /= i;
            }
        }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            end+=n;
        
        return(end);
    }
}
