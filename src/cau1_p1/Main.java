package cau1_p1;

import java.util.Scanner;

public class Main {
//    1. Phần 1:
//    Nhập vào một chuỗi ký tự hỗn hợp (bao gồm chữ cái, số và ký tự đặc biệt) từ bàn phím. Ví dụ: "a1b2c d3ef 45 gh"
//    Tách số và tính tổng: Trích xuất tất cả các ký tự số có trong chuỗi, coi các chuỗi số liên tiếp là một số nguyên,
//    sau đó tính tổng chúng

     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        String input=sc.nextLine();
        if(input.trim().length()==0){
            System.out.println("Lỗi: không nhập nội dung");
        }else{

            String temp="";
            for(int i=0;i<input.length();i++){
                char c = input.charAt(i);
                if(c>'a' && c<'z'|| c>'A' && c<'Z'){
                    temp+=" ";
                }
                else if(c>='0' && c<='9'){
                    temp+=c;
                }
            }
            int total=0;
            System.out.println(temp.trim().replaceAll("\\s+"," "));
            String[] temp2=temp.trim().replaceAll("\\s+"," ").split(" ");
            for(int i=0;i<temp2.length;i++){
                total+=Integer.parseInt(temp2[i]);
            }
            System.out.println(total);







//            String num="";
//            int flag=0;
//            for(int i=0;i<input.length();i++){
//                String temp=input;
//                char c = input.charAt(i);
//                if(c>='a' && c<='z'||c>='A' && c<='Z'){
//
//                    flag=1;
//                }
//                if(flag==1){
//
//                    num="";
//                }
//                if(c>='0' && c<='9'){
//                    flag=0;
//                    num+=c-'0';
//                }
//                if(flag==0){
//                    System.out.println(num);
//                }
//            }
        }
    }
}
