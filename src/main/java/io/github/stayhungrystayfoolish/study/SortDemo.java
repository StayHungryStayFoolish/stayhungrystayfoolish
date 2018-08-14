package io.github.stayhungrystayfoolish.study;

import java.util.Arrays;

/**
 * Created by bonismo@hotmail.com on 2018/8/12 下午10:50
 *
 * @Version: V1.0.0
 * <p>
 * Description:
 */
public class SortDemo {

    public static void main(String[] args) {
        int[] ns = {30, 12, 24, 56, 88, 57, 10, 9};
        for (int i = 0; i < ns.length; i++) {
            for (int j = i + 1; j < ns.length; j++) {
                if (ns[i] > ns[j]) {
                    int tmp = ns[j];
                    ns[j] = ns[i];
                    ns[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }
}


