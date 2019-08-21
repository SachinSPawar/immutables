# immutables
Immutable Queue Implementation In Java

This repository contains immutable implementation of following Queue interface.

```java
	public interface Queue<T> {

      //Adds the element at the end of the immutable queue, and returns the new queue.
	    public Queue<T> enQueue(T t);
	    
      //Removes the element at the beginning of the immutable queue, and returns the new queue.
	    public Queue<T> deQueue();
	    
      //Returns the element at the beginning of the immutable queue.
	    public T head();
	    
      //Returns whehther the queue is empty or not.
	    public boolean isEmpty();
	}
    ```
    
