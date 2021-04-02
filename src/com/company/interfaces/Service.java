package com.company.interfaces;

public class Service {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        long startID = 10L;
        long startBalance = 20000L;
        for (int i = 0; i < accounts.length; i++) {
            User user = new User(startID, "John", "Doe");
            accounts[i] = new Account(1028, startBalance, user);
            startID++;
            startBalance++;
        }
        AccountService service = new AccountServiceImpl(accounts);
        service.findAccountByOwnerId(10L);
        System.out.println(service.countAccountsWithBalanceGreaterThan(20001L));
    }
}

interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here
class AccountServiceImpl implements AccountService {
    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts.clone();
    }

    public Account findAccountByOwnerId(long id) {
        for (Account acc : accounts) {
            if (acc.getOwner().getId() == id) {
                System.out.println(acc.getOwner().getFirstName() + " " + acc.getOwner().getLastName());
                return acc;
            }
        }
        return null;
    }

    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for (Account acc : accounts) {
            if (acc.getBalance() > value) {
                count++;
            }
        }
        return count;
    }

}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}