import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//9 вариант (нечет задания)

public class Main {
    public static void main(String[] args) {
        Main n = new Main();
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        //1(1.1)
        out.println("Дробная часть числа\nВведите число, дробную часть которого нужно вывести:");
        if (in.hasNextDouble()) {
            double x11 = in.nextDouble();
            out.println(n.fraction(x11));
        } else {
            out.println("Неверный ввод");
        }

        //2(1.3)
        out.println("Преобразование буквы в число\nВведите число:");
        String s13 = in.next();
        if (s13.length()==1) {
            char c13 = s13.charAt(0);
            out.println(n.charToNum(c13));
        } else {
            out.println("Неверный ввод");
        }

        //3(1.5)
        out.println("Проверка, является ли число двузначным\nВведите число:");
        if (in.hasNextInt()) {
            int x15 = in.nextInt();
            out.println("Число двузначное?");
            out.println(n.is2Digits(x15));
        } else out.println("Неверный ввод");

        //4(1.7)
        out.println("Входит ли число в диапазон\nВведите диапазон:");
        if (in.hasNextInt()) {
            int a17 = in.nextInt();
            if (in.hasNextInt()) {
                int b17 = in.nextInt();
                out.println("Введите число:");
                if (in.hasNextInt()) {
                    int num17 = in.nextInt();
                    out.println(n.isInRange(a17, b17, num17));
                } else out.println("Неверный ввод");
            } else out.println("Неверный ввод");
        } else out.println("Неверный ввод");

        //5(1.9)
        out.println("Равенство трех чисел\nВведите 3 числa:");
        if (in.hasNextInt()) {
            int a19 = in.nextInt();
            if (in.hasNextInt()) {
                int b19 = in.nextInt();
                if (in.hasNextInt()) {
                    int c19 = in.nextInt();
                    out.println(n.isEqual(a19, b19, c19));
                } else out.println("Неверный ввод");
            } else out.println("Неверный ввод");
        } else out.println("Неверный ввод");

        //6(2.1)
        out.println("Модуль числа\nВведите число:");
        if (in.hasNextInt()) {
            int a21 = in.nextInt();
            out.println(n.abs(a21));
        } else out.println("Неверный ввод");

        //7(2.3)
        out.println("Делимость числа на 3 и 5\nВведите число:");
        if (in.hasNextInt()) {
            int a23 = in.nextInt();
            out.println(n.is35(a23));
        } else out.println("Неверный ввод");

        //8(2.5)
        out.println("Максимальное число из тройки чисел\nВведите числа:");
        if (in.hasNextInt()) {
            int a25 = in.nextInt();
            if (in.hasNextInt()) {
                int b25 = in.nextInt();
                if (in.hasNextInt()) {
                    int c25 = in.nextInt();
                    out.println(n.max3(a25, b25, c25));
                } else out.println("Неверный ввод");
            } else out.println("Неверный ввод");
        } else out.println("Неверный ввод");

        //9(2.7)
        out.println("Сумма двух чисел\nВведите числа:");
        if (in.hasNextInt()) {
            int a27 = in.nextInt();
            if (in.hasNextInt()) {
                int b27 = in.nextInt();
                out.println(n.sum2(a27, b27));
            } else out.println("Неверный ввод");
        } else out.println("Неверный ввод");

        //10(2.9)
        out.println("День недели\nВведите число, обозначающее день недели:");
        if (in.hasNextInt()) {
            int a29 = in.nextInt();
            out.println(n.day(a29));
        } else out.println("Это не день недели");

        //11(3.1)
        out.println("Числа от 0 до x\nВведите число x:");
        boolean check31;
        int a31;
        if ((check31 = in.hasNextInt()) && (a31 = in.nextInt())>=0) {
            out.println(n.listNums(a31));
        } else out.println("Неверный ввод");

        //12(3.3)
        out.println("Четные числа от 0 до x\nВведите число x:");
        boolean check33;
        int a33;
        if ((check33=in.hasNextInt()) && ((a33 = in.nextInt()) >= 0)) {
            out.println(n.chet(a33));
        } else out.println("Неверный ввод");

        //13(3.5)
        out.println("Количество знаков в числе\nВведите число:");
        if (in.hasNextInt()) {
            int a35 = in.nextInt();
            out.println(n.numLen(a35));
        } else out.println("Неверный ввод");

        //14(3.7)
        out.println("Квадрат из \"*\"\nВведите размер стороны квадрата:");
        boolean check37;
        int a37;
        if ((check37=in.hasNextInt()) && ((a37 = in.nextInt()) > 0)) {
            n.square(a37);
        } else out.println("Неверный ввод");

        //15(3.9)
        out.println("Треугольник из \"*\"\nВведите высоту:");
        boolean check39;
        int a39;
        if ((check39=in.hasNextInt()) && ((a39 = in.nextInt()) > 0)) {
            n.rightTriangle(a39);
        } else out.println("Неверный ввод");

        //16(4.1)
        out.println("Индекс первого вхождения числа x в массив\nЕсли число не входит в массив вернется -1");
        int[] array41 = new int[10];
        for (int i = 0; i<10; i++) {
            array41[i] = rnd.nextInt(10) + 1;
        }
        out.println("Исxодный массив: " + Arrays.toString(array41));
        out.println("Введите x:");
        if (in.hasNextInt()) {
            int a41 = in.nextInt();
            out.println("Результат: " + Integer.toString(n.findFirst(array41, a41)));
        } else out.println("Неверный ввод");

        //17(4.3)
        out.println("Наибольшее по модулю значение массива");
        int[] array43 = new int[10];
        for (int i = 0; i<10; i++) {
            array43[i] = rnd.nextInt(21)-10;
        }
        out.println("Исxодный массив: " + Arrays.toString(array43));
        out.println("Результат: " + Integer.toString(n.maxAbs(array43)));

        //18(4.5)
        out.println("Вставка элементов массива ins в массив arr");
        int[] arr45 = new int[5];
        int[] ins45 = new int[5];
        for (int i = 0; i<5; i++) {
            arr45[i] = rnd.nextInt(10)+1;
        }
        for (int i = 0; i<5; i++) {
            ins45[i] = rnd.nextInt(10)+1;
        }
        out.println("Исxодный массив arr: " + Arrays.toString(arr45));
        out.println("Исxодный массив ins: " + Arrays.toString(ins45));
        out.println("Введите с какой позиции начать вставку:");
        int k;
        if (in.hasNextInt() && ((k = in.nextInt()) >= 0)) {
            out.println("Результат: " + Arrays.toString(n.add(arr45, ins45, k)));
        } else out.println("Неверный ввод");

        //19(4.7)
        out.println("Возвратный реверс\nСоздание нового массива, в котором значения исходного массива записаны задом наперед");
        int[] array47 = new int[10];
        for (int i = 0; i<10; i++) {
            array47[i] = rnd.nextInt(21)-10;
        }
        out.println("Исxодный массив: " + Arrays.toString(array47));
        out.println("Результат: " + Arrays.toString(n.reverseBack(array47)));

        //20(4.9)
        out.println("Индексы всех вхождений числа x в массив");
        int[] arr49 = new int[10];
        for (int i = 0; i<10; i++) {
            arr49[i] = rnd.nextInt(10)+1;
        }
        out.println("Исxодный массив: " + Arrays.toString(arr49));
        out.println("Введите x:");
        if (in.hasNextInt()) {
            int k49 = in.nextInt();
            out.println("Результат: " + Arrays.toString(n.findAll(arr49, k49)));
        } else out.println("Неверный ввод");
    }
    //1(1.1)
    public double fraction(double x) {
        return (x % 1);
    }
    //2(1.3)
    public int charToNum(char x) {
        return x - '0';
    }
    //3(1.5)
    public boolean is2Digits(int x) {
        if ((Math.abs(x / 10) > 0) && (Math.abs(x / 10) < 10)) {
            return true;
        } else {
            return false;
        }
    }
    //4(1.7)
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
    //5(1.9)
    public boolean isEqual(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            return true;
        } else {
            return false;
        }
    }
    //6(2.1)
    public int abs(int x) {
        if (x < 0) {
            return (x * (-1));
        } else {
            return x;
        }
    }
    //7(2.3)
    public boolean is35(int x) {
        if (((x % 3 == 0) && (x % 5 == 0)) || ((x % 3 != 0) && (x % 5 != 0))) {
            return false;
        } else {
            return true;
        }
    }
    //8(2.5)
    public int max3(int x, int y, int z) {
        int max;
        if (x > y) max = x;
        else max = y;
        if (max > z) return max;
        else return z;
    }
    //9(2.7)
    public int sum2(int x, int y) {
        if ((x + y >= 10) && (x + y <= 19)) return 20;
        else return (x + y);

    }
    //10(2.9)
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
    //11(3.1)
    public String listNums (int x) {
        String res ="0";
        for (int i=1; i<=x; i++) {
            res = res + ' ' + Integer.toString(i);
        }
        return res;
    }
    //12(3.3)
    public String chet (int x) {
        String res ="0";
        for (int i=2; i<=x; i=i+2) {
            res = res + ' ' + Integer.toString(i);
        }
        return res;
    }
    //13(3.5)
    public int numLen (long x) {
        int length = 1;
        while (x/10 != 0) {
            x=x/10;
            length++;
        }
        return length;
    }
    //14(3.7)
    public void square (int x) {
        for (int i = 0; i<x; i++) {
            for (int k = 1; k<x; k++) {
                out.print('*');
            }
            out.println('*');
        }
    }
    //15(3.9)
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
    //16(4.1)
    public int findFirst (int[] arr, int x) {
        int index = 0;
        while ((index<arr.length)&&(arr[index]!=x)) {
            index++;
        }
        if (index==arr.length)  return -1;
        else return index;
    }
    //17(4.3)
    public int maxAbs (int[] arr) {
        int max=0;
        int index=1;
        while (index < arr.length) {
           if (Math.abs(arr[index])>Math.abs(arr[max])) max=index;
           index++;
        }
        return arr[max];
    }
    //18(4.5)
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
    //19(4.7)
    public int[] reverseBack (int[] arr) {
        int[] newArr = new int[arr.length];
        int ind = 0;
        for (int i = arr.length-1; i >=0; i--) {
            newArr[ind]=arr[i];
            ind++;
        }
        return newArr;
    }
    //20(4.9)
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
