package com.softhinkers.main;

import com.softhinkers.database.DatabaseConnector;
import com.softhinkers.database.Person;

import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.main
 * @date 1/11/2021
 */
public class Main {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        databaseConnector.dbConnection();
        List<Person> personList = databaseConnector.getPersonList();
        for(Person p : personList){
            if(!p.getFirstName().equals("Dhruva")){
                System.out.println(p.getId());
                System.out.println(p.getFirstName());
                System.out.println(p.getLastName());
            }
        }
    }
}
