import java.util.Random;


public class SortHelper {
    /**
     * 打印数组
     * @param array
     */
    public static void printArray(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
    }


    /**
     * 随机生成数字
     * @param n 要生成的数组长度
     * @param rangeL 数组左边界
     * @param rangeR 数组右边界
     */
    public static int[] generateArray(int n,int rangeL,int rangeR){
        int array[] = new int[n];
        if(rangeL > rangeR){
            throw new IllegalArgumentException("范围非法");
        } else{
            for (int i = 0;i < n;i++){
                array[i] = new Random().nextInt((rangeR-rangeL+1)+rangeL);
            }
            return array;
        }
    }


    /**
     *  生成近乎有序的数组
     * @param n 生成0 - n
     * @param swapTimes 交换次数
     * @return
     */
    public static int[] generateNearlySortedArray(int n,int swapTimes){
        int result[] = new int[n];
        for(int i = 0;i < n;i++){
            //构造一个有序数组
            result[i] = i;
        }
        for(int i = 0;i < swapTimes;i++){
        Random random = new Random();
        int a = random.nextInt(n);
        int b = random.nextInt(n);
        int temp = result[a];
        result[a] = result[b];
        result[b] = temp;
        }
        return result;
    }
}
