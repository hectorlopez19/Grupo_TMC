package model;

public class Quotation {
    private int days;
    private String destination;
    private String roomKind;
    private String payMethod;
    private double subtotal;
    private double iva;
    private double total;
    private double monthlyPayment;

    public Quotation(int days, String destination, String roomKind, String payMethod, double subtotal) {
        this.days = days;
        this.destination = destination;
        this.roomKind = roomKind;
        this.payMethod = payMethod;
        this.subtotal = subtotal;
        this.iva = subtotal * 0.16;
        this.total = subtotal + iva;
        if(payMethod.equals("Pago unico")) {
            this.monthlyPayment = 0;
        }
        else {
            this.monthlyPayment = total / 6;
        }
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRoomKind() {
        return roomKind;
    }

    public void setRoomKind(String roomKind) {
        this.roomKind = roomKind;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }


}
