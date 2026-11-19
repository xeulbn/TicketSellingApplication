package xeulbn.ticketsellingapplication.ticketseller.domain;

import xeulbn.ticketsellingapplication.ticketoffice.domain.TicketOffice;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
