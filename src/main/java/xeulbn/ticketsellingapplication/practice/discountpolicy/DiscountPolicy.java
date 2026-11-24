package xeulbn.ticketsellingapplication.practice.discountpolicy;

import xeulbn.ticketsellingapplication.practice.discountcondition.DiscountCondition;
import xeulbn.ticketsellingapplication.practice.money.Money;
import xeulbn.ticketsellingapplication.practice.screening.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//추상 클래스
public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition...conditions){
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition eachCondition : conditions){
            if(eachCondition.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
