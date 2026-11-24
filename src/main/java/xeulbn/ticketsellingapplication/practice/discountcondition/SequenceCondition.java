package xeulbn.ticketsellingapplication.practice.discountcondition;

import xeulbn.ticketsellingapplication.practice.screening.Screening;

public class SequenceCondition implements DiscountCondition{

    private int sequence;

    public SequenceCondition(int sequence){
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        //Screening이 할인 가능한 경우 true, 불가능한 경우 false 반환
        return screening.isSequence(sequence);
    }
}
