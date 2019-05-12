
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








=======
# Java Multithreading and Concurrency Interview Questions
# What is multithreading?
Multithreading is a process of executing multiple threads simultaneously. Multithreading is used to obtain the multitasking. It consumes less memory and gives the fast and efficient performance. Its main advantages are:

Threads share the same address space.
The thread is lightweight.
The cost of communication between the processes is low.
# What is the thread?
A thread is a lightweight subprocess. It is a separate path of execution because each thread runs in a different stack frame. A process may contain multiple threads. Threads share the process resources, but still, they execute independently.
# What is association?
Association is a relationship where all object have their own lifecycle and there is no owner. Let’s take an example of Teacher and Student. Multiple students can associate with a single teacher and a single student can associate with multiple teachers but there is no ownership between the objects and both have their own lifecycle. These relationship can be one to one, One to many, many to one and many to many.

# What do you mean by aggregation?
Aggregation is a specialized form of Association where all object have their own lifecycle but there is ownership and child object can not belongs to another parent object. Let’s take an example of Department and teacher. A single teacher can not belongs to multiple departments, but if we delete the department teacher object will not destroy. 

# What is composition in Java?
Composition is again specialized form of Aggregation and we can call this as a “death” relationship. It is a strong type of Aggregation. Child object dose not have their lifecycle and if parent object deletes all child object will also be deleted. Let’s take again an example of relationship between House and rooms. House can contain multiple rooms there is no independent life of room and any room can not belongs to two different house if we delete the house room will automatically delete.
# What is multiple inheritance? Is it supported by Java?
MultipleInheritance - Java Interview Questions - If a child class inherits the property from multiple classes is known as multiple inheritance. Java does not allow to extend multiple classes.

The problem with multiple inheritance is that if multiple parent classes have a same method name, then at runtime it becomes difficult for the compiler to decide which method to execute from the child class.

Therefore, Java doesn’t support multiple inheritance. The problem is commonly referred as Diamond Problem.
# What is singleton class and how can we make a class singleton?
Singleton class is a class whose only one instance can be created at a given time, in one JVM. A class can be made singleton by making its constructor private.
# why we use singleton class
 Singleton patterns are used in logging, caches, thread pools, configuration settings, device driver objects.
# What are wrapper classes?
object reperesentation of primitive data type is calles wrapper classes. There are 8 classes.
Primitive	                         Wrapper Class	                                     Constructor Argument
boolean           	                   Boolean                                          	boolean or String
byte	                                  Byte	                                             byte or String
char	                                 Character	                                              char
int                                 	Integer	                                               int or String
float	                                 Float	                                              float, double or String
double	                             Double	                                                   double or String
long	                               Long	                                                      long or String
short                              	Short	                                                       short or String
#  wrapper class hierarchy as per Java API
# Advantage of wrapper class
.It provide predefined method support
.Automatic conversion of primitive data type to non pritive data type 
.collection can not hold primitive data type.we use in collection
# what is Autoboxing
A process of converting primitive data type value to its corresponding non- primitive object by automatically(compiler)
ex-
public class{
p.s.m(String args[]){
int i=100;//this value have to convert into object form
Integer i=Integer.valueOf(i);// this code is write before wrapper class now compiler internally write this code we do not have to write
Integer ab =i;// autoboxing
s.o.p(i);
}}
# Unboxing
A process of converting Object  to its corresponding primitive value by automatically(compiler)
ex-
public class{
p.s.m(String args[]){
Integer i=new Integer(10);//now 10 is an object form we have to convert into value form
int  ab=i.intValue();// this code is write before wrapper class now compiler internally write this code we do not have to write
int ab =i;// Unoboxing
s.o.p(i);
}}

# Why java is not 100% Object-oriented?
Java is not 100% Object-oriented because it makes use of eight primitive datatypes such as boolean, byte, char, int, float, double, long, short which are not objects.
# Explain public static void main(String args[]).
public : Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class.
static : It is a keyword in java which identifies it is class based i.e it can be accessed without creating the instance of a Class.
void : It is the return type of the method. Void defines the method which will not return any value.
main: It is the name of the method which is searched by JVM as a starting point for an application with a particular signature only. It is the method where the main execution occurs.
String args[] : It is the parameter passed to the main method.

 # What is synchronization?
Synchronization is the mechanism that ensures that only one thread is accessed the resources at a time.
.It is uesd for data inconsistancy problem
.It is only apply for method and blocks.
.It is not apply for classes and variables.
Synchronized (object)
{
// statement
}
# why we need this
ex.
ek bank account me 1000 rs h aur use do person ek hi time pe access kar rahe h 1st person 600.and 2nd person 500
so there is problem we cant withdraw money 
# disadvatage 
It takes time 
agar jayada jarurat nhi ho to synchronized na kar


# What is URL?
URL stands for Uniform Resource Locator and it points to resource files on the Internet. URL has four components: http://www. address. com:80/index.html, where http - protocol name, address - IP address or host name, 80 - port number and index.html - file path.
# Define Exception
An Exception is an unwanted event that interrupts the normal flow of the program. When an exception occurs program execution gets terminated. In such cases we get a system generated error message. The good thing about exceptions is that they can be handled in Java. By handling the exceptions we can provide a meaningful message to the user about the issue rather than a system generated message, which may not be understandable to a user.
# Why an exception occurs?
There can be several reasons that can cause a program to throw exception. For example: Opening a non-existing file in your program, Network connection problem, bad input data provided by user etc.
# Exception Handling
If an exception occurs, which has not been handled by programmer then program execution gets terminated and a system generated error message is shown to the user. For example look at the system generated exception below:

# What's the base class of all exception classes?
Ans: In Java, Java.lang.Throwable is the super class of all exception classes and all exception classes are derived from this base class.
# Errors                                                   	Exceptions
Errors in java are of type java.lang.Error.	Exceptions in java are of type java.lang.Exception.
All errors in java are unchecked type.	Exceptions include both checked as well as unchecked type.
Errors happen at run time. They will not be known to compiler.	Checked exceptions are known to compiler where as unchecked exceptions are not known to compiler because they occur at run time.
It is impossible to recover from errors.	You can recover from exceptions by handling them through try-catch blocks.
Errors are mostly caused by the environment in which application is running.	Exceptions are mainly caused by the application itself.
Examples :
java.lang.StackOverflowError, java.lang.OutOfMemoryError	Examples :
Checked Exceptions : SQLException, IOException
Unchecked Exceptions : ArrayIndexOutOfBoundException, ClassCastException, NullPointerException
# Types of exceptions
There are two types of exceptions in Java:
1)Checked exceptions
2)Unchecked exceptions

# Checked exceptions
All exceptions other than Runtime Exceptions are known as Checked exceptions as the compiler checks them during compilation to see whether the programmer has handled them or not. If these exceptions are not handled/declared in the program, you will get compilation error. For example, SQLException, IOException, ClassNotFoundException etc.

# Unchecked Exceptions
Runtime Exceptions are also known as Unchecked Exceptions. These exceptions are not checked at compile-time so compiler does not check whether the programmer has handled them or not but it’s the responsibility of the programmer to handle these exceptions and provide a safe exit. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.
# Few Important points regarding finally block
1. A finally block must be associated with a try block, you cannot use finally without a try block. You should place those statements in this block that must be executed always.

2. Finally block is optional, as we have seen in previous tutorials that a try-catch block is sufficient for exception handling, however if you place a finally block then it will always run after the execution of try block.

3. In normal case when there is no exception in try block then the finally block is executed after try block. However if an exception occurs then the catch block is executed before finally block.

4. An exception in the finally block, behaves exactly like any other exception.

5. The statements present in the finally block execute even if the try block contains control transfer statements like return, break or continue




# What happens if an exception is not handled in a program?
Ans: If an exception is not handled in a program using try catch blocks, program gets aborted and no statement executes after the statement which caused exception throwing.
# How objects are stored in Java?
Ans: In java, each object when created gets a memory space from a heap. When an object is destroyed by a garbage collector, the space allocated to it from the heap is re-allocated to the heap and becomes available for any new objects.
# I want my class to be developed in such a way that no other class (even derived class) can create its objects. How can I do so?
Ans: If we declare the constructor of a class as private, it will not be accessible by any other class and hence, no other class will be able to instantiate it and formation of its object will be limited to itself only.
 # I want to control database connections in my program and want that only one thread should be able to make database connection at a time. How can I implement this logic?
Ans: This can be implemented by use of the concept of synchronization. Database related code can be placed in a method which hs synchronized keyword so that only one thread can access it at a time.
# In Java thread programming, which method is a must implementation for all threads?
Ans: Run() is a method of Runnable interface that must be implemented by all threads.
# I want to re-reach and use an object once it has been garbage collected. How it's possible?
Ans: Once an object has been destroyed by garbage collector, it no longer exists on the heap and it can't be accessed again. There is no way to reference it again.
# What is the difference between processes and threads ?
A process is an execution of a program, while a Thread is a single execution sequence within a process. A process can contain multiple threads. A Thread is sometimes called a lightweight process.

#  Explain different ways of creating a thread.Which one would you prefer and why ?
There are three ways that can be used in order for a Thread to be created:

A class may extend the Thread class.
A class may implement the Runnable interface.
An application can use the Executor framework, in order to create a thread pool.
The Runnable interface is preferred, as it does not require an object to inherit the Thread class. In case your application design requires multiple inheritance, only interfaces can help you. Also, the thread pool is very efficient and can be implemented and used very easily.
# . Explain the available thread states in a high-level.
During its execution, a thread can reside in one of the following states:

Runnable: A thread becomes ready to run, but does not necessarily start running immediately.
Running: The processor is actively executing the thread code.
Waiting: A thread is in a blocked state waiting for some external processing to finish.
Sleeping: The thread is forced to sleep.
Blocked on I/O: Waiting for an I/O operation to complete.
Blocked on Synchronization: Waiting to acquire a lock.
Dead: The thread has finished its execution.
# What is the difference between a synchronized method and a synchronized block ?
In Java programming, each object has a lock. A thread can acquire the lock for an object by using the synchronized keyword. The synchronized keyword can be applied in a method level (coarse grained lock) or block level of code (fine grained lock).

# How does thread synchronization occurs inside a monitor ? What levels of synchronization can you apply ?
The JVM uses locks in conjunction with monitors. A monitor is basically a guardian that watches over a sequence of synchronized code and ensuring that only one thread at a time executes a synchronized piece of code. Each monitor is associated with an object reference. The thread is not allowed to execute the code until it obtains the lock.

# . What’s a deadlock ?
A condition that occurs when two processes are waiting for each other to complete, before proceeding. The result is that both processes wait endlessly.
deadlock is situation where multithreads are trying to waiting for each other to complete for operation is known as deadlock.
# how to avoid deadlock
if u provide to an ordered access 
# how deadlock occur
b/c of synchronized keyword

# . How do you ensure that N threads can access N resources without deadlock ?
A very simple way to avoid deadlock while using N threads is to impose an ordering on the locks and force each thread to follow that ordering. Thus, if all threads lock and unlock the mutexes in the same order, no deadlocks can arise.




