package structural.facade;

import java.sql.Connection;

public class OracleHelper {
 
	public static Connection getOracleDBConnection(){
		// 실제 커넥션을 리턴해야 하지만, 예제이기에 null 을 리턴하겠습니다.
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		// get data from table and generate pdf report
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		// get data from table and generate pdf report
	}
	
}
