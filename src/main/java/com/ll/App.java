package com.ll;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("계산기, 시작!");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("명령) ");
                String cmd = scanner.nextLine();

                if (cmd.equals("종료")) break;

                System.out.println("입력한 명령: " + cmd);
            }
        }

        System.out.println("계산기, 종료!");
    }
}
