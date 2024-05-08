public class MostRepeatedNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 2, 4, 2, 3, 4, 2, 4 };
        int mostRepeated = findMostRepeatedNumber(arr);
        System.out.println("Most Repeated number: " + mostRepeated);
    }

    public static int findMostRepeatedNumber(int[] arr) {
        int maxFrequency = 0;
        int mostRepeatedNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxFrequency) {
                maxFrequency = count;
                mostRepeatedNumber = arr[i];
            }
        }
        return mostRepeatedNumber;
    }
}
