public class Main {
    public static void main(String[] args) {
        int sum = 1100; // Сумма пополнения//
        int bill = 100; //Сумма на счету//
        int billSum; //Сумма после пополнения//
        boolean sumAdd = sum > 1000;
        int bonus = 0;
        int bonusSum;
        if (sumAdd) {
            bonusSum = (sum / bill + bonus);
            billSum = (sum + bill + bonusSum);
        } else {
            bonusSum = bonus;
            billSum = (sum + bill + bonusSum);
        }
        System.out.println("Сумма на счету: " + billSum);
        System.out.println();
        System.out.println("Сумма бонусов:" + bonusSum);
    }
}
