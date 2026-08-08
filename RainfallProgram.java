import java.util.Scanner;


//Creating the Month class, using two fields of monthName and amount. We will get
//the monthName from the array we will create, and the amount from the user input.
class MonthRainfall {
    String monthName;
    double amount;

    public MonthRainfall(String monthName) {
        this.monthName = monthName;
        this.amount = 0.0;
    }
}

    //The main class
public class RainfallProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This createes an array, with each indexed item having a name that relates
        //to a different month. We initialize all the months up front so we don't
        //have to worry about setting their names later on.
        MonthRainfall[] months = {
            new MonthRainfall("January"),
            new MonthRainfall("February"),
            new MonthRainfall("March"),
            new MonthRainfall("April"),
            new MonthRainfall("May"),
            new MonthRainfall("June"),
            new MonthRainfall("July"),
            new MonthRainfall("August"),
            new MonthRainfall("September"),
            new MonthRainfall("October"),
            new MonthRainfall("November"),
            new MonthRainfall("December")
        };

        double total = 0.0;

        // Input loop
        for (int i = 0; i < months.length; i++) {
            double rainfall;

            do {
                //Now we can set the double for each month.
                System.out.print("Enter rainfall for " + months[i].monthName + ": ");
                rainfall = scanner.nextDouble();

                if (rainfall < 0) {
                    System.out.println("Rainfall must be 0 or greater.");
                }

            } while (rainfall < 0);
            //Now we change the 'amount' based on the user input, also adding the
            //total for later calculations.
            months[i].amount = rainfall;
            total += rainfall;
        }

        // Calculate average
        double average = total / months.length;

        // setting the maximum and minimum to 0 so when a loop goes through all the
        // values it can change accordingly.
        MonthRainfall maxMonth = months[0];
        MonthRainfall minMonth = months[0];

        //if the month being checked has a higher value it will replace the existing
        //month name stored in maxMonth
        for (int i = 1; i < months.length; i++) {
            if (months[i].amount > maxMonth.amount) {
                maxMonth = months[i];
            }
        //this does the same but for the minimum
            if (months[i].amount < minMonth.amount) {
                minMonth = months[i];
            }
        }

        // Output results
        System.out.println("\nAverage rainfall: " + average);
        System.out.println("Highest rainfall: " + maxMonth.monthName + " (" + maxMonth.amount + ")");
        System.out.println("Lowest rainfall: " + minMonth.monthName + " (" + minMonth.amount + ")");

        scanner.close();
    }
}
