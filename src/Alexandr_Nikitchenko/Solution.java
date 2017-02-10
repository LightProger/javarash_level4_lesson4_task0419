package Alexandr_Nikitchenko;
/*
Найти максимум четырех чисел и вывести на экран, если все числа равны между собой, вывести любое 
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        // Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snum1 = reader.readLine();
        String snum2 = reader.readLine();
        String snum3 = reader.readLine();
        String snum4 = reader.readLine();

        // Перевод из строки в число
        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);
        int num3 = Integer.parseInt(snum3);
        int num4 = Integer.parseInt(snum4);

        // Рассчет максимального числа из 4 введеных и вывод на экран
        if(num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println(num1);
        }else if(num2 > num1 && num2 > num3 && num2 > num4){
            System.out.println(num2);
        }else if(num3 > num2 && num3 > num1 && num3 > num4){
            System.out.println(num3);
        }else if(num4 > num2 && num4 > num3 && num4 > num1){
            System.out.println(num4);
        } else   {
            System.out.println(num1);
        }

    }
}
