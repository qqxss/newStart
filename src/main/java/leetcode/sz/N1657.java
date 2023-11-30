package leetcode.sz;

import java.util.Arrays;

/**
 * 如果可以使用以下操作从一个字符串得到另一个字符串，则认为两个字符串 接近 ：
 *
 * 操作 1：交换任意两个 现有 字符。
 * 例如，abcde -> aecdb
 * 操作 2：将一个 现有 字符的每次出现转换为另一个 现有 字符，并对另一个字符执行相同的操作。
 * 例如，aacabb -> bbcbaa（所有 a 转化为 b ，而所有的 b 转换为 a ）
 * 你可以根据需要对任意一个字符串多次使用这两种操作。
 *
 * 给你两个字符串，word1 和 word2 。如果 word1 和 word2 接近 ，就返回 true ；否则，返回 false 。
 */
public class N1657 {
    public boolean closeStrings(String word1, String word2) {
        int[] a=new int[26],b=new int[26];
        //统计各字母数量
        for(char c:word1.toCharArray())
            a[c-'a']++;
        for(char c:word2.toCharArray())
            a[c-'a']++;
        //排除一种数量等于零且另一个不为零的情况
        for (int i = 0; i <26; i++) {
            if(a[i]>0&&b[i]==0||a[i]==0&&b[i]>0)
                return false;
        }
        //如果数量没有不同时为零，比较字母数量不为零的是否相等
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }

    public static void main(String[] args) {
        int[] a=new int[26];
        for(char c:"adc".toCharArray())
            a[c-'a']++;
        for (int c:a) {
            System.out.println(c);
        }
    }
}
