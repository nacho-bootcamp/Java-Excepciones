public class TestConexion {
  public static void main(String[] args) throws Exception {
    // try con recursos
    try (Conexion con = new Conexion()) {
      con.leerDatos();
    } catch (IllegalStateException ex) {
      System.out.println("Ejecutando catch");
      ex.printStackTrace();
    }
    // Otro metodo de hacer y mejor
    // Conexion con = new Conexion();
    // try {
    // con.leerDatos();
    // } catch (IllegalStateException e) {
    // e.printStackTrace();
    // } finally {
    // con.cerrar();
    // }
  }
}
// la conexion siempre se debe de cerrar para eso utilizamos
// finally , no importa si hubo o no error
// siempre entrara en el metodo cerrar()