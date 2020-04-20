package az.stepit.generics;

import javax.print.Doc;

public class Demo {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Developer developer = new Developer();

        Employee<?> employee = generateEmployee(doctor);

    }

    //generation is only available for Derived classes of Person
    public static <L extends Person> Employee<L> generateEmployee(L employee){
        Employee<L> created = new Employee<>();
        created.setEmployee(employee);
        return created;
    }
}
