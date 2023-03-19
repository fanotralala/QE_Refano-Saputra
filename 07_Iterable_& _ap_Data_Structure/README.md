# Basic Data Structures

## **Iterable**
* Urutan string dan angka pada tipe data yang ada (list, tuple, dictionary, set, dan lain-lain) Key [opsional] berfungsi sebagai kunci perbandingan untuk menentukan urutan.
    ```
    List<String> list = new ArrayList><();

    list.add("one");
    list.add("two");
    list.add("three");

    for( String element : list ){
        System.out.println( element.toString() );
    }
    ```

## **Collection**
* **Collection** sendiri merupakan wadah yang menampung value pada kontainer tunggal.
    ```
    // The Collections framework is defined in the java.util package
    import java.util.ArrayList;

    class Main {
        public static void main(String[] args){
            ArrayList<String> animals = new ArrayList<>();
            // Add elements
            animals.add("Dog");
            animals.add("Cat");
            animals.add("Horse");

            System.out.println("ArrayList: " + animals);
        }
    }

    ```

### List
* **List** adalah jenis array yang membolehkan adanya value duplicate atau nilai yang sama dalam index yang berbeda.
    ```
    import java.util.List;
    import java.util.ArrayList;

    class Main {

        public static void main(String[] args) {
            // Creating list using the ArrayList class
            List<Integer> numbers = new ArrayList<>();

            // Add elements to the list
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            System.out.println("List: " + numbers);

            // Access element from the list
            int number = numbers.get(2);
            System.out.println("Accessed Element: " + number);

            // Remove element from the list
            int removedNumber = numbers.remove(1);
            System.out.println("Removed Element: " + removedNumber);
        }
    }

    ```

### Array List
* Collection yang menjadi bagian dari Java Util. Seperti biasa, **ArrayList** dapat menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal.
    ```
    import java.util.ArrayList;

    class Main {
    public static void main(String[] args){

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);
        }
    }
    ```

### Linked List
* sekumpulan elemen bertipe sama, yang mempunyai keterurutan tertentu, yang setiap elemennya terdiri dari dua bagian.
    ```
    import java.util.LinkedList;

    class Main {
    public static void main(String[] args){

        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);
    }
    }
    ```

### Immutable List
    ```
    import java.util.List;
    public class ListOf1 {
    public static void main(String[] args) {
        List<String> imtList = List.of("AA", "BB", "CC");
        imtList.forEach(s -> System.out.println(s));
    }
    } 
    ```

## **Set **
* **Set** adalah jenis array yang tidak membolehkan adanya value duplicate, saat ada insert value yang sudah ada sebelumnya, maka value itu akan terotomatisasi dibuang salah satunya dan akhirnya value tersebut hanya tetap ada satu saja
    ```
    import java.util.*;
    
    // Main class 
    public class GFG {
        
        // Main driver method
        public static void main(String[] args)
        {
            // Demonstrating Set using HashSet
            // Declaring object of type String 
            Set<String> hash_Set = new HashSet<String>();
    
            // Adding elements to the Set
            // using add() method
            hash_Set.add("Geeks");
            hash_Set.add("For");
            hash_Set.add("Geeks");
            hash_Set.add("Example");
            hash_Set.add("Set");
    
            // Printing elements of HashSet object
            System.out.println(hash_Set);
        }
    }
    ```

### Hash Set
* Class yang sering digunakan untuk menyimpan collection yang bebas duplikasi.
    ```
    import java.util.HashSet;

    public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
    }
    ```

### LinkedHashSet
* **LinkedHashSet** menggunakan double linked list di semua elemen. **LinkedHashSet** berbeda dengan HashSet ketika kita peduli terhadap urutan iterasi.
    ```
    import java.util.*;  
    class LinkedHashSet1{  
    public static void main(String args[]){  
    //Creating HashSet and adding elements  
            LinkedHashSet<String> set=new LinkedHashSet();  
                set.add("One");    
                set.add("Two");    
                set.add("Three");   
                set.add("Four");  
                set.add("Five");  
                Iterator<String> i=set.iterator();  
                while(i.hasNext())  
                {  
                System.out.println(i.next());  
                }  
    }  
    }  
    ```

### Immutable Set
* Secara umum, objek yang tidak dapat diubah tidak akan mengubah keadaan internalnya begitu kita membuatnya. Ini membuatnya aman untuk thread secara default. Logika yang sama berlaku untuk **Immutable set**
    ```
    import java.util.*;
    import com.google.common.collect.ImmutableSet;
    import java.io.*;
    
    class GfG
    {
        public static void main(String args[])
        {
            // creating empty set
            Set<String> s = new HashSet<String>();
            s.add("GeeksforGeeks");
            s.add("Practice");
            
            // An immutable copy of s
            Set<String> is  = ImmutableSet.copyOf(s);
                
            System.out.println(is);
        }
    }
    ```

## SortedSet
* Sebuah Set yang selanjutnya memberikan pemesanan total pada elemen-elemennya. Elemen diurutkan menggunakan urutan alaminya, atau oleh Pembanding yang biasanya disediakan pada waktu pembuatan **sorted set**.
    ```
    import java.util.*;
    
    class SortedSetExample{
    
        public static void main(String[] args)
        {
            SortedSet<String> ts
                = new TreeSet<String>();
    
            // Adding elements into the TreeSet
            // using add()
            ts.add("India");
            ts.add("Australia");
            ts.add("South Africa");
    
            // Adding the duplicate
            // element
            ts.add("India");
    
            // Displaying the TreeSet
            System.out.println(ts);
    
            // Removing items from TreeSet
            // using remove()
            ts.remove("Australia");
            System.out.println("Set after removing "
                            + "Australia:" + ts);
    
            // Iterating over Tree set items
            System.out.println("Iterating over set:");
            Iterator<String> i = ts.iterator();
            while (i.hasNext())
                System.out.println(i.next());
        }
    }
    ```

### TreeSet
*  Class yang sering digunakan untuk mengekstrak elemen dari collection dalam urutan tertentu.
    ```
    import java.util.*;  
    class TreeSet1{  
    public static void main(String args[]){  
    //Creating and adding elements  
    TreeSet<String> al=new TreeSet<String>();  
    al.add("Ravi");  
    al.add("Vijay");  
    al.add("Ravi");  
    al.add("Ajay");  
    //Traversing elements  
    Iterator<String> itr=al.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    }  
    }  
    ```

### NavigableSet
* **NavigableSet** mewakili set yang dapat dinavigasi dalam Java Collection Framework. Antarmuka NavigableSet mewarisi dari antarmuka SortedSet.
    ```
    import java.util.*;
    import java.io.*;
    
    class NavigableSetDemo {
    
        public static void main(String[] args)
        {
            NavigableSet<String> ts = new TreeSet<String>();
    
            // Elements are added using add() method
            ts.add("A");
            ts.add("B");
            ts.add("C");
            ts.add("A");
    
            System.out.println(ts);
        }
    }
    ```

## **Queue**
* Kumpulan data yang penambahan elemennya hanya bisa dilakukan pada sisi belakang dan penghapusannya hanya bisa dilakukan pada sisi depan.
    ```
    import java.util.*;
    
    public class GFG {
    
        public static void main(String args[])
        {
            Queue<String> pq = new PriorityQueue<>();
    
            pq.add("Geeks");
            pq.add("For");
            pq.add("Geeks");
    
            System.out.println(pq);
        }
    }
    ```

## **Deque** 
* **Deque** adalah antrian dimana elemennya bisa masuk dan keluar lewat kedua ujungnya (berbeda dengan queue yang hany bisa masuk lewat ujung belakang dan keluar lewat ujung depan).
    ```
    import java.util.*;
    public class ArrayDequeDemo {
        public static void main(String[] args)
        {
            // Initializing an deque
            Deque<String> dq
                = new ArrayDeque<String>();
    
            // add() method to insert
            dq.add("For");
            dq.addFirst("Geeks");
            dq.addLast("Geeks");
    
            System.out.println(dq);
        }
    }
    ```

## **Stack** 
* Jadi tumpukan adalah sebuah koleksi objek yang menerapkan konsep LIFO (Last In First Out).
    ```
    import java.io.*;
    import java.util.*;
    
    class StackDemo {
    
        // Main Method
        public static void main(String[] args)
        {
    
            // Default initialization of Stack
            Stack stack1 = new Stack();
    
            // Initialization of Stack
            // using Generics
            Stack<String> stack2 = new Stack<String>();
    
            // pushing the elements
            stack1.push("4");
            stack1.push("All");
            stack1.push("Geeks");
    
            stack2.push("Geeks");
            stack2.push("For");
            stack2.push("Geeks");
    
            // Printing the Stack Elements
            System.out.println(stack1);
            System.out.println(stack2);
        }
    }
    ```

## **Map**

### HashMap
* Class yang berisi sekumpulan pasangan nilai (value) dan kunci (key).
    ```
    import java.util.HashMap;

    public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
    }
    ```

### WeakHashMap
* **WeakHashMap** adalah implementasi antarmuka Peta berbasis hashtable, dengan kunci yang bertipe WeakReference.
    ```
    import java.util.WeakHashMap;

    class Main {
        public static void main(String[] args) {
            // Creating WeakHashMap of numbers
            WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

            String two = new String("Two");
            Integer twoValue = 2;
            String four = new String("Four");
            Integer fourValue = 4;

            // Inserting elements
            numbers.put(two, twoValue);
            numbers.put(four, fourValue);
            System.out.println("WeakHashMap: " + numbers);

            // Make the reference null
            two = null;

            // Perform garbage collection
            System.gc();

            System.out.println("WeakHashMap after garbage collection: " + numbers);
        }
    }

    ```

### IdentityHashMap
* Kelas ini mengimplementasikan antarmuka Peta. Antarmuka Peta mengamanatkan penggunaan metode equals() pada perbandingan kunci. Namun, kelas IdentityHashMap melanggar kontrak itu. Sebaliknya, ia menggunakan persamaan referensi (==) pada operasi pencarian utama
    ```
    import java.util.IdentityHashMap;
    
    public class Example {
        public static void main(String[] args) {
            IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
            identityHashMap.put("A", 1);
            identityHashMap.put(new String("A"), 2);
            System.out.println(identityHashMap.size()); // 2
            System.out.println(identityHashMap.get("A")); // 1
        }
    }
    ```

### LinkedHashMap
* **LinkedHashMap** adalah kombinasi dari HashTable dan LinkedList.
    ```
    import java.util.*;
    
    // Main class
    // AddElementsToLinkedHashMap
    class GFG {
    
        // Main driver method
        public static void main(String args[])
        {
    
            // Initialization of a LinkedHashMap
            // using Generics
            LinkedHashMap<Integer, String> hm1
                = new LinkedHashMap<Integer, String>();
    
            // Add mappings to Map
            // using put() method
            hm1.put(3, "Geeks");
            hm1.put(2, "For");
            hm1.put(1, "Geeks");
    
            // Printing mappings to the console
            System.out.println("Mappings of LinkedHashMap : "
                            + hm1);
        }
    }
    ```

### ImmutableMap
* Guava menyediakan versi yang tidak dapat diubah dari setiap java.util.Map menggunakan ImmutableMap. Itu melempar UnsupportedOperationException setiap kali kami mencoba memodifikasinya.
```
import java.util.*;
import com.google.common.collect.ImmutableMap;
 
class GfG {
    public static void main(String args[])
    {
        // non-empty immutable set
        ImmutableMap<Integer, String> imap =
                         ImmutableMap.<Integer, String>builder()
                                                 .put(1, "Geeks")
                                                 .put(2, "For")
                                                 .put(3, "Geeks")
                                                 .build();
 
        // Let's print the set
        System.out.println(imap);
    }
}
```

## **Sorted Map**

### Sorted Map
* Antarmuka **SortedMap** adalah subantarmuka dari antarmuka java.util.Map di Jawa.
    ```
    import java.io.*;
    import java.util.*;
    class GFG {
    
        // Main Method
        public static void main(String args[])
        {
            // Default Initialization of a
            // SortedMap
            SortedMap tm1 = new TreeMap();
    
            // Initialization of a SortedMap
            // using Generics
            SortedMap<Integer, String> tm2
                = new TreeMap<Integer, String>();
    
            // Inserting the Elements
            tm1.put(3, "Geeks");
            tm1.put(2, "For");
            tm1.put(1, "Geeks");
    
            tm2.put(new Integer(3), "Geeks");
            tm2.put(new Integer(2), "For");
            tm2.put(new Integer(1), "Geeks");
    
            System.out.println(tm1);
            System.out.println(tm2);
        }
    }
    ```

### Navigable Map
* Antarmuka Java **NavigableMap**, java.util.NavigableMap, adalah sub-antarmuka dari Antarmuka Java SortedMap.
```
import java.util.*;
 
class AddingElementsExample {
    public static void main(String args[])
    {
 
        // Instantiate an object
        // Since NavigableMap is an interface
        // We use TreeMap
        NavigableMap<Integer, String> nmap
            = new TreeMap<Integer, String>();
 
        // Add elements using put()
        nmap.put(3, "Geeks");
        nmap.put(2, "For");
        nmap.put(1, "Geeks");
 
        // Print the contents on the console
        System.out.println("Mappings of NavigableMap : "
                           + nmap);
    }
}
```

## **Sorting**
* Proses menyusun kembali data yang sebelumnya telah disusun dengan suatu pola tertentu, sehingga tersusun secara teratur menurut aturan tertentu.
    ```
    import java.util.Arrays;
    import java.util.Collections;
    
    public class GFG {
        public static void main(String[] args)
        {
            // Note that we have Integer here instead of
            // int[] as Collections.reverseOrder doesn't
            // work for primitive types.
            Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
    
            // Sorts arr[] in descending order
            Arrays.sort(arr, Collections.reverseOrder());
    
            System.out.printf("Modified arr[] : %s",
                            Arrays.toString(arr));
        }
    }
    ```

## Referensi

- <https://www.geeksforgeeks.org/>
- <https://www.javatpoint.com/>
- <https://www.programiz.com/>