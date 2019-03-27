import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Queries queries = new Queries();
        queries.excercise9();


        //        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/employees?characterEncoding=utf8";
//        String username = "root";
//        String password = "";
//        Connection connection = DriverManager.getConnection(url,username,password);
//
//        Statement statement = connection.createStatement();
//
//        String excercise5 = "select title from employees.titles  where emp_no ='10009';";
//
//
//        String excercise7 = "select last_name, first_name, salary from  employees.employees e join salaries s on s.emp_no = e.emp_no where salary =(select max(salary) from salaries);";
//        String excercise8 = "select first_name, last_name, salary from employees.employees e join salaries s on s.emp_no = e.emp_no where curdate() between s.from_date and s.to_date order by salary desc limit 10;";
//        String excercise9 = "";
//        String excercise10 = "select distinct(title) from titles;";
//
//        ResultSet resultSet = statement.executeQuery(excercise10);
//        while(resultSet.next()){
//            String one = resultSet.getString(1);
//            System.out.println(one);
//        }
//        connection.close();
    }


}
