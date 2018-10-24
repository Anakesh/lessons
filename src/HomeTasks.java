import java.util.*;

//import java.util.Scanner;
//
public class HomeTasks {
    public static void main(String[] args) {

// Домашнее задание к понедельнику (22.10.2018)
//       Задача 1
//       В три переменные a, b и c явно записаны программистом
//       три целых попарно неравных между собой числа.
//       Создать программу, которая переставит числа в переменных
//       таким образом, чтобы при выводе на экран
//       последовательность a, b и c оказалась строго возрастающей.

/*       int[] numbs;

        int t, j, size, counter =0;

        numbs = new int[3];

        numbs[0] = 15;
        numbs[1] = 45;
        numbs[2] = -2;
        size = numbs.length;

        //Пузырьковая сортировка
        for (int i = 1; i<size; i++){

            for(j = size - 1; j>=i; j--){
                if (numbs[j-1] > numbs[j]){
                    t = numbs[j - 1];
                    numbs[j - 1] = numbs[j];
                    numbs[j] = t;
                }
            }
        }
        //Сортировка методом вставки Insertsort
//        for (int p = 1; p<size; p++){
//            for(int j1 = p; j1>0 && numbs[j1 - 1]>numbs[j1]; j1--){
//                counter++;
//                int tmp = numbs[j1 - 1];
//                numbs[j1 - 1] = numbs[j1];
//                numbs[j1] = tmp;
//            }
//        }
        for (int u = 0; u<size; u++){
            System.out.print(numbs[u] + " ");
        }
        System.out.println("Отсортированный массив");*/


//        Задача 4
//        Проверьте, является ли натуральное число — простым.

        /*System.out.println("Введите натуральное число");
        Scanner num = new Scanner(System.in);
        int number= num.nextInt();
        int j=0, div=6;
        if (number % 2==0) j = 1;
        if (number % 3==0) j = 1;
        while ((j != 1) && ((div-1) * (div-1) <= number)) {
            if (number % (div-1) == 0) j = 1;
            if ((div+1)*(div+1) > number) break;
            if (number % (div+1)==0) j = 1;
            div = div+6;
        }
        if (j==0) System.out.println("Число простое");
        else System.out.println("Число составное");
        System.out.println();*/

//        Задача 6*
//        В городе N проезд в трамвае осуществляется по бумажным
//        отрывным билетам.
//        Каждую неделю трамвайное депо заказывает в местной
//        типографии рулон билетов с номерами от 000001 до 999999.
//    «Счастливым» считается билетик у которого сумма первых трёх
//        цифр номера равна сумме последних трёх цифр, как, например,
//                в билетах с номерами 003102 или 567576.
//        Трамвайное депо решило подарить сувенир обладателю каждого
//        счастливого билета и теперь раздумывает,
//                как много сувениров потребуется.
//                С помощью программы подсчитайте сколько счастливых
//        билетов в одном рулоне?


/*        int souvenir = 0;
        for (int ticket = 1; ticket <= 999999; ticket++) {
            int part1 = ticket / 100000 + ticket / 10000 % 10 + ticket / 1000 % 10;
            int part2 = ticket / 100 % 10 + ticket / 10 % 10 + ticket % 10;
            if (part1 == part2) {
                ++souvenir;
            }

        }
        System.out.println("Количество сувениров: " + souvenir);*/



        int count = 0;
        int min;
        for (int hour = 0; hour < 24; hour++) {
            for (min = 0; min < 60; min++) {
                int pos1 = hour / 10;
                int pos2 = hour % 10;
                int pos3 = min / 10;
                int pos4 = min % 10;
                if (pos1 == pos4 && pos2 == pos3) {
                    ++count;
                }
            }
        }
        System.out.println("Количество симметиричных комбинаций: " + count);


        /*int n = 0;
        for (int hour = 0; hour < 24; hour++) {
            if ((hour % 10) > 5) {continue;}
            n++;
        }
        System.out.println("Симметричных комбинаций: " + n);*/


//        int[] tiger = new int[10];
//        for (int i = 0; i < 10; i++) {
//            tiger[i] = (i + 1) * 2;
//            System.out.println(tiger[i]);
//        }
//        System.out.println(Arrays.toString(tiger));
//        int[] number;
//        number = new int[10];
//        int k = 2;
//        for (int i = 0; i < 10; i++) {
//            number[i] = k;
//            k+= 2;
//            System.out.print(number[i] + " ");
//        } for (int num: number) {
//            System.out.print("\n" + num);
//        }
//        int[] arrOdd = new int[100/2];
//
//
//        for (int i = 0; i < arrOdd.length; i++){
//            arrOdd[i] = 1 + 2 * i;
//        }
//
//        System.out.println(Arrays.toString(arrOdd));
//
//        for (int i = 0; i < arrOdd.length / 2; i++){
//
//            int tmp = arrOdd[i];
//            arrOdd[i] = arrOdd[arrOdd.length - i - 1];
//            arrOdd[arrOdd.length -1- i] = tmp;
//        }
//
//        System.out.println(Arrays.toString(arrOdd));


//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите чётное положительное число");
//        int user = in.nextInt();
//        if (user % 2 != 0 || user <= 0) {
//            System.out.println("Это не чётное положительное число, повторите ввод");
//        } else {
//            int arr[] = new int[user];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = ((int) (Math.random() * 11) - 5);
//            }
//            System.out.println(Arrays.toString(arr));
//
//            int[] arr1 = new int[user / 2];
//            int sum1 = 0;
//            arr1 = Arrays.copyOfRange(arr, 0, user / 2);
//            for (int i = 0; i < arr1.length; i++) {
//                sum1 += Math.abs(arr1[i]);
//            }
//            System.out.println(sum1);
//            int[] arr2 = new int[user / 2];
//            int sum2 = 0;
//            arr2 = Arrays.copyOfRange(arr, user / 2, arr.length);
//            for (int i = 0; i < arr2.length; i++) {
//                sum2 += Math.abs(arr2[i]);
//            }
//            System.out.println(sum2);
//            if (sum1 == sum2) {
//                System.out.println("Суммы модулей равны");
//            } else if (sum1 > sum2) {
//                System.out.println("Сумма модулей левой стороны больше");
//            } else {
//                System.out.println("Сумма модулей правой стороны больше");
//            }


//        }
//        int ammInt=0, leftModSum=0, rightModSum=0;
//        do {
//            System.out.println("Введите четное положительное число");
//            Scanner amm = new Scanner(System.in);
//            ammInt = amm.nextInt();
//        } while (ammInt<=0 || ammInt%2!=0);
//        int[] caracal = new int[ammInt];
//        Random rnd = new Random();
//        for (int i=0; i<ammInt; i++){
//            caracal[i] = (rnd.nextInt(11))-5;
//            if (i <= (ammInt-1)/2) leftModSum = leftModSum + Math.abs(caracal[i]);
//            else rightModSum = rightModSum + Math.abs(caracal[i]);
//        }
//
//        System.out.println(Arrays.toString(caracal));
//        if (leftModSum>rightModSum) System.out.println("Сумма модулей левой половины массива больше");
//        else if (leftModSum<rightModSum) System.out.println("Сумма модулей правой половины массива больше");
//        else System.out.println("Сумма модулей левой и правой половин массива равны");
//
//
//        System.out.println("ввести строку");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println("найти");
//        String strSub = sc.nextLine();
//        System.out.println("заменить на");
//        String strSubN = sc.nextLine();
//        String strN = str.replaceAll(strSub, strSubN);
//        System.out.println("итоговая:" );
//        System.out.println(strN);
//        sc.close();
//
//
//		// 2) Òðåáóåòñÿ óäàëèòü èç íåå ïîâòîðÿþùèåñÿ ñèìâîëû è âñå ïðîáåëû.
//
//
//        // çàìåíÿåò âñå öèôðû íà ïðîáåë *.replaceAll("[0-9]+", " ");
//        // çàìåíÿåò âñå áóêâû íà ñëîâî 123 *.replaceAll("[a-zA-Z]+", "123");
//
//        //	String strN = "òååååêñò   òåkêñò";
//        System.out.println("убирает пробелы:");
//        String strN1 = strN.replaceAll("\\s", "");
//        //	int count = 0;
//
//        System.out.println(strN1);
//        StringBuffer sb = new StringBuffer(strN1);
//        for (int i = 0; i < sb.length(); i++)
//            for (int j = i + 1; j < sb.length(); j++)
//                if (sb.charAt(i) == sb.charAt(j))
//                {
//                    //	count++;
//                    //	System.out.println(i + " " +j);
//                    sb.deleteCharAt(j);
//                    j--;
//                }
//        System.out.println("итоговая без повторяющихся:");
//        System.out.println(sb.toString());
//        //	System.out.println(count);
//        System.out.println("Введите строку");
//        String string4 = scanString.nextLine();
//        int counter2=0, k=0, startpos, endpos=0;
//        char[] chars2 = string4.toCharArray();
//// Сначала считаем, сколько элементов будет в итоговом массиве. Для этого использую два цикла: внешний - чтобы нащупать первую цифру числа, внутренний - последнюю.
//        while (k<chars2.length) {
//            if (chars2[k]=='0' || chars2[k]=='1' || chars2[k]=='2' || chars2[k]=='3' || chars2[k]=='4' || chars2[k]=='5' || chars2[k]=='6' || chars2[k]=='7' || chars2[k]=='8' || chars2[k]=='9') {
//                counter2++;
//                while (chars2[k]=='0' || chars2[k]=='1' || chars2[k]=='2' || chars2[k]=='3' || chars2[k]=='4' || chars2[k]=='5' || chars2[k]=='6' || chars2[k]=='7' || chars2[k]=='8' || chars2[k]=='9') {
//                    if (k+1<chars2.length) k++;
//                    else break;
//                }
//            }
//            k++;
//        }
////        System.out.println(counter2);
//// Проверка на налиие чисел в строке
//        if (counter2>0) {
//
//            int[] result = new int[counter2];
//
//            k = 0;
//            counter2 = -1;
//// -1, потому что потом это уже будет не размером массива, а индексом
//            while (k < chars2.length) {
//                if (chars2[k] == '0' || chars2[k] == '1' || chars2[k] == '2' || chars2[k] == '3' || chars2[k] == '4' || chars2[k] == '5' || chars2[k] == '6' || chars2[k] == '7' || chars2[k] == '8' || chars2[k] == '9') {
//                    startpos = k;
//                    counter2++;
//                    while (chars2[k] == '0' || chars2[k] == '1' || chars2[k] == '2' || chars2[k] == '3' || chars2[k] == '4' || chars2[k] == '5' || chars2[k] == '6' || chars2[k] == '7' || chars2[k] == '8' || chars2[k] == '9') {
//                        endpos = k+1;
////                        result[counter2]=result[counter2]*10+Character.getNumericValue(chars2[k]); - альтернативный способ
////substring считает первую позицию включительно, а последнюю исключительно. При k больше максимального индекса массива все равно работает
//                        if (k + 1 < chars2.length) k++;
//                        else break;
//                    }
//                    result[counter2] = Integer.parseInt(string4.substring(startpos, endpos));
//// Не забыть спросить про класс Integer. И про Random.
//                }
//                k++;
//            }
//
//            System.out.println(Arrays.toString(result));
//        } else System.out.println("В строке нет чисел");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        char[] arr = in.nextLine().toCharArray();
//        StringBuilder currNum = new StringBuilder();
//        List<Integer> numbers = new ArrayList();
//        for (int i = 0; i < arr.length; i++) {
//            if (Character.isDigit(arr[i])) {
//                currNum.append(arr[i]);
//            }
//            if (!Character.isDigit(arr[i]) || i == arr.length - 1) {
//                if (currNum.length() > 0) {
//                    numbers.add(Integer.parseInt(currNum.toString()));
//                    currNum = new StringBuilder();
//                }
//            }
//        }
//        System.out.println(numbers.toString());

//        String str = "дом 48, корпус 9, парадная 7, этаж 4";
//        String[] strArr = (str.replaceAll("\\D+", " ")
//                .trim()).split(" ");
//        System.out.println(Arrays.toString(strArr));



    }
}



