import java.util.Arrays;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

//		//Even Squares
//		
//		  List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
//	        List<Integer> result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
//	        System.out.println(result); 

		
		
		
//		//Case Insensitive Distinct word count
//		
//		List<String> words = Arrays.asList("Java", "java", "Stream", "STREAM");
//        long count = words.stream().map(String::toLowerCase).distinct().count();
//        System.out.println(count); 

		
		
		
		
//		// Average salary per Department
//		
//		class Employee {
//		    String deptartment;
//		    double salary;
//
//		    Employee(String deptartment, double salary) {
//		        this.dept = deptartment;
//		        this.salary = salary;
//		    }
//		}
//
//		public class Sample3 {
//		    public static void main(String[] args) {
//		        List<Employee> staff = List.of(new Employee("HR", 40000),new Employee("IT", 60000),new Employee("HR", 50000),new Employee("IT", 80000));
//		        Map<String, Double> avgSalary = staff.stream().collect(Collectors.groupingBy(e -> e.dept, Collectors.collectingAndThen(Collectors.averagingDouble(e -> e.salary),avg -> Math.round(avg * 100.0) / 100.0)));
//		        System.out.println(avgSalary); 
//		    }
//	        

		
		
		
		
//		 //Flatten & Alphabetise

//		List<List<String>> nested = Arrays.asList(Arrays.asList("apple", "", "banana"),Arrays.asList("orange", null, "grape"));
//		List<String> result = nested.stream().flatMap(List::stream).filter(s -> s != null && !s.trim().isEmpty()).sorted().collect(Collectors.toList());
//
//		System.out.println(result); // [apple, banana, grape, orange]


		
		
//		//First Non repeating character
//		 String s = "swiss";
//	        Map<Character, Integer> countMap = new LinkedHashMap<>();
//
//	        for (char c : s.toCharArray()) {
//	            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
//	        }
//
//	        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
//	            if (entry.getValue() == 1) {
//	                System.out.println("First unique character: " + entry.getKey());
//	                return;
//	            }
//	        }
//
//	        System.out.println("No unique character found.");
		
		
		
		
		
//		//Top traders by year
//		class Tx {
//		    int year;
//		    String trader;
//		    int value;
//
//		    Tx(int year, String trader, int value) {
//		        this.year = year;
//		        this.trader = trader;
//		        this.value = value;
//		    }
//		}
//
//		public class Sample6 {
//		    public static void main(String[] args) {
//		        List<Tx> txs = Arrays.asList(
//		            new Tx(2020, "Alice", 100),
//		            new Tx(2020, "Bob", 150),
//		            new Tx(2020, "Alice", 200),
//		            new Tx(2020, "Charlie", 120),
//		            new Tx(2020, "Bob", 50),
//		            new Tx(2020, "Dave", 150)
//		        );
//
//		        Map<Integer, List<String>> result = txs.stream().collect(Collectors.groupingBy(tx -> tx.year,Collectors.collectingAndThen(Collectors.groupingBy(tx -> tx.trader, Collectors.summingInt(tx -> tx.value)),traderMap -> traderMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().thenComparing(Map.Entry::getKey)).limit(3).map(Map.Entry::getKey).collect(Collectors.toList()))));
//
//		        System.out.println(result);
//		    }
//		}
		
		
		
		
		
//		//Immutable Linked Set Collector
//		 Set<Integer> set = Stream.of(1, 2, 3, 4, 5, 1, 2).collect(toImmutableLinkedSet());
//		        System.out.println(set); 
//		    }
//
//		    public static <T> Collector<T, ?, Set<T>> toImmutableLinkedSet() {
//		        return Collector.of(LinkedHashSet::new,Set::add,(left, right) -> { left.addAll(right); return left; },set -> Collections.unmodifiableSet(set));
		
		
		
		
		
//		//map vs flatmap
//		   List<String> sentences = Arrays.asList("Java is cool", "Streams are powerful");
//
//	        List<List<String>> mapped = sentences.stream().map(s -> Arrays.asList(s.split(" "))).collect(Collectors.toList());
//
//	        List<String> flatMapped = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).distinct().sorted().collect(Collectors.toList());
//
//	        System.out.println("Mapped: " + mapped);
//	        System.out.println("FlatMapped: " + flatMapped);
		
		
		
		
//		List<String> items = new ArrayList<>();
//		items.add("A");
//		items.add("B");
//		items.add("C");
//		for (String s : items) {
//		    if (s.equals("B")) items.remove(s);
//		}
//		System.out.println(items);
		
		
		
		
		
//		List<Integer> list = List.of(10, 20, 30);
//		list.replaceAll(n -> n + 1);
//		System.out.println(list);
		
		
		
//		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//		System.out.println(nums.stream().reduce(1, (a, b) -> a * b));
//		
		
		
		
//		 List<String> list = Arrays.asList("a", "b", "c");
//		 System.out.println(list.stream().map(String::toUpperCase).findFirst().get());
//	    
		
		
		
		
//		Stream.of("zebra", "apple", "monkey").sorted().findFirst().ifPresent(System.out::print);
		
		
		
		
//		String s1 = "Hello";
//		String s2 = "Hello";
//		String s3 = new String("Hello");
//
//		System.out.print((s1 == s2) + " ");
//		System.out.println(s1 == s3);
		
		
		
//		List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9);
//		System.out.println(nums.stream().filter(n -> n % 2 == 0).count());

		
		
//		List<String> list = Arrays.asList("a", "b", "c", "d");
//		list.stream().skip(2).forEach(System.out::print);

		
//		String s = "abc";
//		String t = "abc";
//		System.out.println(s.hashCode() == t.hashCode());
		
		
		
//		List<String> list = Arrays.asList("Java", "Python", "C");
//		list.stream().filter(s -> s.length() > 3).limit(1).forEach(System.out::println);

		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "A");
//		map.put(2, "B");
//		map.put(1, "C");
//		System.out.println(map.get(1));
		
		
		
//		List<Integer> list = Arrays.asList(10, 20, 30, 40);
//		list.replaceAll(n -> n + 5);
//		System.out.println(list);
		
		
		
//		List<Integer> nums = Arrays.asList(4, 5, 6);
//		nums.stream().map(n -> n * 2).filter(n -> n > 8).forEach(System.out::println);
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);
	}
}
