//计算1-100的和
public class DoWhileExercise02 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }while (i <= 100);
        System.out.println("1-100的和为：" + sum);
    }
}
