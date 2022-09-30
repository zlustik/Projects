public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    public void showDecaseconds(double numSeconds){ 
        
        double decaseconds = numSeconds / 10;
        System.out.println("A decasecond is 10 seconds.");
        System.out.println("Conversion to decaseconds is: "  +  decaseconds);
        System.out.println();

    }
   


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    public void showJiffies(double numSeconds){
    // add your code here
        double jiffies = numSeconds * 100;
        System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds.");
        System.out.println("Conversion to jiffies: " + jiffies);
        System.out.println();

    }

    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    public void showNewYorkMinutes(double numSeconds){
    // add your code here
        double nycMinutes = numSeconds * 20;
        System.out.println("A new york minute is the period of time between the traffic lights turning");
        System.out.println("green and the cab behind you honking. It is 1/20th of 1 second.");
        System.out.println("Conversion to New York City Minutes: " + nycMinutes);
        System.out.println();
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    public void showNanoCenturies(double numSeconds){
    // add your code here
        double nanoCenturies = numSeconds / 3.156;
        System.out.println("A nanocentury is a computing measurement coined from the expression -  'never to let the user wait more than ");
        System.out.println("a few nanocenturies for a response.' It is 3.156 seconds.");
        System.out.println("Conversion to Nano Centuries: " + nanoCenturies);
        System.out.println();

    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here
    public void showScaramuccis(double numSeconds){
        double scaramuccis = numSeconds / 950400;
        System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.");
        System.out.println("Conversion to Scaramuccis: " + scaramuccis);
        System.out.println();
    
    }


    
}//end class