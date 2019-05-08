package com.example.baseAlgotithm;

/**
 * @author lei
 * @create 2018/11/05 19:27.
 */
public class SelectionSort {

    public static int[] selectionSort(int[] list){
        if(list != null && list.length > 0){
            int[] result = new int[list.length];
            for(int i = 0; i < list.length; i++){
                int max=list[i];
                int index = i;
                for(int j=i+1; j<list.length; j++){
                    if(list[j] > list[i]){
                        max = list[j];
                        index = j;
                    }
                }
                if(index != i){
                    list[index] = list[i];
                    list[i] = max;
                }
                System.out.println(max);
            }
            return result;
        }
        return null;
     }


    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,6,7,8,9};
        selectionSort(list);
    }

}
