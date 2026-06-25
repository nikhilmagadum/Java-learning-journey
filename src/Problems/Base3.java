package Problems;

public class Base3 {
    // Function to search for the target element in the array
    public static int findElementIndex(int[] arr, int target) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // Return -1 if the target element is not found
        return -1;
    }

    public static void main(String[] args) {
        // Example array and target element
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        // Perform the search
        int resultIndex = findElementIndex(arr, target);

        // Output the result
        System.out.println("Result index: " + resultIndex);
    }
}
