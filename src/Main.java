public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte Tbilisi = 111;
        short Istanbul = 10;
        int Berlin = 3000;
        long Beirut = 6;
        double TemperatureInMoscow = 21.6;
        float sparrowWeight = 1.3f;
        char city = 30;
        boolean BeirutIf = Beirut < 7;
        System.out.println (BeirutIf);

        // Задание 2
        double theFirstBoxer = 78.2;
        double theSecondBoxer = 82.7;
        double totalWeight = theFirstBoxer + theSecondBoxer;
        System.out.println(totalWeight);
        double weightDifference = theSecondBoxer - theFirstBoxer;
        System.out.println(weightDifference);

        // Задание 3
        byte oneBanana = 80;
        int weightOfBananas = oneBanana * 5;
        byte oneHundredMilliliters = 105;
        int twoHundredMilliliters = oneHundredMilliliters * 2;
        byte oneIceCream = 100;
        int twoIceCream = oneIceCream * 2;
        byte oneEgg = 70;
        int fourEggs = oneEgg * 4;
        int mix = weightOfBananas + twoHundredMilliliters + twoIceCream + fourEggs;
        int killograms = mix / 1000;
        System.out.println(killograms);

        // Задание 4
        byte loseWeight = 7;
        int loseWeightInGrams = loseWeight * 1000;
        int losesMinimum = loseWeightInGrams / 250;
        int losesMaximum = loseWeightInGrams / 500;
        int sum = losesMinimum + losesMaximum;
        int average = sum / 2;
        System.out.println(average);

        // Задание 5
        int Masha = 67760;
        int increaseSalaryMasha = Masha / 100 * 10;
        int salaryMasha = increaseSalaryMasha + Masha;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + increaseSalaryMasha + " рублей");

        int Denis = 83690;
        int increaseSalaryDenis = Denis / 100 * 10;
        int salaryDenis = increaseSalaryDenis + Denis;
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + increaseSalaryDenis + " рублей");

        int Kristina = 76230;
        int increaseSalaryKristina = Kristina / 100 * 10;
        int salaryKristina = increaseSalaryKristina + Kristina;
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + increaseSalaryKristina + " рублей");

    }
}