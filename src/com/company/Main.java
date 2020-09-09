package com.company;
//import java.util.concurrent.ThreadLocalRandom;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        mojnoGulyatIliNet((int) (Math.random() * (100 - 15 + 1) + 15), 25);
        print();
        print();
        print();
        print();
        print();
        vozrastUgadai(1988, 2020);
        generateRandom();
        randomNew();

    }

    // В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.
  public static void mojnoGulyatIliNet(int randomaAge, int temp) {
      Random newAge = new Random();
      int maxAge = 60;
      int randomAge = newAge.nextInt(maxAge);
        /*
        1- если возраст человека от 20 до 45 лет и температура на улице от -20 до 30
        градусов, то возвращаемый результат - “Можно идти гулять”;
        2- eсли же человеку меньше 20 лет и температура на улице в диапазоне от 0
        до 28 градусов, то результат снова - “Можно идти гулять”;
        3- а если человеку больше 45 лет, то результат “Можно идти гулять” формируется
        только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
        4- В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
        */
      System.out.println(randomAge);
      if (randomAge > 20 && randomAge < 25 && temp > -20 && temp < 30) {
          System.out.println("1- Можно идти гулять");
      }
      if (randomAge < 20 && temp > 0 && temp < 28) {
          System.out.println("2- можно идти гулять");
      }
      if (randomAge > 45 && temp > -10 && temp < 25) {
          System.out.println("3- можно идти гулять");
      } else {
          System.out.println("4- Оставайтесь дома");
      }
  }
    public static void print() {
        System.out.println("точно так надо1");
        System.out.println("точно так надо2");
        System.out.println("точно так надо3");
    }

    public static void vozrastUgadai(int godRojdeniya, int tekuwiyGod) {
        int result = tekuwiyGod - godRojdeniya;
        System.out.println("вам сейчас " + result + " года");
    }

    public static void generateRandom() {
        //Math.random() * (max - min + 1) + min
        int min = 10;
        int max = 100;
        int randomAge = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("1 - метод случайных чисел " + randomAge);
    }

    public static void randomNew() {
        Random ageMetod2 = new Random();
        int ageDo = 100;
        int randomAge2 = ageMetod2.nextInt(ageDo);
        System.out.println("2 - метод случайных чисел " + randomAge2);
    }

    //не смог сделать данным методом
    /*
    public class ThreadLocalRandom {
      int int_random = ThreadLocalRandom.current().nextInt();
      System.out.println("Random Integers: "+int_random);
    }
    */


}

