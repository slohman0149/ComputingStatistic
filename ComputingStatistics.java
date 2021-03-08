import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         amount = amount + loan.getLoanAmount();
      }
      return amount;
   }
   
   /*
    * Calculates the average of all the daysToFund in the data ArrayList
    * @returns the average of daysToFund
    */
   public double avgDaysToFund(){
       double averageSec = 0.0;
       int listSize = data.size();
       for (Loan l:data) {
           averageSec += l.getDaysToFund();
        }
       double averageMin = averageSec / 60;
       double avergeHour = averageMin / 60;
       double averageDay = avergeHour / 24;
       averageDay = averageDay / listSize;
       return averageDay;
    }
   /*
    * Finds the largest loan from a country
    * @returns the largest loan
    */
   public double largestLoan(String countryName) {
       double bigLoan = 0.0;
       for (Loan l:data) {
          String arrayCountry = l.getCountry(); 
          if (arrayCountry.equals(countryName)) {
              if (bigLoan < l.getLoanAmount()) {
                  bigLoan = l.getLoanAmount();
                }
            }
       }
       return bigLoan;
    }
   /*
    * Finds the average loan for a specific country
    * @returns the average loan
    */
   public double avgLoan(String countryName) {
       double averageLoan = 0.0;
       for (Loan l:data) {
           String arrayCountry = l.getCountry();
           if (arrayCountry.equals(countryName)) {
               averageLoan += l.getLoanAmount();
            }
        }
       return averageLoan; 
    }
    /*
     * Finds the country with the longest time to fund
     * @returns the country with longest fund time
     */
   public String longestToFundCountry() {
       String longestCountry = " ";
       int fundTime = 0;
       for (Loan l: data) {
           if (fundTime < l.getDaysToFund()) {
               longestCountry = l.getCountry();
               fundTime = l.getDaysToFund();
            }
        }
       return longestCountry;
    }
    /*
     * Finds the total amount of loans funded from a specific 
     * country
     * @return total amount of loan
     */
   public int loansFunded(String countryName) {
       int loanFund = 0;
       for (Loan l:data) {
           String arrayCountry = l.getCountry();
           if (arrayCountry.equals(countryName)) {
               loanFund += 1;
            }
        }
       return loanFund;
    }
}
