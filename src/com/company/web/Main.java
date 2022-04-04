package com.company.web;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer temp;
        boolean isNeedSort = true;
        //bubble
//        while(isNeedSort){
//            isNeedSort=false;
//            for (int i = 0; i < array.length-1; i++) {
//                if(array[i]>array[i+1]){
//                    temp=array[i];
//                    array[i]=array[i+1];
//                    array[i+1]=temp;
//                    isNeedSort=true;
//                    continue;
//                }
//            }
//        }
        // Insert
//        for (int i = 1; i < array.length; i++) {
//            Integer current = array[i];
//            Integer j=i-1;
//            while (j>=0 && current<array[j]){
//                array[j+1]=array[j];
//                j--;
//            }
//            array[j+1]=current;
//        }

        // Choise
//        for (int i = 0; i <array.length ; i++) {
//            Integer min=array[i];
//            Integer minId=i;
//            for (int j = i+1; j <array.length ; j++) {
//                if(array[j]<min){
//                    min=array[j];
//                    minId=j;
//                }
//            }
//            Integer temp1=array[i];
//            array[i]=min;
//            array[minId]=temp1;
//        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
