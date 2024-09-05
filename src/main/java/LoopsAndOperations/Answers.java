package LoopsAndOperations;

public class Answers {
    /*
    I use a switch statement for the different values that op can be
    This is cleaner than chaining a bunch of "else if" statements

    ** There is a better way to do this using something called an enhanced switch **
    ** See if you can figure out how to use it **
    */
    public int calculate(char op, int x, int y) {
        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            default:
                return x / y;
        }
    }

    /*
    I am going to use two variables 'a' and 'b' to get the answer
        a will be F(n-2)
        b will be F(n-1)
    As we loop I make one variable F(n-1) + F(n-2) and the other F(n-1)
     */
    public int fib(int n) {
        //if n < 2 we can't have two variables so just return the answer
        if (n < 2)  {
            if (n==0)  {
                return 0;
            }
            return 1;
        }

        //F(n-2)
        int a = 0;
        //F(n-1)
        int b = 1;

        //we start at 2 since we dealt with n being below 2
        for (int i = 2; i <= n; i++) {
            //create a temp variable to hold F(n-1)
            int t = b;

            //add F(n-2) to 'b'
            b += a;
            //set 'a' to the temp variable
            a = t;
        }

        //Since we are done looping 'b' is F(N)
        return b;
    }

    /*
    Here I made a for loop starting from 0 and ending on n-1
    I then assigned the appropriate values for the array index
    For each if statement I put continue at the end
        This is cleaner than chaining else if statements
        This also goes to the next value immediately instead of reading the rest of the block


    ** There are many ways to do this! **
    ** See if you can clean this up using an object called StringBuilder **
     */
    public String[] fizzBuzz(int n) {
        String[] result = new String[n];

        //for loop from i to n-1
        for (int i = 0; i < n; i++) {

            //checks if divisible by both
            if (i % 3 == 0  &&  i % 5 == 0) {
                result[i] = "fizzbuzz";
                continue;
            }
            //check if divisible by 3
            if (i  %  3 == 0)  {
                result[i] = "fizz";
                continue;
            }
            //check if divisible by 5
            if (i  % 5 == 0)  {
                result[i]  =  "buzz";
                continue;
            }

            //convert int into a string for the array
            result[i] = Integer.toString(i);
        }
        return result;
    }
}
