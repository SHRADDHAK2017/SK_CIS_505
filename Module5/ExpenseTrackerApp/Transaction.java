import java.util.Date;

public class Transaction{

    public static final int length = 0;
	private Date date;            // specifies the date of a transaction
    private String description;  //specifies the description of a transaction
    private Double amount;      //specifies the amount of a transaction

    //no-argument constructor to create a customer
    public Transaction(){

        date = date;
        description = "";
        amount = 0.0;
        
    }

    // argument constructor that creates a Transaction
    public Transaction(Date date, String description, Double amount){

        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    //Accessor methods for four data field
    public void setDate (Date date){

        this.date = date;
    }

    public Date getDate(){

        return date;
    }

    public void setDescription(String description){

        this.description = description;
    }

    public String getDescription(){

        return description;
    }

    public void setAmount(Double amount){

        this.amount = amount;
    }

    public Double getAmount(){
        return amount;
    }

    //Override method to get a string description for a Transaction

    public String toString(){

        return "\n" + "Date" + getDate() +"\n" + "Description" + getDescription() + "\n" + "Amount" + getAmount();
    }

    



}