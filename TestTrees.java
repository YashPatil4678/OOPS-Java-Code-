
public class TestTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trees t1 = new Trees();
		Trees t2 = new Trees();
		t2.setName("Banana");
		t2.setType("xyz");
		t2.setHeight(120);
		t2.setCategory("abc");
		
		t1.setName("Coconut");
		t1.setType("Fruit");
		t1.setHeight(100);
		t1.setCategory("NULL");
		System.out.println("Tree 1:");
		System.out.println("Tree Name :"+t1.getName());
		System.out.println("Tree Type :"+t1.getType());
		System.out.println("Tree Category: "+t1.getCategory());
		System.out.println("Tree Height: "+t1.getHeight());
		System.out.println();
		
		System.out.println("Tree 2:");
		System.out.println("Tree Name :"+t2.getName());
		System.out.println("Tree Type :"+t2.getType());
		System.out.println("Tree Category: "+t2.getCategory());
		System.out.println("Tree Height: "+t2.getHeight());
		
	}

}
