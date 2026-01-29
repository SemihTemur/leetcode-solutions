class Solution {
    public String capitalizeTitle(String title) {
        String[] array = title.split(" ");
        
        StringBuilder sb = new StringBuilder();

        int index = 0;

        for (String s : array) {
            if (s.length() > 2) {
                s = s.toLowerCase();
                char[] c = s.toCharArray();
                c[0] = (char)(c[0] - 32);
                s = new String(c);
            } else {
                s = s.toLowerCase();
            }

            index++;

            if(array.length == index)
                sb.append(s);

            else
                sb.append(s + " ");
        }

        return sb.toString();
    }
}