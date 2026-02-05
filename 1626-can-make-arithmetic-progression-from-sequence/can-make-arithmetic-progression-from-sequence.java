class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = Math.abs(arr[0]-arr[1]);
        int i = 1;

        for(i = 1;i<arr.length-1;i++){
            if(difference != Math.abs(arr[i]-arr[i+1]))
                return false;
        }

        return true;
    }
}