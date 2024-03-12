import java.lang.Math;

public class liczbypierwsze {
  public static void main(String[] args) {
    for (int n = 0; n <= 100; n++) {
      boolean pierwsza = true;
      if (n <= 1) {
        pierwsza = false;
      } else {
        for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
            pierwsza = false;
            break;
          }
        }
      }
      if (pierwsza) {
        System.out.println("Liczba " + n + " jest liczbą pierwszą");
      }
    }
  }
}