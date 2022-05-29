package Beans.IDDocument;

import java.io.Serializable;

/**
 * This is the class of ID document definition
 *
 * @author Ruizhe Ou
 * @author Jiacheng Li
 * @version 1.0 May 2nd, 2022
 */
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
