package org.example;

public class Array {
    public static void main(String[] args){

        int[] arr={33,5,2,6,7};
          //traversing an array
        for(int i=0; i<= arr.length-1; i++) {
            System.out.println(arr[i]);
        }

        int[] arr1={-3,45,6,-9};
        //find the sum of the array
        int sum =0;
        for (int i=0; i<= arr1.length-1;i++) {
         sum+=arr1[i];
        }
        System.out.println("sum of the array is "+ sum);

      //reversing an array
        int[] arr2={4,7,8,9,12};
        for (int i =arr2.length-1; i >=0 ; i--) {
            System.out.println(arr2[i]);
        }
         //find the second highest in the array

//        int[] first = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr2.length; i++) {
//
//            if (arr2[i] > first) {
//                second = first;
//                first = arr2[i];
//            }
//            else if (arr2[i] > second && arr2[i] != first) {
//                second = arr2[i];
//            }
//        }

//        System.out.println("Second Highest: " + second);

        //2D Arrays
        //Traversing an 2d array
        int[][] darr = {
                {-3,45},
                {6,-9}
        };
        for (int i=0; i<darr.length;i++) {
            for (int j = 0; j <darr[i].length ; j++) {
                System.out.println(darr[i][j] +" ");
            }
        }

        //sum of the array
//     Array:   int[][] darr = {
//                {-3,45},
//                {6,-9}
//        };
        int sum2d=0;
        for (int i = 0; i < darr.length ; i++) {
            for (int j = 0; j < darr[i].length ; j++) {
                sum2d+=darr[i][j];

            }
        }
        System.out.println("sum of the array is "+ sum2d);
        System.out.println();
        //reversing an 2d array
        for (int i = darr.length-1; i>=0 ; i--) {
            for (int j = darr[i].length-1; j>=0 ; j--) {
                System.out.println("Reversed Array is  "+ darr[i][j]);

            }
        }

//       Array: int[][] darr = {
//                {-3,45},
//                {6,-9}
//        };

        //find the second highest from the 2d array
        int first2d = Integer.MIN_VALUE;
        int second2d= Integer.MIN_VALUE;

        for(int i=0;i<darr.length;i++){
            for(int j=0;j<darr[i].length;j++){

                if(darr[i][j] > first2d){
                    second2d = first2d;
                    first2d = darr[i][j];
                }
                else if(darr[i][j] > second2d && darr[i][j] != first2d){
                    second2d = darr[i][j];
                }

            }
        }
        System.out.println();
        System.out.println("Second Highest: " + second2d);

    }
    }

