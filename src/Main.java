public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
}
    public static void task1() {

        // Задание 1
        byte a = 35;
        short b = 11;
        int c = 69;
        long d = 150000L;
        float e = 1.8f;
        double f = 12.3;
        boolean g = b >= 71;
        char r = '?';
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("Значение переменной g с типом boolean равно " + g);
        System.out.println("Значение переменной r с типом char равно " + r);
    }

    public static void task2() {
        //Задание 2
    float one = 27.12f;
    long two = 987678965549L;
    double tree = 2.786;
    boolean four = false;
    short five = 569;
    short six = - 159;
    int seven = 27897;
    byte eight = 67;
    char nine = '!';
    }

    public static void task3() {
    // Задание 3

    int students = 23 + 27 + 30;
    int lists = 480;
    int listsPerStudent = lists / students;
        System.out.println("На каждого ученика рассчитано " + listsPerStudent + " листов бумаги");
    }

    public static void task4() {
    // Задание 4

       int bottlePerTwoMin = 16;
       int timeMin = 2;
       int bottlePerMin = bottlePerTwoMin / timeMin;
       int threeDays = 3;
       int timeTwenty = 20;

       int dayHour = 24;
       int timeMinDay = dayHour * 60;
       int month = 30;

       int bottlePerTwenty = bottlePerMin * timeTwenty;
       int bottlePerDay = bottlePerMin * timeMinDay;
       int bottlePerThreeDays = bottlePerDay * threeDays;
       int bottleMonth = bottlePerDay * month;

        System.out.println("За " + timeTwenty + " минут машина произвела бутылок " + bottlePerTwenty + " штук");
        System.out.println("За один день машина произвела бутылок " + bottlePerDay + " штук");
        System.out.println("За " + threeDays + " дня машина произвела бутылок " + bottlePerThreeDays + " штук");
        System.out.println("За месяц машина произвела бутылок " + bottleMonth + " штук");

    }

    public static void task5(){
        //Задание 5
    int cans = 120;
    int whiteCan = 2;
    int brownCan = 4;
    int cansOneClass = whiteCan + brownCan;
    int classes = cans / cansOneClass;
    int white = classes * whiteCan;
    int brown = classes * brownCan;
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }

    public static void task6() {
        //Задание 6

        int banana = 5;
        int milk = 2;
        int iceCream = 200 / 100;
        int egg = 4;
        int bananaOneWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int wholeWeight = banana * bananaOneWeight + milk * milkWeight + iceCream * iceCreamWeight +
                egg * eggWeight;
        int grPerKg = 1000;
        float weightKg = wholeWeight / (float) grPerKg;
        System.out.println("Вес спорт-завтрака: " + weightKg + " кг");

    }

    public static void task7() {
       // Задание 7

        int weightKilogramm = 7;
        int everyDayLoseWeight = 250;
        int everyDayLoseMoreWeight = 500;
        int methodLoseWeight = 2;
        int inGr = 1000;

        int weight = weightKilogramm * inGr;
        int quantityDay = weight / everyDayLoseWeight;
        int quantityDayLoseMoreWeight = weight / everyDayLoseMoreWeight;
        int quantityDayAverage = (quantityDay + quantityDayLoseMoreWeight) / methodLoseWeight;
        System.out.println("Количество дней для похудения при снижении веса на 250 гр. в день: " + quantityDay);
        System.out.println("Количество дней для похудения при снижении веса на 500 гр. каждый день : " + quantityDayLoseMoreWeight);
        System.out.println("Среднее количество дней для похудения " + quantityDayAverage);

    }

    public static void task8 (){
        // Задание 8

        int  salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        double increaseSalaryPercent = 0.1;
        int year = 12;

        int newSalaryMasha = (int) (salaryMasha * increaseSalaryPercent + salaryMasha);
        int yearMashaBefore = salaryMasha * year;
        int yearMashaAfter = newSalaryMasha * year;
        int differentSalaryMasha = yearMashaAfter - yearMashaBefore;

        int newSalaryDenis = (int) (salaryDenis * increaseSalaryPercent + salaryDenis);
        int yearDenisBefore = salaryDenis * year;
        int yearDenisAfter = newSalaryDenis * year;
        int differentSalaryDenis = yearDenisAfter - yearDenisBefore;

        int newSalaryKris = (int) (salaryKris * increaseSalaryPercent + salaryKris);
        int yearKrisBefore = salaryKris * year;
        int yearKrisAfter = newSalaryKris * year;
        int differentSalaryKris = yearKrisAfter - yearKrisBefore;

        System.out.println( "Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differentSalaryMasha + " рублей.");
        System.out.println( "Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differentSalaryDenis + " рублей.");
        System.out.println( "Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + differentSalaryKris + " рублей.");


    }
}
