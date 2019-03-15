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
Singleton class is a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private.
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
Below is wrapper class hierarchy as per Java API
                                           
                                             

             


