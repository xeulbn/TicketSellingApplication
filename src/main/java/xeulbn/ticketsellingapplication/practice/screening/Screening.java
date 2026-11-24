package xeulbn.ticketsellingapplication.practice.screening;

import xeulbn.ticketsellingapplication.practice.customer.Customer;
import xeulbn.ticketsellingapplication.practice.money.Money;
import xeulbn.ticketsellingapplication.practice.movie.Movie;
import xeulbn.ticketsellingapplication.practice.reservation.Reservation;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime startTime;

    public Screening(Movie movie, int sequence, LocalDateTime startTime) {
        this.movie = movie;
        this.sequence = sequence;
        this.startTime = startTime;
    }

    public LocalDateTime getStartTime(){
        return startTime;
    }

    public boolean isSequence(int sequence){
        return this.sequence==sequence;
    }
    public Money getMovieFee(){
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount){
        return new Reservation(customer, this, calculateFee(audienceCount),audienceCount);
    }

    private Money calculateFee(int audienceCount){
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
