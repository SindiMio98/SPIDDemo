package entities;

public class SPID extends TestSPID{
    private long id;
    private User user;
    private Status status;
    private String descripton;

    public SPID() {

    }

    public SPID(long id, User user, Status status, String descripton) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.descripton = descripton;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    @Override
    public String toString() {
        return "SPID{" +
                "id=" + id +
                //", user=" + user +
                ", user= Name: " + user.getName() + "\tUsername: "+user.getUsername()+ "\tSurname: " + user.getSurname()+
                ", status=" + status +
                ", descripton='" + descripton + '\'' +
                '}';
    }
}
