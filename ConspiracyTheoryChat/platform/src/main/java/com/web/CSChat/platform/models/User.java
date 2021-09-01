package com.web.CSChat.platform.models;

public class User
{
    private String id;
    private String username;
    private String imageURL;
    private String email;
    private String password;

    public User(String id, String username, String email, String password, String imageURL) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.email = email;
        this.password = password;
    }
    public User() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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
}
