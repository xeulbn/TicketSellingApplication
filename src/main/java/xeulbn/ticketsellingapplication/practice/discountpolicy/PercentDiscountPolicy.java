package xeulbn.ticketsellingapplication.practice.discountpolicy;

import xeulbn.ticketsellingapplication.practice.discountcondition.DiscountCondition;
import xeulbn.ticketsellingapplication.practice.money.Money;
import xeulbn.ticketsellingapplication.practice.screening.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition...discountConditions) {
        super(discountConditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
