public class TestConexion {
  public static void main(String[] args) {
    Conexion con = new Conexion();
    try {
      con.leerDatos();
    } catch (IllegalStateException e) {
      e.printStackTrace();
    } finally {
      con.cerrar();
    }
  }
}
// la conexion siempre se debe de cerrar para eso utilizamos
// finally , no importa si hubo o no error
// siempre entrara en el metodo cerrar()