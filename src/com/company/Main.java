package com.company;

public class Main {

    public static void main(String[] args) {
	Bank bank=new Bank("Teb bank");
    bank.addBranch("Adelaide");
    bank.addCustomer("Adelaide","Murat",50.05);
    bank.addCustomer("Adelaide","Mehmet",175.34);
    bank.addCustomer("Adelaide","Zeynep",220.12);
    bank.addBranch("Sydney");
    bank.addCustomer("Sydney","Melis",150.14);
    bank.addCustomerTransaction("Adelaide","Murat",44.22);
        bank.addCustomerTransaction("Adelaide","Murat",12.44);
        bank.addCustomerTransaction("Adelaide","Mehmet",1.65);
        bank.ListCustomers("Adelaide",true);
    }
}
