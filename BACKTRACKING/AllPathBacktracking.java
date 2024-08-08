import java.util.Arrays;

public class AllPathBacktracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path = new int[maze.length][maze[0].length];

        backtrackAllPath("",maze,0,0,path,1);

    }
//    static void allPathOfMaze(String p,boolean[][] maze, int r, int c){
//        //CONSIDERING THE BLOCK IN PATH
//        if(r==maze.length-1 && c== maze.length-1){
//            System.out.println(p);
//            return;
//
//        }
//        if(!maze[r][c]){
//            return;
//        }
//        //CONSIDERING THE BLOCK IN PATH
//        maze[r][c]=false;
//        if (r < maze.length-1){
//            allPathOfMaze(p+'D',maze,r+1,c);
//        }
//        if (c < maze.length-1){
//            allPathOfMaze(p+'R',maze,r,c+1);
//        }
//        if(r>0){
//            allPathOfMaze(p+'U', maze, r-1,c);
//        }
//        if(c>0){
//            allPathOfMaze(p+'L', maze, r,c-1);
//        }
//        //Function over
//        //Re modify the changes i.e maze[r][c]=TRUE
//        maze[r][c]=true;
//    }
    static void backtrackAllPath(String p,boolean[][] maze, int r, int c, int[][] path, int step){
        //CONSIDERING THE BLOCK IN PATH
        if(r==maze.length-1 && c== maze.length-1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(!maze[r][c]){
            return;
        }
        //CONSIDERING THE BLOCK IN PATH
        maze[r][c]=false;
        path[r][c]=step;
        if (r < maze.length-1){
            backtrackAllPath(p+'D',maze,r+1,c,path,step+1);
        }
        if (c < maze.length-1){
            backtrackAllPath(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            backtrackAllPath(p+'U', maze, r-1,c,path,step+1);
        }
        if(c>0){
            backtrackAllPath(p+'L', maze, r,c-1,path,step+1);
        }
        //Function over
        //Re modify the changes i.e maze[r][c]=TRUE
        maze[r][c]=true;
        path[r][c]=0;
    }
}
