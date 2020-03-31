/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

import java.util.NoSuchElementException;

class MyPriorityQueue

{

    protected Node front, rear;

    public int size;

    public MyPriorityQueue()

    {

        front = null;

        rear = null;

        size = 0;

    }

    public boolean isEmpty()

    {

        return front == null;

    }


    public int getSize()

    {

        return size;

    }


    public void insert(int data)

    {

        Node nptr = new Node(data, null);

        if (rear == null)

        {

            front = nptr;

            rear = nptr;

        }

        else

        {

            rear.setLink(nptr);

            rear = rear.getLink();

        }

        size++ ;

    }

    public int remove()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception");

        Node ptr = front;

        front = ptr.getLink();

        if (front == null)

            rear = null;

        size-- ;

        return ptr.getData();

    }

    public int peek()

    {

        if (isEmpty() )

            throw new NoSuchElementException("Underflow Exception");

        return front.getData();

    }

    public void display()

    {

        System.out.print("\nQueue = ");

        if (size == 0)

        {

            System.out.print("Empty\n");

            return ;

        }

        Node ptr = front;

        while (ptr != rear.getLink() )

        {

            System.out.print(ptr.getData()+" ");

            ptr = ptr.getLink();

        }

        System.out.println();

    }

}


