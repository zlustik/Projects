public class Budget {
    public static void main(String[] args) {

        //************************** 
        //Project 1
        //************************** 
       

        //INCOME//

        int hourlyWage = 10;       //Initializes
        double wage = hourlyWage;  //Income

        //EXPENSES//
       
        int rent = 625;            //
        int internet = 27;         //Initializes
        int grocery = 250;         //Expenses
        int fun = 150;             //
        
        //CALCULATIONS//

        int monthlyExpense = rent + internet + grocery + fun; //Adds total expenses together.
        double weeklyExpense = monthlyExpense/4; //Calculates weekly expenses
        double breakEven = weeklyExpense / hourlyWage; //Hours to break even can be calculated by dividing expenses by hourly wage.
        double hoursToSave = breakEven + (25 / wage); //Calculates how many hours needed to save $100 per month ($25 per week).
        
        //OUTPUT//

        System.out.println();
        System.out.println("INCOME:");
        System.out.println("--------------------------");
        System.out.println("Wage: ------------$" + hourlyWage);
        System.out.println("--------------------------");
        System.out.println("EXPENSES:"); 
        System.out.println("--------------------------");
        System.out.println("Rent: -----------$" + rent);
        System.out.println("Internet: --------$" + internet);
        System.out.println("Groceries: ------$" + grocery);
        System.out.println("Leisure: --------$" + fun);
        System.out.println();
        System.out.println("Total Monthly Expenses: $" + monthlyExpense);    
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Weekly hours to break even: " + breakEven + " hours.");
        System.out.println("Weekly hours to save $100 a Month: " + hoursToSave + " hours.");
        System.out.println("--------------------------");
      
        
    }
    
}


