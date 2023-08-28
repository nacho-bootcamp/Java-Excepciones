public class Conexion implements AutoCloseable {
  public Conexion() {
    System.out.println("Abriendo conexion");
  }

  public void leerDatos() {
    System.out.println("Recibiendo datos");
    // es cuando la conexion no es exitosa
    throw new IllegalStateException();
  }

  public void cerrar() {
    System.out.println("Cerrando conexion");
  }

  @Override
  public void close() throws Exception {
    cerrar();
  }
}
