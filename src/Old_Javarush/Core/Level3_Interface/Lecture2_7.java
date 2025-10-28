package Old_Javarush.Core.Level3_Interface;

public class Lecture2_7 {
    public class Solution {
        public static void main(String[] args) throws Exception {
            SimpleObject<String> str = new StringObject();
            System.out.println(str.getInstance());
        }

        interface SimpleObject<T> {
            SimpleObject<T> getInstance();
        }

        static class StringObject implements SimpleObject <String> {
            @Override
            public SimpleObject<String> getInstance() {
                return null;
            }
        }
    }
}
