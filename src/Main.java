public class Main {
    public static void main(String[] args) {

        System.out.println("Здравствуйте");
        int amountTicket = 13676;
        System.out.println("Стоимость билета " + amountTicket +" руб.");
        System.out.println("У нас действует бонусная программа,  за каждые 20 рублей, потраченные на билет, начисляется 1 миля.");


        int amountOneMiles = 20;
        int amountBonusMiles = amountTicket / amountOneMiles;

        System.out.println("Ваш бонус составляет " + amountBonusMiles + " миль.");

    }
}