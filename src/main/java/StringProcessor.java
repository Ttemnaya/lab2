import java.util.Scanner;

public class StringProcessor {

    //строка, состоящая из n копий строки s
    public String CopyOfString(String str, int n) {

        String newStr = new String();
        for (int i = 0; i < n; i++) {
            newStr += str;
        }
        if (n<0) throw new IllegalArgumentException("Отрицательное значение");
        return newStr;
    }

    //количество вхождений второй строки в первую.
    public int CountOfOccurrences(String str1, String str2) {
        int i = 0, x = -1; // вспомагательная, вместо і, что б начать цикл
        int count = -1;
        while (i != -1) {
            i = str1.indexOf(str2, x + 1);
            x = i;
            count++;
        }
        return count;
    }

    //строка, созданная заменой символов в ней
    public String SymbolReplacement(String str) {
        String newString = new String();
        return newString = str.replace("1", "один").replace("2", "два").replace("3", "три");
    }

    //удалить каждый второй по счету символ, не создавая новую строку
    public StringBuilder RemoveEverySecondSymbol(StringBuilder str) {
        for (int i = 1; i < str.length(); i++) {
            str.delete(i, i+1);
        }
        return str;
    }
}