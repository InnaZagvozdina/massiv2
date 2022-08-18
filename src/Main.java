
public class Main {
    public static int[] generateRandomArray() {

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задание 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int arrSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arrSum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrSum + " рублей");


        // Задание 2

        int arrMin = 0;
        int arrMax = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                arrMin = arrMin + arr[i];
            }
            if (arr[i] > arr[i + 1]) {
                arrMax = arrMax + arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день " + arrMax / 30 + "рублей");
        System.out.println("Минимальная сумма трат за день " + arrMin / 30 + "рублей");

        // Задание 3

        System.out.println("В среднем компания тратит в день " + arrSum / 30);


        // Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
   for (int a = reverseFullName.length-1; a >= 0;  a--) {
    System.out.print(reverseFullName[a]);



            }

        }

            }





























































