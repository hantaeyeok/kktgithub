package structural.facade;

import java.sql.Connection;

public class MySqlHelper {
	public static Connection getMySqlDBConnection(){
		// 실제 커넥션을 리턴해야 하지만, 예제이기에 null 을 리턴하겠습니다.
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		// get data from table and generate pdf report
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		// get data from table and generate pdf report
	}
}
