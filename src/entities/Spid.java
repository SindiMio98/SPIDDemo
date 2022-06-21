
package entities;

public class Spid extends Base {


    private long id;
    private User user;
    Status status = Status.PENDING;
    private String description;

    public Spid() {
    }

    public Spid(long id, User user, Status status, String description) {
        super(id, null, null);
        this.user = user;
        this.status = status;
        this.description = description;
    }



    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}