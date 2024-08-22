public class Strings {
    public static String convertToUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static int countVowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String str1, String str2){
        int[] arr = new int[26];
        for(int i=0; i<str1.length(); i++){
            arr[str1.charAt(i) - 'a']++;
        }
        for(int i=0; i<str2.length(); i++){
            arr[str2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "aaabbccdff";
        // System.out.println(convertToUppercase(str));
        // System.out.println(stringCompression(str));

        // StringBuilder sb = new StringBuilder();
        // sb.append("Hello");
        // sb.append(" Aryan");
        // System.out.println(sb);
        
        // System.out.println(countVowels("aabbccddeefijklo"));

        System.out.println(isAnagram("abacddcef", "aabccdedf"));
    }
}
