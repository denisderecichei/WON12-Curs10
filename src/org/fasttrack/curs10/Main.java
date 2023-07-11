package org.fasttrack.curs10;

import org.fasttrack.tema9.company.DatabaseAdmin;
import org.fasttrack.tema9.company.Person;
import org.fasttrack.tema9.company.Programmer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static List<String> myList;

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Mirela");
        stringList.add("Ioana");
        System.out.println(stringList.size());
        stringList.remove(0);
        System.out.println(stringList.size());
        System.out.println(stringList.get(0));

        List<String> fructe = new ArrayList<>();
        fructe.add("mar");
        fructe.add("mar");
        fructe.add("mar");
        fructe.add("mar");



        stringList.add("Ioana");
        stringList.add("Ioana");
        stringList.add("Ioana");
        stringList.add("Ioana");
        stringList.add("Ioana");
        stringList.add("Ioana");
        stringList.add("Ioana");
        stringList.add("Ioana");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i));
        }

        List<String> secondList = new ArrayList<>();
        secondList.add("Marius");
        secondList.add("Gigel");
        System.out.println();
        System.out.println("-----------------");
        stringList.addAll(secondList);
        for (String nume: stringList) {
            System.out.print(nume);
        }
        System.out.println();

        Set<String> setString = new HashSet<>();
        setString.add("Ioana");
        setString.add("Ioana");
        setString.add("Ioana");
        setString.add("Ioana");
        setString.add("Maria");
        System.out.println(setString.size());

        stringList.addAll(setString);

        List<Person> persons = new ArrayList<>();
        Programmer prog1 = new Programmer("Prog1", "Last name",
                LocalDateTime.now(), "internet",
                LocalDateTime.now(), "java");
        DatabaseAdmin admin = new DatabaseAdmin("DB", "Last DB",
                LocalDateTime.now(), "internet",
                LocalDateTime.now(), "super dba", "oracle");
        persons.add(prog1);
        persons.add(admin);
        persons.add(prog1);
        persons.add(admin);
        persons.add(prog1);
        persons.add(admin);
        persons.add(prog1);
        persons.add(admin);
        persons.add(prog1);
        persons.add(admin);
        System.out.println("List has " + persons.size());
        for (Person currentPerson: persons) {
            System.out.println(currentPerson.getFullName());
            if (currentPerson.getFullName().contains("X")) {
                System.out.println("contains");
            }
        }

        boolean wasItemRemoved = persons.remove(admin);
        System.out.println("SIZE NOW IS: " + persons.size());

        while (persons.remove(admin)) {
        }

//        persons.addAll(setString);

        System.out.println("SIZE NOW IS: " + persons.size());

    }
}
