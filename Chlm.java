package cn.kgc.chlm;

import java.util.Scanner;

public class Chlm {

	public static void main(String[] args) {
		String[] name = new String[5];// ���涩��������
		String[] dishMegs = new String[] { "���մ���", "������˿", "ʱ������" };// ������ѡ��Ϣ����Ʒ��
		double[] prices = new double[] { 38.0, 20.0, 15.0 };// ��Ʒ����
		int[] times = new int[4];// �����Ͳ�ʱ��
		String[] addresses = new String[4];// �����Ͳ͵�ַ
		int[] states = new int[4];// ���涩��״̬��0��ʾ��Ԥ����1��ʾ����ɡ�
		double[] sumPrices = new double[4];// ���涩�����ܽ��
		int[] praiseNums = new int[3];// ������
		System.out.println("��ӭ�������Ի����˶���ϵͳ��");
		int num = -1;// ��ʼ���û��������ֵ���û�����0�������˵��������˳�ϵͳ��
		boolean isExit = false;// ��־�û��Ƿ��˳�ϵͳ��trueΪ�˳�ϵͳ��
		do {
			System.out.println("******************************************\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.��Ҫ����\n2.�鿴�ʹ�\n3.ǩ�ն���\n4.ɾ������\n5.��Ҫ����\n6.�˳�ϵͳ\n");
			System.out.println("********************************************************\n");
			System.out.println("��ѡ��");
			int choose = sc.nextInt();// ��¼�û�ѡ��Ĺ��ܱ��
			switch (choose) {
			case 1:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");
				boolean isAdd = false;
				for (int i = 0; i < name.length; i++) {
					if (name[i] == null) {
						System.out.println("�����붩����������");
						String names = sc.next();
						System.out.println("���\t����\t����\t������");
						for (int j = 0; j < dishMegs.length; j++) {
							String praiseNum = (praiseNums[j]) > 0 ? praiseNums[j] + "��" : "0";
							System.out.println((j + 1) + "\t" + dishMegs[j] + "\t" + prices[j] + "\t" + praiseNum);
						}
						// �û����
						System.out.println("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
						int chooseDish = sc.nextInt();
						System.out.println("��ѡ������Ҫ�ķ���");
						int number = sc.nextInt();
						String dishMeg = dishMegs[chooseDish - 1] + "" + number + "��";
						double sumPrice = prices[chooseDish - 1] * number;
						double deliCharge = (sumPrice >= 50) ? 0 : 5;
						System.out.println("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ���");
						int time = sc.nextInt();
						while (time < 10 || time > 20) {
							System.out.println("������������������10~20֮���������");
							time = sc.nextInt();
						}
						System.out.println("�������Ͳ͵�ַ��");
						String address = sc.next();
						System.out.println("���ͳɹ���");
						System.out.println("��������" + dishMeg);
						System.out.println("�Ͳ�ʱ�䣺" + time + "��");
						System.out.println(
								"�ͷѣ�" + sumPrice + "Ԫ���Ͳͷ�" + deliCharge + "Ԫ���ܼƣ�" + (sumPrice + deliCharge) + "Ԫ��");
						name[i] = names;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice + deliCharge;
						break;

					}
					if (!isAdd) {
						System.out.println("�Բ������Ĳʹ�����");
					}
				}
				break;
			case 2:
				// �鿴�δ�
				System.out.println("***�鿴�ʹ�***");
				System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for (int i = 0; i < name.length; i++) {
					if (name[i] != null) {
						String state = (states[i] == 0) ? "��Ԥ��" : "�����";
						String date = times[i] + "��";
						String sumPrice = sumPrices[i] + "Ԫ";
						System.out.println((i + 1) + "\t" + name[i] + "\t" + dishMegs[i] + "\t" + date + "\t"
								+ addresses[i] + "\t\t" + sumPrice + "\t" + state);

					}
				}
				break;
			case 3:
				// ǩ�ն���
				System.out.println("***ǩ�ն���***");
				boolean isSignFind = true;// �ҵ�Ҫǩ�յĶ���
				System.out.println("��ѡ��Ҫǩ�յĶ�����ţ�");
				int signOrderId = sc.nextInt();
				for (int i = 0; i < name.length; i++) {
					if (name[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1;
						System.out.println("����ǩ�ճɹ�");
						isSignFind = false;
						break;

					} else if (name[i] != null && states[i] == 1 && signOrderId == i + 1) {
						System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ��");
						isSignFind = false;
					}
				}
				if (isSignFind) {
					System.out.println("��ѡ��Ķ���������");
				}
				break;

			case 4:
				// ɾ������
				System.out.println("****ɾ������****");
				System.out.println("������Ҫɾ���Ķ�����ţ�");
				int delid = sc.nextInt();
				for (int i = 0; i < name.length; i++) {
					if (name[i] != null && states[i] == 1) {
						name[delid - 1] = null;

						System.out.println("ɾ�������ɹ�");
						break;
					} else if (name[i] != null && states[i] == 1) {
						System.out.println("���Ķ���δǩ�գ�����ɾ����");
						break;
					} else {
						System.out.println("��Ҫɾ���Ķ���������");
					}
				}
				break;
			case 5:
				// ��Ҫ����
				System.out.println("****��Ҫ����****");
				System.out.println("���" + "\t" + "����" + "\t" + "����");
				for (int i = 0; i < dishMegs.length; i++) {
					String price = prices[i] + "Ԫ";
					String priaiseNum = (praiseNums[i] > 0 ? praiseNums[i] + "��" : "");
					System.out.println((i + 1) + "\t" + dishMegs[i] + "\t" + price + "\t" + priaiseNum);
				}
				System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int priaiseNum = sc.nextInt();
				praiseNums[priaiseNum - 1]++;
				System.out.println("���޳ɹ���");
				break;
			case 6:
				// �˳�ϵͳ
				isExit = true;
				break;

			default:
				System.out.println("�Բ���û�����ѡ�");
				break;
			}
			if (isExit == false) {
				System.out.println("����0ʱ����");
				num = sc.nextInt();
			} else {
				System.out.println("��ӭ�´�������");
				break;
			}

		} while (num == 0);
	}

}


