package xeulbn.ticketsellingapplication.ticketseller.domain;

import xeulbn.ticketsellingapplication.audience.domain.Audience;
import xeulbn.ticketsellingapplication.ticket.domain.Ticket;
import xeulbn.ticketsellingapplication.ticketoffice.domain.TicketOffice;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}
