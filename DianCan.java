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
	    public static String[] name = new String[4];// ����
	    public static int[] time = new int[4];// �Ͳ�ʱ��
	    public static String[] addess = new String[4];// �Ͳ͵�ַ
	    public static String[] orderMsg = new String[4];// �Ͳ�����
	    public static double[] orderPrices = new double[4];// ���͵��ܼ�
	    public static String[] dishNames = { "��������", "����ǽ", "�½���ȫ��" };// �˵�
	    public static int[] price = { 88, 880, 812 };// �˼�
	    public static int[] prize = { 12, 34, 812 };// ������
	    public static int[] status = new int[4];// ����״̬
	    public static void main(String[] args) {
	        name[0] = "�ŷ�";
	        orderMsg[0] = "��������һ��";
	        time[0] = 11;
	        addess[0] = "����";
	        orderPrices[0] = 88;
	        status[0] = 0;
	        name[1] = "����";
	        orderMsg[1] = "����ǽһ��";
	        time[1] = 12;
	        addess[1] = "��������";
	        price[1] = 880;
	        status[1] = 0;
	        System.out.println("***��ӭʹ�óԻ�����ϵͳ***");
	        to: do {
	            System.out.println("*************************************");
	            System.out.println("\t1:��Ҫ����");
	            System.out.println("\t2:�鿴�ʹ�");
	            System.out.println("\t3:ǩ�ն���");
	            System.out.println("\t4:ɾ������");
	            System.out.println("\t5:��Ҫ����");
	            System.out.println("\t6:�˳�ϵͳ");
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
	                System.out.println("�˳�ϵͳ");
	                break to;
	            }
	            }
	        } while (true);
	        System.out.println("��ӭ�´ι���");
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
	                System.out.println("�ʹ�����");
	                return isFull;
	            }
	            System.out.println("��Ҫ����");
	            System.out.println("*********��Ʒ��Ϣ**********");
	            System.out.println("���\t����\t�۸�\t����");
	            for (int i = 0; i < dishNames.length; i++) {
	                System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price[i] + "\t" + prize[i]);
	            }
	            System.out.println("**************");
	            int index = inputIntNum(1, 3);
	            int dishNum = inputIntNum(1, 5);
	            String msg = dishNames[index - 1] + "," + dishNum + "��";
	            System.out.println("���붩��������:");
	            String orderName = sc.next();
	            System.out.println("���붩�͵�ַ:");
	            String orderAdd = sc.next();
	            System.out.println("�����Ͳ͵�ַ:");
	            int orderTime = sc.nextInt();
	            double rate = (price[index - 1] * dishNum > 50) ? 0 : 5;
	            double orderPrice = price[index - 1] * dishNum + rate;
	            System.out.println("������Ϣ��������:");
	            System.out.println("������:+orderName");
	            System.out.println("��������:" + msg);
	            System.out.println("�����ܼ�:" + orderPrice);
	            System.out.println("�Ͳͷ���:" + rate);
	            System.out.println("�Ͳ�ʱ��:" + time);
	            System.out.println("�Ͳ͵�ַ:" + orderAdd);
	            for (int i = 0; i < name.length; i++) {
	                if (name[i] == null) {
	                    name[i] = orderName;
	                    time[i] = orderTime;
	                    orderMsg[i] = msg;
	                    addess[i] = orderAdd;
	                    orderPrices[i] = orderPrice;
	                    System.out.println("���ͳɹ�!");
	                    break;
	                }
	            }
	            System.out.println("�Ƿ��������(y/n):");
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
	            System.out.println("��ѡ��˵����:");
	            while (!sc.hasNext()) {
	                System.out.println("��������");
	                String sd = sc.next();
	            }
	            index = sc.nextInt();
	            if (index <= end && index >= start) {
	                break;
	            } else {
	                System.out.println("ѡ�������" + start + "-" + end + "֮��");
	            }
	        } while (true);
	        return index;
	    }
	    public static int inputIntNum1(int start, int end) {
	        int index = -1;
	        do {
	            System.out.println("���빺�򼸷�:");
	            while (!sc.hasNext()) {
	                System.out.println("��������:");
	                String sd = sc.next();
	            }
	            index = sc.nextInt();
	            if (index <= end && index >= start) {
	                break;
	            } else {
	                System.out.println("ѡ�������" + start + "-" + end + "֮��");
	            }
	        } while (true);
	        return index;
	    }
	    public static void function2() {
	        System.out.println("���\t����\t��������\t\t�ܼ�\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�Ͳ�״̬");
	        for (int i = 0; i < name.length; i++) {
	            if (name[i] != null) {
	                String st = "";
	                if (status[i] == 0) {
	                    st = "δǩ��";
	                } else {
	                    st = "��ǩ��";
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
	        // �ж϶����ŵķ�Χ1-n
	        int end = 0;
	        for (String s : name) {
	            if (s != null) {
	                end++;
	            }
	        }
	        int start = 1;
	        if (end == 0) {
	            System.out.println("û�ж�����ǩ��");
	            return;
	        }
	        System.out.println(start + "==>" + end);
	        int index = inputIntNum(1, end);
	        for (int i = 0; i < name.length; i++) {
	            if (name[i] != null && index == (i + 1) && status[i] == 1) {
	                System.out.println("�˶�����ǩ��");
	                continue;
	            }
	            if (name[i] != null && index == (i + 1) && status[i] == 0) {
	                status[i] = 1;
	                System.out.println("����ǩ�ճɹ�");
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
	            System.out.println("û�ж�����ɾ��");
	            return;
	        }
	        System.out.println(start + "==>" + end);
	        int index = inputIntNum(1, end);
	        boolean isFind = false;
	        for (int i = 0; i < name.length; i++) {
	            if (name[i] != null && index == (i + 1) && status[i] == 0) {
	                System.out.println("��ѡ��ûǩ�գ�����ɾ��");
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
	            System.out.println("ɾ���ɹ�");
	        }
	    }
	    private static void function5() {
	        System.out.println("*********���޲�Ʒ��Ϣ************");
	        System.out.println("���\t����\t�۸�\t����");
	        for (int i = 0; i < dishNames.length; i++) {
	            System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price[i] + "\t" + prize[i]);
	        }
	        System.out.println("************************************");
	        int index = inputIntNum(1, dishNames.length);
	        prize[index - 1]++;
	        System.out.println("���޳ɹ�");
	    
	 
			}
			
		
		

	}


