package project7;

import java.util.Random;

public class Project7 
{
    public static void main(String[] args) 
    {
        int size = 200000;
        int[] array = new int[size];
        populateArray(array);
        
        long start , elapsed;
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.BubbleSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("BubbleSort:%d\n", elapsed);
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.BubbleSortSC(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("BubbleSortSC:%d\n", elapsed);
       
        start = System.currentTimeMillis(); 
        SortingAlgorithms.SelectionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("SelectionSort:%d\n", elapsed);
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.InsertionSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("InsterionSort:%d\n", elapsed);
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.MergeSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("MergeSort:%d\n", elapsed);
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.QuickSort(array.clone() , 0 , array.length-1);
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("QuickSort:%d\n", elapsed);
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.JavaSort(array.clone());
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("JavaSort:%d\n", elapsed);
        
        start = System.currentTimeMillis(); 
        SortingAlgorithms.CocktailShakerSort(array);
        elapsed = System.currentTimeMillis() - start;
        System.out.printf("CocktailShackerSort:%d\n", elapsed);
    }
    
    private static void populateArray(int[] array)
        {
            Random rand = new Random();
            
            for(int i = 0; i < array.length; i++)
            {
                array[i] = rand.nextInt(1001);
            }
        }
}
