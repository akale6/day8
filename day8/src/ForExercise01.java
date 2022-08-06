//打印1-100之间所有是9的倍数的整数，统计个数及总和
public class ForExercise01 {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int t = 9;

        for (int i =1; i <= 100; i++){
            if (i % t == 0){
                System.out.println("i="+i);
                count++;
                sum += i;
            }
        }
        System.out.println("count=" +count);
        System.out.println("sum=" +sum);
    }
}
