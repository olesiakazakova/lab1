import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//через 2 недели сдать отчет на сайте psu.online (к следующей паре)
//9 вариант ( нечет задания )
//20 задач каждая задача по 0,4. 2 балла за отчет
//интерфейс дружественный, чтобы пользователь понимал какую задачу решает программа
//защита от дурака, проверять входные данные
public class Main {
    public static void main(String[] args) {
        Main n = new Main();
        Scanner in = new Scanner(System.in);
        //1 ex

        out.println("Дробная часть числа \nВведите число, дробную часть которого нужно вывести");
        double x = in.nextDouble();
        out.println(n.fraction(x));

        //3 ex
        /*
        out.println("Преобразование строки в число \nВведите число");
        String c0 = in.next();
        char c= c0.charAt(0);
        out.println(n.charToNum(c));
         */
        //5 ex
        /*
        out.println("Введите число");
        int x = in.nextInt();
        out.println("Число двузначное?");
        out.println(n.is2Digits(x));
         */
        //7 ex
        /*
        out.println("Входит ли число диапазон \nВведите диапазон");
        int a = in.nextInt();
        int b = in.nextInt();
        out.println("Введите число");
        int num = in.nextInt();
        out.println(n.isInRange(a,b,num));
         */
        //9 ex
        /*out.println("Введите 3 числa");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        out.println(n.isEqual(a,b,c));
         */
        //2.1 ex
        /*
        out.println("Модуль числа\nВведите число:");
        int a = in.nextInt();
        out.println(n.abs(a));
         */
        //2.3 ex
        /*
        out.println("Делимость числа на 3 и 5\nВведите число:");
        int a = in.nextInt();
        out.println(n.is35(a));
        */
        //2.5 ex
        /*
        out.println("Максимальное число из тройки чисел\nВведите числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        out.println(n.max3(a,b,c));
         */
        //2.7 ex
        /*out.println("Сумма двух чисел\nВведите числа:");
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(n.sum2(a,b));
         */
        //2.9 ex
        /*
        out.println("День недели\nВведите число, обозначающее день недели:");
        if (in.hasNextInt()) {
            int a = in.nextInt();
            out.println(n.day(a));
        } else out.println("это не день недели");
        */
        //3.1 ex
        /*
        out.println("Числа от 0 до x\nВведите число x:");
        if (in.hasNextInt()) {
            int a = in.nextInt();
            out.println(n.listNums(a));
        } else out.println("Неверный ввод");
         */
        //3.3 ex
       /*
        out.println("Четные числа от 0 до x\nВведите число x:");
        boolean check;
        int a;
        if ((check=in.hasNextInt()) && ((a = in.nextInt()) >= 0)) {
            out.println(n.chet(a));
        } else out.println("Неверный ввод");
        */
        //3.5 ex
        /*
        out.println("Количество знаков в числе\nВведите число:");
        if (in.hasNextInt()) {
            int a = in.nextInt();
            out.println(n.numLen(a));
        } else out.println("Неверный ввод");
         */
        //3.7 ex
        /*
        out.println("Квадрат из \"*\"\nВведите размер стороны квадрата:");
        boolean check;
        int a;
        if ((check=in.hasNextInt()) && ((a = in.nextInt()) > 0)) {
            n.square(a);
        } else out.println("Неверный ввод");
         */
        //3.9 ex
        /*
        out.println("Треугольник из \"*\"\nВведите высоту:");
        boolean check;
        int a;
        if ((check=in.hasNextInt()) && ((a = in.nextInt()) > 0)) {
            n.rightTriangle(a);
        } else out.println("Неверный ввод");
         */
        //4.1 ex
        /*
        out.println("Индекс первого вхождения числа x в массив\nЕсли число не входит в массив вернется -1\nВведите x:");
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            array[i] = rnd.nextInt(10)+1;
        }
        if (in.hasNextInt()) {
            int a = in.nextInt();
            out.println("Результат: " + Integer.toString(n.findFirst(array, a)));
        } else out.println("Неверный ввод");
        out.println("Исxодный массив: " + Arrays.toString(array));
        */
        // 4.3 ex
        /*
        out.println("Наибольшее по модулю значение массива");
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            array[i] = rnd.nextInt(21)-10;
        }
        out.println("Исxодный массив: " + Arrays.toString(array));
        out.println("Результат: " + Integer.toString(n.maxAbs(array)));
         */
        // 4.5 ex
        /*
        out.println("Вставка элементов массива ins в массив arr\nВведите с какой позиции начать вставку:");
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            arr1[i] = rnd.nextInt(10)+1;
        }
        for (int i = 0; i<10; i++) {
            arr2[i] = rnd.nextInt(10)+1;
        }
        int k;
        if (in.hasNextInt() && ((k = in.nextInt()) > 0)) {
            out.println("Исxодный массив arr: " + Arrays.toString(arr1));
            out.println("Исxодный массив ins: " + Arrays.toString(arr2));
            out.println("Результат: " + Arrays.toString(n.add(arr1, arr2, k)));
        } else out.println("Неверный ввод");
         */
        // 4.7 ex
        /*
        out.println("Новый массив, в котором значения исходного массива записаны задом наперед.");
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            array[i] = rnd.nextInt(21)-10;
        }
        out.println("Исxодный массив: " + Arrays.toString(array));
        out.println("Результат: " + Arrays.toString(n.reverseBack(array)));
         */
        // 4.9 ex
        /*
        out.println("Индексы всех вхождений числа x в массив\nВведите x:");
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i<10; i++) {
            arr[i] = rnd.nextInt(10)+1;
        }
        if (in.hasNextInt()) {
            int k = in.nextInt();
            out.println("Исxодный массив " + Arrays.toString(arr));
            out.println("Результат: " + Arrays.toString(n.findAll(arr, k)));
        } else out.println("Неверный ввод");

         */
    }

    public double fraction(double x) {
        return (x % 1);
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public boolean is2Digits(int x) {
        if ((x / 10 > 0) && (x / 10 < 10)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isInRange(int a, int b, int num) {
        if (a > b) {
            if ((num <= a) && (num >= b)) {
                return true;
            } else {
                return false;
            }
        } else {
            if ((num >= a) && (num <= b)) {
                return true;
            } else {
                return false;
            }
        }

    }

    public boolean isEqual(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return true;
        } else {
            return false;
        }
    }

    public int abs(int x) {
        if (x < 0) {
            return (x * (-1));
        } else {
            return x;
        }
    }

    public boolean is35(int x) {
        if (((x % 3 == 0) && (x % 5 == 0)) || ((x % 3 != 0) && (x % 5 != 0))) {
            return false;
        } else {
            return true;
        }
    }

    public int max3(int x, int y, int z) {
        int max;
        if (x > y) max = x;
        else max = y;
        if (max > z) return max;
        else return z;
    }

    public int sum2(int x, int y) {
        if ((x + y >= 10) && (x + y <= 19)) return 20;
        else return (x + y);

    }

    public String day(int x) {
        String result;
        switch (x) {
            case 1:
                result = "понедельник";
                break;
            case 2:
                result = "вторник";
            break;
            case 3:
                result = "среда";
            break;
            case 4:
                result = "четверг";
            break;
            case 5:
                result = "пятница";
            break;
            case 6:
                result = "суббота";
            break;
            case 7:
                result = "воскресенье";
            break;
            default:
                result = "это не день недели";
                break;
        }
        return result;
    }

    public String listNums (int x) {
        String res ="0";
        for (int i=1; i<=x; i++) {
            res = res + ' ' + Integer.toString(i);
        }
        return res;
    }

    public String chet (int x) {
        String res ="0";
        for (int i=2; i<=x; i=i+2) {
            res = res + ' ' + Integer.toString(i);
        }
        return res;
    }

    public int numLen (long x) {
        int length = 1;
        while (x/10 != 0) {
            x=x/10;
            length++;
        }
        return length;
    }

    public void square (int x) {
        for (int i = 0; i<x; i++) {
            for (int k = 1; k<x; k++) {
                out.print('*');
            }
            out.println('*');
        }
    }

    public void rightTriangle (int x) {
        int star = 1;
        int gap = x-1;
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < gap; k++) {
                out.print(' ');
            }
            gap--;
            for (int j = 0; j < star; j++) {
                out.print('*');
            }
            star++;
            out.println();
        }
    }

    public int findFirst (int[] arr, int x) {
        int index = 0;
        while ((arr[index]!=x) && (index<arr.length-1)) {
            index++;
        }
        if (index<arr.length-1)  return index;
        else return -1;
    }

    public int maxAbs (int[] arr) {
        int max=0;
        int index=1;
        while (index < arr.length) {
           if (Math.abs(arr[index])>Math.abs(arr[max])) max=index;
           index++;
        }
        return arr[max];
    }

    public int[] add (int[] arr, int[] ins, int pos) {
        int[] newAr = new int[arr.length + ins.length];
        int index = 0;
        int indArr = 0;
        while (indArr < arr.length) {
            if (indArr == pos){
                for (int i = 0; i < ins.length; i++) {
                    newAr[index] = ins[i];
                    index++;
                }
                newAr[index] = arr[indArr];
                indArr++;
                index++;
            }
            newAr[index]=arr[indArr];
            indArr++;
            index++;
        }
        return newAr;
    }

    public int[] reverseBack (int[] arr) {
        int[] newArr = new int[arr.length];
        int ind = 0;
        for (int i = arr.length-1; i >=0; i--) {
            newArr[ind]=arr[i];
            ind++;
        }
        return newArr;
    }

    public int[] findAll (int[] arr, int x) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) sum++;
        }
        int[] newArr = new int[sum];
        int ind = 0;
        for (int i = 0;  i < arr.length; i++) {
            if (arr[i]==x) {
                newArr[ind]=i;
                ind++;
            }
        }
        return newArr;
    }

}
