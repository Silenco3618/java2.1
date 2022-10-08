public class Main {
    public static void main(String[] args) {
        int sum = 1100;
        int bill = 100;
        int bill2;
        boolean x = sum > 1000;
        int bonus = 0;
        int bonus1;
        if (x) {
            bonus1 = (sum / bill + bonus);
            bill2 = (sum + bill + bonus1);
            System.out.println("Сумма на счету: " + bill2);
            System.out.println();
            System.out.println("Сумма бонусов:" + bonus1);
        }
    }
}