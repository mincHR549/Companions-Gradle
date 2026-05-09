package com.mojang.authlib;

import java.util.Map;
public class GameProfile {
    public GameProfile(java.util.UUID id, String name) {}
    public GameProfile(java.util.UUID id, String name, Map<String, String> properties) {}
    public java.util.UUID getId() { return null; }
    public String getName() { return null; }
    public Map<String, String> getProperties() { return null; }
    public <V> V getProperty(String name) { return null; }
    public void setProperty(String name, String value) {}
}
