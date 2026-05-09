package net.milkbowl.vault.economy;

import org.bukkit.OfflinePlayer;
import java.util.List;

public abstract class Economy {
    public abstract boolean isEnabled();
    public abstract String getName();
    public abstract boolean has(OfflinePlayer p, double amount);
    public abstract boolean has(String p, double amount);
    public abstract boolean has(OfflinePlayer p, double amount, String n) { return false; }
    public abstract boolean has(String p, double amount, String n) { return false; }
    public abstract boolean has(OfflinePlayer p, double amount, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean has(String p, double amount, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean withdraw(OfflinePlayer p, double amount);
    public abstract boolean withdraw(String p, double amount);
    public abstract boolean withdraw(OfflinePlayer p, double amount, String n) { return false; }
    public abstract boolean withdraw(String p, double amount, String n) { return false; }
    public abstract boolean withdraw(OfflinePlayer p, double amount, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean withdraw(String p, double amount, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean deposit(OfflinePlayer p, double amount);
    public abstract boolean deposit(String p, double amount);
    public abstract boolean deposit(OfflinePlayer p, double amount, String n) { return false; }
    public abstract boolean deposit(String p, double amount, String n) { return false; }
    public abstract boolean deposit(OfflinePlayer p, double amount, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean deposit(String p, double amount, String n, java.util.Map<String, Object> r) { return false; }
    public abstract double getBalance(OfflinePlayer p);
    public abstract double getBalance(String p);
    public abstract double getBalance(OfflinePlayer p, String n) { return 0; }
    public abstract double getBalance(String p, String n) { return 0; }
    public abstract double getBalance(OfflinePlayer p, String n, java.util.Map<String, Object> r) { return 0; }
    public abstract double getBalance(String p, String n, java.util.Map<String, Object> r) { return 0; }
    public abstract String getCurrencyName(long l) { return ""; }
    public abstract String getCurrencyName() { return ""; }
    public abstract String format(double v) { return ""; }
    public abstract String getDenomination(double v) { return ""; }
    public abstract String getDenomination(double v, java.util.Map<String, Object> r) { return ""; }
    public abstract int getDecimalPlaces() { return 0; }
    public abstract boolean createPlayerAccount(OfflinePlayer p) { return false; }
    public abstract boolean createPlayerAccount(String p) { return false; }
    public abstract boolean createPlayerAccount(OfflinePlayer p, String n) { return false; }
    public abstract boolean createPlayerAccount(String p, String n) { return false; }
    public abstract boolean createPlayerAccount(OfflinePlayer p, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean createPlayerAccount(String p, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean hasAccount(OfflinePlayer p) { return false; }
    public abstract boolean hasAccount(String p) { return false; }
    public abstract boolean hasAccount(OfflinePlayer p, String n) { return false; }
    public abstract boolean hasAccount(String p, String n) { return false; }
    public abstract boolean hasAccount(OfflinePlayer p, String n, java.util.Map<String, Object> r) { return false; }
    public abstract boolean hasAccount(String p, String n, java.util.Map<String, Object> r) { return false; }
    public abstract java.util.List<String> getAccounts() { return null; }
    public abstract java.util.List<String> getAccounts(OfflinePlayer p) { return null; }
    public abstract java.util.List<String> getAccounts(String p) { return null; }
    public abstract java.util.List<String> getAccounts(OfflinePlayer p, String n) { return null; }
    public abstract java.util.List<String> getAccounts(String p, String n) { return null; }
    public abstract java.util.List<String> getAccounts(OfflinePlayer p, String n, java.util.Map<String, Object> r) { return null; }
    public abstract java.util.List<String> getAccounts(String p, String n, java.util.Map<String, Object> r) { return null; }
}
