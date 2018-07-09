package InstallBinarySearch;

public class BinarySearchWithRecursive {
    public static void main(String[] args) {
        System.out.println(binarySearch(list,0,12,2));  /* 0 */
        System.out.println(binarySearch(list,0,12,11)); /* 4 */
        System.out.println(binarySearch(list,0,12,79)); /*12 */
        System.out.println(binarySearch(list,0,12,1));  /*-1 */
        System.out.println(binarySearch(list,0,12,5));  /*-1 */
        System.out.println(binarySearch(list,0,12,80)); /*-1 */
    }

    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int low, int high, int key) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (list[mid] == key) return mid;
            if (list[mid] > key) return binarySearch(list, low, mid - 1, key);
            if (list[mid]<key) return binarySearch(list, mid + 1, high, key);
        }
        return -1;
    }
}
