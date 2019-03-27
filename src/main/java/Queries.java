import java.sql.*;

public class Queries {

    private final String url = "jdbc:mysql://localhost:3306/employees?characterEncoding=utf8";
    private final String username = "root";
    private final String password = "";

    void excercise4() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.jdbc.Driver");
        Statement statement = connection.createStatement();
        String excercise4 = "select first_name, last_name, birth_date from employees e  where 1=1 and gender = 'M' and birth_date=(select min(birth_date) from employees where gender ='M'); ";
        ResultSet resultSet = statement.executeQuery(excercise4);
        while (resultSet.next()) {
            String one = resultSet.getString(1);
            String two = resultSet.getString(2);
            String three = resultSet.getString(3);
            System.out.println(one + " " + two + " " + three);
        }
        connection.close();
    }

    void excercise5() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.jdbc.Driver");
        Statement statement = connection.createStatement();
        String excercise5 = "select title from employees.titles  where emp_no ='10009';";
        ResultSet resultSet = statement.executeQuery(excercise5);

        while (resultSet.next()) {
            String one = resultSet.getString(1);
            System.out.println(one);
        }
        connection.close();
    }

    void excercise6() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.jdbc.Driver");
        Statement statement = connection.createStatement();
        String excercise6 = "select  first_name, last_name, title from employees.employees e join titles t on t.emp_no = e.emp_no where to_date = '9999-01-01';";
        ResultSet resultSet = statement.executeQuery(excercise6);
        while (resultSet.next()) {
            String one = resultSet.getString(1);
            String two = resultSet.getString(2);
            String three = resultSet.getString(3);
            System.out.println(one + " " + two + " " + three);

        }
        connection.close();
    }

    void excercise7() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.jdbc.Driver");
        Statement statement = connection.createStatement();
        String excercise7 = "select last_name, first_name, salary from  employees.employees e join salaries s on s.emp_no = e.emp_no where salary =(select max(salary) from salaries);";
        ResultSet resultSet = statement.executeQuery(excercise7);
        while (resultSet.next()) {
            String one = resultSet.getString(1);
            String two = resultSet.getString(2);
            String three = resultSet.getString(3);
            System.out.println(one + " " + two + " " + three);
        }
        connection.close();
    }

    void excercise8() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.jdbc.Driver");
        Statement statement = connection.createStatement();
        String excercise8 = "select  first_name, last_name, title from employees.employees e join titles t on t.emp_no = e.emp_no where to_date = '9999-01-01';";
        ResultSet resultSet = statement.executeQuery(excercise8);
        while (resultSet.next()) {
            String one = resultSet.getString(1);
            String two = resultSet.getString(2);
            String three = resultSet.getString(3);
            System.out.println(one + " " + two + " " + three);

        }
        connection.close();
    }

    void excercise9() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.jdbc.Driver");
        Statement statement = connection.createStatement();
        String excercise9 = "select employees.first_name as first_name_pracownik, employees.last_name as last_name_pracownik, em.first_name as first_name_manager, em.last_name as last_name_manager from employees join dept_emp de on employees.emp_no = de.emp_no and curdate() between de.from_date and de.to_date join departments d on d.dept_no = de.dept_no join dept_manager dm on dm.dept_no = d.dept_no and curdate() between dm.from_date and dm.to_date join employees em on em.emp_no = dm.emp_no";
        ResultSet resultSet = statement.executeQuery(excercise9);
        while (resultSet.next()) {
            String one = resultSet.getString(1);
            String two = resultSet.getString(2);
            String three = resultSet.getString(3);
            String four = resultSet.getString(4);
            System.out.println(one + " " + two + " " + three + " " + four );

        }
        connection.close();
    }


        void excercise10 () throws ClassNotFoundException, SQLException {
            Connection connection = DriverManager.getConnection(url, username, password);
            Class.forName("com.mysql.jdbc.Driver");
            Statement statement = connection.createStatement();
            String excercise10 = "select distinct(title) from titles;";
            ResultSet resultSet = statement.executeQuery(excercise10);
            while (resultSet.next()) {
                String one = resultSet.getString(1);
                System.out.println(one);

            }
            connection.close();
        }


    }
