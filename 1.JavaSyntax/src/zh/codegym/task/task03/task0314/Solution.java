package zh.codegym.task.task03.task0314;

/* 
乘法表
*/

public class Solution {
    public static void main(String[] args) {
        //在此编写你的代码
        
        int i = 1;
        while( i <= 10){
            
            int j = 1;
            while( j <= 10){
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
