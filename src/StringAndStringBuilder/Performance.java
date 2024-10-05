package StringAndStringBuilder;

public class Performance {
    public static void main(String[] args) {
       String series = "";
       for(int i = 0 ; i < 26 ; i++) {
           char ch = (char) ('a' + i);
           series = series + ch;
       }
           System.out.println(series);
       }
    }
    //as we know strings ares immutable here the same object is not updated every time a new object is created

