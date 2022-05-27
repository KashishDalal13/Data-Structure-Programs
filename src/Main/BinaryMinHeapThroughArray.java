package Main;

public class BinaryMinHeapThroughArray {
    int[] theHeap;
    int capacity;
    int pos;

    public BinaryMinHeapThroughArray()
    {
        pos = 1;
        capacity = 10;
        theHeap = new int[capacity];
    }

    public void insert(int value)
    {
        if(pos == capacity)
        {
            //Increase the capacity
        }
        else
        {
            theHeap[pos++] = value;

            int child=pos-1;
            int parent = child/2;

            while(theHeap[parent] > theHeap[child] && parent > 0)
            {
                int tmp=theHeap[parent];
                theHeap[parent] = theHeap[child];
                theHeap[child] = tmp;

                child=parent;
                parent=child/2;
            }
        }
    }
    public void print()
    {
        for(int i =1;i<pos;i++)
        {
            System.out.print(theHeap[i]+ " ");
        }
    }

    public static void main(String[] args) {
        BinaryMinHeapThroughArray heap = new BinaryMinHeapThroughArray();
        heap.insert(12);
        heap.insert(7);
        heap.insert(6);
        heap.insert(10);
        heap.insert(8);
        heap.insert(20);

        heap.print();
    }
}
