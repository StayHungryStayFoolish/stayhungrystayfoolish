package io.github.stayhungrystayfoolish.study;

import java.math.BigDecimal;

/**
 * Created by bonismo@hotmail.com on 2018/8/12 下午3:56
 *
 * @Version: V1.0.0
 * <p>
 * Description:
 */
public class VariableDemo {

    private static int i3;

    public static void main(String[] args) {
        int i1 = 10;
        int i3 = 2_000_000_000;  // 使用 _ 更好的标识数字
        int i4 = 0xff0000;
        int i5 = 0b1000000000;
        // 二进制
        System.out.println("二进制" + Integer.toBinaryString(i4));
        // 十六进制
        System.out.println("十六进制" + Integer.toHexString(i4));
        int i2 = 5;
        int n1 = i2 << 10;
        int n2 = i1 >> 11;
        System.out.println(n1);
        System.out.println(n2);
        int a = 20021230;
        System.out.println("a 非的结果是：" + (~a));

        long l = (1 + i2) * i2 / 2;
        System.out.println(l);

        BigDecimal max = BigDecimal.valueOf(-20);
        BigDecimal min = BigDecimal.valueOf(0.9);
        BigDecimal abs = BigDecimal.valueOf(-10.92222);
        System.out.println(max.subtract(min));
        System.out.println(max.add(min));
        System.out.println(max.compareTo(abs));

        int n = 1;
        boolean and = (5 < n) && (5 / n > 0);
        boolean or = (5 < n) || (5 / n > 0);
        System.out.println(and);
        System.out.println(or);
        System.out.println(5 / n < 0);
        System.out.println(5 / n );

        System.out.print("中文 str\n");
        System.out.print("\"Hello\\\"");
    }
}


