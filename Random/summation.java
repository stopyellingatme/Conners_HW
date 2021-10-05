public class j {

  public static void n10() {
    long n = 10;

    long runtime_1 = System.nanoTime();
    long runtime_2 = System.nanoTime();

    long e_total = 0;

    // This is Itteration based on the Summation equation
    for (long y = 1; y <= n; y++) {
      e_total += y;
    }

    long diff_runtime = runtime_2 - runtime_1;

    runtime_1 = System.nanoTime();
    long right_runtime = n * n / 2;

    runtime_2 = System.nanoTime(); // Re-assign runtime_2

    // Calculate Simple (Right) Equation Runtime
    long diff_runtime_right = runtime_2 - runtime_1;

    // Check error percentage
    float s = 1f * (right_runtime - e_total) / e_total * 100;
    float a =
      1f * (diff_runtime - diff_runtime_right) / diff_runtime_right * 100;

    System.out.println(
      "For n=" + n + ", the estimation method error: " + s + "%."
    );
    System.out.println("the exact method is: " + a + "% longer.");
  }

  public static void n100() {
    long n = 100;

    long runtime_1 = System.nanoTime();
    long runtime_2 = System.nanoTime();

    long e_total = 0;

    // This is Itteration based on the Summation equation
    for (long y = 1; y <= n; y++) {
      e_total += y;
    }

    long diff_runtime = runtime_2 - runtime_1;

    runtime_1 = System.nanoTime();
    long right_runtime = n * n / 2;

    runtime_2 = System.nanoTime(); // Re-assign runtime_2

    // Calculate Simple (Right) Equation Runtime
    long diff_runtime_right = runtime_2 - runtime_1;

    // Check error percentage
    float s = 1f * (right_runtime - e_total) / e_total * 100;
    float a =
      1f * (diff_runtime - diff_runtime_right) / diff_runtime_right * 100;

    System.out.println(
      "For n=" + n + ", the estimation method error: " + s + "%."
    );
    System.out.println("the exact method is: " + a + "% longer.");
  }

  public static void n1000() {
    long n = 1000;

    long runtime_1 = System.nanoTime();
    long runtime_2 = System.nanoTime();

    long e_total = 0;

    // This is Itteration based on the Summation equation
    for (long y = 1; y <= n; y++) {
      e_total += y;
    }

    long diff_runtime = runtime_2 - runtime_1;

    runtime_1 = System.nanoTime();
    long right_runtime = n * n / 2;

    runtime_2 = System.nanoTime(); // Re-assign runtime_2

    // Calculate Simple (Right) Equation Runtime
    long diff_runtime_right = runtime_2 - runtime_1;

    // Check error percentage
    float s = 1f * (right_runtime - e_total) / e_total * 100;
    float a =
      1f * (diff_runtime - diff_runtime_right) / diff_runtime_right * 100;

    System.out.println(
      "For n=" + n + ", the estimation method error: " + s + "%."
    );
    System.out.println("the exact method is: " + a + "% longer.");
  }

  public static void main(String[] args) {
      n10();
      n100();
      n1000();
  }
}
