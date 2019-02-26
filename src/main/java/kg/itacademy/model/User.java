package kg.itacademy.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement(name = "user")
public class User {
    private String name;
    private String password;
    private int id;
    private LocalDateTime dateCreated;

    public User(int id,String name, String password,  LocalDateTime dateCreated) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateTime) {
        this.dateCreated = dateTime;
    }
}
