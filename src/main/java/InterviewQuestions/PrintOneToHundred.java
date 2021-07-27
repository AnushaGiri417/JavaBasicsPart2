package InterviewQuestions;

public class PrintOneToHundred {
    /**
    * Output numbers from 1 to 100
     * without using any numbers in your code.
    */

    public static void main(String[] args) {

        int one = 'A' / 'A'; //which is 1
        String str = ".........."; //using 10 dots

        for(int i=one; i<=(str.length()*str.length()); i++){
            System.out.print(i+" ");
        }

        System.out.println();
// 2nd way: Using ASCII ( American Standard Code for Information Interchange ) table where each characters on keyboard have a numeric value. So, on ASCII chart, value of d is 100
    //example:- a=97, b= 98; c=99; d=100; e= 101 ........z=122;

        for(int i=one; i<='d'; i+=one){
            System.out.print(i+" ");
        }

        System.out.println();

//3rd way:
        String s = "programmin";

        int zero = s.length() - s.length();
        int hundred = s.length() * s.length();

        for(int i = zero; i<=hundred; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

    //We can also do:
        int zero_ = "".length();
        int one_ = ".".length();
        int hundred_ = Integer.valueOf(Integer.toString(one_) + Integer.toString(zero_) + Integer.toString(zero_));
        for(int i = one_; i <= hundred_; i += one_)
            System.out.print(i+" ");

    }
}
