package az.stepit.generics;

public class Employee<T extends Person> {
    T employee;

    public T getEmployee() {
        return employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }
}
