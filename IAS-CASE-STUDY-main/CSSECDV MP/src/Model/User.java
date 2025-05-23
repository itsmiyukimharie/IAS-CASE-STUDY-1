package Model;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private int role = 2;
    private int locked = 1;
    private String resetToken;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(String username, String password, int role, int locked){
        this.username = username;
        this.password = password;
    }
    
    public User(String username, String email, String password, int role, int locked) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.locked = locked;
    }
    
    public User(int id, String username, String email, String password, int role, int locked){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.locked = locked;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }
    
    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }
}
