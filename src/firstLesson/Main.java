package firstLesson;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
        };
    checkArray(new Integer[]{1,2,3,null,3,null});
    }

 public static   int  checkSize (int[]  arr,int min){
        if(min<5){
            System.out.println();
            return -1;
        }
        return arr.length;
 }
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
     * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
     * 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
     * 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
     * 3. если вместо массива пришел null, метод вернет -3
     */
    public static int findNumber(int arr[],int number){
        if (arr==null){
            return -3;
        }
         else if (checkSize(arr,3)==-1){
            return -1;
        }else {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==number){
                    return i;
                }
            }
        }
         return -2;
    }
    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
     * Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
     * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
     * и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий,
     * метод должен бросить RuntimeException с сообщением об ошибке.
     */
    public  static int sumSqArr(int [][]arr){
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr.length!=arr[i].length){
            throw new RuntimeException("Arr is not squid");
        }
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==0||arr[i][j]==1){
                    sum+=arr[i][j];
                }
                else {
               throw new RuntimeException("UnCarrentValue");
            }}
        }
        return sum;
    }



    /**
     * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
     * Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
     * 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
     * 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
     */


    public static void checkArray(Integer[] arr) {
        List<Integer> cash = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                cash.add(i);
        }
        if (!cash.isEmpty()) {
            throw new RuntimeException(String.format("В ячейках с индексами %s встетился null%n", cash));
        } else {
            System.out.println("Nullы не встетились");
        }
    }
}