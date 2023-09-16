public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);


        System.out.println();
        System.out.println(service.calculate(150000));

        System.out.println();
        System.out.println(service.calculate(2000));
    }
}