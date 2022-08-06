import java.util.Scanner;

//如果张三不还钱 一直揍他，直到还钱为止 System.out.println("还钱吗？y/n")
public class DoWhileExercise04 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("揍");
            System.out.println("还钱吗？y/n");
            answer = scanner.next().charAt(0);
            System.out.println("他的回答是"+ answer);
        }while (answer != 'y');
    }
}
