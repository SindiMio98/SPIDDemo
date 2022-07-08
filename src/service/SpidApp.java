package service;


import entities.Spid;
import entities.Status;
import entities.User;

public class SpidApp {

    public static User createUser(long id, String name, String surname, String username) {
        return new User(id, name, surname, username);
    }


    public static Spid createSpid(long id, User user, Status status, String description) {
        return new Spid(id, user, status, description);
    }

    public static void editUser(User user, long id, String name, String surname, String username) {
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setUsername(username);
    }

    public static void editSpid(Spid spid, long id, User user, Status status, String description) {
        spid.setId(id);
        spid.setUser(user);
        spid.setStatus(status);
        spid.setDescription(description);
    }

    public static void main(String[] args) {
        User user = createUser(1, "Sindi", "Mio", "msindi");
        Spid spid = createSpid(1, user, Status.PENDING, "Sindi Mio's Spid");

        User user1 = createUser(2, "Ana", "Smith", "asmith");
        Spid spid1 = createSpid(2, user1, Status.PENDING, "Ana Smith's Spid");

        User user2 = createUser(3, "Beni", "Lone", "blone");
        Spid spid2 = createSpid(3, user2, Status.PENDING, "Beni Lone's Spid");



        try {
            editUser(user, 4, "Sindi", "Mio", "msindi98");
            editSpid(spid, 4, user, Status.APPROVED, "Sindi Mio's Spid");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        editUser(user1, 5, "Ana", "Smith", "asmith22");
        editUser(user2, 6, "Beni", "Lone", "bjones42");


        editSpid(spid1, 5, user1, Status.APPROVED, "Jane Smith's Spid");
        editSpid(spid2, 6, user2, Status.APPROVED, "Mike Jones's Spid");



        System.out.println("Lista e Spid:\n");
        System.out.println("ID: " + spid.getId() + " Status: " + spid.getStatus() + " Description: " + spid.getDescription());
        System.out.println("ID: " + spid1.getId() + " Status: " + spid1.getStatus() + " Description: " + spid1.getDescription());
        System.out.println("ID: " + spid2.getId() + " Status: " + spid2.getStatus() + " Description: " + spid2.getDescription());


        System.out.println("\nLista e Spideve te lidhura me nje User:\n");
        System.out.println("Username: " + user.getUsername() + " is connected to SPID: " + spid.getUser().getUsername().equals(user.getUsername()));
        System.out.println("Username: " + user1.getUsername() + " is connected to SPID: " + spid1.getUser().getUsername().equals(user1.getUsername()));
        System.out.println("Username: " + user2.getUsername() + " is connected to SPID: " + spid2.getUser().getUsername().equals(user2.getUsername()));

    }
}

