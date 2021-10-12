public static int[] primesNums(int[] array) {
    // write your code here (java.util.Arrays is already imported)
    int [] primes = new int[array.length];
        boolean isPrime = true;
        int primesIndex = 0;
        for (int i : array) 
        {
            if( i == 1 || i == 0)
                continue;
            int sqrtI = (int)Math.floor(Math.sqrt(i));
            for( int j = 2; j <= sqrtI; j++)
            {
                if( i%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(!isPrime)
            {
                isPrime = true;
                continue;
            }
                
            primes[primesIndex++] = i;
            
        }
 
        return Arrays.copyOf(primes, primesIndex);
    
  }
