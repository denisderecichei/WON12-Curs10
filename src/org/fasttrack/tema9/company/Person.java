package org.fasttrack.tema9.company;

import java.time.LocalDateTime;

public interface Person {
    String getFirstName();
    String getLastName();
    LocalDateTime getBirthday();
    String getAddress();

    default String getFullName() {
        return getFirstName() + getLastName();
    }
}
