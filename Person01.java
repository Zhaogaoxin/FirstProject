package cn.kgc.duixiang;

public class Person01 {
	
	public String name;
	public char   sex;
	public double weight;
	public double loseweight;
	public void jf(){
		System.out.println(name+"��һ��"+sex+"���ӣ�����"+weight+"kg"+"����"
				+ "��мŬ����������"+loseweight+"kg,"+"���ʺ��������"+(weight-loseweight)+"kg");
	}
	public String mm(){
		return name;
		
	}
}
