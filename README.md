
# Java Collections Interview Questions
# 1) What is the Collection framework in Java?
Collection Framework is a combination of classes and interface, which is used to store and manipulate the data in the form of objects. It provides various classes such as ArrayList, Vector, Stack, and HashSet, etc. and interfaces such as List, Queue, Set, etc. for this purpose.
# What are the main differences between array and collection?
Array and Collection are somewhat similar regarding storing the references of objects and manipulating the data, but they differ in many ways. The main differences between the array and Collection are defined below:
1)Arrays are always of fixed size, i.e., a user can not increase or decrease the length of the array according to their requirement or at runtime, but In Collection, size can be changed dynamically as per need.
2)Arrays can only store homogeneous or similar type objects, but in Collection, heterogeneous objects can be stored.
3)Arrays cannot provide the ?ready-made? methods for user requirements as sorting, searching, etc. but Collection includes readymade methods to use.
# 3) Explain various interfaces used in Collection framework?
Collection framework implements various interfaces, Collection interface and Map interface (java.util.Map) are the mainly used interfaces of Java Collection Framework. List of interfaces of Collection Framework is given below:

1. Collection interface: Collection (java.util.Collection) is the primary interface, and every collection must implement this interface.
Syntax:
public interface Collection<E>extends Iterable  
Where <E> represents that this interface is of Generic type

2. List interface: List interface extends the Collection interface, and it is an ordered collection of objects. It contains duplicate elements. It also allows random access of elements.
Syntax:
public interface List<E> extends Collection<E>  
3. Set interface: Set (java.util.Set) interface is a collection which cannot contain duplicate elements. It can only include inherited methods of Collection interface
Syntax:
public interface Set<E> extends Collection<E>  
Queue interface: Queue (java.util.Queue) interface defines queue data structure, which stores the elements in the form FIFO (first in first out).
Syntax:
public interface Queue<E> extends Collection<E>  
4. Dequeue interface: it is a double-ended-queue. It allows the insertion and removal of elements from both ends. It implants the properties of both Stack and queue so it can perform LIFO (Last in first out) stack and FIFO (first in first out) queue, operations.
Syntax:
public interface Dequeue<E> extends Queue<E>  
5. Map interface: A Map (java.util.Map) represents a key, value pair storage of elements. Map interface does not implement the Collection interface. It can only contain a unique key but can have duplicate elements. There are two interfaces which implement Map in java that are Map interface and Sorted Map.
# What is the difference between ArrayList and Vector?
No.	ArrayList	                                                  Vector
1)	ArrayList is not synchronized.	                         Vector is synchronized.
2)	ArrayList is not a legacy class.	                       Vector is a legacy class.
3)	ArrayList increases its size by cc*3/2of the array size.	Vector increases its size by doubling the array size.
4)	ArrayList is not ?thread-safe? as it is not synchronized.	Vector list is ?thread-safe? as it?s every method is synchronized.
  5) Multithread                                          single thread
6) present jdk 1.2                                    present jdk 1.0
7) three overloaded constructor                     four overloaded constructor
-ArrayList()                                        -vector()
-ArrayList(int index)                               -vector(int initial Capcity)
-ArrayList(collection col)                      -vector(int initialCapcity,int incrementalCapcity)
                                                  -vector (collection col)
  # What is the difference between ArrayList and LinkedList?
No.	ArrayList	                                                    LinkedList
  1) data store in the form of Array                              data store in the form of node
  2)shift operation involved                                        No shift operation invovled
  3)initial and incremental capacity is applicable                 Not applicable
  4)good for search                                                 good for insertion and removal of data
  5) 3 overloaded constructor                                        2 overloaed contructor
 #  What is the difference between Iterator and ListIterator?
Iterator traverses the elements in the forward direction only whereas ListIterator traverses the elements into forward and backward direction.

No.	Iterator	                                                                 ListIterator
1)	The Iterator traverses the elements in the forward direction only.	ListIterator traverses the elements in backward and                                                                         forward directions both.
2)	The Iterator can be used in List, Set, and Queue.	ListIterator can be used in List only.
3)	The Iterator can only perform remove operation while traversing the collection.	ListIterator can perform ?add,? ?remove,?                                                                     and ?set? operation while traversing the collection.
# What is the difference between Iterator and Enumeration?
No.	Iterator	                                                          Enumeration
1)	The Iterator can traverse legacy and non-legacy elements.	Enumeration can traverse only legacy elements.
2)	The Iterator is fail-fast.	                              Enumeration is not fail-fast.
3)	The Iterator is slower than Enumeration.	                Enumeration is faster than Iterator.
4)	The Iterator can perform remove operation while traversing the collection.	The Enumeration can perform only traverse                                                                                  operation on the collection.
# What is the difference between List and Set?
The List and Set both extend the collection interface. However, there are some differences between the both which are listed below.

The List can contain duplicate elements whereas Set includes unique items.
The List is an ordered collection which maintains the insertion order whereas Set is an unordered collection which does not preserve the insertion order.
The List interface contains a single legacy class which is Vector class whereas Set interface does not have any legacy class.
The List interface can allow n number of null values whereas Set interface only allows a single null value.
# What is the difference between HashSet and TreeSet?
The HashSet and TreeSet, both classes, implement Set interface. The differences between the both are listed below.

HashSet maintains no order whereas TreeSet maintains ascending order.
HashSet impended by hash table whereas TreeSet implemented by a Tree structure.
HashSet performs faster than TreeSet.
HashSet is backed by HashMap whereas TreeSet is backed by TreeMap.
# What is the difference between Set and Map?
The differences between the Set and Map are given below.

Set contains values only whereas Map contains key and values both.
Set contains unique values whereas Map can contain unique Keys with duplicate values.
Set holds a single number of null value whereas Map can include a single null key with n number of null values.
# What is the difference between Collection and Collections?
The differences between the Collection and Collections are given below.

The Collection is an interface whereas Collections is a class.
The Collection interface provides the standard functionality of data structure to List, Set, and Queue. However, Collections class is to sort and synchronize the collection elements.
The Collection interface provides the methods that can be used for data structure whereas Collections class provides the static methods which can be used for various operation on a collection.
# What is the difference between Comparable and Comparator?
No.         	Comparable	                                                Comparator
1)	Comparable provides only one sort of sequence.	The Comparator provides multiple sorts of sequences.
2)	It provides one method named compareTo().	It provides one method named compare().
3)	It is found in java.lang package.	It is located in java.util package.
4)	If we implement the Comparable interface, The actual class is modified.	The actual class is not changed.
# What do you understand by BlockingQueue?
BlockingQueue is an interface which extends the Queue interface. It provides concurrency in the operations like retrieval, insertion, deletion. While retrieval of any element, it waits for the queue to be non-empty. While storing the elements, it waits for the available space. BlockingQueue cannot contain null elements, and implementation of BlockingQueue is thread-safe.
# What does the hashCode() method?
The hashCode() method returns a hash code value (an integer number).

The hashCode() method returns the same integer number if two keys (by calling equals() method) are identical.

However, it is possible that two hash code numbers can have different or the same keys.

If two objects do not produce an equal result by using the equals() method, then the hashcode() method will provide the different integer result for both the objects.
# What is hash-collision in Hashtable and how it is handled in Java?
Two different keys with the same hash value are known as hash-collision. Two separate entries will be kept in a single hash bucket to avoid the collision. There are two ways to avoid hash-collision.
1)Separate Chaining
2)Open Addressing
# What is the Dictionary class?
The Dictionary class provides the capability to store key-value pairs.

# What is the default size of load factor in hashing based collection?
The default size of load factor is 0.75. The default capacity is computed as initial capacity * load factor. For example, 16 * 0.75 = 12. So, 12 is the default capacity of Map.

# What do you understand by fail-fast?
The Iterator in java which immediately throws ConcurrentmodificationException, if any structural modification occurs in, is called as a Fail-fast iterator. Fail-fats iterator does not require any extra space in memory.
# What is the difference between the length of an Array and size of ArrayList?
The length of an array can be obtained using the property of length whereas ArrayList does not support length property, but we can use size() method to get the number of objects in the list.

Finding the length of the array

Int [] array = new int[4];  
System.out.println("The size of the array is " + array.length);  
          
Finding the size of the ArrayList

ArrayList<String> list=new ArrayList<String>();    
list.add("ankit");    
list.add("nippun");  
System.out.println(list.size());  
# How to convert ArrayList to Array and Array to ArrayList?
We can convert an Array to ArrayList by using the asList() method of Arrays class. asList() method is the static method of Arrays class and accepts the List object. Consider the following syntax:

Arrays.asList(item)  
We can convert an ArrayList to Array using toArray() method of the ArrayList class. Consider the following syntax to convert the ArrayList to the List object.
# HashMap doesn’t maintain any order.
# TreeMap sort the entries in ascending order of keys.
# LinkedHashMap maintains the insertion order.


List_object.toArray(new String[List_object.size()])  
















  
