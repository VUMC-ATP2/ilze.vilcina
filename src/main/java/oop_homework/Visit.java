package oop_homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@ToString
@AllArgsConstructor
public class Visit {
    public Customer customer;
    public Date date;
    @Getter
    @Setter
   public double serviceExpense;
    @Getter
    @Setter
    public double productExpence;

public Visit(Customer customer, Date date) {
    this.customer = customer;
    this.date = date;
}
public String getName() {
    return customer.getName();
}
public double getServiceExpense() {
    return serviceExpense;
}
public void setServiceExpense(double serviceExpense) {
    this.serviceExpense = serviceExpense;
}
public double getProductExpence() {
    return productExpence;
}
public void setProductExpence(double productExpence) {
    this.productExpence = productExpence;
}
public double getTotalExpence() {
    return ((serviceExpense - (serviceExpense*DiscountRate.getServiceDiscountRate(customer.getMemberType())))+(productExpence - (productExpence*DiscountRate.getProductDiscountRate(customer.getMemberType()))));
}

}
