package com.java.collections.list;

public class List {

    // child interface of Collection interface  --> So all the methods available in Collection Interface can be used here by default
    // duplicates are distinguished by Index of element


    // List Interface also has few additional methods

    /*
       1. add (int index, Object obj) -- adding at specific index
       2. addAll (int index, Collection col)
       3. remove (int index)
       4. indexOf (Object obj) --> first occurance of obj
       5. lastIndexOf (Object obj)

       6. get (int index)

       7. ListIterator

       8. set(int index, Object obj) --> update a element at specific index

     */


    /**
     *  List Interface and it's implemented classes
     *
     *  ArrayList
     *  Vector
     *  LinkedList
     */

    /*
        Note: Each collection framework is written based on some standard data structures

        In Java -- based on Resizable or growable array
                -- duplicated are allowed
                -- insertion objects are allowed
                -- heterogeneous objects are allowed
                -- Null insertion is possible

        Note: except treeSet and treeMap [sorting is required hence same elements can't be compared] heterogeneous objects are allowed

     */

    /**
     *   Serialization && Cloning ::
     *
     *   Collections basically used for to hold and transfer objects --> so to transfer the objects from one place to another across network
     *   the Object should be serializable -- so by default every Collection interface/ class are serializable by default
     *
     *   they implements serializable Interface
     *
     *   similarly Cloneable Interface also implemented by default [create copy of same collection and perform some operations]
     */

}
