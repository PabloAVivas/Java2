package BuenSabor_V4.Entities;

public class Usuario extends Base{
    private String auth0Id;
    private String userName;

    public Usuario() {
    }

    public Usuario(Long id, String auth0Id, String userName) {
        super(id);
        this.auth0Id = auth0Id;
        this.userName = userName;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*@Override
    public String toString() {
        return "Usuario{" +
                "auth0Id='" + auth0Id + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }*/
}
