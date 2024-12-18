
public class TestStudentss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentss s1 = new Studentss();
		Studentss s2 = new Studentss();
		
		s1.setName("Sam");
		s1.setRollno(10);
		s1.setMobno(925386794);
		s1.setAdd("Pune");
		
		s2.setName("John");
		s2.setRollno(11);
		s2.setMobno(789632512);
		s2.setAdd("Mumbai");
		
		System.out.println("Student1:");
		System.out.println("Name :"+s1.getName());
		System.out.println("Roll No:"+s1.getRollno());
		System.out.println("Mob No.:"+s1.getMobno());
		System.out.println("Address :"+s1.getAdd());
		System.out.println();
		
		System.out.println("Student2:");
		System.out.println("Name :"+s2.getName());
		System.out.println("Roll No:"+s2.getRollno());
		System.out.println("Mob No.:"+s2.getMobno());
		System.out.println("Address :"+s2.getAdd());
	

	}

}
