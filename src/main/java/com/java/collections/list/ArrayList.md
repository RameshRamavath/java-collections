# ArrayList 

    Note: Each collection framework is written based on some standard data structures

    In Java -- based on Resizable or growable array
        - duplicated are allowed
        - insertion objects are allowed
        - heterogeneous objects are allowed
        - Null insertion is possible

        Note: except treeSet and treeMap [sorting is required hence same elements can't be compared] heterogeneous objects are allowed

## Important constructors::

        1. ArrayList a = new ArrayList();
          -- default size 10 -- once its reaches max capacity new arrayList will be created and reference will be
             re assigned and older one will be moved to Garbage collection
          -- new capacity = ( current capacity  1.5 ) + 1 == 15+1

        2. ArrayList a = new ArrayList(int req_capacity);  --> defining array list with some initial capacity
        3. ArrayList a = new ArrayList(Collection c); --> for creating an equivalent ArrayList Object for given Collection


## Serialization && Cloning ::
     
    Collections basically used for to hold and transfer objects --> so to transfer the objects from one place to another across network
    the Object should be serializable -- so by default every Collection interface/ class are serializable by default
     
    they implements serializable Interface
     
    similarly Cloneable Interface also implemented by default [create copy of same collection and perform some operations]
   


    
## Random access (I)
    
    Available in java.util package --> marker interface [no methods inside it]

    * Only ArrayList and Vector implements RandomAccess interface [same time to access 1st element vs 100th element]
    * Hence ArrayList is best Collection if our requirement is frequent access of elements
     
       i.e : Frequent operation --> retrieval --> go for ArrayList or Vector

   **When to not use ArrayList**
      
      If our frequent operation is insertion at specific index / start of array. mid of array && removal of objects --> avoid ArrayList
      because on larger Arrays a lot of re-arrangements of elements needs to done to achieve these two operations

    

   **How to make ArrayList synchronized ??**
      
      By using Collections class [synchronizedList method]

      ArrayList a = new ArrayList(); -- non-synchronized
      List b = Collections.synchronizedList(a) --> synchronized
