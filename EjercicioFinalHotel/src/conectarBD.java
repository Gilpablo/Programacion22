import java.sql.*;


public class conectarBD {

	
	private static final String URL = "jdbc:mysql://192.168.4.232:3306/hotelGilpablo";
	private static final String USU = "bd";
	private static final String PASS = "bd";
	
	
	public static void pruebaConectar() {
		
		try {
			Connection con = DriverManager.getConnection(URL, USU, PASS);
			
			System.out.println("Conexion realizada");
		} catch (SQLException e) {
			System.out.println("error");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void insertarClientes() {
		
		
	}
	
	
	
}
