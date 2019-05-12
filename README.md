# String-interview Question-

) Is String a keyword in java?

No. String is not a keyword in java. String is a final class in java.lang package which is used to represent the set of characters in java.

2) Is String a primitive type or derived type?

String is a derived type.

3) In how many ways you can create string objects in java?

There are two ways to create string objects in java. One is using new operator and another one is using string literals. The objects created using new operator are stored in the heap memory and objects created using string literals are stored in string constant pool.

String s1 = new String("abc");          //Creating string object using new operator
String s2 = "abc";        //Creating string object using string literal
4) What is string constant pool?

String objects are most used data objects in Java. Hence, java has a special arrangement to store the string objects. String Constant Pool is one such arrangement. String Constant Pool is the memory space in heap memory specially allocated to store the string objects created using string literals. In String Constant Pool, there will be no two string objects having the same content.

Whenever you create a string object using string literal, JVM first checks the content of the object to be created. If there exist an object in the string constant pool with the same content, then it returns the reference of that object. It doesn’t create a new object. If the content is different from the existing objects then only it creates new object.

5) What is special about string objects as compared to objects of other derived types?

One special thing about string objects is that you can create string objects without using new operator i.e using string literals. This is not possible with other derived types (except wrapper classes). One more special thing about strings is that you can concatenate two string objects using ‘+’. This is the relaxation java gives to string objects as they will be used most of the time while coding. And also java provides string constant pool to store the string objects.

READ :  25 Java Array Interview Questions And Answers
6) What do you mean by mutable and immutable objects?

Immutable objects are like constants. You can’t modify them once they are created. They are final in nature. Where as mutable objects are concerned, you can perform modifications to them.

[quads id=5]

7) Which is the final class in these three classes – String, StringBuffer and StringBuilder?

All three are final. (Interviewer will ask this type of questions to confuse you)

8) What is the difference between String, StringBuffer and StringBuilder?

[Answer]

9) Why StringBuffer and StringBuilder classes are introduced in java when there already exist String class to represent the set of characters?

The objects of String class are immutable in nature. i.e you can’t modify them once they are created. If you try to modify them, a new object will be created with modified content. This may cause memory and performance issues if you are performing lots of string modifications in your code. To overcome these issues, StingBuffer and StringBuilder classes are introduced in java.

10) How many objects will be created in the following code and where they will be stored in the memory?

String s1 = "abc";
String s2 = "abc";
Only one object will be created and this object will be stored in the string constant pool.

11) How do you create mutable string objects?

Using StringBuffer and StringBuilder classes. These classes provide mutable string objects.

12) Which one will you prefer among “==” and equals() method to compare two string objects?

I prefer equals() method because it compares two string objects based on their content. That provides more logical comparison of two string objects. If you use “==” operator, it checks only references of two objects are equal or not. It may not be suitable in all situations. So, rather stick to equals() method to compare two string objects. 
“==” operator, equals() method and hashcode() methods are used to check the equality of any type of objects in Java. In this article, we will discuss which is the better way to check the equality of two string objects.

“==” operator compares the two objects on their physical address. That means if two references are pointing to same object in the memory, then comparing those two references using “==” operator will return true. For example, if s1 and s2 are two references pointing to same object in the memory, then invoking s1 == s2 will return true. This type of comparison is called “Shallow Comparison”.

equals() method, if not overrided, will perform same comparison as “==” operator does i.e comparing the objects on their physical address. So, it is always recommended that you should override equals() method in your class so that it provides field by field comparison of two objects. This type of comparison is called “Deep Comparison”.

In java.lang.String class, equals() method is overrided to provide the comparison of two string objects based on their contents. That means, any two string objects having same content will be equal according to equals() method. For example, if s1 and s2 are two string objects having the same content, then invoking s1.equals(s2) will return true.

13) Which class will you recommend among String, StringBuffer and StringBuilder classes if I want mutable and thread safe objects?

StringBuffer

14) How do you convert given string to char array?

Using toCharArray() method.

15) How many objects will be created in the following code and where they will be stored?

String s1 = new String("abc");
String s2 = "abc";
Here, two string objects will be created. Object created using new operator(s1) will be stored in the heap memory. The object created using string literal(s2) is stored in the string constant pool.
##What is Casting?
Casting is used when we want to convert on data type to another. There are two types of Casting:
Implicit Casting
Explicit Casting
#What is Implicit Casting?
Implicit Casting is done by the compiler. Good examples of implicit casting are all the automatic widening conversions i.e. storing smaller values in larger variable types.
int value = 100;
long number = value; //Implicit Casting
float f = 100; //Implicit Casting 
#What is Explicit Casting?
Explicit Casting is done through code. Good examples of explicit casting are the narrowing conversions - storing larger values into smaller variable types. Explicit casting would cause truncation of value if the value stored is greater than the size of the variable.
long number1 = 25678;
int number2 = (int)number1;//Explicit Casting
//int x = 35.35;//COMPILER ERROR
int x = (int)35.35;//Explicit Casting
int bigValue = 280;
byte small = (byte) bigValue;
System.out.println(small);//output 24. Only 8 bits remain.
#What is Auto Boxing?
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.

Integer ten = new Integer(10);
    ten++;//allowed. Java does had work behind the screen for us
Boxing and new instances
Auto Boxing helps in saving memory by reusing already created Wrapper objects.
 However wrapper classes created using new are not reused.
Two wrapper objects created using new are not same object.
Integer nineA = new Integer(9);
Integer nineB = new Integer(9);
System.out.println(nineA == nineB);//false
System.out.println(nineA.equals(nineB));//true
Two wrapper objects created using boxing are same object.
Integer nineC = 9;
Integer nineD = 9;
System.out.println(nineC == nineD);//true
System.out.println(nineC.equals(nineD));//true
## Generic
## Exception Handling
# what is Exception.
Exception is an error event that can happen during the execution of a program and disrupts it’s normal flow. Exception can arise from different kind of situations such as wrong data entered by user, hardware failure, network connection failure etc.
# REmaing in copy
#What is difference between Checked and Unchecked Exception in Java?
1.Checked Exceptions should be handled in the code using try-catch block or else method should use throws keyword to let the caller know about the checked exceptions that might be thrown from the method. Unchecked Exceptions are not required to be handled in the program or to mention them in throws clause of the method.
2.Exception is the super class of all checked exceptions whereas RuntimeException is the super class of all unchecked exceptions. Note that RuntimeException is the child class of Exception.
3.Checked exceptions are error scenarios that requires to be handled in the code, or else you will get compile time error. For example, if you use FileReader to read a file, it throws FileNotFoundException and we must catch it in the try-catch block or throw it again to the caller method. Unchecked exceptions are mostly caused by poor programming, for example NullPointerException when invoking a method on an object reference without making sure that it’s not null. For example, I can write a method to remove all the vowels from the string. It’s the caller responsibility to make sure not to pass null string. I might change the method to handle these scenarios but ideally the caller should take care of this.
#What is difference between throw and throws keyword in Java?
throws keyword is used with method signature to declare the exceptions that the method might throw whereas throw keyword is used to disrupt the flow of program and handing over the exception object to runtime to handle it.
#What is OutOfMemoryError in Java?
OutOfMemoryError in Java is a subclass of java.lang.VirtualMachineError and it’s thrown by JVM when it ran out of heap memory. We can fix this error by providing more memory to run the java application through java options.
#What are different scenarios causing “Exception in thread main”?
Some of the common main thread exception scenarios are:

Exception in thread main java.lang.UnsupportedClassVersionError: This exception comes when your java class is compiled from another JDK version and you are trying to run it from another java version.
Exception in thread main java.lang.NoClassDefFoundError: There are two variants of this exception. The first one is where you provide the class full name with .class extension. The second scenario is when Class is not found.
Exception in thread main java.lang.NoSuchMethodError: main: This exception comes when you are trying to run a class that doesn’t have main method.
Exception in thread “main” java.lang.ArithmeticException: Whenever any exception is thrown from main method, it prints the exception is console. The first part explains that exception is thrown from main method, second part prints the exception class name and then after a colon, it prints the exception message.
#What is difference between final, finally and finalize in Java?
final and finally are keywords in java whereas finalize is a method.

final keyword can be used with class variables so that they can’t be reassigned, with class to avoid extending by classes and with methods to avoid overriding by subclasses, finally keyword is used with try-catch block to provide statements that will always gets executed even if some exception arises, usually finally is used to close resources. finalize() method is executed by Garbage Collector before the object is destroyed, it’s great way to make sure all the global resources are closed.

Out of the three, only finally is related to java exception handling.
#What happens when exception is thrown by main method?
When exception is thrown by main() method, Java Runtime terminates the program and print the exception message and stack trace in system console.


#Can we have an empty catch block?
We can have an empty catch block but it’s the example of worst programming. We should never have empty catch block because if the exception is caught by that block, we will have no information about the exception and it wil be a nightmare to debug it. There should be at least a logging statement to log the exception details in console or log files.
#Errors	                                   #        Exceptions
Errors in java are of type java.lang.Error.	Exceptions in java are of type java.lang.Exception.
All errors in java are unchecked type.	Exceptions include both checked as well as unchecked type.
Errors happen at run time. They will not be known to compiler.	Checked exceptions are known to compiler where as unchecked exceptions are not known to compiler because they occur at run time.
It is impossible to recover from errors.	You can recover from exceptions by handling them through try-catch blocks.
Errors are mostly caused by the environment in which application is running.	Exceptions are mainly caused by the application itself.
Examples :
java.lang.StackOverflowError, java.lang.OutOfMemoryError	Examples :
                                                         Checked Exceptions : SQLException, IOException
                                             Unchecked Exceptions : ArrayIndexOutOfBoundException, ClassCastException, NullPointerException
error vs exception in java
#What is the difference between throw, throws and Throwable in java?
throw is a keyword in java which is used to throw an exception manually. Using throw keyword, you can throw an exception from any method or block. But, that exception must be of type java.lang.Throwable class or it’s sub classes. Below example shows how to throw an exception using throw keyword.
Throws is also a keyword in java which is used in the method signature to indicate that this method may throw mentioned exceptions. The caller to such methods must handle the mentioned exceptions either using try-catch blocks or using throws keyword. Below is the syntax for using throws keyword.
Throwable is a super class for all types of errors and exceptions in java. This class is a member of java.lang package. Only instances of this class or it’s sub classes are thrown by the java virtual machine or by the throw statement. The only argument of catch block must be of this type or it’s sub classes. If you want to create your own customized exceptions, then your class must extend this class. Click here to see the hierarchy of exception classes in java.

















