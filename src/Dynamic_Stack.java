public class Dynamic_Stack extends Stack1{
    
        @Override

        public void push(int val)throws Exception{
            if(!isFull()){
                super.push(val);
            }
            else{
                int narr[] = new int[2*super.arr.length];
                for(int i = 0;i<narr.length;i++){
                    narr[i] = arr[i];
                }
                arr=narr;
                super.push(val);

            }
        }
}