import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ColoringBook {

    public static int maxArea = 0;
    public static int currentArea = 0;

    public static void move(int[][] arrayImg, int x, int y, int startColor) {
        if(arrayImg[y][x] == 0) { // 색칠 안되있음
            return;
        }
       
        
        // 영역 밖 체크
        if(x + 1 < arrayImg[0].length) { // 
            move(arrayImg, x + 1, y, startColor);
        }

        if(y + 1 <  arrayImg.length) {
            move(arrayImg, x , y + 1, startColor);
        }        

        currentArea++; // 현재 영역 증가
        arrayImg[y][x] = 0; // 색칠한것 지우기
    }
    

    public static void main(String[] args) 
    {    
        int areaCount = 0;
        int[][] picture = {
            {1, 1, 1, 0},
            {1, 2, 2, 0}, 
            {1, 0, 0, 1}, 
            {0, 0, 0, 1}, 
            {0, 0, 0, 3}, 
            {0, 0, 0, 3}
        };
        System.out.println(picture[1][0]);
        int m = 6;
        int n = 4;
        int [][]copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = picture[i][j];
            }
        }
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if(picture[y][x] != 0) {
                    move(picture, x, y, picture[y][x]);
                    areaCount++;
                    if(maxArea < currentArea) {
                        maxArea = currentArea;
                        currentArea = 0;
                    }
                }
            }
        }
        //System.out.println(maxArea);
       // System.out.println(areaCount);
    }

}
