import java.util.Vector;

public class TestMain {

	public static void main(String[] args) {
		Vector<User> vec = new Vector<User>();
		User t1 = new User();User t2 = new User();
		User t3 = new User();User t4 = new User();
		User t5 = new User();User t6 = new User();
		t1.age=10;t1.setName("t2");t1.level=1;t2.age=20;t2.setName("t2");t2.level=2;
		t3.age=30;t3.setName("t3");t3.level=3;t4.age=40;t4.setName("t4");t4.level=4;
		t5.age=50;t5.setName("t5");t5.level=5;t6.age=60;t6.setName("t6");t6.level=6;
		vec.add(t1);vec.add(t2);vec.add(t3);
		vec.add(t4);vec.add(t5);vec.add(t6);
		
		for(int i=0;i<vec.size();i++) {//User Vector 출력
			System.out.print("Index : "+i+" age : "+vec.elementAt(i).age);
			System.out.print(" level : "+vec.elementAt(i).level);
			System.out.println(" name :  "+vec.elementAt(i).getname());			
		}
		for(int i=0;i<vec.size();i++) {//t3 Vect찾고 출력, 삭제
			if(vec.elementAt(i).getname().equals("t3")) {
				System.out.print(i+"Element is T3");
				vec.remove(i);
				System.out.println("Element T3 Elase");
			}
		}
		for(int i=0;i<vec.size();i++) {//User Vector 출력
			System.out.print("Index : "+i+" age : "+vec.elementAt(i).age);
			System.out.print(" level : "+vec.elementAt(i).level);
			System.out.println(" name :  "+vec.elementAt(i).getName());			
		//Index 2가 T3가 아니라 T4가 옴.
		//vector 자동정렬로 인해 빈칸이 정리됨
		}	
		//System.out.println(vec);
		
		
	}

}