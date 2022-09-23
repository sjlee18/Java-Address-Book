package AddressBook;

public class Entries {
    private String firstname;
    private String lastName;
    private String phonenumber;
    private String emailaddress;

    Entries(String firstname, String lastName, String phonenumber, String emailaddress) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    @Override
    public String toString() {
        return "First Name: " + firstname + "\nLast Name: " + lastName
                + "\nPhone Number: " + phonenumber + "\nEmail Address: " + emailaddress;
    }

}