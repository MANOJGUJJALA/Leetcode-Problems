class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer,Set<Character>>row=new HashMap<>();

         HashMap<Integer,Set<Character>>col=new HashMap<>();
         HashMap<String,Set<Character>>box=new HashMap<>();


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }

                if(row.containsKey(i)){
                    if(row.get(i).contains(board[i][j])){
                        return false;
                    }
                    else{
                        row.get(i).add(board[i][j]);
                    }
                }
                else{
                    row.put(i,new HashSet<>());
                    row.get(i).add(board[i][j]);
                }


                 if(col.containsKey(j)){
                    if(col.get(j).contains(board[i][j])){
                        return false;
                    }
                    else{
                        col.get(j).add(board[i][j]);
                    }
                }
                else{
                    col.put(j,new HashSet<>());
                    col.get(j).add(board[i][j]);
                }

                String key=i/3+"-"+j/3;

                 if(box.containsKey(key)){
                    if(box.get(key).contains(board[i][j])){
                        return false;
                    }
                    else{
                        box.get(key).add(board[i][j]);
                    }
                }
                else{
                    box.put(key,new HashSet<>());
                    box.get(key).add(board[i][j]);
                }




            }
        }
        return true;
        
    }
}