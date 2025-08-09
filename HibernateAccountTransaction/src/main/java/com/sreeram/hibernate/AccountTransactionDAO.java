package com.sreeram.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class AccountTransactionDAO {
    private SessionFactory factory;

    public AccountTransactionDAO() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public void addAccountWithTransactions(String holderName, Transaction... transactions) {
        Account acc = new Account();
        acc.setHolderName(holderName);
        acc.setTransactions(Arrays.asList(transactions));

        Session session = factory.openSession();
        org.hibernate.Transaction tx = session.beginTransaction(); // ✅ FIXED here
        session.save(acc);
        tx.commit();
        session.close();
    }

    public void viewAccountsWithTransactions() {
        Session session = factory.openSession();
        session.createQuery("from Account", Account.class).list().forEach(account -> {
            System.out.println(account);
            account.getTransactions().forEach(System.out::println);
        });
        session.close();
    }

    public void close() {
        factory.close();
    }
}
