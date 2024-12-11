package models;

public class Announcement {
    private Long id;
    private String name;
    private String description;
    private int price;
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Announcement(Long id, String name, String description, int price, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.user = user;

    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", user=" + user +
                '}';
    }
}
