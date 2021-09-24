package predicates.func.in;

import java.util.function.Predicate;

public class EmployeesUnder25<E> implements Predicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.getAge() < 25;
    }
}
