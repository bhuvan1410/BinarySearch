public class BinarySearch {

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] firstArray = new int[6];
        int[] secondArray = new int[6];

        int position1, position2;
        int target1, target2;

        target1 = 9;
        target2 = 2;

        firstArray[0] = 3;
        firstArray[1] = 9;
        firstArray[2] = 19;
        firstArray[3] = 25;
        firstArray[4] = 29;
        firstArray[5] = 25;

        secondArray[0] = 5;
        secondArray[1] = 19;
        secondArray[2] = 13;
        secondArray[3] = 23;
        secondArray[4] = 31;
        secondArray[5] = 45;

        position1 = search(firstArray, target1);
        position2 = search(secondArray, target2);

        System.out
                .println("After running binary search for array1 and target: 9: the target has been found in position: "
                        + position1);
        System.out.println(
                "After running binary search for array2 and target: 2 : the target has been found in position: "
                        + position2);

    }

}
