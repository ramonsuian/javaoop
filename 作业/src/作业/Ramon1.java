package 作业;

import java.util.Scanner;

public class Ramon1 {
public static void main(String[] args) {
	System.out.println("分数");
	Scanner scanner = new Scanner(System.in);
	  int score = scanner.nextInt();
	  
	 if ( score <= 100) {
	  
	  if( score >= 90 && score <= 100 ) {
		  System.out.println("优秀");
	  }else if (score >=80 && score <90){
		  System.out.println("良好");
	  }else if (score >=70 && score <80) {
		  System.out.println("可以");
	  }else if (score >=60 && score <70) {
		  System.out.println("还行");
	  }else if (score >=50 && score <60) {
		  System.out.println("呵呵");
	  }else {
		  System.out.println("真棒");
	  }
	 } else {
		 System.out.println("请输入一个正确的分数");
	 }
	
	  //return; 返回，后面代码不执行。
	  
	  
	  
}
}
