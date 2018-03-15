package ru.stqa.em.sandbox;

public class MyFirstProgram11 {

  public static void main(String[] args) {
    hello("world");
    hello("User");
    hello("Max");

    Square s = new Square(5);
    System.out.println("Площаадь квадрата со стороной  " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,7);
    System.out.println("Площаадь прямоугольника со сторонами " + r.a + " и " + r.b + "=" + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}