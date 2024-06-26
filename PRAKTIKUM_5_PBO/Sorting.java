import java.util.Scanner;

public class Sorting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println("\nBubble Sort:");
        Sorting.bubbleSort(arr.clone());

        System.out.println("\nQuick Sort:");
        Sorting.quickSort(arr.clone(), 0, arr.length - 1);

        System.out.println("\nInsertion Sort:");
        Sorting.insertionSort(arr.clone());

        System.out.println("\nSelection Sort:");
        Sorting.selectionSort(arr.clone());

        System.out.println("\nMerge Sort:");
        Sorting.mergeSort(arr.clone(), 0, arr.length - 1);
    }
    
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    printArray(arr);
                }
            }
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pivot = arr[high];
            int i = (low - 1);
            for(int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                    printArray(arr);
                }
            }
            swap(arr, i + 1, high);
            quickSort(arr, low, i - 1);            
            quickSort(arr, i + 1, high);
        }
    }
    
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            printArray(arr);
        }
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            if (arr[j] < arr[min_idx])
            min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }
    public static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;      
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
        L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
        R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            printArray(arr);
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            printArray(arr);
        }
    }
    
    public static void mergeSort(int arr[], int l, int r){
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}