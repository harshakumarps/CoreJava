package com.xworkz.internal;

public class Badge {
    private int id;
    private String name;
    private String role;
    private String securityLevel;
    private boolean isActive;

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setRole(String role) {
        this.role = role;
    }

    void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    void setActive(boolean active) {
        isActive = active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public boolean isActive() {
        return isActive;
    }
}