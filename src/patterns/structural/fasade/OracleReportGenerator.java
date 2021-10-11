package patterns.structural.fasade;

import java.sql.Connection;

public class OracleReportGenerator {

    public static Connection getOracleDBConnection() {

        System.out.println("connection to Oracle DB established");
        return null;
    }

    public void generatePDFReportFromOracle(String table, Connection connection) {

        System.out.println("creating PDF report from " + table + " with Oracle DB");
    }

    public void generateHTMLReportFromOracle(String table, Connection connection) {

        System.out.println("creating HTML report from " + table + " with Oracle DB");
    }
}
