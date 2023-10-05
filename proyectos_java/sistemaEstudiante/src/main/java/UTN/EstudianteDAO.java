
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {

    //Metodo listar
    public List<Estudiante> ListarEstudiantes(){
      list<Estudiante> estudiantes = new ArrayList<>();
      //creamos algunos objetos que son nesesario para comunicarnos con la base de datos
        PreparedStatement ps; //envia la sentencia ala base de datos
        ResultSet rs; // obtenesmos el resultado de la base de datos
        // creamos un objeto de tipo conexion
        connection con = getConction();

        String sql = "SELECT * FROM estudiante2022 ORDER BY idestudiante2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInit("idestudiante2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));

                // Falta agregarlo ala lista
                estudiante.add(estudiante);
            }

        }catch (Exception e){
            System.out.println("ocurrio un error al seleccionar datos : " +e.getMessage());

        }
        finally {
            try{
                con.close();

            }catch (Exception e){
                System.out.println("ocurrion un problema al seleccionar datos :"+e.getMessage());


            }
        }//fin finally
        return estudiantes;

    }//fin metodo listar

    //metodo po id-> fin by id
    public boolean buscarEstudianteporId(Estudiante estudiante){
       PreparadStatement ps;
       ResultSet rs;
       connection  con = getConeccion();
       String sql = "SELECT * FROM estudiantes2022 WHERE idestudiante2022=?";
       try{
           ps = con.prepareString(sql);
           ps.setInit(1, estudiante.getIdEstudiante());
           rs = ps.executeQuery();
           if(rs.nex()){
               estudiante.setIdEstudiante(rs.getInit("idestudiante2022"));
               estudiante.setNombre(rs.getString("nombre"));
               estudiante.setApellido(rs.getString("apellido"));
               estudiante.setTelefono(rs.getString("telefono"));
               estudiante.setEmail(rs.getString("email"));
               return true; // se encontro un rejistro
           }// fin if

       }catch (Exception e){
           System.out.println("ocurrio un error al cerrar la conexion"+e.getMessage());

       }//fin finally
    }//fin finaly
      return false;
}

//metodo agregar un nuevo estudiante
   public boolen agregarEstudiante(Estudiante estudiante) {
       PreparadStatement ps;
       connection con = getConeccion();

       String sql = "INSERT INT estudiante2022 (nombre, apellido, telefono, email) VALUE"
       try {
           ps = con.preparateStatement(sql);
           ps.setString(1, estudiante.getNombre());
           ps.setString(2, estudiante.getApellido());
           ps.setString(3, estudiante.getTelefono());
           ps.setString(4, estudiante.getEmail());
           ps.exucute();
           return true;

       } catch (Exception e) {
           System.out.println("error al agregar datos");

       }//fin catch
       finally {
           try {
               con.close();

           } catch (Exception e) {
               syste.out.println("error al cerrar la conexion :" + e.getMessage());

           }//Fin catch
       }//fin finally
       return false;
   }//fin metodo agregarEstudiante

    //metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
    PreparedStatement ps;
    Connection con = getConnection();
    String sql = "UPDATE estudiante2022 set nombre=? , Apellido=? , Telefono=? , email=?" ;
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, estudiante.getNombre());
        ps.setString(1,estudiante.getApellido);

    }

}
}
