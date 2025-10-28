package Old_Javarush.Syntax.Collections.Lecture4_1;



public class Solution {
    static void main(String[] args) {



    CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
        for (int i= 0; i < 10; i++) {
            System.out.println(arrayList.elements[i]);
        }
    }
}
