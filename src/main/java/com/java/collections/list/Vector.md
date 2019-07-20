# Vector 

   Another utility or implemented class in List interface

    Vector is synchronized version of ArrayList --> only one thread can be operate some actions on Vector -- hence thread safe
    but obv performance is little lower

    All benefits we have in ArrayList are available in Vector also -- additionally vector is thread safe

    i,e: growable, serializable, clonable, memory preserved in Advance, best for retrieval operations [random access] + thread safe

    
    All methods will have full length names -- old style in Java
     
      1. addElement(Object a) ---> where as in ArrayList or List we simply say add(Object a)
      2. removeElement (Object a)
      3. removeElementAt (int index)
      4. removeAllElements () ---> clear in List or ArrayList or Collection

## Important constructors::

    1. Vector a = new Vector(); -- default size 10
          -- once its reaches max capacity new Vector will be created
          -- new capacity = ( current capacity  2 )  ==> 20, 40, 80, 160......

    2. Vector a = new Vector(int initial_capacity);  --> defining Vector with some initial capacity
    3. Vector a = new Vector(Collection c); --> for creating an equivalent Vector Object for given Collection

    4. Vector a = new Vector(int initial_capacity, int incremental_capacity); --> instead of doubling the Vector size when it reaches it's Max size,
                                                                                     We can specify the incremental value
       Vector a = new Vector(int 100, int 10); --> 100, 110, 120, 130.... will be possible Vector sizes

## Stack Class
 
    Has a child class also ---> Stack

    Designed for Last In First Out [LIFO]

   **Constructor**

       Stack a = new Stack();

## Methods:

    push (Object obj) --- add object
    pop () ---- get last Object & remove it
    peak () --- return top of the stack but don't remove
    search(Object obj) ---returns the offset of the Object


