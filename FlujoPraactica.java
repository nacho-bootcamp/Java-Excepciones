public class FlujoPraactica {
  public static void main(String[] args) {
    System.out.println("Ini do main");
    metodo1();
    System.out.println("Fim do main");
  }

  public static void metodo1() {
    try {
      metodo2();
    } catch (NewException | NullPointerException | ArithmeticException ex) {
      String msg = ex.getMessage();
      System.out.println("Exception" + msg);
      ex.printStackTrace();
    }
  }

  public static void metodo2() {
    System.out.println("Ini do metodo2");
    throw new MiException("Mi excepcion fue lanzada");
  }
}
