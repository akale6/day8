public class WhileExercise {
    public static void main(String[] args) {
        int i = 1;
        int end = 100;
        while (i <= end) {
            if (i % 3 == 0) {
                System.out.println("i=" + i);

            }
            i++;
        }

    }
}
//打印1-100所有能被3整除的整数