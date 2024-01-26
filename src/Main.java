public class Main {
    public static void main(String[] args) {
        for (int a = 1; a <= 165; a += 2) {
            System.out.println(a);
        }
        System.out.println("-----------------");

        task2();
        task3();
        task4();
        task5();
        hardTask1();
    }

    public static void task2() {
        for (int a = 90; a >= 0; a -= 5) {
            System.out.println(a);
        }
        System.out.println("-----------------");
    }

    public static void task3() {
        for (int a = 2, i = 0; i < 20; i++, a *= 2) {
            System.out.println(a);
        }
        System.out.println("-----------------");
    }

    public static void task4() {
        for (int i = -29; i < 10; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----------------");
    }

    public static void task5() {
        int sum = 0;
        for (int i = 50; i <= 150; i++) {
            sum += i;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(sum);
        System.out.println("---------------------");
    }

    public static void hardTask1() {
        int[] arr = {1, 3, 12, 15, 5};
        max(arr);
    }

    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("-----------------");
    }
}