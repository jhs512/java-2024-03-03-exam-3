package com.ll;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("계산기, 시작!");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            System.out.println("입력한 명령: " + cmd);
        }

        System.out.println("계산기, 종료!");
    }
}
