
import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    System.out.println("Hello world!");
    final int a = 2;
    final int b = 3;
    int zad3 = 0;
    int n = 100;
    final Scanner liczba_a = new Scanner(System.in);
    System.out.print("Twoja liczba A to  ");
    final double x = liczba_a.nextDouble();
    final Scanner liczba_b = new Scanner(System.in);
    System.out.print("Twoja liczba B to  ");
    final double y = liczba_b.nextDouble();
    System.out.println("Wprowadziles A " + x);
    System.out.println("Wprowadziles B " + y);
    System.out.format("Suma zadeklarowanych liczb %d\n", a + b);
    System.out.print("(1 – dla sumy, 2 – dla różnicy, 3 – dla iloczynu, 4 – dla ilorazu)\n");
    final Scanner liczba_z = new Scanner(System.in);
    System.out.print("(Co chcesz zrobic:  ");
    final int z = liczba_z.nextInt();
    if (z > 0 && z <= 4) {
      zad3 = z;
    } else {
      System.out.println("nie miesci sie w przedziale");
    }
    // System.out.println("debug:rozmiar: " + zad3);
    double suma = 0;
    switch (zad3) {
      case 1:
        suma = x + y;
        break;
      case 2:
        suma = x - y;
        break;
      case 3:
        if (x == 0 || y == 0) {
          suma = 0;
          break;
        }
        suma = x * y;
        break;
      case 4:
        if (x == 0 || y == 0) {
          System.out.print("Nie mozna dzielic przez 0\n");
          break;
        }
        suma = x / y;
        break;
    }
    System.out.println("Suma = " + suma);

    for (int parzyste = 1; parzyste <= n; parzyste++) {
      if (parzyste % 2 == 0) {
        System.out.println(parzyste);
      }
    }
    // jebac te liczby pierwsze XD
    liczbypierwsze.main(args);
  }
}
