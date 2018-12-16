package cn.kcg.test;

public class YunSuanFu {
	public static void main(String[] args){
		byte b=5;
		int i=7;
		
		System.out.println(i+b);//12
		System.out.println(i-b);//2
	    System.out.println(i*b);//35
	    System.out.println(i/b);//1
	    System.out.println(i%b);//2
	    System.out.println(++b);//6
	    System.out.println(b++);//6
	    System.out.println(i--);//7
	    System.out.println(--i);//5
	    System.out.println(b+=i);//b=b+i 12
	    System.out.println(b-=i);//b=b-i 7
	    System.out.println(b*=i);//b=b*i 35
        System.out.println(b/=i);//b=b/i 7
      int a=75,c=23;
      int num=a>b?a:b;
      String str= num%2==0?"Å¼Êı":"ÆæÊı";
      		System.out.println(str);
      
	}

}
