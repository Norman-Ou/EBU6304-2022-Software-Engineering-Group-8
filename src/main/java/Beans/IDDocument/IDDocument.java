package Beans.IDDocument;

import java.io.Serializable;

public class IDDocument  implements Serializable {
    private final String ID;
    private final String surname;

    public IDDocument(String ID, String surname) {
        this.ID = ID;
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public String getSurname() {
        return surname;
    }
}
