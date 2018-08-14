package io.github.stayhungrystayfoolish.study;

/**
 * Created by bonismo@hotmail.com on 2018/8/12 下午11:00
 *
 * @Version: V1.0.0
 * <p>
 * Description:
 */
public class CommandParameter {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String arg : args) {
            if ("-version".equalsIgnoreCase(arg))
            System.out.println(arg + "1.0");
        }
    }
}


