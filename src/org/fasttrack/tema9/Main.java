package org.fasttrack.tema9;

import org.fasttrack.tema9.company.DatabaseAdmin;
import org.fasttrack.tema9.company.Employee;
import org.fasttrack.tema9.company.Programmer;
import org.fasttrack.tema9.products.Fridge;
import org.fasttrack.tema9.products.Product;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Product firstProduct = new Product(131, "Filtru apa", "Filtru apa", 31);
        Fridge fridge = new Fridge(1311, "beko", "beko", 300, 13, 13, 13, 13, 13.13);

        System.out.println(firstProduct.getDescription());
        System.out.println(fridge.getTemperature());


        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
        todaysDate = LocalDate.of(2000, 2, 17);
        System.out.println(todaysDate);

        LocalTime localTime = LocalTime.now();

        LocalDateTime todaysDateTime = LocalDateTime.now();
        LocalDateTime dbTime = LocalDateTime.of(1954, 1, 1, 9, 10);
        System.out.println(todaysDateTime);
        todaysDateTime = LocalDateTime.of(1984, 1, 1, 9, 10, 13);
        System.out.println(todaysDateTime);

        Programmer prog1 = new Programmer("Prog1", "Last name",
                todaysDateTime, "internet",
                LocalDateTime.now(), "java");
        DatabaseAdmin admin = new DatabaseAdmin("DB", "Last DB",
                dbTime, "internet",
                LocalDateTime.now(), "super dba", "oracle");

        personalData(prog1);
        personalData(admin);

    }

    public static void personalData(Employee e1) {
        System.out.println("Full name: " + e1.getFullName());
        System.out.println("employee position: " + e1.getPosition());
        System.out.println(e1.getAddress());

        int number = (int) 45.3d;

        if (e1 instanceof Programmer) {
            System.out.println(e1.getFullName() + " este programator");
            Programmer myProgrammer = (Programmer) e1;
            System.out.println(((Programmer) e1).getLanguage());
            DatabaseAdmin admin = (DatabaseAdmin) e1;
            admin.getDbTechnology();
        } else if (e1 instanceof DatabaseAdmin) {
            System.out.println(e1.getFullName() + " este dba");
        }


        LocalDateTime birthday = e1.getBirthday();
        LocalDateTime currentTime = LocalDateTime.now();

        int age = Period.between(birthday.toLocalDate(), currentTime.toLocalDate()).getYears();
        ChronoUnit.YEARS.between(birthday, currentTime);
        System.out.println("Age is: " + age);
    }

}
