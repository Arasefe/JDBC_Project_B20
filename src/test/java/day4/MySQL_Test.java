package day4;

import utility.ConfigurationReader;
import utility.DB_Utility;

public class MySQL_Test {
    public static void main(String[] args) {
        String connectionStr= ConfigurationReader.getProperty("library.database.url");
        String username=ConfigurationReader.getProperty("library.database.username");
        String password=ConfigurationReader.getProperty("library.database.password");

        DB_Utility.createConnection(connectionStr,username,password);
    }
}
