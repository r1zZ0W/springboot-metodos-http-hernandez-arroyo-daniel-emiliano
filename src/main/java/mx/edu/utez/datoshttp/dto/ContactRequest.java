package mx.edu.utez.datoshttp.dto;

public class ContactRequest {

    private String name;
    private String message;

    public ContactRequest() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
