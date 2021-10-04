public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15_000;
        int amountOfRubles = 20;

        int amountOfMiles = ticketPrice / amountOfRubles;
        System.out.println("Количество начисленных миль = " + amountOfMiles);

    }
}
