package xeulbn.ticketsellingapplication.practice.discountcondition;

import xeulbn.ticketsellingapplication.practice.screening.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
