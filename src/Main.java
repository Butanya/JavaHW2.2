public class Main {

    public static void main(String[] args) {

        int initialAmount = 0;
        int payment = 1_100;
        int totalAmount = initialAmount + payment;
        int bonus = payment / 100;

        int outAmount;
        if (payment > 1_000) {
            outAmount = (totalAmount + bonus);

            System.out.println("На вашем счету " + outAmount + " рублей, из них бонусных рублей - " + bonus);

        } else {
            outAmount = totalAmount;

            System.out.println("На вашем счету " + outAmount + " рублей, из них бонусных рублей - 0");
        }

    }
}
