package cau3;

import java.util.Scanner;

public class Main {
//    Mảng con:
//    Cho mảng A[] gồm N phần tử, mảng B gồm M phần tử. Nhiệm vụ của bạn là xác định xem B có phải là một mảng con
//            (không cần liên tiếp nhưng cần giữ đúng thứ tự các phần tử) của mảng A hay không
//
//    Ví dụ: Mảng A[] = {1, 1, 2, 8, 9, 3, 4}, B[] = {1, 2, 9, 4} là một mảng con của mảng A
static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số lượng phần tử mảng 1: ");
    int n = Integer.parseInt(sc.nextLine());
    int[] arr1 = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        arr1[i] = Integer.parseInt(sc.nextLine());
    }
    System.out.print("Nhập số lượng phần tử mảng 2: ");
    int m = Integer.parseInt(sc.nextLine());
    int[] arr2 = new int[n];
    for (int i = 0; i < m ; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        arr2[i] = Integer.parseInt(sc.nextLine());
    }
    int currentIndex=-1;
    for(int i=0;i<m;i++){
        int flag=0;
        for(int j=i+1;j<n;j++){
            if(arr1[i]==arr2[j]){
                flag=1;

                if(j>currentIndex){
                    currentIndex=j;

                }else{
                    System.out.println("Mảng B không phải là mảng con của A");
                    return;
                }
            }
        }
    }
    System.out.println("Mảng B là mảng con của A");


}
}
