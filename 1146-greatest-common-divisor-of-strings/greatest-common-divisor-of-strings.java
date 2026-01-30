class Solution {
    public String gcdOfStrings(String str1, String str2) {
       
        if((str2+str1).equals(str1+str2)){
            int str1Length = str1.length();
            int str2Length = str2.length();
            int dividing = 2;
            int index = 1;

            int minLength = Math.min(str2Length,str1Length);

            while(minLength>=dividing){
                if(str1Length % dividing == 0 && str2Length % dividing == 0){
                    index =  dividing;
                }
                dividing++;
            }

            return str1.substring(0,index);
        }
      
        return "";
    }
}