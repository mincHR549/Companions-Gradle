package com.mojang.authlib.properties;

public class Property {
    public Property(String name, String value) {}
    public Property(String name, String value, String signature) {}
    public String getName() { return null; }
    public String getValue() { return null; }
    public String getSignature() { return null; }
    public boolean isSignatureValid(String publicKey) { return true; }
}
