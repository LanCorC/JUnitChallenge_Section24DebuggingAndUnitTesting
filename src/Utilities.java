public class Utilities {

    //Returns a char array, containing every n'th char
    //sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {

        if(sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length/n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n-1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }

        return result;
    }

    //remove pairs of the same chars that are next to each other;
    //ABBCDEEF -> ABCDEF
    //ABCBDEEF -> ABCBDEF - double b, not neighboring, so they are kepy
    public String removePairs(String source) {
        //if length <2, no pairs
        if (source.length() < 2) {
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();
        //A A B C
        for(int i=0; i < string.length; i++) {
            if (i == string.length - 1 || string[i] != string[i + 1]) {
                sb.append(string[i]);
            }
        }

        return sb.toString();
    }

    //conversion based on internal business rule
    public int converter(int a, int b){
        return (a/b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if(source.length() % 2 == 0) {
            return source;
        }

        return null;
    }
}
