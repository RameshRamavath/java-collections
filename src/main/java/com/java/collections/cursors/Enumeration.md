# Enumeration

    One of the Cursor concept in Java - to retrieve elements from Collection one-by-one
    
    We can create Enumeration object using elements() method from Vector Utility class

       Enumeration e = v.elements(); --> v is vector collection here

   **methods**
      
       public boolean hasMoreElements()
       public Object nextElement()

    example --> create vector of 100 Integers and print all even numbers from it one by one
