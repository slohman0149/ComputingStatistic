
/**
 * Write a description of class Loan here.
 *
 * @SydneyL & SamK
 * @DATE GOES HERE
 */
public class Loan
{
    private int ID;
    private double loanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;
    
    public Loan(int ID, double loanAmount, String country, int daysToFund,
                int numLenders) {
        this.ID = ID;
        this.loanAmount = loanAmount;
        this.country = country;
        this.daysToFund = daysToFund;
        this.numLenders = numLenders;
    }
    //Gets the ID:syd
    public int getID() {
        return ID;
    }
    //Gets the Loan Amount:syd
    public double getLoanAmount() {
        return loanAmount;
    }
    //Gets the Country: syd
    public String getCountry() {
        return country;
    }
    
    
    //Sets the ID to a new int:syd
    public void setID(int ID) {
        this.ID = ID;
    }
    //Sets the Loan Amount to a new double: syd
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    //Sets the Country to a new String: syd
    public void setCountry(String country) {
        this.country = country;
    }
    
    
    //Turns the entire Loan data into a printable string: syd
    public String toString() {
        return "ID: "+ID+" Loan Amount: "+loanAmount+" Country: "+country+" Days to Fund: "+daysToFund+" Number of Lenders: "+numLenders;
    }
}
