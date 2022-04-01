package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {


	// Задание 1
        int dog = 7;
        byte cat  = 1;
        short mouse = 3;
        long elephant = 120L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = false;
        char ampersand = 38;
        System.out.println(dogIsAdult);


    // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе +" + weightDifference);


    // Задание 3

        var bananaWeight = 5* 80;
        float milkWeight = 2*105;
        var iceCreamWeight = 2*100;
        var eggsWeight = 4*70;
        var fruitsWeight = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Общее количество фруктов " + fruitsWeight + "гр! ");
        fruitsWeight = fruitsWeight / 1000;
        System.out.println("В килограмах " + fruitsWeight + "кг! ");

     // Задание 4

     long weight = 7000L;
     float oneDay = weight / 250f;
     System.out.println("Дней надо " + oneDay + " Если сбросит по 250 в день ");
     int loseWeight = 7000;
     int onePortion = loseWeight / 500;
     System.out.println("Дней надо " + onePortion + " Если сбросит по 500 в день ");


     int day500gr = 14;
     long day250gr = 28;
     System.out.println(day250gr - day500gr +" Промежуток дней ");
     int day = 14/2;
     System.out.println(day500gr + day +" День нужен в среднем ");

     //Задание 5
     float Masha = (float) 67760;
     double Denis = 83690;
     float Kristina = (float) 76930;
     System.out.println("Годой доход Маши вырос на " +Masha /100*10+ "Рублей ");
     System.out.println("Годовой доход Дениса вырос на "+Denis /100*10 +"Рублей ");
     System.out.println("Годовой доход Кристины вырос на "+Kristina/100*10 +"Рублей ");

     Masha=Masha+6776;
     Denis=Denis+8369;
     Kristina=Kristina+7693;
     System.out.println("Теперь Маша получает " + Masha + "Рублей ");
     System.out.println("Теперь Денис получает " + Denis + "Рублей ");
     System.out.println("Теперь Кристина получает " +Kristina +"Рублей ");
















           }

}
