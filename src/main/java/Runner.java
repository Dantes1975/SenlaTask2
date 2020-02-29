public class Runner {
    public static void main(String[] args) {
        CheckArray checkArray = new CheckArray();
        int[] arr = {1, 14, 3, 25, 42, 16, 34, 25, 74, 12};
        int[] array = {1, 14, 3, 25, 42, 16, 34, 25, 12};

        System.out.println("Max - " + checkArray.gemMaxFromArray(arr));
        System.out.println("Max - " + checkArray.getMaxByRecurs(array, 0));

    }

}

