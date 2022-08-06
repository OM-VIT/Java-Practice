package com.company;

public class Stack_Using_Array {
    static int size=1000;
    int top;
    int arr[]= new int[size];

    void stackCustom(){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }

    boolean isEmpty(){
        return (top==-1);
    }
    boolean isFull(){
        return (size-1==top);
    }
     void push(int pushedelement){
        if(!isFull()) {
            top++;
            arr[top] = pushedelement;

            System.out.println("Pushed Element is " + pushedelement);
        }
            else{
                System.out.println("stack is full!!!");
            }

        }

         int pop() {
             if (isEmpty()) {
                 int returnedTop = top;
                 top--;

                 System.out.println("Popped element is " + arr[returnedTop]);

                 return arr[returnedTop];
             } else {
                 System.out.println("stack is empty!!!");
                 return -1;

             }


         }

         int peek(){
        if(isEmpty()){
            return arr[top];
        }
        else {
            System.out.println("stack is empty");
            return -1;
        }

    }
}
