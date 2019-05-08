package com.example.algorithm;

import static java.lang.Math.floor;

import java.util.Scanner;

/**
 * @author lei
 * @create 2018/10/15 18:53.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//生成Scanner对象
        while (sc.hasNext()) {
            int n  = sc.nextInt(); //读下一个整型字符串
            String flag = sc.nextLine();
            print(n,flag);
        }
        sc.close(); //用完后关闭扫描器是一个好的习惯
    }


    public static void  print(int x,String flag){
        flag = flag.trim();
       int n = (int) floor(Math.sqrt(((x+1))/2));
        for(int i=0; i<n; i++){
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-1-2*i;j++){
                System.out.print(flag);
            }
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-1-2*i;j++){
                System.out.print(flag);
            }
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(x-(2*n*n-1));
    }

}
