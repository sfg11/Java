/*
Apply a Decorator pattern to StackImpl1 to implement two new Stack Decorator classes that
might be used for debugging. You might want to try (3) first and modify it after you do and learn
from 1 and 2.
1. (18 pts) The first Decorator will display the name of each Stack method when it is
invoked. Your implementation class should be named StackDecorator1.

2. (18 pts) The second Decorator will check the preconditions of each Stack method, and
display “TRUE” or “FALSE”, depending on whether the appropriate preconditions are
satisfied. Your implementation class should be named StackDecorator2.
3. (12 pts) Draw the UML class diagram for the resulting Interface and Decorators.
"C:\Program Files\Java\jre1.8.0_144\bin"
javac *.java
dir
java
 */
 public interface Stack {
 	public void push(Object object);
 	public Object pop();
 	public Object top();
 	public boolean isEmpty();
 	public int length();
 	public void clean();
 }
