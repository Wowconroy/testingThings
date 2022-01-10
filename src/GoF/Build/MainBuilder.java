package GoF.Build;

public class MainBuilder {
    public static void main(String[] args) {
        User user = new UserHelper().createUser(1, "admin", "eees");
    }
}

class UserHelper{
    public static User createUser(int id, String login, String password){
        User user = new User();
        user.setId(id);
        user.setLogin(login);
        user.setPassword(password);
        return user;
    }
}

class User {
    private int id;
    private String login;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}