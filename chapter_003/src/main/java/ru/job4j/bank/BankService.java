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
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            ArrayList<Account> accounts = (ArrayList<Account>) users.get(user);
            for (Account ac : accounts) {
                if (ac.equals(account)) {
                    return;
                }
            }
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user.getPassport()
                .equals(passport)).findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
           return users.get(user).stream().filter(account -> account.getRequisite()
                    .equals(requisite)).findFirst().orElse(null);
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

            rsl = true;
        }

        return rsl;
    }
}