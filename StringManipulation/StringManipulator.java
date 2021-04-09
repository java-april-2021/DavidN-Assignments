public class StringManipulator{
    public static String trimAndConcat(String a, String b){
        a = a.trim();
        b = b.trim();
        String retString = a.concat(b);
        return retString;
    }
    public static Integer getIndexOrNull(String str, char ch){
        if(str.indexOf(ch) < 0){
            return null;
        }
        else{
            return str.indexOf(ch);
        }
    }
    public static Integer getIndexOrNull(String str, String sub){
        if(str.indexOf(sub) < 0){
            return null;
        }
        else{
            return str.indexOf(sub);
        }
    }
    public static String concatSubstring(String str, int a, int b, String strTwo){
        String retString = str.substring(a,b);
        retString = retString.concat(strTwo);
        return retString;
    }
}