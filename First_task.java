package com.company;

import java.util.Scanner;

public class First_task {
    public static void recurrent(int num, int i)
    {
        if(i<=num)
        {
            if((i%3!=0)&&(i%5!=0))
            {
                System.out.print(i + " ");
            }
            else if((i%3==0)&&(i%5!=0))
            {
                System.out.print("Fizz ");
            }
            else if((i%3!=0)&&(i%5==0))
            {
                System.out.print("Buzz ");
            }
            else if((i%3==0)&&(i%5==0)) {
                System.out.print("FizzBuzz ");
            }
        }
        if(i>num) return;
        i++;
        recurrent(num, i);

    }
    public static void cycle(int num)
    {
        for(int i=1;i<=num; i++)
        {
            if((i%3!=0)&&(i%5!=0))
            {
                System.out.print(i + " ");
            }
            else if((i%3==0)&&(i%5!=0))
            {
                System.out.print("Fizz ");
            }
            else if((i%3!=0)&&(i%5==0))
            {
                System.out.print("Buzz ");

            }
            else if((i%3==0)&&(i%5==0))
            {
                System.out.print("FizzBuzz ");
            }
        }
    }

    public static void main(String[] args) {
            System.out.println("Первое задание.");
	        Scanner in = new Scanner(System.in);
	        int num;
	        do{
                System.out.print("Введите число num: ");
	            num = in.nextInt();
	            if(num<=0) System.out.println("Ошибка, введите корректное число!");
            }while(num<=0);
	        System.out.println("Решение циклами: ");
	        cycle(num);
	        System.out.println("Решение рекурсией: ");
	        recurrent(num, 1);
    }
}
