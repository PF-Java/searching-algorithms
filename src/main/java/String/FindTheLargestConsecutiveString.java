package String;

import java.util.Scanner;

public class FindTheLargestConsecutiveString {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String stringList = inputString.nextLine();

        //Tạo chuỗi con gồm các từ trong stringList
        String[] strings = stringList.split(" ");

        //Sắp xếp chuỗi con theo thứ tự không tăng(giảm dần)
        for (int i = 0; i < strings.length-1 ; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].length() < strings[j].length()) {
                    String tempString = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tempString;
                }
            }
        }
        //In ra chuỗi con có độ dài lớn nhất
        System.out.println("The lanrgest string is: " + strings[0]);

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }

        /*************************************
         * vòng lặp ngoài thực hiện n lần
         * vòng lặp trong thực hiện n lần
         * Số phép tính thực hiện là O(4) là hằng số C
         *
         * T(n)=O(n*n*4)=O(n2)
         */
    }
}
