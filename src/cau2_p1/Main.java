package cau2_p1;

import java.util.Scanner;

public class Main {
//    1. Phần 1:
//    Nhập vào mảng số nguyên arr gồm n phần tử
//    Thống kê tần suất: Đếm số lần xuất hiện của từng phần tử trong mảng
//    Ví dụ: [1, 2, 1, 3, 2] --> 1 xuất hiện 2 lần, 2 xuất hiện 2 lần, 3 xuất hiện 1 lần
//    Lưu ý: In ra kết quả sao cho mỗi số chỉ liệt kê 1 lần (Tránh in lặp lại)
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
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            boolean flag=false;
            for(int k=0;k<i;k++){
                if(arr[k]==arr[i]){
                    flag=true;
                }
            }
            if(!flag){
                System.out.printf("Số %d xuất hiện: %d lần\n",arr[i],count);
            }
        }
    }
}
