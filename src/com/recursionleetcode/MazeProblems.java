package com.recursionleetcode;

import java.sql.Array;
import java.util.ArrayList;

public class MazeProblems {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));

//        path("", 3, 3);
//        pathArray("", 3 ,3);

//        System.out.println(pathArrayDiagonal("", 3, 3));

        boolean[][] board = { {true, true, true},
                              {true, false, true},
                              {true, true, true}};

        pathWithObstacles("", board, 0, 0);
    }

    // count of paths
    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    // paths
    static void path(String p, int r, int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }

        if (r>1){
            path(p + 'D', r-1, c);
        }

        if (c>1){
            path(p + 'R', r, c-1);
        }
    }

    // paths - arrayList
    static ArrayList<String> pathArray(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r>1){
            list.addAll(pathArray(p + 'D', r-1, c));
        }

        if (c>1){
            list.addAll(pathArray(p + 'R', r, c-1));
        }

        return list;
    }

    // paths with diagonals
    static ArrayList<String> pathArrayDiagonal(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r>1 && c>1){
            list.addAll(pathArrayDiagonal(p + 'D', r-1, c-1));
        }

        if (r>1){
            list.addAll(pathArrayDiagonal(p + 'V', r-1, c));
        }

        if (c>1){
            list.addAll(pathArrayDiagonal(p + 'H', r, c-1));
        }

        return list;
    }

    // path with obstacles
    static void pathWithObstacles(String p, boolean [][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r < maze.length-1){
            pathWithObstacles(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length-1){
            pathWithObstacles(p + 'R', maze, r, c+1);
        }
    }

}
