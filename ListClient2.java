
public class ListClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedIntList list = new LinkedIntList();
		list.add(18);
		list.add(27);
		list.add(42);
		list.add(3);
		list.add(-1);
		
		LinkedIntList list2 = new LinkedIntList();
		list2.add(-3);
		list2.add(5);
		list2.add(17);
		list2.add(45);
		list2.add(76);
		
		LinkedIntList list3 = new LinkedIntList();
		list3.add(0);
		list3.add(0);
		list3.add(0);
		list3.add(0);
		
		LinkedIntList list4 = new LinkedIntList();
		list4.add(59);
		
		LinkedIntList list5 = new LinkedIntList();
		
		// test and print list which is not sorted
		System.out.println(list);	
		System.out.println(list.isSorted());
		// test and print list which is sorted
		System.out.println();
		System.out.println(list2);
		System.out.println(list2.isSorted());
		// test and print list with all "equal" objects
		System.out.println();
		System.out.println(list3);
		System.out.println(list3.isSorted());
		// test and print list with one object
		System.out.println();
		System.out.println(list4);
		System.out.println(list4.isSorted());
		// test and print empty list
		System.out.println();
		System.out.println(list5);
		System.out.println(list5.isSorted());

	}

}
