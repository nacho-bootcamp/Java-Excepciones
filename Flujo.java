public class Flujo {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    metodo1();
    System.out.println("Fim do main");
  }

  public static void metodo1() {
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }

  public static void metodo2() {
    System.out.println("Ini do metodo2");
    for (int i = 1; i <= 5; i++) {
      System.out.println("i");
      try {
        int num = 0;
        int resultado = i / num;
      } catch (NullPointerException exepcion) {
        System.out.println("Atrapo nullPointer");
        System.out.println(exepcion.getMessage());
        exepcion.printStackTrace();
      } catch (ArithmeticException exepcion) {
        System.out.println("Atrapo Arithmetic");
        System.out.println(exepcion.getMessage());
        exepcion.printStackTrace();
      }
      // cath(NullPointerException |ArithmeticException exeption)
      // esa es otra manera
    }
    System.out.println("Fim do metodo2");
  }
}