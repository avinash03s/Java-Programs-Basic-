package Login;

public class Register {
    private String userId;
    private String password;

    Register(String userId,String password){
        this.userId=userId;
        this.password=password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
