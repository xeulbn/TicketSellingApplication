package xeulbn.ticketsellingapplication.audience.domain;

import xeulbn.ticketsellingapplication.bag.domain.Bag;
import xeulbn.ticketsellingapplication.ticket.domain.Ticket;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
