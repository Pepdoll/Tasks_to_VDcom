package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Third_task {

    public static void main(String[] args) {
        System.out.println("Третье задание");
        Scanner in = new Scanner(System.in);
        ArrayList<Data> data_base = new ArrayList<>();
        Double res;
        do {
            System.out.println("Введите данные: ");
            String s = in.nextLine();
            String[] new_str = s.split(" ");

            if (!new_str[3].equals("?")) {
                String temp;
                Double temp2;
                Double first = Double.parseDouble(new_str[0]);
                Double second = Double.parseDouble(new_str[3]);
                if(first>second)
                {
                    temp=new_str[4];
                    new_str[4]=new_str[1];
                    new_str[1]=temp;
                    temp2=second;
                    second=first;
                    first=temp2;
                }
                Double k1 = second / first;
                Double k2 = first/second;
                Data data1 = new Data(new_str[1],new_str[4], k1);
                Data data2 = new Data(new_str[4],new_str[1], k2);
                data_base.add(data1);
                data_base.add(data2);
            }
            else
            {
                for(Data o:data_base)
                {
                    if(o.first.equals(new_str[4]))
                    {
                        for(Data b:data_base)
                        {
                            if(o.second.equals(b.first))
                            {
                                for(Data d:data_base)
                                {
                                    if((b.second.equals(d.first))&&(b.first.equals(d.second)))
                                    {
                                        res=d.koef/o.koef*Double.parseDouble(new_str[0]);
                                        System.out.println(new_str[0]+" "+new_str[1]+" = "+res+" "+new_str[4]);
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }while(true);
    }
}
