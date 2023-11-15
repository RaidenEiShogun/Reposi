import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HwFor2 {
    public static void main(String[] args) {
        
        //ex.7: find average
        int[] array7 = {25,10,10};
        System.out.println(ex7(array7));

        //ex.21: find same elements
        int[] array21 = {25,120,10,77};
        int[] array21_2 = {250,77, 40,10};
        System.out.println((Arrays.toString(ex21(array21, array21_2))).replace("[", "").replace("]", ""));

        //ex.4: Sum of paired numbers
        int[] array4 = {2, 44, 65, 93, 10, 12};
        System.out.println(ex4(array4));

        //ex.1: the smallest element
        int[] array1 = {552, 44, 65, 93, 10, 12};
        System.out.println(ex1(array1));

        //ex.15: anogrammality
        String string15 ="гамма";
        String string15_2 ="магма";
        System.out.println(ex15(string15,string15_2));

        //ex.2: bubble sort (from little to big)
        int[] array2 = {552, 44, 65, 93, 10, 12};
        System.out.println(Arrays.toString(ex2BubbleSort(array2)).replace("[", "").replace("]", ""));

        //ex.12: is it palindromic?
        String string12 = "madam";
        System.out.println(ex12(string12));

        //ex.3: factorial (I tried to do it in usual way, n stream n recursion. stream failed;))
        System.out.println(ex3(7));

        //ex.6: A E O I Y
        String string6 = "Was I a good archon, Neuvillette?";
        System.out.println(ex6(string6));

        //ex.5: prime numbers
        int num5 = 59; //3, 2, 9
        System.out.println(ex5(num5));

        //ex.10: fibonacci
        int n = 6;
        System.out.println(ex10fibonacci(n));

        //ex.9: NOD
        int n1um9 = 5;
        int n2um9 = 30;
        System.out.println(ex9(n1um9,n2um9));

        //ex.19: difference
        int[] array19 = {2, 78, 90, 32, 55, 490,9};
        System.out.println(ex19(array19));

        //ex.18: the longest chain
        int[] array18 = {1, 4,78,342,97,64,23,4};
        System.out.println(Arrays.toString(ex18(array18)));

        //ex.11: 1 to N
        int[] array11 = {1,2,5,6,7,8,9,10};
        int N = 3;

        System.out.println(ex11(array11, N));

        //ex.20: the highest
        int[] array20 = {6,46,745,345,23};
        System.out.println(ex20(array20));
    }

    private static int ex20(int[] array20) {
        int arrayLength = array20.length;

        if (arrayLength == 0) {
            return -1;
        }
        else if (arrayLength == 1) {
            return 0;
        }

        if (array20[0] > array20[1]) {
            return 0;
        } else if (array20[arrayLength - 1] > array20[arrayLength - 2]) {
            return arrayLength - 1;
        }

        for (int i = 1; i < arrayLength - 1; i++) {
            if (array20[i] > array20[i - 1] && array20[i] > array20[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    private static List<Integer> ex11(int[] array11, int N) {
        List<Integer> isMiss = new ArrayList<>();
        boolean[] isContenting = new boolean[N+1];

        for (int num : array11) { //заполнили массив
            if (num >= 1 && num <= N) {
                isContenting[num] = true;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (!isContenting[i]) {
                isMiss.add(i);
            }
        }

        return isMiss;
    }

    private static int[] ex18(int[] array18) {
        if (array18.length == 0) {
            return new int[0];
        }

        int arrayLength = array18.length;
        int maxim = 0;
        int[] row = new int[arrayLength];
        int[] indexSaver = new int[arrayLength];

        for (int i =0; i < arrayLength; i++) { //проходимся по массиву
            row[i] =1; //чему равняется цепь
            indexSaver[i] =-1; //индексы в цепи

            for (int j = 0; j < i; j++) {//внутренний цикл
                if (array18[i] > array18[j] && row[i] < row[j] + 1) { // сравнить длину и больший ли э
                    row[i] = row[j] + 1; //изменили знач в цепи
                    indexSaver[i] = j; //сохранили индекс
                }
            }

            if (row[i] > row[maxim]) {
                maxim = i;
            }
        }

        int[] res = new int[row[maxim]];
        int currentIndex = maxim;
        for (int i = row[maxim] -1; i>= 0; i--) {
            res[i] = array18[currentIndex];
            currentIndex = indexSaver[currentIndex];
        }

        return res;
    }

    private static int ex19(int[] array19) {
        if (array19.length < 2) {
            return 0;
        }

        int maxE = array19[0];
        int minE = array19[0];

        for (int i = 1; i < array19.length; i++) {
            maxE = Math.max(maxE,array19[i]);
            minE = Math.min(minE,array19[i]);
        }

        return maxE-minE;
    }

    private static int ex9(int n1um9, int n2um9) {
        while (n2um9!=0){ //пока while не равняется нулю
            int NODTemp =n2um9; //присвоили нод-темп 2 число
            n2um9=n1um9%n2um9; //присвоили 2 числ результат ост от деления от н1 к н2
            n1um9=NODTemp; //н1 = нод
        }
        return n1um9;
    }

    private static int ex10fibonacci(int num10) {
        if (num10 <= 1) { //меньше 1 => false
            return num10;
        }
        else
        {
            return ex10fibonacci(num10-1)+ex10fibonacci(num10-2);
        }
    }

    private static boolean ex5(int num5) {
        if (num5 <= 1) { //меньше 1 => false
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num5); i++) {
            if (num5 % i == 0) { //есть ли остаток?

                return false;
            }
        }
        return true;
    }

    private static int ex6(String string6) {
        int count=0;
        for (int i = 0; i < string6.length(); i++) {
            char char6 = Character.toLowerCase(string6.charAt(i));
            if (char6 == 'a' || char6 == 'e' || char6 == 'i' || char6 == 'o' || char6 == 'u') {
                count++;
            }
        }
        return count;
    }

    private static int ex3(int num) {

        //usual
        //int result = 1;
        //for (int i = 1; i <= num; i++) {
        //    result = result * i;
        //}
        //return result;

        //recursion
        if (num <= 1) {
            return 1;
        }
        else {
            return num * ex3(num - 1);
        }

    }

    private static boolean ex12(String string12) {
        // Регулярное выражение пробелы-знаки, изменяет на пустое место;
        // equalsIgnoreCase - сравнить 2 строки, не учитывая регистр.
        // New StringBuilder та самая вторая строка
        return string12
                .replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(string12.replaceAll("\\W",""))
                .reverse().toString());
    }

    private static int[] ex2BubbleSort(int[] array2) {
        //берет по два сортирует до конца и по новой

        boolean checkSorted = false;
        int temp;

        while (!checkSorted){
            checkSorted = true;
            for (int i = 0; i < array2.length-1; i++) {
                if (array2[i]>array2[i+1]){
                    checkSorted = false;

                    temp=array2[i];
                    array2[i]=array2[i+1];
                    array2[i+1]=temp;
                }
            }
        }

        return array2;
    }

    private static boolean ex15(String string15, String string152) {
        if (string15.length() != string152.length()) {
            return false;
        }
        char[] array1CHAR = string15.toCharArray();
        char[] array2CHAR = string152.toCharArray();
        Arrays.sort(array1CHAR);
        Arrays.sort(array2CHAR);

        return Arrays.equals(array1CHAR, array2CHAR);
    }

    private static int ex1(int[] array1) {
        int minNum = array1[0];

        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < minNum) {
                minNum = array1[i];
            }
        }

        return minNum;
    }

    private static int ex4(int[] array4) {
        int sum =0;
        for (int j : array4) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }

    private static int[] ex21(int[] array21, int[] array21_2) {
        List<Integer> sames = new ArrayList<>();

        for (int k : array21) {
            for (int i : array21_2) {
                if (k == i) { //если элемент 1 массива = элементу 2 массива, засчитываем в одинаковые
                    sames.add(k);
                    break;
                }
            }
        }
        int[] res = new int[sames.size()];
        for (int i = 0; i < sames.size(); i++) {
            res[i] = sames.get(i);
        }

        return res;
    }

    private static int ex7(int[] array7) {
        int res=0;
        int count=0;
        for (int j : array7) {
            res += j;
            count++;

        }
        return res/count;

    }

}