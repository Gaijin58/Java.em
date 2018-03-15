package ru.stqa.em.sandbox;

public class MyFirstProgram11 {

  public static void main(String[] args) {
    hello("world");
    hello("User");
    hello("Max");

    double l = 5;
    System.out.println("Площаадь квадрата со стороной  " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площаадь прямоугольника со сторонами " + a + " и " + b + "=" + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}