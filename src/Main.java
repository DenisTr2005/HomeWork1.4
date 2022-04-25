public class Main {
    public static void main(String[] args) {

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
        System.out.println("\n");

        System.out.println("Задание 2");
        int firstFr = 3;
        for (i = firstFr; i<=31; i+=7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("\n");

        System.out.println("Задание 3");
        int yearCurrent = 2022, yearFirst = yearCurrent - 200, yearLast = yearCurrent + 100;
        for (int year = yearFirst; year <= yearLast; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

    }
}