/*Пусть дан произвольный список целых чисел.
//
//Нужно удалить из него чётные числа
//Найти минимальное значение
//Найти максимальное значение
//Найти среднее значение
*/

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int n = new Random().nextInt(5, 20);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(99));
            if (list.get(i) % 2 != 0)
                list1.add(list.get(i));
        }
        System.out.println("Произвольный список целых чисел " + list);
        System.out.println();
        System.out.println("Список нечётных: " + list1);
        System.out.println();

        int ma = list1.get(0);
        for (int j : list1) {
            if (j > ma)
                ma = j;
        }
        System.out.println("Максимум в списке " + ma);
        System.out.println();

        int mi = list1.get(0);
        for (int j : list1) {
            if (j < mi)
                mi = j;
        }
        System.out.println("Минимум в списке " + mi);
        System.out.println();

        double sum = 0;
        //int count = 0;
        double mid = 0;
        for (int j : list1) {
            sum += j;
            mid = sum / list1.size();
        }

        System.out.println("Среднее арифметическое: " + mid);





    }
}





