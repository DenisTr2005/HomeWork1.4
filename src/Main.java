public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задание 1");
        int i = 0;
        while (i<10) {
            i++;
            System.out.print(i + " " );
        }
        System.out.println();
        for (;i>0;i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n ");

        System.out.println("Задание 2");
        int firstFr = 3;
        for (i = firstFr; i<=31; i+=7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        System.out.println("Задание 3");
        int yearCurrent = 2022, yearFirst = 200, yearLast = 100;
        for (i = 0; i <= yearCurrent + yearLast; i+=79) {
            if (i >= yearCurrent - yearFirst) {
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        for (int j = 1; j<31; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println(j + ": ping pong");
            } else if (j % 3 == 0) {
                System.out.println(j + ": ping");
            } else if (j % 5 == 0) {
                System.out.println(j + ": pong");
            } else {
                System.out.println(j + ":");
            }
        }
        System.out.println();

        System.out.println("Задание 5");
        int f1 = 0, f2 = 1, f3, quantityNF = 10;
        System.out.print(f1 + " " + f2);
        for (int j = 3; j <= quantityNF; j++) {
            f3 = f1 + f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
    }
}