
public class EulerTo50 {

	public static void main(String[] args) {
		Q5_SmallestMultiple();
	}
	//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

	public static void Q5_SmallestMultiple() {
		
		//primes within 20
		Integer[][] factors = new Integer [20][4];
		
		int count = 0;
		for (int i = 10; i < 21; i++) {
			factors[count] = primeFactors(i);
			count++;
	
		}
		
		for (int i = 0; i < factors.length; i++) {
			System.out.println("");
			for (int j = 0; j < factors[i].length; j++) {
				if(factors[i][j] != null) {
					System.out.print(factors[i][j]+", ");
				}
				
			}
		}
		
		

	}

	public static Integer[] primeFactors(int n)
    {
		Integer[] endfactors = new Integer[4];
        // Print the number of 2s that divide n
		if (n == 1){
			endfactors[0] = 1;
			return endfactors;
		}
		
		int factor_counter = 0;
        while (n%2==0)
        {
            
            endfactors[factor_counter] = 2;
            n /= 2;
            factor_counter++;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                endfactors[factor_counter] = i;
                n /= i;
                factor_counter++;
            }
        }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            endfactors[factor_counter] = n;
        	
        
        return(endfactors);
    }
}
