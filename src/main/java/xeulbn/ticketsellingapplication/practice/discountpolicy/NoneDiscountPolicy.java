package xeulbn.ticketsellingapplication.practice.discountpolicy;

import xeulbn.ticketsellingapplication.practice.money.Money;
import xeulbn.ticketsellingapplication.practice.screening.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
