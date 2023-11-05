package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/myFirstLesson";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    // реализуйте настройку соеденения с БД

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection is work");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }

    public void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
