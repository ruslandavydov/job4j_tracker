package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (!users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод находит клиента по номеру паспорта.
     *
     * @param passport номер пспорта искомого клиента
     * @return данные клиента
     */
    public Optional<User> findByPassport(String passport) {
        /* for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null; */
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод находит счет клиента по номеру паспорта.
     *
     * @param passport номер паспорта
     * @param requisite реквизиты счета
     * @return реквизиты счтета клиента
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            /* for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            } */
            return users.get(user.get())
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst();
        }
        return rsl;
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
        Optional<Account> scrAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (scrAccount.get().getRequisite() != null
                || destAccount.get().getRequisite() != null
                || scrAccount.get().getBalance() >= amount) {
            scrAccount.get().setBalance(scrAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            result = true;
        }
        return result;
    }
}
