package introduction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = fillEmployeesList();

//        employees.sort((p2, p1) -> p1.getName().compareTo(p2.getName()));
//        employees.forEach(employee -> System.out.println(employee.getAge() + " " + employee.getName()));

//      We CAN create a lambda and assign it to a variable
        UpperConcat upperConcat = (s1,s2) -> s1.toUpperCase() + " " + s2.toUpperCase();

        //We can also direckly return a value
        UpperConcat returnUpperConcat = (s1,s2) -> {
            String result = s1.toUpperCase() + " " + s2.toUpperCase();
            return result;
        };

        System.out.println(doStringStaff(upperConcat, employees.get(0).getName(), employees.get(1).getName()));
    }

    public static String doStringStaff(UpperConcat up, String s1, String s2){
         return up.upperAndConcat(s1, s2);
    }

    private static List<Employee> fillEmployeesList(){
        List<Employee> employees = new ArrayList<>();
        Employee first = new Employee("Ganio", 53);
        Employee second = new Employee("Aleks", 29);
        Employee third = new Employee("Bobi", 18);
        Employee fourth = new Employee("Kolio", 35);

        employees.add(first);
        employees.add(second);
        employees.add(third);
        employees.add(fourth);

        return  employees;
    }
}
