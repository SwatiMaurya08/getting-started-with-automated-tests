package com.softhinkers.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.database
 * @date 1/11/2021
 */
public class DatabaseConnector {

    List<Person> personList = new ArrayList<Person>();

    public void dbConnection() {

        String sqlSelectAllPersons = "SELECT * FROM person";
        String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";

        try {
            Connection conn = DriverManager.getConnection(connectionUrl, "root", "");
            PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("ID");
                String name = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");
                personList.add(new Person(id, name, lastName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getPersonList() {
        return personList;
    }

}

