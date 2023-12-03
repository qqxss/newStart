package leetcode.sz;

/**
 * 车上最初有 capacity 个空座位。车 只能 向一个方向行驶（也就是说，不允许掉头或改变方向）
 *
 * 给定整数 capacity 和一个数组 trips ,  trip[i] = [numPassengersi, fromi, toi] 表示第 i 次旅行有 numPassengersi 乘客，接他们和放他们的位置分别是 fromi 和 toi 。这些位置是从汽车的初始位置向东的公里数。
 *
 * 当且仅当你可以在所有给定的行程中接送所有乘客时，返回 true，否则请返回 false。
 */

public class N1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        int a=0;
        //记录到达的最后一战
        for(int[] i:trips){
            if(i[2]>a)
                a=i[2];
        }
        //记录每站上车下车人数
        int[] b=new int[a+1];
        for(int[] trip:trips){
            b[trip[1]]+=trip[0];
            b[trip[2]]-=trip[0];
        }
        //对比每站人数是否满足要求
        int count=0;
        for(int i=0;i<=a;++i){
            count+=b[i];
            if(count>capacity){
                return false;
            }
        }
        return true;
    }
}
