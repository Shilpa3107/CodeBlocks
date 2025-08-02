public class Queue{
    static int arr[];
    static int front;
    static int rear;

    public Queue(){
        arr = new int[5];
        front = 0;
        rear = 0;
    }
    public Queue(int n){
        arr = new int[n];
        front = 0;
        rear = 0;
    }
    public boolean isFull(){
        return front==arr.length;
    }
    public boolean isEmpty(){
        return front == 0;
    }
    public void enqueue(int val)throws Exception{
        if(isFull())
          throw new Exception("Array is full");
        arr[rear++] = val;
    }
    public int dequeue()throws Exception{
        if(isEmpty())
          throw new Exception("Array is empty");
        return arr[front++];
    }
}