package 作业;

import java.util.Scanner;

public class Ramon {
   public static void main(String[] args) {
   System.out.println("请输入一个年份");
   Scanner scanner = new Scanner(System.in);
   int year = scanner.nextInt();
   if (year%400 == 0 ||( year%4== 0 && year%100!= 0) ) {
	   System.out.println("闰年");
   }else {
	   System.out.println("平年");
   }
}
}
