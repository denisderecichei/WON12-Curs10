package org.fasttrack.tema9.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee {
    private static final String position = "programmer";
    private String language;
    private List<String> fruits;

    public Programmer(String firstName, String lastName, LocalDateTime birthday, String address, LocalDateTime dateOfEmployment, String language) {
        super(firstName, lastName, birthday, address, dateOfEmployment);
        this.language = language;
        this.fruits = new ArrayList<>();
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return position;
    }


}
