class WordSearch {
  public static void main(String args[]){
    char word[][] = {{'A','B','C','E'},{'S','F','C','E'},{'A','D','E','E' }};
    WordSearch obj = new WordSearch();
    String target = "ABCCE";
    System.out.println(obj.exist(word, target));
  }
    public boolean exist(char[][] board, String word) {
        boolean used[][] = new boolean[board.length][board[0].length];
       for(int i = 0;i<board.length;i++){
             for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    if(search(board,word,i,j,0,used))
                    return true;
                }
             }
        }
        return false;
    }
    public boolean search(char board[][], String word, int ind1, int ind2,int i,boolean used[][]){
        if(i == word.length())
          return true;
        if(ind1 < 0 || ind1 >= board.length || ind2 < 0 || ind2 >= board[0].length)
          return false;

        if( board[ind1][ind2] != word.charAt(i) ||used[ind1][ind2])
           return false;
        
        used[ind1][ind2] = true;

        boolean found =  search(board,word,ind1-1,ind2,i+1,used) || search(board,word,ind1+1,ind2,i+1,used) || search(board,word,ind1,ind2-1,i+1,used) ||  search(board,word,ind1,ind2+1,i+1,used);
         
         used[ind1][ind2] = false;
        return found;
    }
}