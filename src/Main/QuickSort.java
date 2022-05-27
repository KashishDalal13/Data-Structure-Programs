package Main;

public class QuickSort {
    public static void QuickSortt(int[] arr, int left, int right)
    {
        int index = partition(arr, left, right);

        if(left < index -1)
            QuickSortt(arr, left,index -1);
        if(index < right)
            QuickSortt(arr, index,right);
    }
    private static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[(left + right) / 2];
        while(left <= right)
        {
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right --;

            if(left <= right)
            {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;

                left++;
                right --;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,9,8,7,6,5,4,3,2,1};
        QuickSortt(array, 0, array.length -1);
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
}
