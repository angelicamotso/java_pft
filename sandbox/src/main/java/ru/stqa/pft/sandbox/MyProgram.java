package ru.stqa.pft.sandbox;

public class MyProgram {
	public static void main(String[] args) {

		hello("Angelica");
		hello("Dima");

		Square s = new Square(5);
    System.out.println("площадь квадрата со стороной" + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("площадь квадрата со сторонами" + r.a + " & " + r.b + " = " + r.area());
	}

	public static void hello (String one) {
    System.out.println("Hello," + one + "!");
  }


}