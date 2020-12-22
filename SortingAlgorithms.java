package project7;

import java.util.Arrays;

public class SortingAlgorithms 
{
    public static void BubbleSort(int[] array)
    {
        for(int i = 0; i < array.length-1; i++)
        {
            for(int j = 0; j < array.length-i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    public static void BubbleSortSC(int[] array)
    {
        for(int i = 0; i < array.length-1; i++)
        {
            boolean swap = false;
            for(int j = 0; j < array.length-i-1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)
            break;
        }
    }
    
    public static void SelectionSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[index])
                {
                    index = j;
                }
            }
            
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }

    }
    
    public static void InsertionSort(int[] array)
    {
        int i, key, j;
        
        for (i = 1; i < array.length; i++)
        {
            key = array[i];
            j = i - 1;
            
            while (j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = key;
        } 
    }
    
    public static void MergeSort(int[] array)
    {
        if (array.length < 2)
        {
            return;
        }
        
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        
        for (int i = 0; i < mid; i++)
        {
            l[i] = array[i];
        }
        
        for (int i = mid; i < array.length; i++)
        {
            r[i - mid] = array[i];
        }
        
        MergeSort(l);
        MergeSort(r);
            
        merge(array, l, r, mid, array.length - mid);
    }
    
    public static void merge(int[] array, int[] l, int[] r, int left, int right) 
    {
        int i = 0, j = 0, k = 0;
        
        while (i < left && j < right) 
        {
            if (l[i] <= r[j]) 
            {
                array[k] = l[i];
                i++;
            }
            else 
            {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < left)
        {
            array[k++] = l[i++];
        }
        while (j < right)
        {
            array[k++] = r[j++];
        }
}
    
    public static void QuickSort(int[] array, int start, int end)
    {
 
        int partition = partition(array, start, end);
 
        if(partition-1>start) 
        {
            QuickSort(array, start, partition - 1);
        }
        if(partition+1<end) 
        {
            QuickSort(array, partition + 1, end);
        }
    }
    
    public static int partition(int[] array, int start, int end)
    {
        int pivot = array[end];
 
        for(int i=start; i<end; i++)
        {
            if(array[i]<pivot)
            {
                int temp= array[start];
                array[start]=array[i];
                array[i]=temp;
                start++;
            }
        }
 
        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;
 
        return start;
    }
    
    public static void JavaSort(int[] array)
    {
        Arrays.sort(array);
    }
    
    public static void CocktailShakerSort(int[] array)
    {
        boolean swapped = true; 
        int start = 0; 
        int end = array.length; 
  
        while (swapped == true) 
        { 
            swapped = false; 
            
            for (int i = start; i < end - 1; ++i) 
            { 
                if (array[i] > array[i + 1]) 
                { 
                    int temp = array[i]; 
                    array[i] = array[i + 1]; 
                    array[i + 1] = temp; 
                    swapped = true; 
                } 
            } 
            
            if (swapped == false) 
            {
                break; 
            }
            swapped = false;
            end = end - 1; 
            
            for (int i = end - 1; i >= start; i--) { 
                if (array[i] > array[i + 1]) { 
                    int temp = array[i]; 
                    array[i] = array[i + 1]; 
                    array[i + 1] = temp; 
                    swapped = true; 
                } 
            } 
            start = start + 1; 
        } 
    } 
}