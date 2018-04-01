import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ_arrays_string {
    public static void main(String[] args) {

        /*1.1) Создайте массив из всех чётных чисел от 2 до 20
         и выведите элементы массива на экран сначала в строку,
          отделяя один элемент от другого пробелом, а затем в столбик
           (отделяя один элемент от другого началом новой строки).
            Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
          */

        int val = 0; // посчитаем размер массива
        for (int i = 2; i <= 20; i += 2) {
            val++;
        }

        int ev[] = new int[val];
        int start = 2;
        for (int i = 0; i < ev.length; i++) {
            ev[i] = start;
            start += 2;
            System.out.print(ev[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < ev.length; i++) {
            System.out.print(ev[i] + "\n");
        }



        /*1.2) Создайте массив из всех нечётных чисел от 1 до 99,
         выведите его на экран в строку, а затем этот же массив
          выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
          */

//        int val1 = 0;  // посчитаем размер массива
//        for (int i = 1; i <= 99; i += 2) {
//            val1++;
//        }
//        int odd[] = new int[val1];
//        int start1 = 1;
//        for (int i = 0; i < odd.length; i++) {
//            odd[i] = start1;
//            start1 += 2;
//            System.out.print(odd[i] + " ");
//        }
//
//        System.out.println();
//
//        int odd1[] = new int[val1];
//        int start2 = 99;
//        for (int i = 0; i < odd1.length; i++) {
//            odd1[i] = start2;
//            start2 -= 2;
//            System.out.print(odd1[i] + " ");
//        }


        /*1.3) Создайте массив из 15 случайных целых чисел из отрезка [0;9].
         Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
          и выведете это количество на экран на отдельной строке.
          */

//        Random rand = new Random();
//        int arr[] = new int[15];
//        int evenElem = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int n = rand.nextInt(10);
//            arr[i] = n;
//            System.out.print(" " + arr[i]);
//            if (arr[i] % 2 == 0) {
//                evenElem++;
//            }
//        }
//        System.out.println("\n" + "Четных элементов в данном массиве: " + evenElem);



        /*1.4) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
         выведите массивы на экран в двух отдельных строках.
         Посчитайте среднее арифметическое элементов каждого массива и сообщите,
          для какого из массивов это значение оказалось больше
           (либо сообщите, что их средние арифметические равны).
          */

//        int val3 = 5;
//        int arr1[] = new int[val3];
//        int arr2[] = new int[val3];
//        Random rand = new Random();
//        double countArr1 = 0;
//        double countArr2 = 0;
//
//        for (int i = 0; i < val3; i++) {
//            int n = rand.nextInt(6);
//            int m = rand.nextInt(6);
//            arr1[i] = n;
//            arr2[i] = m;
//            countArr1 += arr1[i];
//            countArr2 += arr2[i];
//        }
//
//        System.out.print(Arrays.toString(arr1) + "\n");
//        System.out.print(Arrays.toString(arr2) + "\n");
//
//        double average1 = countArr1 / val3;
//        double average2 = countArr2 / val3;
//
//        if (average1 > average2) {
//            System.out.println("arr1:" + average1 + " больше чем " + "arr2:" + average2);
//        } else if (average2 > average1) {
//            System.out.println("arr2:" + average2 + " больше чем " + "arr1:" + average1);
//        } else {
//            System.out.println("arr1:" + average1 + " равно " + "arr2:" + average2);
//        }

        /*2.1)  Найти в строке указанную подстроку и заменить ее на новую.
         Строку, ее подстроку для замены и новую подстроку вводит пользователь.
          */

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите строку: ");
//        String str = sc.nextLine();
//
//        System.out.println("Что ищем?: ");
//        String strQue = sc.nextLine();
//
//        System.out.println("На что меняем?: ");
//        String strNew = sc.nextLine();
//
//        String result = str.replace(strQue, strNew);
//        System.out.println("Получилось: " + result);




    }
}
