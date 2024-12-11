package models;

import java.util.List;

public class Favorite {
    private Long id;
   private Long userId;
   private Long AnnouncementId;

    public Favorite(Long id, Long userId, Long announcementId) {
        this.id = id;
        this.userId = userId;
        AnnouncementId = announcementId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAnnouncementId() {
        return AnnouncementId;
    }

    public void setAnnouncementId(Long announcementId) {
        AnnouncementId = announcementId;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", userId=" + userId +
                ", AnnouncementId=" + AnnouncementId +
                '}';
    }
}
