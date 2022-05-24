public class ArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = {5, 10, 15, 20, 25};
        
        // Access and display individual elements of the array
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);
        
        // Modify elements of the array
        numbers[1] = 12;
        numbers[3] = 18;
        
        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
