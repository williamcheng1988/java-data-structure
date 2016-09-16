package com.data.structure.直接插入排序;

public class SortedArray {
	
	//在排序（升序）的整数数组value 中顺序查找key， 若查找成功返回元素下标，否则返回-1
	public static int indexOf(int[] value, int key){
		if(value!=null){//数组未按升序排序的错误未知处理
			for (int i = 0; i < value.length && value[i]<=key; i++) {
				System.out.println(value[i]+"? ");
				if(value[i]==key){
					return i;
				}
			}
		}
		return -1;
	}
	
	//将 key 按升序插入到 value 数组前 n 个元素中
	public static void insert(int value[], int n , int key){
		int i =0;
		while (i<n && key>=value[i]) {//顺序查找key 的插入位置
			i++;
		}
		for (int j = n-1; j >=i; j--) {
			value[j+1] = value[j];  //将元素向后移动
		}
		value[i] = key;
	}
	
	//输出 前 index 个元素
	public static void print(int[] value, int index){
		for (int i = 0; i < value.length; i++) {
			if(i<index){
				System.out.print( "  "+value[i]);
			}
		}
		System.out.println();
	}
}
