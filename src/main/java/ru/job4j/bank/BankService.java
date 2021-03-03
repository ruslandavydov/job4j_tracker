package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс BankService
 *
 * @author RUSLAN DAVYDOV
 * @version 1.0
 * @since 25.02.2021
 */
public class BankService {
    /**
     * База данных банка users.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет клиента.
     *
     * @param user клиент
     */
    public void addUser(User user) {
        List<Account> list = new ArrayList<>();
        users.putIfAbsent(user, list);
    }

    /**
     * Метод добавляет счет клиенту,
     * если счет еще не открыт.
     *
     * @param passport номер паспорта клиента
     * @param account параметры счета клиента
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
         if (!users.get(user).contains(account)) {
             users.get(user).add(account);
         }
    }

    /**
     * Метод находит клиента по номеру паспорта.
     *
     * @param passport номер пспорта искомого клиента
     * @return данные клиента
     */
    public User findByPassport(String passport) {
        /* for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null; */
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод находит счет клиента по номеру паспорта.
     *
     * @param passport номер паспорта
     * @param requisite реквизиты счета
     * @return реквизиты счтета клиента
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            /* for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            } */
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод реализует перевод денег со счета на счет,
     * проверяет наличе счетов и достаточность денег
     * на счете, с которого осуществляется перевод.
     *
     * @param srcPassport номер паспорта клиента переводящего деньги
     * @param srcRequisite реквизиты счета откуда осуществляется перевод
     * @param destPassport номер паспорта клиента получающего деньги
     * @param destRequisite реквизиты счета куда осуществляется перевод
     * @param amount сумма перевода
     * @return в случае осуществления перевода true, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account scrAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (scrAccount.getRequisite() != null
                || destAccount.getRequisite() != null
                || scrAccount.getBalance() >= amount) {
            scrAccount.setBalance(scrAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }
}
