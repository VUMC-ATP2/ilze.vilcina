package oop_homework;

import java.util.Date;

public class Example {
    public static void main(String [] args) {
        Date date = new Date();
        System.out.println("Customers: ");

        Customer customerRita = new Customer("Rita", true, "Premium");
        Visit customerRitaVisit = new Visit(customerRita, new Date());
        customerRitaVisit.setServiceExpense(10);
        customerRitaVisit.setProductExpence(8);
        System.out.println(customerRitaVisit);
        System.out.println("Total expences: " + customerRitaVisit.getTotalExpence());

        System.out.println("-------------------------------------------------------------------");
        Customer customerDaniils = new Customer("Daniils", true, "Gold");
        Visit customerDaniilsVisit = new Visit(customerDaniils, new Date());
        customerDaniilsVisit.setServiceExpense(10);
        customerDaniilsVisit.setProductExpence(8);
        System.out.println(customerDaniilsVisit);
        System.out.println("Total expences: " + customerDaniilsVisit.getTotalExpence());

        System.out.println("-------------------------------------------------------------------");
        Customer customerEmma = new Customer("Emma", true, "Silver");
        Visit customerEmmaVisit = new Visit(customerEmma, new Date());
        customerEmmaVisit.setServiceExpense(10);
        customerEmmaVisit.setProductExpence(8);
        System.out.println(customerEmmaVisit);
        System.out.println("Total expences: " + customerEmmaVisit.getTotalExpence());

        System.out.println("-------------------------------------------------------------------");
        Customer customerToms = new Customer("Toms", false, "");
        Visit customerTomsVisit = new Visit(customerToms, new Date());
        customerTomsVisit.setServiceExpense(10);
        customerTomsVisit.setProductExpence(8);
        System.out.println(customerTomsVisit);
        System.out.println("Total expences: " + customerTomsVisit.getTotalExpence());

        System.out.println("-------------------------------------------------------------------");
        Customer customerElla = new Customer("Ella", true, "Premium");
        Visit customerEllaVisit = new Visit(customerElla, new Date());
        customerEllaVisit.setServiceExpense(10);
        System.out.println(customerEllaVisit);
        System.out.println("Total expences: " + customerEllaVisit.getTotalExpence());

        System.out.println("-------------------------------------------------------------------");
        Customer customerArtis = new Customer("Artis", true, "Premium");
        Visit customerArtisVisit = new Visit(customerArtis, new Date());
        customerArtisVisit.setProductExpence(8);
        System.out.println(customerArtisVisit);
        System.out.println("Total expences: " + customerArtisVisit.getTotalExpence());

}}
