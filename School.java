package cn.kgc.duixiang;

public class School {
	public String name;// [���η�]   ��������  ������[=����]   ����ѧУ��������
	public int  length;// [���η�]	��������    ������[=����]   ����ѧУ�������
	public String publicticy; 
	public void jiaoxue(){}//[���η�] ��������    ���������������� ��������{������}  ������󷽷�
	
	public static void main(String[] args) {
	School dog;
	dog=new School();
	dog.name="С��";
	dog.length=85;
	dog.publicticy="����ʡʡ������ѧУ";
	System.out.println(dog.name+dog.length);
	}
	
}
