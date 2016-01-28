import java.util.function.Function;

public class Integrate {
  private double a;
  private double b;
  private int n;

  public Integrate(double a, double b, int n) {
    this.a = a;
    this.b = b;
    this.n = n;
  }

  public double weight(int j) {
    double h = (b - a) / n;
    if ((j == 1) || (j == n + 1))
      return 0.5 * h;
    else
      return h;
  }

  public double node(int j) {
    return a + (b - a) / n * (j - 1);
  }

  public double integrate(Function<Double, Double> f) {
    double value = 0;
    for (int j = 1; j <= n + 1; j++) {
      value += weight(j) * f.apply(node(j));
    }
    return value;
  }
}