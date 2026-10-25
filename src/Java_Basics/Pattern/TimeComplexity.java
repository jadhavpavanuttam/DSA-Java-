package Java_Basics.Pattern;

//find the member of number 'x' in given array
public class TimeComplexity {
    public static void main(String[] args) {
String t1= """
        Definition & Solution:
        
        time complexity is the way to program 
        language its own run
        optimized way of accessing the
        
        Definition solutions :
        depends on number of 
        operations / instructions are 
        depends on it's input size.
        """;
        System.out.println(t1);
        int c=0;
        for (int i = 1; i < 20; i*=2) {
            c++;
        }
        System.out.println(" \n\n Iterate time :"+c);
    }
}
/*
Logarithmic time notation :

log(2^k)=log a^b
log b^b=1
log a^b=log a^b/log c^a

Logarithmic Time Complexity :
O(Log(n))


time complexity :
time complexity is the way to program language its own run
optimized way of accessing the

Definition solutions :
depends on number of operations / instructions are depends on it's input size.

Asymptotic Analysis :

 ^
 |
 |<- Number of operation
 |
 |                 ::Asymptotic analysis
 |                    Growth of input is better as compare to
 |                     another algorithm then its known as Asymptotic notation
 |
 |
 |__________________ >

     Input  directly proportional to cases

 ^
 |
 |
 |<- Number of operation
 |
 |                 ::Asymptotic analysis
 |                    Growth of input is better as compare to
 |                     another algorithm then its known as Asymptotic notation
 |
 |__________________ >        Constant Time Complexity
 |   |   |   |          resp time is :t1,t2,t3...tn
 |___|___|___|______ >


Calculation :

Worst Case Time Complexity:

time complexity : O(n)  (big 'O 'order)

Best Case Time Complexity :

time complexity: O(1) / w(1) (omega)
represent constant order time complexity

Average Case Time Complexity : Theta (n) ->@(n) (theta)

 for(i=1 -> n)
 time complexity : O(n)

for(i=1 -> n)
for(j=1 -> n)
time Complexity : O(n*n) or O(n^2)

 Inner Loop:
  for(i=1->n)
    for(j=1->n)
       (m*n)->O(n ^2)
time complexity : O(n^2)

1+2+3+4+....+n
where n=9
Total.Operation= n*(n-1)/2
               =>9*8/2
               => 9^2   ::Ignore (n/2) short terms in the given quetions
     Answer is => 9^2 = 81


     in case of Square root : O(n*(Math.sqrt(n)))
::time complxty =n*(root(n))

Time Complexity:

Simple : O(1)
Iterative : O(n)
Logarithmic :O(log n) iterative
Logarithmic :O(n log n)
Nesting :O(n^2) ,O(n^3),or depends on the given input
it will takes more much times : O(n^n)

 */