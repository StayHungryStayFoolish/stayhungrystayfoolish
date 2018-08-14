package io.github.stayhungrystayfoolish.study;

import java.util.Arrays;

/**
 * Created by bonismo@hotmail.com on 2018/8/12 下午8:43
 *
 * @Version: V1.0.0
 * <p>
 * Description:
 */
public class LoopDemo {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("continue");
//                System.out.println("break");
                continue;
            }
            System.out.println("i = " + i);
            sum = sum + i;
        }
        System.out.println("For 循环结束 , sum = " + sum);


        int[] ns = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ns));
        System.out.println(Arrays.asList(ns).getClass());

    }
}


