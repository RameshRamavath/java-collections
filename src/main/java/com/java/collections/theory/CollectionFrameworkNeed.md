#                                         Collection Framework

**What is the need?**

    When we have hundreds of variables in our application, declaring each of them is hard and bad practice. readability of code is also very difficult

    Next, people moved to Array --> can store more than one variable

    Employees[] e = new Employee [100] ---> with single variable declaration we can use 100 variables --> based on index we can access the elements

**Limitations**

    1. Fixed in size -- we may not know the number of elements before in-hand. Number employees may increase or decrease
    2. Can hold only same data type objects -- else will throw compile time error

        e[0] = new Employee(); --- valid
        e[1] = new Student();  --- compile error - in-compatible error

    Solution:  Go for Object type arrays

        Object[] ob = new Object[200];

        ob[0] = new Employee(); -- valid
        ob[1] = new Student();  -- valid


    3. Not implemented on any standard data structures concept -- so no readily available methods -- user expected to write custom methods
       sorting
       searching --- every thing we need to write


    Keeping these limitations --> better to go Collections

  But, collections comes with performance cost over Arrays

    In order to add element to arrayList --> every time it needs to copy all the elements to new referenced array -- each time copying elements is huge performance cost

    In collections primitives can't be hold -- only objects can be hold


**Collection**
 
    Group of individual objects as single entity then go for collection --- group of Students objects

**Collection Framework**

    Collection of classes and interfaces