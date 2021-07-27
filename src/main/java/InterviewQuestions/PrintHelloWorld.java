package InterviewQuestions;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintHelloWorld {
    public static void main(String[] args) {
        /**
         * Print Hello world witout using semi colon ';' in your code
         *
         *  backslash \n generates a new line
         */

    //1
        if(System.out.printf( "Hello World \n"  ) ==null){
        }


    //2
        if(System.out.append( "Hello World \n" )==null){
        }


    //3
        if(System.out.append( "Hello World \n" ).equals( null )){
            String str = "Hello world";

        }
        System.out.println("------------------------------------------------------------------------------------------------------");
        /**
         * Print "Hello World" without System.out.println()
          */
        try {
            System.out.write( "Hello world \n".getBytes() );   //1
            System.out.format("%s", "Hello World \n");          //2
            PrintStream myOutput = new PrintStream( new FileOutputStream( FileDescriptor.out ) );  //3
            myOutput.print( "Hello world" );
            System.err.print( "Hello World" );      //4
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.console().writer().println("Hello world");  //throws null pointer exception
        /**
         *  System.console() gives NULL if we run in IDE instead of  running the code in the command prompt or terminal
         */

    }
}
