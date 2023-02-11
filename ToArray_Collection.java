//toArray(T[] arr) method illustration

public class Demo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>(100);
		list.add(1);
		list.add(2);
		list.add(5);
		
		Object[] arr1 = list.toArray();
		Integer[] arr2 = list.toArray(new Integer[1]);
		Integer[] arr3 = list.toArray(new Integer[3]);
		Integer[] arr4 = list.toArray(new Integer[10]);
		
		System.out.println(Arrays.toString(arr1)); //[1, 2, 5]
		System.out.println(Arrays.toString(arr2)); //[1, 2, 5]
		System.out.println(Arrays.toString(arr3)); //[1, 2, 5]
		System.out.println(Arrays.toString(arr4)); //[1, 2, 5, null, null, null, null, null, null, null]
		
	}
	
}