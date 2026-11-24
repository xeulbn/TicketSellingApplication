package xeulbn.ticketsellingapplication.practice.discountpolicy;

import xeulbn.ticketsellingapplication.practice.discountcondition.DiscountCondition;
import xeulbn.ticketsellingapplication.practice.money.Money;
import xeulbn.ticketsellingapplication.practice.screening.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ... discountConditions) {
        super(discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
