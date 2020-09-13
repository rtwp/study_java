package d0913;
//1 267p 직접 코딩

public class ReferenceParamEx03 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
        int[] arr2 = {3, 2, 1, 6, 5, 4};

        printArr(arr);
        bookArr(arr); // 오름차순으로 정렬
        mineArr(arr2); // 오름차순으로 정렬
        printArr(arr);
        printArr(arr2);
        sum(arr);
    }

    static void printArr(int[] arr) {
        String s = "[";
        for(int i = 0; i < arr.length; i++) {
            s += arr[i];
            if(i != arr.length - 1)
                s += ", ";
        }
        s += "]";
        System.out.println(s);
    }

    static void bookArr(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++)
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = tmp;
                }
                count++;
            }
        System.out.println("book count : " + count);
    }

    static void mineArr(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
            for(int j = arr.length - 1; j > i; j--) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                count++;;
            }
        System.out.println("mine count : " + count);
    }

    static void sum(int[] arr) {
        int sum = 0;
        for(int i : arr)
            sum += i;
        System.out.println(sum);
    }

}
