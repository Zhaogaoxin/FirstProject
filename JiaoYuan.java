package cn.kgc.duixiang;

public class JiaoYuan {
	
	public String name;//�������� ���ԵĶ��壺 ���η� �������� ������[=����]��
	public int    age;//��������   ���η�  �������� ������[=����]��
	public String attend;//�༶����  ���η� �������� ������[=����]��
	public String hobbby;//��������  ���η� �������� ������[=����]��
	public int seniority;//�������� ���η� �������� ������[=����]��
	public String professor;//�������� ���η� �������� ������[=����]��
	public void teach(){//��������Ϊ���������Ķ��壺 ���η� void ��������������{}
		System.out.println("��ѧ�����ǲ���֪ʶʹ�ҿ���");
	}
	public void play(){
		System.out.println("Ԣ������");
	}
	public static void main(String[] args) {
		JiaoYuan wanglaoshi;//���������  ���� ��������
		wanglaoshi=new JiaoYuan();//����Ĵ�������ֵ������  �﷨��������=new ����������
		wanglaoshi.name="����ʦ";//���Ը�ֵ ������.������=����
		wanglaoshi.age=25;
		wanglaoshi.attend="k8505";
		wanglaoshi.hobbby="�����";
		wanglaoshi.professor="ʹ��Java�����������߼�";
		wanglaoshi.seniority=5;
		System.out.println(wanglaoshi.name+"\n"+"רҵ����:"+wanglaoshi.hobbby+"\n"+"���ڿγ̣�"+wanglaoshi.professor+"\n"+"���䣺"+wanglaoshi.seniority);
		wanglaoshi.teach();
		wanglaoshi.play();
		
	}
 
}
