public class Main {
    public static void main(String[] args) {

        //Variable creation
        String clientName = "Eduardo";
        int nights = 7;
        double dailyRate = 4.88;
        boolean oceanView = true;

        //Print information
        System.out.println("        ***** HOTEL BOOKING *****");
        System.out.println("--------------------------------------------");

        System.out.println("Client name: "+clientName);
        System.out.println("Nights: "+nights);
        System.out.println("Daily Rate: "+dailyRate);
        System.out.println("Ocean View: "+oceanView);

        //Updating variable
        clientName = "Jose";
        nights = 15;
        dailyRate = 6.88;
        oceanView = false;

        //New data print
        System.out.println();
        System.out.println("***** NEW HOTEL BOOKING INFORMATION *****");
        System.out.println("--------------------------------------------");
        System.out.println("Client name: "+clientName);
        System.out.println("Nights: "+nights);
        System.out.println("Daily Rate: "+dailyRate);
        System.out.println("Ocean View: "+oceanView);
    }
}