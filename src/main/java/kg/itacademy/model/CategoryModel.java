package kg.itacademy.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement(name = "category")
public class CategoryModel {
    private int id;
    private String name;
    private int userId;
    private boolean isActive;
    private LocalDateTime dateCreated;

    public CategoryModel(int id, String name, int userId,
                    boolean isActive, LocalDateTime dateCreated) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
