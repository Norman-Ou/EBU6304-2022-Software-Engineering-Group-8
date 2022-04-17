package Beans.IDDocument;

public class IDDocument {
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
