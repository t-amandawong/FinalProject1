/**
 * Order.java
 * @author Henry Choy, Mario Panuco, Nigel Erlund, Weifeng Bai, Thanyared Wong
 * CIS 22C, Final Project
 */

import java.util.Comparator;

public class Order {

    private Customer customer;
    private int shippingSpeed;
    private int date;
    private List<VideoGame> orderContents;
    private boolean shippingStatus;
    private long priority;

    public Order(Customer customer, int date, List<VideoGame> orderContents, int shippingSpeed, boolean shippingStatus) {
        this.customer = customer;
        this.date = date;
        this.orderContents = orderContents;
        this.shippingSpeed = shippingSpeed;
        this.priority = (System.currentTimeMillis() - (shippingSpeed * 86400000));
        this.shippingStatus = shippingStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<VideoGame> getOrderContents() {
        return orderContents;
    }

    public void setOrderContents(List<VideoGame> orderContents) {
        this.orderContents = orderContents;
    }

    public int getShippingSpeed() {
        return shippingSpeed;
    }

    public void setShippingSpeed(int shippingSpeed) {
        this.shippingSpeed = shippingSpeed;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    @Override
    public String toString() { // return string in the format that we are writing out to the file
        String temp = "";
        temp += shippingSpeed + "\n";
        temp += Boolean.toString(shippingStatus) + "\n";
        temp += date + "\n";
        temp += priority + "\n";
        temp += orderContents.getLength() + "\n"; // Number of video games in the order
        orderContents.placeIterator();
        for (int i = 0; i < orderContents.getLength(); i++) {
            temp += orderContents.getIterator().getTitle() + "\n";
            orderContents.advanceIterator();
        }
        return temp;
    }

}

//Should also contain a Comparator class with a compare method to determine priority
class OrderComparator implements Comparator<Order> {
    public int compare(Order order1, Order order2) {
        if (order1.getPriority() < order2.getPriority()) {
            return -1;
        } else if (order1.getPriority() > order2.getPriority()) {
            return 1;
        } else {
            return 0;
        }
    }
}