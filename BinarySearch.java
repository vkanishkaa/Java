public class BinarySearch {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};
        int found = 30;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == found) {
                System.out.println("Element is found");
                return;
            }
            else if (arr[mid] < found) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element is not found");
    }
}