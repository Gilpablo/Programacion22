import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDClientes {
	
	 private static String URL = "jdbc:mysql://localhost:3306/GestorClientes";
	 private static String USUARIO = "root";
	 private static String CLAVE = "toor";
	
	
	public static void ConectaBD() {
		
		try {
			Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
			
			System.out.println("conectado");
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}

		
	}
	
	
	public static ArrayList<String> cargarDatos(){
		
		ArrayList<String> vClientes = new ArrayList<String>();
		
		try {
			Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
			
			
			
			String consulta = "SELECT * FROM CLIENTES;";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			
			while (rs.next()) {
				String id = rs.getString(1);
				String nombre = rs.getString(2);
				String direccion = rs.getString(3);
				
				vClientes.add(id);
				vClientes.add(nombre);
				vClientes.add(direccion);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vClientes;
		
	}
	 

}
