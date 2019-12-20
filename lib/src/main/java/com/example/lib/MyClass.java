package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int answer = (int) (Math.random() * 100 + 1);
        int yourAnswer;
        do {
            counter++;
            System.out.print("你猜的数字是多少：");
            yourAnswer = sc.nextInt();
            if (yourAnswer == answer) {
                System.out.println("恭喜你，答对了！");
                System.out.println("你猜了" + counter + "次");
            } else if (yourAnswer > answer) {
                System.out.println("還要小一点！");
            } else {
                System.out.println("還要大一点!");

            }
        } while (yourAnswer != answer);

    }
}