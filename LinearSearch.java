class LinearSearch {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};
        int found = 30;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == found) {
                System.out.println("Element is found");
                return;
            }
        }

        System.out.println("Element is not found");
    }
}