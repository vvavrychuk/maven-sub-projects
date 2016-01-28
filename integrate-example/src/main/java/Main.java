class Main {
  public static void main(String[] args) {
    Integrate integrate = new Integrate(0, Math.PI, 100);
    double value = integrate.integrate(Math::sin);
    System.out.println(value);
  }
}