package se.kth.id1212.appserv.converter.presentation.acct;

import se.kth.id1212.appserv.converter.util.Util;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

class UpdateRateForm {
    @NotNull(message = "Please specify rate")
    @Positive(message = "Amount must be greater than zero")
    private Integer rate;

    public Integer getRate() {
        return rate;
    }
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return Util.toString(this);
    }
}
