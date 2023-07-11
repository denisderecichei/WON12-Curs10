package org.fasttrack.tema9.company;

import java.time.LocalDateTime;

public class FullPerson extends SecondHalfBakedPerson{

    public FullPerson(String nume) {
        super(nume);
    }

    @Override
    public String getLastName() {
        return "galsta";
    }

    @Override
    public LocalDateTime getBirthday() {
        return LocalDateTime.now();
    }
}
