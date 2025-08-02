public class Stack1{
    protected int arr[];
    private int top;

    public Stack1(){
      arr = new int[5];
      top = 0;
    }
    public Stack1(int n){
        arr = new int[n];
        top = 0;
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public boolean isFull(){
        return top == arr.length-1;
    }
    public void push(int val) throws Exception{
        if(isFull()){
           throw new Exception("Array is full");
        }
        else 
          arr[top++]= val;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Array is empty");
        }
        else{
            int val = arr[top];
             top--;
            return val;
        }
    }
    public int peek()throws Exception{
        if(isEmpty())
           throw new Exception("Array is empty");
        else 
           return arr[top];
    }
    public void display(){
        System.out.println();
        for(int i = 0;i<=top;i++)
          System.out.print(arr[i]+" ");
    }
    public static void main(String args[]) throws Exception{
        Stack1 obj = new Stack1(4);
        obj.push(1);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        obj.display();

    }

}