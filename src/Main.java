public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 4, 11, 5, 6, 7, 8, 9, 29};//бул жерде белгилуу болгон массивдин сандарынан эн минимальный жана максимум санын чыгарып берет.
        array(numbers);
        temp(numbers);
    }

    public static void array(int[] q) {
        int min = q[0];
        for (int i = 0; i < q.length; i++) {
            if (min > q[i]) {
                min = q[i];
            }
            System.out.print(q[i] + " ");
        }
        System.out.print("\n" + "Минимум саны : " + min);
    }

    public static void temp(int[] t) {
        int max = t[0];
        for (int i = 0; i < t.length; i++) {
            if (max < t[i]) {
                max = t[i];
            }
        }
        System.out.print("\n"+"Максимум саны :"+max);
    }
}

