// JAVA - Cheat Sheet
// Carson Pemble

import java.util.*;

public class Testing {

    public static void main(String args[]) {

        System.out.println("\n- - - String and Int Conversions - - -");

        int ivar = 111;
        String str = String.valueOf(ivar);
        System.out.println("Num to String is: " + str);
        System.out.println("ivar + str is: " + (ivar + str));

        String strNum = "1234";
        int inum = Integer.parseInt(strNum);
        System.out.println("String to Num is: " + inum);
        System.out.println("ivar + strNum is: " + (ivar + inum));



        System.out.println("\n- - - Array Lists - - -");

        List<Integer> array = new ArrayList();              // Create Int Array
        array.add(1);
        array.add(2);                                       // Add values
        array.add(3);
        System.out.println(array);
        System.out.println("index 1 is: " + array.indexOf(1));    // Get index of value 1
        System.out.println("index 2 is: " + array.get(2));        // Get Value at index 2
        array.remove(2);                                    // Remove value at index 2
        System.out.println(array);                                // Print
        array.clear();
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(4);



        System.out.println("\n- - - Mock Hands-On Problem 1 - - -");

        List<Integer> uniqueArray = new ArrayList();              // Create Int Array
        int arraySize = array.size();                             // Calculate Size
        String curNum = "";
        int curNumInt = 0;

        for(int i=0; i<arraySize; i++){
            for(int j=0; j<arraySize; j++) {
                for(int k=0; k<arraySize; k++) {
                    curNum = "";
                    if(i!=j && i!=k && j!=k){
                        curNum += array.get(i).toString();
                        curNum += array.get(j).toString();
                        curNum += array.get(k).toString();
                        //System.out.println("curNum: " + curNum);

                        curNumInt = Integer.valueOf(curNum);
                        if(!uniqueArray.contains(curNumInt)){
                            uniqueArray.add(curNumInt);
                        }
                    }

                }
            }
        }

        System.out.println("Unique Array is: " + uniqueArray);
        int max = 0;
        for (Integer integer : uniqueArray) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println(max + ", " + uniqueArray.size());



        System.out.println("\n- - - Palindromes - - -");

        int num1 = 9;
        int num2 = 101;
        int num3 = 1234321;
        int num4 = 930;
        int num5 = 75193;

        System.out.println(checkPalindrome(num1));
        System.out.println(checkPalindrome(num2));
        System.out.println(checkPalindrome(num3));
        System.out.println(checkPalindrome(num4));
        System.out.println(checkPalindrome(num5));



        System.out.println("\n- - - Test Prep - - -");

        // Regex:
        // *    = Matches zero or more occurrences.
        // +    = Matches one or more occurrences.
        // ?    = Matches zero or one occurrence.
        // {m}  = Matches exactly m times.
        // {m,n}= Matches min m and max of n.
        //
        // () = group expressions to form sub-expressions
        // |  = "or"     cat|dog
        //
        //  [abc]	Find one character from the options between the brackets
        //  [^abc]	Find one character NOT between the brackets
        //  [0-9]	Find one character from the range 0 to 9

        // DBMS Order of Operations:
        // FROM WHERE GROUPBY HAVING SELECT DISTINCT UNION ORDERBY LIMIT

        // Instance variable = has "new" keyword
        // Reference variable = has "=" operator

        // Association = "Uses-A", uni-directional
        // Aggregation = "Has-A" relationship, Class has another class as a member (type of association)
        // Composition = "Part-of" relationship, Both classes need each other Car&Engine (type of association)
        // Inheritance = "Is-A" relationship, Child and Parent classes, class extends
        // Encapsulation = Using getters and setters to access data within a class


        // Data Types:
        // double > long > int > short
        boolean b = true;            // (1 bit)
        byte by = 10;                // (8 bits)
        char c = 'C';                // (16 bits)
        short s = 10;                // (16 bits)
        int x = 1000;                // (32 bits)
        long l = 1000000L;           // (64 bits)
        float f = 23.5f;             // (32 bits)
        double d = 32.5;             // (64 bits)


        // Comparing Strings and String Literals
        String strW = "warner";
        String strLW = new String("warner");
        System.out.println(strW == strLW);                // false
        System.out.println(strW.equals(strLW));           // true



        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new String("A"));
        linkedHashSet.add(new String("B"));
        linkedHashSet.add(new String("C"));
        linkedHashSet.add(new String("C"));
        linkedHashSet.add(null);
        linkedHashSet.add(new String("D"));
        linkedHashSet.add(new String("B"));

        Object[] elements3 = linkedHashSet.toArray();
        for(Object ele : elements3){
            System.out.println(ele);
        }


        Map<String, Integer> stringmap = new HashMap<String, Integer>();
        stringmap.put("Stocks", 480);
        stringmap.replace("stocks", 480);           // Does nothing
        System.out.println(stringmap);


        System.out.println("\n- - - Scanners - - -");

//        Scanner input = new Scanner(System.in);
//        double num12 = input.nextDouble();
//        String a = input.nextLine();
//        String b = input.next();
//        int inputInt = input.nextInt();
//
//        while(input.hasNext()){
//            array.add(Integer.valueOf(input.next()));
//        }



        System.out.println("\n- - - Test Re-Created - - -");

        // Both
        //String = input s.next;
        //array of strings;
        //array of ints;

        // #1 unique pairs of sums

        //array from StdIn;
        //add digits to get sum;
        //add sums to array;
        //count how many unique pairs of sums there are;
        //if none return -1;


        // #2  sums close as possible

        // number of items cant be more than 1 apart
        //
        // put nums from array





        /// ------- PROBLEM START ------- ///

        //Scanner input = new Scanner(System.in);
        //String string0 = input.nextLine();
        String string1 = "1,54,78,1221,81";

        List<Integer> intArray = new ArrayList();              // Create Int Array

        String[] strValues = string1.split(",");
        for(String val : strValues){
            //System.out.println(val);
            intArray.add(Integer.parseInt(val));
        }
        System.out.println(Arrays.toString(strValues));
        int intArraySize = intArray.size();

        System.out.println(intArray);
        //System.out.println(intArraySize);

        /// ------- ------------ ------- ///

    }


    private static boolean checkPalindrome(int number){
        int numCopy = number;
        int newNum = 0;
        String  newNumStr = "";

        if(numCopy < 9)
            return true;        // Single digits are palindromes

        while(numCopy > 0){
            newNumStr += String.valueOf(numCopy % 10);
            numCopy = numCopy / 10;
        }

        newNum = Integer.parseInt(newNumStr);       // Convert Str to Int
        return newNum == number;                    // Check if Palindrome
    }


    private static boolean checkPalindrome(String str) {
        return true;
    }




}

//////////// DATABASE ////////////

/*
From -> Join -> Where -> Group By -> Having -> Select -> Distinct -> Order By
 */


//////////// DATA STRUCTURES ////////////

/*
Collection - Root of collection hierarchy (Queue, Dequeue, List, and Sets, but NOT Maps or LinkedLists)
Sets - No Duplicates / Allows one null value
List - Ordered / Allows n number of null values
Queue - Queue & Dequeue

Map - Key & Value
 */


///   - - - - - Arrays - - - - -   ///
/*
    Inserting into an array = All values shift right (possible kicking the last value out)
    Deleting elements in array = All values shift left
    Limitations:
        Arrays are a set size and are immutable (cant change size)
        Can only contain one type
        Inserts and Deletes are expensive

        char arr[]=new char[6];
		arr[0]='A';
        int size = arr.length;
 */


///   - - - - - Linked Lists - - - - -   ///
/*
    Inserting into a LL = Creating a new node, find the node before and adjusting the pointers
    Deleting elements from LL = Find node to delete, adjust previous to point to next
    Displaying = Create a temp node and while not null, print temp data and update
    Limitations:
        Slightly more confusing than arrays
        Elements can only be accessed sequentially
    Advantages:
        Can contain variable number of elements
        Size does not need to be specified during declaration

    public class Node {
	    String data;
	    Node next;
    }

    public class LinkedList {
	    Node head;
	    Node tail;
    }

    Common code:
    if (this.head == null)
	    this.head = this.tail = node;
	else {
	...
	}

 */


///   - - - - - Stack - - - - -   ///
/*
    LIFO = Last In First Out
    Inserting into Stack = "Push" adds an element to the top (Must check if stack is full)
    Deleting from Stack = "Pop" removes the top element (Must check if stack is empty)
    Display = "Display" shows all the elements
                "Peek" returns the top most element

    Stack stack = new Stack(10);
        stack.push(15);
        stack.push(25);
        stack.pop();
        stack.push(10);
        stack.display();
 */


///   - - - - - Queue - - - - -   ///
/*
    FIFO = First In First Out
    Inserting into Stack = "En-queue" adds an element at the end, increases rear         (Must check if stack is full)
    Deleting from Stack = "De-queue" removes an element from the front, increases front   (Must check if stack is empty)
    Display = "Display" shows all the elements

    Queue queue = new Queue(5);
    queue.enqueue("Mia");
    queue.enqueue("Eva");
    queue.enqueue("Luke");
    queue.display();

    For implementation look at ArrayDeque
 */


///   - - - - - ArrayList - - - - -   ///
/*
    Inserting into ArrayList = "add()" allows you to add items
    Deleting from ArrayList = "remove()" removes items from specified index
    Updating in ArrayList = "set()" set an index to specific value
    Display = Print out the arrayList with System.out.println()

    List<String> food = new ArrayList<String>(); // Creating a list of String elements
    food.add("Burger");
    food.add("Pasta");
    food.set(1, "Pizza");       // Modifying the element at a specified index
    food.contains("Pasta");     // Checking whether the element is present or not
    food.remove(2);             // Removing the element from the second index position
    System.out.println("Food items: " + food);

 */


///   - - - - - LinkedList - - - - -   ///
/*
    Inserting into LinkedList = "add()" allows you to add items
    Deleting from LinkedList = "remove()" removes items from specified index
    Updating in ArrayList = "set()" set an index to specific value
    Display = Print out the LinkedList with System.out.println()

    List<String> cities = new LinkedList<String>();
    cities.add("Munich");
	cities.add("Vienna");
    cities.add(3, "Prague");                        // Inserting elements at Index
	System.out.println(cities);                     // Displaying elements
    cities.remove("Munich");                        // Removing elements        (needs param)
    cities.set(2, "Berlin");                        // Replacing element
    System.out.println(cities.indexOf("Berlin"));   // Find index of specified object
    System.out.println(cities.size());              // Displaying size
    System.out.println(cities.contains("Paris"));       // Checking if an element is present
    cities.clear();

    Iterator<Object> it = cities.descendingIterator();
 */


///   - - - - - Sets (HashSets / LinkedHashSets / TreeSets) - - - - -   ///
/*
    * No Duplicates Saved *
    Inserting into Set = "add()"    Adding elements to the HashSet, duplicates wont be added
    Deleting from Set = "remove()"  Removes specified objects
    Display = Print out the Set with System.out.println()
    Extra:
        HashSets = No Order
        LinkedHashSets = Order (Based on Insertions)
        TreeSets = Order (Based on Natural Ordering [Alphabetical/Ascending/etc])

    Set<String> uniqueItems = new HashSet<String>();        // Creating HashSet object
    Set<String> uniqueItems = new LinkedHashSet<String>();  // Creating LinkedHashSet object
    Set<String> uniqueItems = new TreeSet<String>();        // Creating a TreeSet object

    HashSet Functions:
    .add(Object)
    .remove(Object)
    .contains(Object)
    .size()
    .isEmpty()
    .iterator()

    * To Override the Unique aspect of sets *
    @Override
	public int hashCode() {
		return emailId.hashCode();
	}
 */


///   - - - - - HashMap - - - - -   ///
/*
    Map<Key,Value>      (Does not extend Collection interface)
    Inserting into HashMap = "put()" inserts pairs
    Deleting from HashMap = "remove()" removes pairs and returns value
    Display = Print out the HashMap with System.out.println()
    * Is Not Ordered *

    Map<String, Integer> books = new HashMap<String, Integer>();        // Create a Map

    put(key, value)             // inserts pair into map, or updates value if key exists
    remove(key)                 // deletes pair, returns value being deleted
    get(key)                    // returns value for key
    replace(K key, V old, V new)       // replaces old value with new, if no old value, does nothing
    clear()                     // removes all pairs
    size()                      // returns int for key-value pairs
    isEmpty()                   // returns bool

    for(Map.Entry<String, Integer> book:books.entrySet())
        System.out.println(book.getKey() +", "+ book.getValue());

 */


///   - - - - - ArrayDeque - - - - -   ///
/*
                    If Failed:
    Throws Exception           Returns Null
        add()                     offer()         (returns false)
        remove()                  poll()
        element()                 peek()

    Deque<String> queue = new ArrayDeque<String>();	        // no restrictions in capacity
    queue.add("Eva");
	queue.add("Mia");                   // Adds elements to end of queue
	queue.add("Luke");
    queue.remove();                     // removes from front
    queue.poll();                       // removes from the front
    System.out.println(queue.peek());   // Shows head of the Queue
    queue.clear();                      // Clears the Queue

    .push(obj)          // adds to the front
    .pop()              // removes from the front
    .peek()             // Shows item in front
    .size()             // gets size
 */




//////////// ALGORITHMS ////////////

/*
    Time Complexity
        Big Theta - Average
        Big Oh - Upper bound
        Big Omega - Lower bound

    for(i++)        = O(n)
    for(i*=2)       = O(logn)
    for(for(i++))   = O(n^2)
    for(for(i/=2))  = O(nlogn)

    Space Complexity
    Scalability
 */


/*
    /// Searching Algorithms: ///

    Linear Search   -   O(n)
Search through every element of the array

    Binary Search   -   O(log2(n)) - Divide and Conquer
Sort in Asc order and split in half to check

EX:
    public static int searchCustomerId(int array[], int elementToFind) {
		int high = array.length - 1;
		int low = 0;
		int mid = (low + high)/2;

		while (low <= high) {
            mid = (low + high)/2;

            //Checking if the element is present in the mid position
            if (array[mid] == elementToFind)
                return mid;

            // If the element is greater than the element in the mid position,
            // low is updated
            if (array[mid] < elementToFind)
            	low = mid+1;

            // Else high is updated
            else
            	high = mid - 1;
        }

        //-1 is being returned when the element is not present in the array
        return -1;
	}


 */


/*
    /// Sorting Algorithms: ///

     1) Bubble Sort   -   O(n^2)    -   Iteration

Compare each element with its adjacent and swap if necessary - requires multiple passes
EX:
	public static void swap(int[] elements, int firstIndex, int secondIndex) {
		int temp = elements[firstIndex];
		elements[firstIndex] =  elements[secondIndex];
		elements[secondIndex] = temp;
		noOfSwaps++;
	}

	public static int bubbleSort(int[] elements) {
		boolean swaped = false;
		for(int i=0; i<elements.length-1; i++){
		    noOfPasses++;
		    swaped = false;
		    for(int j=0; j<elements.length-1; j++){
		        if(elements[j] > elements[j+1]){
		            swap(elements, j, j+1);
		            swaped = true;
		        }
		    }
		    if(!swaped)
		    noOfPasses--;
		}
		return noOfPasses + 1;
	}


    2) Merge Sort   -   O(nlogn) -   Recursion - Divide and Conquer

Break the array into smaller arrays and combine in order - One Pass - Space Inefficient
Collections.sort() uses Merge Sort
EX:
	public static void mergeSort(int[] elements, int size) {
		if(size < 2)
		    return;

		int middle = size/2;
		int[] left = new int[middle];
		int[] right = new int[size - middle];

		for(int i=0; i<middle; i++){
		    left[i] = elements[i];
		}
		for(int i=middle; i<size; i++){
		    right[i-middle] = elements[i];
		}

		mergeSort(left, middle);
		mergeSort(right, size-middle);

		merge(elements, left, right, middle, size-middle);
	}

	public static void merge(int[] elements, int left[], int right[], int leftMerge, int rightMerge) {
	    int firstIndex = 0; //initial index of first sub-array
        int secondIndex = 0; //initial index of second sub-array
        int thirdIndex = 0; //initial index of merged sub-array

        while (firstIndex < leftMerge && secondIndex < rightMerge) {
            if (left[firstIndex] <= right[secondIndex])
                elements[thirdIndex++] = left[firstIndex++];
            else
                elements[thirdIndex++] = right[secondIndex++];
        }

        while (firstIndex < leftMerge)
            elements[thirdIndex++] = left[firstIndex++];

        while (secondIndex < rightMerge)
            elements[thirdIndex++] = right[secondIndex++];
	}
 */


    //////////// DS & ALGO SUMMARY ////////////
/*
    Data Structure            Time Complexity             Space Complexity
                       Access  Search  Insert  Delete
       Array       -    O(1)    O(n)    O(n)    O(n)            O(n)
       LinkedList  -    O(n)    O(n)    O(1)    O(1)            O(n)
       Stack       -    O(n)    O(n)    O(1)    O(1)            O(n)
       Queue       -    O(n)    O(n)    O(1)    O(1)            O(n)


        Algorithm     Time Complexity   Space Complexity
    Linear Search   -    O(n)       -       O(1)
    Binary Search   -   O(logn)     -       O(1)
    Bubble Sort     -   O(n^2)      -       O(1)
    Merge Sort      -   O(nlogn)    -       O(n)
 */