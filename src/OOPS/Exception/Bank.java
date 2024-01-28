package src.OOPS.Exception;

public class Bank {
    private String currency;
    private Integer amount;
    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Integer add(Bank bankname) throws  customexception{
        if (!bankname.currency.equalsIgnoreCase("INR")){
            throw new customexception("INR to currenty not supported");

        }
        Integer sum=this.amount+bankname.amount;
        return sum;

    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


}
