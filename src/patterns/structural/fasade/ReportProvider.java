package patterns.structural.fasade;

import java.sql.Connection;

public class ReportProvider {

    public enum DBType {
        MYSQL,
        ORACLE;
    }

    public enum ReportType {
        HTML,
        PDF;
    }

    public static void generateRepor(DBType dbType, ReportType reportType, String table) {

        Connection connection = null;

        switch (dbType) {

            case ORACLE:
                connection = OracleReportGenerator.getOracleDBConnection();

                OracleReportGenerator generator = new OracleReportGenerator();

                switch (reportType) {

                    case PDF:
                        generator.generatePDFReportFromOracle(table, connection);
                        break;
                    case HTML:
                        generator.generateHTMLReportFromOracle(table, connection);
                        break;
                }
                break;

            case MYSQL:
                connection = MySQLReportGenerator.getMySQLDBConnection();

                MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();

                switch (reportType) {

                    case PDF:
                        mySQLReportGenerator.generatePDFReportFromMySQL(table, connection);
                        break;
                    case HTML:
                        mySQLReportGenerator.generateHTMLReportFromMySQL(table, connection);
                        break;
                }
        }
    }
}
