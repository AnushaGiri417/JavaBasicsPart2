package InterviewQuestions;

public class NaN {
    public static void main(String[] args) {
        /**
         *
         * What is NaN - Not a Number?
         * How is NaN defined in different languages?
         * Java, C, C++, Ruby, Python, JavaScript
         *
         */

        //It is undefined number.
        System.out.println(2%0.0);
        System.out.println(Math.sqrt( -1 ));
        System.out.println(Float.NaN);
        System.out.println(Float.NaN == Float.NaN); //(Since both are not defined they cannot be compared. So the output is false)
        System.out.println(Float.NaN != Float.NaN); //true

        double nan = 2.1 % 0; // NaN
        System.out.println(2.1 % 0 == nan);
        System.out.println(nan == nan);

     //We cannot compare two NaN because they both are two undefined numbers
     //This behaviour is same over other programming languages

    }
}
