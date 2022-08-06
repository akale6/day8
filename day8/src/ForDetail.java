public class ForDetail {
    public static void main(String[] args){
        int i = 1;//初始化和变量迭代可以写到其他的地方 但两边的分号不能省略 循环变量也可以有多条变量迭代语句，中间用逗哈隔开
        for ( ; i <= 10 ;){
            System.out.println("hello world");
            i++;
        }
        System.out.println("i=" +i);
    }

}
