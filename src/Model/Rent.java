/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Date;

/**
 *
 * @author Windows 8.1
 */
public class Rent implements Price{
    private String idTransaction;
    private Date borrowDate;
    private Date returnDate;
    private Customer customer;
    private Employee employee;
    private Cars car;
    private Driver driver;

    public Rent(String idTransaction, Date borrowDate, Date returnDate, Customer customer, Employee employee, Cars car, Driver driver) {
        this.idTransaction = idTransaction;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.customer = customer;
        this.employee = employee;
        this.car = car;
        this.driver = driver;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Cars getCar() {
        return car;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
    
}
