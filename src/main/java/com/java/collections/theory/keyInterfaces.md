# Key Interfaces in Collection Framework


    Interfaces will always provide more info compared to classes -- classes are just dummy implementations of Interface. Always look for Interface definition!

# 9 key Interfaces in Collection framework

**1. Collection**

    When you want to represent group of objects into single entity use this interface
    most common methods used in all other collection interfaces --> add, remove, search and check if empty collection or not etc

    this can be considered as root interface of collection framework

    collection vs collections?

    Collections is utility class present in java.util.package to define several utility methods like sorting, searching etc on Collection Objects

**2. List**

    When duplicate elements allowed & insertion order is important go for List interface

    Collection [parent interface] --> List [child interface] --> implemented classes for List interface are:

    1. Array List
    2. Linked List
    3. Vector [parent utility class] --> 4. stack [child class]


**3. Set**

    When we don't need duplicate and insertion order is not required -- go for Set interface
    Collection [parent interface] --> Set [child interface] --> implemented classes for Set interface are:

    1. HashSet [parent class] --> 2. linkedHashSet [child class]

**4. SortedSet**

    When duplicates are not required but elements should be sorted in some order
    Set [parent interface] --> SortedSet [child interface]

**5. Navigable Set**
   
    SortedSet [parent interface] --> NavigableSet [child interface] and TreeSet is its implemented class
    when position of elements is required


**6. Queue**

    if you want to collect and group objects prior to processing then go for Queue

    collection --> queue --> priority queue & blocking queue

**7. Map**

    when you want to represent group of objects as key & value pairs then all above Interfaces can't be used and you should go for Map

    Collection Interface talks about individual objects ---> Hence Collection Interface is not parent/root interface for Map interface
    Keys can't be duplicates

    Implementation classes!

    1. HashMap  2. linkedHashMap
    3. WeakHashMap
    4. IdentityHashMap
    5. HashTable 6. properties  ---> Legacy classes

**8. SortedMap**

    Based on some sorting order on keys -- child of Map [I]

**9. Navigable Map**

    When position of Keys matters -- its implemented class is TreeMap


* Sorting --> SortedSet or sortedMap
* When 
  1. default sorting is required ---->  use comparable interface
  2. custom sorting is required ----->  use comparator interface

* when you want objects one by one from collection --> cursors are required

  1. Enumeration Interface
  2. Iterator interface
  3. ListIterator interface

## Imp utility classes

* Collections --> for some implementations on collection
* Arrays      --> for some implementations on array

