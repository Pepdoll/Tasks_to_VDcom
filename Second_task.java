package com.company;

import java.io.*;
import java.util.Scanner;

public class Second_task {


    public static void main(String[] args) throws IOException {
        System.out.println("Второе задание.");
        Scanner in = new Scanner(System.in);
        int num, write_num=0;
        int check=0;
        File file = new File("out.txt");
        DataInputStream dis = null;
        DataOutputStream dos = null;
        byte[] buffer = new byte[32768];
        do {
            System.out.print("Введите число num: ");
            num = in.nextInt();
            if ((num <= 0) || (num % 2 != 0)) System.out.println("Ошибка, введите корректное число!");
        } while ((num <= 0) || (num % 2 != 0));
        do {
            dis = new DataInputStream(new FileInputStream(file));
            dos = new DataOutputStream(new FileOutputStream(file));
            String s = Integer.toString(write_num);
            dos.writeUTF(s);
            dos.flush();
            s=dis.readUTF();
            write_num=Integer.parseInt(s);
            write_num++;
            dis.close();
            dos.close();
        }while(write_num<=num);
        write_num--;
        System.out.println("Результат: "+write_num);
    }
}
