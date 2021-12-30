package com.tt.app.suanfa.easy;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * 示例 1：
 * 输入：x = 121
 * 输出：true
 * 示例 2：
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 进阶：你能不将整数转为字符串来解决这个问题吗？
 *
 * @author tecZ
 * @date 2021-12-27
 */
public class Demo9 {
    public static void main(String[] args) {
        int num = 121;
//        boolean b = ifHuiWen(num);
        boolean b = ifHuiWenNum(num);
        System.out.println(b);
    }

    /**
     * 方法1:转字符串采用StringBuilder的reverse反转判断是否相
     *
     * @param num
     * @return
     */
    private static boolean ifHuiWen(int num) {
        boolean b = false;
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        if (sb.toString().equals(sb.reverse().toString())) {
            b = true;
        }
        return b;
    }

    /**
     * 方法2:转字符串收尾对比，不等直接非回文
     *
     * @param num
     * @return
     */
    private static boolean ifHuiWenNum(int num) {
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
