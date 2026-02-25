package cau1_p2;

import java.util.Scanner;
//2. Phần 2:
//Đếm tần suất xuất hiện của ký tự
//Hãy nhập vào 1 chuỗi bất kỳ và in ra số lần xuất hiện của mỗi ký tự trong chuỗi đó
//(Lưu ý phân biệt chữ hoa chữ thường)
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        String input=sc.nextLine();
        if(input.trim().length()==0){
            System.out.println("Lỗi: không nhập nội dung");
        }else{

            for(int i=0;i<input.length();i++){
                int count=1;
                for(int j=i+1;j<input.length();j++){
                    if(input.charAt(i)==input.charAt(j)){
                        count++;

                    }

                }

                boolean flag=false;
                for(int k=0;k<i;k++){
                    if(input.charAt(k)==input.charAt(i)){
                        flag=true;
                    }
                }
                if(!flag){
                    System.out.print(input.charAt(i));
                    System.out.print(": ");
                    System.out.print(count);
                    System.out.print("\n");
                }
            }

        }
    }
}
