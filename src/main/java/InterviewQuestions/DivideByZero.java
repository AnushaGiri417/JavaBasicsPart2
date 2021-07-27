package InterviewQuestions;

public class DivideByZero {
    public static void main(String[] args) {
        /**
         * What will be the output when you divide a number by zero?
         * Number = Interger, Double, Float
         */
     //   System.out.println(5/0); //Throws ArithmeticException
        System.out.println(9.0/0); //Doesn't throw any ArithmeticException  //output - Infinity
        System.out.println(9/0.0); //output - Infinity
        System.out.println(12.33f/0); //output - Infinity
        System.out.println(19.99999d/0); //output - Infinity

        //   System.out.println(0/0); //Throws ArithmeticException because both are integers

        System.out.println(0.0/0); //output - NaN  (value defined in double class; means like a null value)
        System.out.println(0.0/0.0); //output - NaN (Not a Number)
        System.out.println(12.33/0.0);


    //If we divide a double or floating number it will give Infinity not ArithmethicException
    }
}
