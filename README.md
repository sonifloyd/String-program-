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






                                           
                                             

             


