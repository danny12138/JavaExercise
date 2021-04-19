package com.study.oo.nowcoder;

public class binarySearch {
    public static void main(String[] args) {

        int ans = upper_bound_(10,2,new int[]{1,1,2,7,7,7,7,9,9,10});
        System.out.println(ans);
    }
        /**
         * 二分查找
         * @param n int整型 数组长度
         * @param v int整型 查找值
         * @param a int整型一维数组 有序数组
         * @return int整型
         */
        public static int upper_bound_ (int n, int v, int[] a) {
            int index = n/2;
            if (a[index] >= v){
                while(a[index] >= v){
                    index--;
                }
                return index+2;
            }else if (v > a[index]){
                while(v >= a[index]){
                    index++;
                    if (index > n){
                        return n+1;
                    }
                }
                return index-1;
            }else{
                index = 0;
                if (v < a[0]){
                    return n+1;
                }
                while(v >= a[index]){
                    index++;
                }
                return index;
            }
        }
    }

/*
public int upper_bound_ (int n, int v, int[] a) {
        // write code here
        int left = 0,right = n-1;
        int mid = 0;
        if(a[0] > v){
            return 1;
        }
        while(left <= right){
            mid =(right + left)/2;
            if(a[mid] > v){
                right = mid -1;
            }else if(a[mid] < v){

                left = mid + 1;
            }else{
                while(mid >=0 && a[mid] == v){
                    mid--;
                }
                return mid + 2;
            }
        }
        return n + 1;
    }
 */