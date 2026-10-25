package arraySeries;

public class InsertionSortWithDynamicArr {
    public static void main(String[] args) {
        int[] arr = insertionSort(new int[]{5, 4, 3, 1, 2, 6, 7, 9, 8});
        System.out.println("After Sorting Array Is : ");
        for (int x : arr)
            System.out.printf(" %d", x);
    }
    private static int[] insertionSort(int[] arr) {
        if (arr.length == 0)
            return new int[]{};
        sort(arr);  //insertion Sort
        return arr;
    }
    private static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   //key = arr[1] =4
            int j = i - 1;        //j=i-1=0
            while (j >= 0 && arr[j] > key)  //j=0,arr[0]=5 , (0>=0 && arr[0]>5)
            {
                arr[j + 1] = arr[j];       //arr[0+1]=arr[0] , arr[0]=arr[1] ,arr[0]=4
                j--;                  //j=j-1; ->  j=0
            }
            arr[j + 1] = key;  //assign to the empty location    arr[0+1]=key =4
        }
    }

    public static class DynamicArray {
        private int arr[];
        private int capacity;
        private int currentSize;
        private static final int DEFAULT = 10;

        public DynamicArray() {
            arr = new int[DEFAULT];
            capacity = DEFAULT;
            currentSize = 0;
        }

        public DynamicArray(int cap) {
            arr = new int[cap];
            capacity = cap;
            currentSize = 0;
        }

        public void add(int data) {
    //    System.out.println("Capacty is : "+capacity);
            if (currentSize == capacity) {
                int oldArr[] = arr;
                for (int i = 0; i < capacity; i++) {
                    arr[i] = oldArr[i];
                }
                oldArr = null;      //garbage collection will be delete it
                capacity = 2 * capacity;
            }

            arr[currentSize] = data;
            ++currentSize;
        }

        public void remove() {
            //removed the last element
            currentSize--;
        }

        public int get(int i) {
            return arr[i];
        }

        public int getCapacity() {
            return capacity;
        }

        public int size() {
            return currentSize;
        }

        public static void main(String[] args) {
            DynamicArray dynamicArray = new DynamicArray(15);
            dynamicArray.add(1);
            dynamicArray.add(2);
            dynamicArray.add(3);
            dynamicArray.add(4);
            dynamicArray.add(5);
            dynamicArray.add(5);
            dynamicArray.add(5);
            dynamicArray.add(5);
    //dynamicArray.add(6);
    //dynamicArray.add(7);

            System.out.println("At inddex : " + dynamicArray.get(4));
            System.out.println("Size is : " + dynamicArray.size());
            System.out.println("Capacity is : " + dynamicArray.getCapacity());
    //           resizing dynamically
            for (int i = 0; i < dynamicArray.size(); i++)
                System.out.println(dynamicArray.get(i));
        }

        public static class ArrayListExample {
            public static void main(String[] args)
            {
        //        List<String> list = Arrays.asList(new String[]{"pavan", "Amol", "chandan"});
        //        List<String> list1 = new ArrayList<>(list);
        //        Collections.sort(list1);
        //        System.out.println("Given List is : "+list1 + " Type is : " + list1.getClass().getName());
                ;
        /*
            ArrayList l1=new ArrayList();
            l1.add("asdf");
            l1.add(1.23);
            l1.add("pavan");
            l1.add(true);
            l1.add('a');
            l1.add(2,"jaiswal");
                System.out.println(l1);
                System.out.println(l1.get(2));

                Object[] array = l1.toArray();
                Arrays.sort(array);
                System.out.println(Arrays.stream(array).toArray());
        */

        //        List<Integer> list = Arrays.asList(1, 23, 4, 452, 5, 6);
        //        Collections.sort(list);
        //        System.out.println(list+  "  "+list.getClass().getTypeName());
            }
        }
    }

    public static class MergeSort {
        public static void main(String[] args) {
            System.out.println("After Sorting Array is :");
            for (int x : divideAndConquer(new int[]{11, 7, 6, 5, 3, 4, 2, 1, 8, 9}))
                System.out.print(x + " ");
        }

        private static int[] divideAndConquer(int arr[]) {
            mergeSort(arr, 0, arr.length - 1);
            return arr;
        }

        static void mergeSort(int[] arr, int l, int r) {
            //        int l=0,r=arr.length-1;
            if (l < r) {                 //if left is less than right then it will be executed otherwise not
                int m = (l + r) / 2;
                mergeSort(arr, l, m);       //dividing into first sub arrays
                mergeSort(arr, m + 1, r); //dividing into second sub arrays
                merge(arr, l, m, r);
            }
        }

        private static void merge(int arr[], int l, int m, int r) {
            int n1 = m - l + 1;    // size of first array (start from 0 index and ends at length)
            int n2 = r - m;        //size of second array
            int lArr[] = new int[n1];  //left sub array
            int rArr[] = new int[n2];   //right sub array

            for (int i = 0; i < n1; i++)
                lArr[i] = arr[l + i];        // copied from 0 -> mid-left+1

            for (int i = 0; i < n2; i++)
                rArr[i] = arr[m + 1 + i];    // copied from mid+1+i->mid-left+1
            int i = 0;
            int j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (lArr[i] <= rArr[j]) {
                    arr[k] = lArr[i];
                    i++;
                } else {
                    arr[k] = rArr[j];
                    j++;
                }
                k++;
            }
            //remaining elements
            while (i < n1) {
                arr[k++] = lArr[i++];
            }
            while (j < n2) {
                arr[k++] = rArr[j++];
            }
        }
    }
}

/*
Output is :
After Sorting Array Is :
1 2 3 4 5 6 7 8 9
 */