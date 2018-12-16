package cn.kgc.ifdemo;
/**
 * if多分支只要满足一种条件，程序就不往下执行，
 * if多分支要注意不能随意更改条件顺序；
 * 特别适合某个变量处于某个连续区间时的情况；
 * @author Best Codd
 *if多分支的语法：
 *if（条件）{}else if（条件）{}else：
 */
public class If03 {
	public static void main(String[] args) {
		int score = 90;
		if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 60) {
			System.out.println("中等");
		} else {
			System.out.println("不及格");
		}
		System.out.println();
	}

}
