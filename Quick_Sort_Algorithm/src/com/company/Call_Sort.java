package com.company;

public class Call_Sort {

    public static void main(String[] args) {
        int array1 [] = {1,6,-5, -10, 50,6,4,35,0, 3,5,8,10, 7, 2,38,4, 2, 11,77,99,54,81};
        System.out.println("This is an  array before a quick sort  method:");
        for (int v:array1) System.out.printf(v+ "\t");
        System.out.println();
        System.out.println(" This is an array after  a quick sort method: ");
        Quick_Sort.sortQuickly(array1);
           for (int b:array1) System.out.printf(b+"\t");
        System.out.println();

    }
}
