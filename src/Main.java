public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19; // if it found then return index no otherwise return -1
//      int ans = linearSearch3(nums, target);
        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);

    }

    // search the target and return true or fasle
    static boolean linearSearch3(int[] arr, int target) { // we can change here char type like (boolean, int)
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) { // they are in enhanced for loop
            // check for element
            if (element == target) {
                return true;
            }
        }

        return false;

      // search the target and return the element
//    static int linearSearch2(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        // run a for loop
//        for (int element : arr) {
//            // check for element
//            if (element == target) {
//                return element;
//            }
//        }
//
//        return -1;

    // search in the array: return the index if item found
    // otherwise if item not found return -1



//        static int linearSearch(int[] arr, int target) {
//            if (arr.length == 0) {
//                return -1;
//            }
//
//            // run a for loop
//            for (int index = 0; index < arr.length; index++) {
//                // check for element
//                int element = arr[index];
//                if (element == target) {
//                    return index;
//                }
//            }
//            // this line is execute if none of the return statement above have executed
//            // hence the target not found
//
//            return -1;


        }

}