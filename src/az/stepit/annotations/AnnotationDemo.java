package az.stepit.annotations;

import java.lang.reflect.Field;

public class AnnotationDemo {

    public static void main(String[] args){
        Class<Employee> reflected = Employee.class;


        Field[] fields = reflected.getDeclaredFields();

        for (Field field : fields) {
            if(field.isAnnotationPresent(MyAnnotation.class)){
                System.out.println("field with name " + field.getName() + " is annotated");
            }
        }
    }

    public Class<?> pathReflect(String pathName) throws ClassNotFoundException {
        return Class.forName(pathName);
    }

    public Class<?> instanceReflect(Object o){
        return o.getClass();
    }
}
