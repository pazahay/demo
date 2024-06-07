package model;

import java.time.LocalDateTime;

public class Comment {
    private final Long id;
    private String author;
    private String content;
    private LocalDateTime createdAt;

    public Comment(Long id) {
        this.id = id;
    }

    public Comment(Long id, String author, String content, LocalDateTime createdAt) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Геттери та сеттери для полів
}