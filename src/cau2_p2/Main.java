package cau2_p2;

import java.util.Scanner;

public class Main {
//    2. Phần 2:
//    Tìm phần tử lặp lại (Find Duplicate)
//    Hãy nhập vào số phần tử và nhập vào mảng, các số nằm trong khoảng [1, n].
//    Có duy nhất một số bị lặp lại, hãy tìm số đó
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n=Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ "+i+": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }
}
