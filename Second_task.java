package com.company;

import java.io.*;
import java.util.Scanner;

public class Second_task {


    public static void main(String[] args) throws IOException {
        System.out.println("Второе задание.");
        Scanner in = new Scanner(System.in);
        int num, write_num=0;
        do {
            System.out.print("Введите число num: ");
            num = in.nextInt();
            if ((num <= 0) || (num % 2 != 0)) System.out.println("Ошибка, введите корректное число!");
        } while ((num <= 0) || (num % 2 != 0));
        do {
            File file = new File("out.txt");
            FileWriter writer = new FileWriter(file, false);
            FileReader fr = new FileReader(file);
            Scanner sc = new Scanner(fr);
            String s = Integer.toString(write_num);
            writer.write(s);
            writer.flush();
            s = sc.nextLine();
            write_num = Integer.parseInt(s);
            write_num++;
            writer.close();
        }while(write_num<=num);
        write_num--;
        System.out.println("Результат: "+write_num);
    }
}
