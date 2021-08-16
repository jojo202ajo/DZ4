package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
            System.out.println(homeWork(geterateRandomAge(), tempRandom()));
            System.out.println(homeWork(geterateRandomAge(), tempRandom()));
            System.out.println(homeWork(geterateRandomAge(), tempRandom()));
            System.out.println(homeWork(geterateRandomAge(), tempRandom()));
            System.out.println(homeWork(geterateRandomAge(), tempRandom()));

        }

        public static String homeWork(int age, int temperature) {
            System.out.println("Возраст: " + age + " Температура: " + temperature);


            if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
                return  "Можно идти гулять";
            } else if (age > 20 && temperature >= 0 && temperature <= 28) {
                return  "Можно идти гулять";
            } else if (age > 45 && temperature >= -10 && temperature <= 25) {
                return  "Можно идти гулять";
            } else {
                return "Оставайтесь дома";
            }

        }
        public static int geterateRandomAge(){
            Random random = new Random();
            return random.nextInt(70);
        }
        public static int tempRandom(){
        Random random2 = new Random();
        return random2.nextInt(30);
        }

    }





