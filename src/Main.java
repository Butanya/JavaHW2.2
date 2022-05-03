public class Main {

    public static void main(String[] args) {

        int initialAmount = 100;
        int payment = 800;
        int totalAmount = initialAmount + payment;
        int bonus = (totalAmount - 1000) / 100;

        int outAmount;
        if (initialAmount + payment >= 1000) {
            outAmount = (totalAmount + bonus);

            System.out.println("На вашем счету " + outAmount + " рублей, из них бонусных рублей - " + bonus);

        } else {
            outAmount = totalAmount;

            System.out.println("На вашем счету " + outAmount + " рублей, из них бонусных рублей - 0");
        }

    }
}
