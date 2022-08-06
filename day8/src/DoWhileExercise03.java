//统计1-200之间能被5 整除但不能被3整除的数,并统计个数
public class DoWhileExercise03 {
    public static void main(String[] args){
        int i = 1;
        int count = 0;
        int a = 5;
        int b = 3;
        do {
            if (i % a == 0 && i % b != 0) {
                System.out.println("i=" + i);
                count++;
            }
                i++;

        }while (i <= 200);
        System.out.println("count=" + count);
    }
}
