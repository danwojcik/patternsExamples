package patterns.structural.fasade;

import java.sql.Connection;

public class MySQLReportGenerator {

    public static Connection getMySQLDBConnection() {

        System.out.println("connection to MySQL DB established");
        return null;
    }

    public void generatePDFReportFromMySQL(String table, Connection connection) {

        System.out.println("creating PDF report from " + table + " with MySQL DB");
    }

    public void generateHTMLReportFromMySQL(String table, Connection connection) {

        System.out.println("creating HTML report from " + table + " with MySQL DB");
    }
}
