package com.Arrays;

public class Arrays3D {
    public static void main(String[] args) {
     //Declare int[][][]a;
     //Create a=new int[2][3][5]; (Numbers in bracket determine the size of that particular array)

        int[][][] a= {{{10,20},{30,40,50},{60,70,80,90}}};

           for(int i=0; i<a.length; i++){
               for(int j=0; j<a[i].length; j++){
                   for(int k=0; k<a[i][j].length; k++){
                       System.out.print(a[i][j][k]+" ");
                   }
                   System.out.println();
               }
           }
    }
}
