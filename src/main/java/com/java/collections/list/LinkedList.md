# LinkedList 

   Another implemented class in List family

    Best suited when random insertion or deletion is required
    Retrieval of elements is costly operation in LinkedList --> each element will have it's previous & next elements reference

    So to get info about 10th element in the List, searching will be starting from 1st element

## Some characteristics:
     
    1. LinkedList is based Double Linked List Data Structure
    2. Insertion order is preserved
    3. Duplicates are allowed
    4. Null insertion is allowed
    5. Heterogeneous objects are allowed
    6. Serializable and Cloning is possible

    In LinkedList one can implement Stack [last in first out] and Queues [first in first out]--> to achieve this LinkedList has below methods
     
       void addFirst
       void addLast
     
       Object getFirst
       Object getLast
     
       Object removeFirst
       Object removeLast

     
## Constructors::

      Since we don't have any memory reserve concept here, only below two constructors are available
     
      Empty LinkedList                     -->  LinkedList a = new LinkedList();
      Create LinkedList of some collection -->  LinkedList a = new LinkedList(Collection b);

