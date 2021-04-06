package com.Arrays;

public class StringSelectionSort {
    public static void main(String[] args) {

     //It sorts in alphabetical order

        String[] a={"anusha","ashmita","manisha","rista","bhumika","riyanshi"};
        int min;
        String temp="";
        for(int i=0; i< a.length; i++){
            min=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j].compareTo(a[min])<0){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
