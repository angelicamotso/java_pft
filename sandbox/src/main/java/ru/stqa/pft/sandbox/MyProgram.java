package ru.stqa.pft.sandbox;

public class MyProgram {
	public static void main(String[] args) {

		hello("Angelica");
		hello("Dima");

		double l = 5;
    System.out.println("площадь квадрата со стороной" + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("площадь квадрата со сторонами" + a + " & " + b + " = " + area(a,b));
	}

	public static void hello (String one) {
    System.out.println("Hello," + one + "!");
  }

  public static double area (double l) {
	  return l * l;
  }

  public static double area (double a, double b) {
	  return a * b;
  }
}