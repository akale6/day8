//打印40-200之间所有的偶数
public class WhileExercise1 {
    public static void main(String[] args){
        int j = 40;
        while (j <= 200){
            if (j % 2 == 0){
                System.out.println("j=" + j);
            }
            j++;
        }
    }
}
