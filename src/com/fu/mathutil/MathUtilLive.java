/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author huynh
 */
public class MathUtilLive {
    public static void main(String[] args) {

        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));

        //kĩ thuật kiểm thử: ước lượng xem giá trị trả về của hàm là gì
        //expected value : 5! = 120
        //mày/hàm ai dó viết chạy thực tế là mấy - actaul, giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
    }
}
