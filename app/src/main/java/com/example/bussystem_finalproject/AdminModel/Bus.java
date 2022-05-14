package com.example.bussystem_finalproject.AdminModel;

public class Bus {
    String source;
    String destination;
    int numOfSeats;
    double ticketPrice;

    public Bus(String source, String destination, int numOfSeats, double ticketPrice) {
        this.source = source;
        this.destination = destination;
        this.numOfSeats = numOfSeats;
        this.ticketPrice = ticketPrice;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
