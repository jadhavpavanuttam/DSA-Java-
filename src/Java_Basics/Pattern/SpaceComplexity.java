package Java_Basics.Pattern;

public class SpaceComplexity {
    private static String space= """
            Definition :
            Extra memory / space used by an algorithm W.R.T Size
            Calculate Following :
            int val=0;
                    for (int i = 1; i < 10; i*=2) {
                        val++;
                    }
            """;
    static String example= """
            
            Qn.Calculate the time complexity for the following snippet
            
            int val=0
            for(i=1 to n w.r.t i+i)
                val++
            
            
            Iteration   |   i
            ____________|__________
                  1     |  1->2^0
                  2     |  2->2^1
                  3     |  3->2^2
                  4     |  4->2^3
                  5     |  5->2^4
                  6     |  6->2^5
                  7     |  7->2^6
                  8     |  8->2^7
            
            where , K represent number of steps
            & i represents power of 2 iteration k-1
            i=2^k-1
            
            Answer : O(log2 N)
            """;

    public static void main(String[] args) {
        System.out.println(space);
        int val=0;
        for (int i = 1; i < 10; i*=2) {
            val++;
        }
        System.out.println("Given Complexity is : "+val);
        System.out.println("i.e. O(n)");
        System.out.println(example);
    }
}

/*
Space Complexity :

O(n*m)
i=2^k-1

 2^k-1
 2^(k-1)-1,....
.
.
.
.
 2^1-1

 i.e: 2^0=1

 =>1,4,8,.....n

 Qn. Find k in case of n
  i<=n
  2^k <=n

  log2 2^k<=log2^n
  k log 2^2 <= log 2^n

Qn.Calculate the time complexity for the following snippet

int val=0
for(i=1 to n w.r.t i+i)
    val++


Iteration   |   i
____________|__________
      1     |  1->2^0
      2     |  2->2^1
      3     |  3->2^2
      4     |  4->2^3
      5     |  5->2^4
      6     |  6->2^5
      7     |  7->2^6
      8     |  8->2^7

where , K represent number of steps
& i represents power of 2 iteration k-1
i=2^k-1

Answer : O(log2 N)

Qn. Calculate following snippes


K=log2(n)
1+2+3+......+2^k
total=k+1 ~k

G.P (Geometric progression) :
a(r^n-1)/r-1

a=first
r=comman ratio
n=total number

k=log(n)
=>1(2^k-1)/2-1
=>1(2)/1
=>2
Final Answer is : 2
=O(n)


 */