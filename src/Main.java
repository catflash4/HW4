public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 18;
        if ( age >= 18 )
        {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        int temperature = 10;
        if ( temperature <= 5 )
        {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //Задача 3
        int kmPerHour = 50;
        if ( kmPerHour >= 60 )
        {
            System.out.println("Если скорость " + kmPerHour + " то, придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + kmPerHour + " то, можно ездить спокойно");
        }

        //Задача 4
        int ageSecond = 19;
        if( ageSecond >= 2 && ageSecond <= 6)
        {
            System.out.println("Если возраст человека равен " + ageSecond + ", то ему нужно ходить в детский сад");
        }
        if ( ageSecond >= 7 && ageSecond <=17)
        {
            System.out.println("Если возраст человека равен " + ageSecond + ", то ему нужно ходить в школу");
        }
        if ( ageSecond >= 18 && ageSecond <=24)
        {
            System.out.println("Если возраст человека равен " + ageSecond + ", то ему нужно ходить в университет");
        }
        if (ageSecond > 24) {
            System.out.println("Если возраст человека равен " + ageSecond + ", то ему нужно ходить на работу");
        }

        //Задача 5
        int ageForAttractions = 14;
        if (ageForAttractions <= 5)
        {
            System.out.println("Если возраст ребенка равен " + ageForAttractions + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageForAttractions > 5 && ageForAttractions <= 14)
        {
            System.out.println("Если возраст ребенка равен " + ageForAttractions + ", то ему можно кататься на аттракционе только в сопровождении взрослого.");
        }
        if (ageForAttractions > 14)
        {
            System.out.println("Если возраст ребенка равен " + ageForAttractions + ", то ему можно кататься на аттракционе без сопровождение взрослого.");
        }

        //Задача 6
        int takenSeats = 101;
        int alloverSeats = 102;
        int freePlace = alloverSeats - takenSeats;
        int maxSeatPlace = 60;
        int freeSeatPlace;
        int maxStandPlace = 42;
        int freeStand;
        if (takenSeats == maxSeatPlace)
        {
            freeStand = maxStandPlace ;
        } else {
            freeStand = alloverSeats - takenSeats;
        }
        if(takenSeats < alloverSeats)
        {
            freeSeatPlace = maxSeatPlace - takenSeats;
            System.out.println("В поезде есть место.");
            if (freePlace < 61 && freeSeatPlace > 0)
            {
                System.out.println("В поезде щас " + freeSeatPlace + " сидячих мест и " + maxStandPlace + " стоячих мест");
            } else if (freeSeatPlace <= 0) {
                System.out.println("В поезде щас нету сидячих мест но есть " + freeStand + " стоячих мест");
            }
        }else
        {
            System.out.println("В поезде нету свободных мест");
        }

        //Задача 7
        int one = 8;
        int two = 5;
        int three = 12;

        if (one>two && one>three)
        {
            System.out.println("Максимальное число равное " + one);
        }
        else if (two>one && two > three)
        {
            System.out.println("Максимальное число равное " + two);
        }
        else
        {
            System.out.println("Максимальное число равное " + three);
        }
    }
}