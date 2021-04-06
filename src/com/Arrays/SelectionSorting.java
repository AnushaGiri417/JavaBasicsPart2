package com.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {

        int[] a= {38,52,9,18,6,62,13};

        int min;
        int temp=0;
        for(int i=0; i<a.length; i++){
            min=i;
            for(int j=i+1; j<a.length; j++){  //j=i+1 will leave the first element and then check from the next
                if(a[j]<a[min]){
                    min=j;       //see notes
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
