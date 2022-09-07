package com.company.test;

import com.company.Address;
import com.company.Bank;
import com.company.Customer;
import com.company.Date;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private static Bank bank;
    private static Customer newCustomer;
    private static Customer ayo;
    private static Customer ojo;

    @BeforeEach
    void setUp() {
        bank = new Bank("GTB");
        Address address = new Address(63, "Awoyaya Street", "Ajah");
        Date dateOfBirth = new Date(26, 6, 1876);
        newCustomer = new Customer("Kayode", "Alogba", "07014145766", address, dateOfBirth);
        bank.addCustomer(newCustomer);
        ayo = new Customer("Ayo", "Dele", "080", new Address(50, "egan"), new Date(2,3,1776));
        ojo = new Customer("Ojo", "Oyo", "070", new Address(50, "egan"), new Date(2,3,1776));
        bank.addCustomer(ayo);
        bank.addCustomer(ojo);
    }
    }
