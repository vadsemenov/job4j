package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация банковского сервиса по переводу денег.
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
//            ArrayList<Account> accounts = new ArrayList<>();
//            accounts.addAll(users.get(user));
            ArrayList<Account> accounts = (ArrayList<Account>) users.get(user);
            for (Account ac : accounts) {
                if (ac == account) {
                    return;
                }
            }
            accounts.add(account);
            users.put(user, accounts);
        }
    }


    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            ArrayList<Account> accounts = (ArrayList<Account>) users.get(user);
            for (Account ac : accounts) {
                if (ac.getRequisite().equals(requisite)) {
                    return ac;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;


        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount != null && destAccount != null && (srcAccount.getBalance() - amount >= 0)) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);

            User srcUser = findByPassport(srcPassport);
            User destUser = findByPassport(destPassport);

            ArrayList<Account> srcAccounts = (ArrayList<Account>) users.get(srcUser);
            srcAccounts.add(srcAccounts.indexOf(srcAccount), srcAccount);
            ArrayList<Account> destAccounts = (ArrayList<Account>) users.get(destUser);
            destAccounts.add(destAccounts.indexOf(destAccount), destAccount);


            users.put(srcUser, srcAccounts);
            users.put(destUser, destAccounts);
            rsl = true;
        }

        return rsl;
    }
}