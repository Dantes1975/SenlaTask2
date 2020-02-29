public class CheckArray {

    public int gemMaxFromArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMaxByRecurs(int[] arr, int i) {
        {
            if (i < arr.length) {
                int next = getMaxByRecurs(arr, i + 1);
                return (arr[i] > next) ? arr[i] : next;
            } else return arr[0];
        }
    }
}
