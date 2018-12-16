package cn.kgc.chlm;

import java.util.Scanner;

public class DianCan {

//	public static void main(String[] args) {
//			String[] names = new String[4];
//			String[] dishMegs = new String[4];	
//			int[] times = new int[4];	
//			String[] addresses = new String[4];
//			int[] states = new int[4];	
//			double[] sumPrice = new double[4];
	
	    public static Scanner sc = new Scanner(System.in);
	    public static String[] name = new String[4];// 姓名
	    public static int[] time = new int[4];// 送餐时间
	    public static String[] addess = new String[4];// 送餐地址
	    public static String[] orderMsg = new String[4];// 送餐内容
	    public static double[] orderPrices = new double[4];// 订餐的总价
	    public static String[] dishNames = { "蒜蓉黄瓜", "黄焖鸡饭", "蔬菜时鲜" };// 菜单
	    public static int[] price = { 88, 880, 812 };// 菜价
	    public static int[] prize = { 12, 34, 812 };// 点赞数
	    public static int[] status = new int[4];// 订单状态
	    public static void main(String[] args) {
	        name[0] = "张飞";
	        orderMsg[0] = "万三肘子一份";
	        time[0] = 11;
	        addess[0] = "工大";
	        orderPrices[0] = 88;
	        status[0] = 0;
	        name[1] = "张三";
	        orderMsg[1] = "佛跳墙一份";
	        time[1] = 12;
	        addess[1] = "北大青鸟";
	        price[1] = 880;
	        status[1] = 0;
	        System.out.println("***欢迎使用吃货联盟系统***");
	        to: do {
	            System.out.println("*************************************");
	            System.out.println("\t1:我要订餐");
	            System.out.println("\t2:查看餐袋");
	            System.out.println("\t3:签收订单");
	            System.out.println("\t4:删除订单");
	            System.out.println("\t5:我要点赞");
	            System.out.println("\t6:退出系统");
	            System.out.println("*************************************");
	            int num = inputIntNum(1, 6);
	            switch (num) {
	            case 1: {
	                function1();
	                break;
	            }
	            case 2: {
	                function2();
	                break;
	            }
	            case 3: {
	                function3();
	                break;
	            }
	            case 4: {
	                function4();
	                break;
	            }
	            case 5: {
	                function5();
	                break;
	            }
	            case 6: {
	                System.out.println("退出系统");
	                break to;
	            }
	            }
	        } while (true);
	        System.out.println("欢迎下次光临");
	    }
	    public static boolean function1() {
	        boolean isFull = false;
	        do {
	            isFull = false;
	            for (String i : name) {
	                if (i == null) {
	                    isFull = true;
	                    break;
	                }
	            }
	            if (!isFull) {
	                System.out.println("餐袋已满");
	                return isFull;
	            }
	            System.out.println("我要订餐");
	            System.out.println("*********菜品信息**********");
	            System.out.println("序号\t名称\t价格\t点赞");
	            for (int i = 0; i < dishNames.length; i++) {
	                System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price[i] + "\t" + prize[i]);
	            }
	            System.out.println("**************");
	            int index = inputIntNum(1, 3);
	            int dishNum = inputIntNum(1, 5);
	            String msg = dishNames[index - 1] + "," + dishNum + "份";
	            System.out.println("输入订餐人姓名:");
	            String orderName = sc.next();
	            System.out.println("输入订餐地址:");
	            String orderAdd = sc.next();
	            System.out.println("输入送餐地址:");
	            int orderTime = sc.nextInt();
	            double rate = (price[index - 1] * dishNum > 50) ? 0 : 5;
	            double orderPrice = price[index - 1] * dishNum + rate;
	            System.out.println("订餐信息具体如下:");
	            System.out.println("订餐人:+orderName");
	            System.out.println("订餐内容:" + msg);
	            System.out.println("订餐总价:" + orderPrice);
	            System.out.println("送餐费用:" + rate);
	            System.out.println("送餐时间:" + time);
	            System.out.println("送餐地址:" + orderAdd);
	            for (int i = 0; i < name.length; i++) {
	                if (name[i] == null) {
	                    name[i] = orderName;
	                    time[i] = orderTime;
	                    orderMsg[i] = msg;
	                    addess[i] = orderAdd;
	                    orderPrices[i] = orderPrice;
	                    System.out.println("订餐成功!");
	                    break;
	                }
	            }
	            System.out.println("是否继续订餐(y/n):");
	            String ans = sc.next();
	            if (!ans.equals("y")) {
	                break;
	            }
	            if (!isFull) {
	                break;
	            }
	        } while (true);
	        return isFull;
	    }
	    public static int inputIntNum(int start, int end) {
	        int index = -1;
	        do {
	            System.out.println("请选择菜单序号:");
	            while (!sc.hasNext()) {
	                System.out.println("输入整数");
	                String sd = sc.next();
	            }
	            index = sc.nextInt();
	            if (index <= end && index >= start) {
	                break;
	            } else {
	                System.out.println("选项必须在" + start + "-" + end + "之间");
	            }
	        } while (true);
	        return index;
	    }
	    public static int inputIntNum1(int start, int end) {
	        int index = -1;
	        do {
	            System.out.println("输入购买几份:");
	            while (!sc.hasNext()) {
	                System.out.println("输入整数:");
	                String sd = sc.next();
	            }
	            index = sc.nextInt();
	            if (index <= end && index >= start) {
	                break;
	            } else {
	                System.out.println("选项必须在" + start + "-" + end + "之间");
	            }
	        } while (true);
	        return index;
	    }
	    public static void function2() {
	        System.out.println("序号\t姓名\t订餐内容\t\t总价\t送餐时间\t送餐地址\t送餐状态");
	        for (int i = 0; i < name.length; i++) {
	            if (name[i] != null) {
	                String st = "";
	                if (status[i] == 0) {
	                    st = "未签收";
	                } else {
	                    st = "已签收";
	                }
	                System.out.println((i + 1) + "\t");
	                System.out.println(name[i] + "\t");
	                System.out.println(orderMsg[i] + "\t");
	                System.out.println(orderPrices[i] + "\t");
	                System.out.println(time[i] + "\t");
	                System.out.println(addess[i] + "\t");
	            }
	        }
	    }
	    public static void function3() {
	        // 判断订单号的范围1-n
	        int end = 0;
	        for (String s : name) {
	            if (s != null) {
	                end++;
	            }
	        }
	        int start = 1;
	        if (end == 0) {
	            System.out.println("没有订单可签收");
	            return;
	        }
	        System.out.println(start + "==>" + end);
	        int index = inputIntNum(1, end);
	        for (int i = 0; i < name.length; i++) {
	            if (name[i] != null && index == (i + 1) && status[i] == 1) {
	                System.out.println("此订单已签收");
	                continue;
	            }
	            if (name[i] != null && index == (i + 1) && status[i] == 0) {
	                status[i] = 1;
	                System.out.println("订单签收成功");
	                break;
	            }
	        }
	    }
	    private static void function4() {
	        int end = 0;
	        for (String s : name) {
	            if (s != null) {
	                end++;
	            }
	        }
	        int start = 1;
	        if (end == 0) {
	            System.out.println("没有订单可删除");
	            return;
	        }
	        System.out.println(start + "==>" + end);
	        int index = inputIntNum(1, end);
	        boolean isFind = false;
	        for (int i = 0; i < name.length; i++) {
	            if (name[i] != null && index == (i + 1) && status[i] == 0) {
	                System.out.println("此选项没签收，不可删除");
	                continue;
	            }
	            if (name[i] != null && index == (i + 1) && status[i] == 1) {
	                isFind = true;
	                break;
	            }
	        }
	        if (isFind) {
	            for (int i = index - 1; i < name.length; i++) {
	                name[i] = name[i + 1];
	                time[i] = time[i + 1];
	                addess[i] = addess[i + 1];
	                orderMsg[i] = orderMsg[i + 1];
	                orderPrices[i] = orderPrices[i + 1];
	                status[i] = status[i + 1];
	            }
	            name[name.length - 1] = null;
	            time[time.length - 1] = 0;
	            addess[addess.length - 1] = null;
	            orderMsg[orderMsg.length - 1] = null;
	            orderPrices[orderPrices.length - 1] = 0;
	            status[status.length - 1] = 0;
	            System.out.println("删除成功");
	        }
	    }
	    private static void function5() {
	        System.out.println("*********点赞菜品信息************");
	        System.out.println("序号\t名称\t价格\t点赞");
	        for (int i = 0; i < dishNames.length; i++) {
	            System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price[i] + "\t" + prize[i]);
	        }
	        System.out.println("************************************");
	        int index = inputIntNum(1, dishNames.length);
	        prize[index - 1]++;
	        System.out.println("点赞成功");
	    
	 
			}
			
		
		

	}


