public class Conexion {
  public Conexion() {
    System.out.println("Abriendo conexion");
  }

  public void leerDatos() {
    System.out.println("Recibiendo datos");
    throw new IllegalStateException();
    // es cuando la conexion no es exitosa
  }

  public void cerrar() {
    System.out.println("Cerrando conexion");
  }
}
