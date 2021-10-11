package patterns.structural.fasade;

import java.sql.Connection;

public class MainReportGenerator {

    public static void main(String[] args) {

        System.out.println("classic way report calling");

        //MySQL
        Connection mySQLconnection = MySQLReportGenerator.getMySQLDBConnection();
        MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
        mySQLReportGenerator.generatePDFReportFromMySQL("customers", mySQLconnection);

        //ORACLE
        Connection oracleConnection = OracleReportGenerator.getOracleDBConnection();
        OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
        oracleReportGenerator.generateHTMLReportFromOracle("cars", oracleConnection);

        //FASCADE
        System.out.println("fascade usage: ");

        ReportProvider.generateRepor(
                ReportProvider.DBType.ORACLE,
                ReportProvider.ReportType.PDF,
                "customers");
    }
}
