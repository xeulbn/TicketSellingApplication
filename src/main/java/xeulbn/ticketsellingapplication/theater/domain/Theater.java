package xeulbn.ticketsellingapplication.theater.domain;

import xeulbn.ticketsellingapplication.audience.domain.Audience;
import xeulbn.ticketsellingapplication.ticket.domain.Ticket;
import xeulbn.ticketsellingapplication.ticketseller.domain.TicketSeller;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}
