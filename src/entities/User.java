package entities;

public class User extends TestSPID{
    private long id;
    private String name;
    private String surname;
    private String username;

    public User() {
    }

    public User(long id, String name, String surname, String username) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }
}
