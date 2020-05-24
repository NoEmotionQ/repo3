package org;

import org.brand.Brand;
import org.car.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class CarApp
{
    public static void main( String[] args )
    {
      System.out.println("--------------------------------------二维数组压缩为稀疏数组----------------------------------");
        //创建一个二维数组用于表示棋盘
        int [][] chess = new int[11][11] ;
        chess[1][2] = 1 ;
        chess[2][3] = 2 ;
        chess[4][6] = 1 ;

        //打印二维数组
        int sum  = 0 ;
        for(int [] a:chess)
        {
            for (int b:a)
            {
                if(b!=0)
                    sum++ ;
                System.out.printf("%d\t",b);
            }
          System.out.println("\n");
        }

        //创建稀疏数组(行数=特殊元素个数+1；列数=3)
        int [][] sparseArray = new int[sum+1][3] ;

        //确定稀疏数组的第一个一维数组数据：原数组行数、原数组列数、原数组特殊元素个数
        sparseArray[0][0] = 11 ;
        sparseArray[0][1] = 11 ;
        sparseArray[0][2] = sum ;

        //放置特殊元素的信息到稀疏数组
        int count = 1 ;
        for(int i = 0 ;i < chess.length ; i++)
        {
            for (int j = 0 ; j < chess[i].length ;j++)
            {
                if(chess[i][j]!=0)
                {
                  sparseArray[count][0]  = i ;
                  sparseArray[count][1]  = j ;
                  sparseArray[count][2] = chess[i][j] ;
                  count++ ;
                }
            }
        }

        //打印稀疏数组
       for(int i = 0 ;i < sparseArray.length ;i++)
       {
         System.out.printf("%d\t%d\t%d\n",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
       }

      System.out.println("------------------------稀疏数组还原二维数组---------------------------------");
       //创建一个新的二维数组
      int row  = sparseArray[0][0] ;//行
      int col = sparseArray[0][1] ;//列
      int [][] chess1 = new int[row][col] ;
      for (int i = 1 ; i < sparseArray.length ;i++)//特殊元素信息的数组下标从1开始
      {
        int row1 = sparseArray[i][0] ; //特殊元素所在行
        int col1 = sparseArray[i][1] ; //特殊元素所在列
        chess1[row1][col1] = sparseArray[i][2] ; //特殊元素的值
      }
      //遍历还原后的二维数组
      for(int [] a:chess1)
      {
         for (int b : a)
         {
           System.out.printf("%d\t",b);
         }
        System.out.println();
      }

    }
}
