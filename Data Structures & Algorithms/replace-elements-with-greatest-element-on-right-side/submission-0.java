class Solution {
    public int[] replaceElements(int[] arr) {
        
        int high_right=-1;
        int next = arr[arr.length-1];
        arr[arr.length-1] = high_right;
        high_right = next;
        for (int i=arr.length-2; i>=0;i--){
            if (arr[i] <= high_right){
                arr[i] = high_right;
            }
            else{
                next = arr[i];
                arr[i] = high_right;
                high_right = next;
            }
        }

        return arr;
    }
}