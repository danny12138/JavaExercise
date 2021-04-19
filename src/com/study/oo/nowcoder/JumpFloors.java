package com.study.oo.nowcoder;

public class JumpFloors {
    public static void main(String[] args) {
        int ans = JumpFloor(9);
        System.out.println(ans);
    }

    public static int JumpFloor(int target) {
        if (target <= 1){
            return 1;
        }
        return JumpFloor(target-1) + JumpFloor(target-2);
    }
}
