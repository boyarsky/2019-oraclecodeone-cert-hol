public class Giants implements RandomInterface {

    public static void main(String... args) {
        Giants giants = new Giants();
        System.out.println(giants.getRandomNumberTickets(10));
        System.out.println(giants.getNumberStrikes());
    }
}
