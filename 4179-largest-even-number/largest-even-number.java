class Solution {
    public String largestEven(String s) {
        if(s.length() == 1){
            if(s.equals("2"))
                return s;
            else
                return "";
        }

        char[] largestEvenArray = s.toCharArray();
        int i = largestEvenArray.length - 1;
        int index = -1;

        for(i=largestEvenArray.length - 1;i>=0;i--){
            if(largestEvenArray[i]=='2'){
                index = i;
                break;
            }
        }

        return s.substring(0,index+1);
    }
}