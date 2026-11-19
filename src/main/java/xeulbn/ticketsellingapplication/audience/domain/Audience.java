package xeulbn.ticketsellingapplication.audience.domain;

import xeulbn.ticketsellingapplication.bag.domain.Bag;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
