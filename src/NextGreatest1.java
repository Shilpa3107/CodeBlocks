import java.util.Stack;
public class NextGreatest1{
    public static void main(String args[]){
        int arr[] = {3,1,2,4,6,1,2,1};
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
        while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                int indx = stack.pop();
                 ans[indx] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int indx = stack.pop();
            ans[indx] = -1;
        }
        for(int n : ans)
          System.out.print(n+" ");
    }
}