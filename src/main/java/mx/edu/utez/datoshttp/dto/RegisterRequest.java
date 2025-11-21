package mx.edu.utez.datoshttp.dto;

public class RegisterRequest {
    private String username;
    private String password;

    // Constructor vació
    public RegisterRequest() {}

    public RegisterRequest(String username, String password) {}

    // Getters y setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
