package cn.kgc.chlm;

import java.util.Scanner;

public class Chlm {

	public static void main(String[] args) {
		String[] name = new String[5];// 保存订餐人姓名
		String[] dishMegs = new String[] { "红烧带鱼", "鱼香肉丝", "时令鲜蔬" };// 保存所选信息，菜品名
		double[] prices = new double[] { 38.0, 20.0, 15.0 };// 菜品单价
		int[] times = new int[4];// 保存送餐时间
		String[] addresses = new String[4];// 保存送餐地址
		int[] states = new int[4];// 保存订单状态：0表示已预定，1表示已完成。
		double[] sumPrices = new double[4];// 保存订单的总金额
		int[] praiseNums = new int[3];// 点赞数
		System.out.println("欢迎来到‘吃货联盟订餐系统’");
		int num = -1;// 初始化用户输入的数值，用户输入0返回主菜单，否则退出系统。
		boolean isExit = false;// 标志用户是否退出系统：true为退出系统。
		do {
			System.out.println("******************************************\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("1.我要订餐\n2.查看餐袋\n3.签收订单\n4.删除订单\n5.我要点赞\n6.退出系统\n");
			System.out.println("********************************************************\n");
			System.out.println("请选择：");
			int choose = sc.nextInt();// 记录用户选择的功能编号
			switch (choose) {
			case 1:
				// 我要订餐
				System.out.println("***我要订餐***");
				boolean isAdd = false;
				for (int i = 0; i < name.length; i++) {
					if (name[i] == null) {
						System.out.println("请输入订餐人姓名：");
						String names = sc.next();
						System.out.println("序号\t菜名\t单价\t点赞数");
						for (int j = 0; j < dishMegs.length; j++) {
							String praiseNum = (praiseNums[j]) > 0 ? praiseNums[j] + "赞" : "0";
							System.out.println((j + 1) + "\t" + dishMegs[j] + "\t" + prices[j] + "\t" + praiseNum);
						}
						// 用户点菜
						System.out.println("请选择您要点的菜品编号：");
						int chooseDish = sc.nextInt();
						System.out.println("请选择您需要的份数");
						int number = sc.nextInt();
						String dishMeg = dishMegs[chooseDish - 1] + "" + number + "份";
						double sumPrice = prices[chooseDish - 1] * number;
						double deliCharge = (sumPrice >= 50) ? 0 : 5;
						System.out.println("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
						int time = sc.nextInt();
						while (time < 10 || time > 20) {
							System.out.println("您的输入有误，请输入10~20之间的整数！");
							time = sc.nextInt();
						}
						System.out.println("请输入送餐地址：");
						String address = sc.next();
						System.out.println("订餐成功！");
						System.out.println("您订的是" + dishMeg);
						System.out.println("送餐时间：" + time + "点");
						System.out.println(
								"餐费：" + sumPrice + "元，送餐费" + deliCharge + "元，总计：" + (sumPrice + deliCharge) + "元。");
						name[i] = names;
						dishMegs[i] = dishMeg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = sumPrice + deliCharge;
						break;

					}
					if (!isAdd) {
						System.out.println("对不起，您的餐袋已满");
					}
				}
				break;
			case 2:
				// 查看参袋
				System.out.println("***查看餐袋***");
				System.out.println("序号\t订餐人\t餐品信息\t送餐地址\t\t总金额\t订单状态");
				for (int i = 0; i < name.length; i++) {
					if (name[i] != null) {
						String state = (states[i] == 0) ? "已预定" : "已完成";
						String date = times[i] + "日";
						String sumPrice = sumPrices[i] + "元";
						System.out.println((i + 1) + "\t" + name[i] + "\t" + dishMegs[i] + "\t" + date + "\t"
								+ addresses[i] + "\t\t" + sumPrice + "\t" + state);

					}
				}
				break;
			case 3:
				// 签收订单
				System.out.println("***签收订单***");
				boolean isSignFind = true;// 找到要签收的订单
				System.out.println("请选择要签收的订单序号：");
				int signOrderId = sc.nextInt();
				for (int i = 0; i < name.length; i++) {
					if (name[i] != null && states[i] == 0 && signOrderId == i + 1) {
						states[i] = 1;
						System.out.println("订单签收成功");
						isSignFind = false;
						break;

					} else if (name[i] != null && states[i] == 1 && signOrderId == i + 1) {
						System.out.println("您选择的订单已完成签收，不能再次签收");
						isSignFind = false;
					}
				}
				if (isSignFind) {
					System.out.println("您选择的订单不存在");
				}
				break;

			case 4:
				// 删除订单
				System.out.println("****删除订单****");
				System.out.println("请输入要删除的订单序号：");
				int delid = sc.nextInt();
				for (int i = 0; i < name.length; i++) {
					if (name[i] != null && states[i] == 1) {
						name[delid - 1] = null;

						System.out.println("删除订单成功");
						break;
					} else if (name[i] != null && states[i] == 1) {
						System.out.println("您的订单未签收，不能删除！");
						break;
					} else {
						System.out.println("您要删除的订单不存在");
					}
				}
				break;
			case 5:
				// 我要点赞
				System.out.println("****我要点赞****");
				System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
				for (int i = 0; i < dishMegs.length; i++) {
					String price = prices[i] + "元";
					String priaiseNum = (praiseNums[i] > 0 ? praiseNums[i] + "赞" : "");
					System.out.println((i + 1) + "\t" + dishMegs[i] + "\t" + price + "\t" + priaiseNum);
				}
				System.out.println("请选择您要点赞的菜品序号：");
				int priaiseNum = sc.nextInt();
				praiseNums[priaiseNum - 1]++;
				System.out.println("点赞成功！");
				break;
			case 6:
				// 退出系统
				isExit = true;
				break;

			default:
				System.out.println("对不起没有这个选项！");
				break;
			}
			if (isExit == false) {
				System.out.println("输入0时返回");
				num = sc.nextInt();
			} else {
				System.out.println("欢迎下次再来！");
				break;
			}

		} while (num == 0);
	}

}


