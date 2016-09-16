package com.data.structure.直接插入排序;

/**
 * @author William Cheng
 * 2016年9月16日-下午6:02:43
 */
public class Example {
	
	/**
	 * @return
	 * @throws java.io.IOException
	 */
	public static int [] readInt() throws java.io.IOException{
		System.out.println("输入无需的整数序列：");
		byte buffer[] = new byte[512];//以字节数组作为缓冲区
		//从标准输入流中读取若干字节到缓冲区 buffer， 返回实际读取字节数
		int count = System.in.read(buffer);
		if(count<=2){//输入回车符 或 ^Z
			return null;
		}
		//由 buffer 数组中从0开始长度为 count-2 的若干字节构成
		String s = new String(buffer, 0 , count-2);
		String str[] = s.split(" ");//分解成字符串数组
		int value[] = new int[str.length];
		int i = 0, j =0;
		while (i < str.length) {
			try {//异常处理语句， 存在潜在异常的代码 
				value[j] = Integer.parseInt(str[i]);
				j++;
			} catch (Exception e) {
				System.out.println(str[i]+"字符串不能转为整数");
			} finally {
				i++;
			}
		}
		if(i==j){
			return value;
		}
		int keys[] = new int[j];
		//将 value 数组从0 开始的j 个元素复制到keys 数组从0开始的元素中
		System.arraycopy(value, 0, keys, 0, j);
		
		return keys;
	}

	/**
	 * @param args
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws java.io.IOException {//抛出异常交由java 虚拟机处理
		int value[] = Example.readInt();
		for (int i = 0; i < value.length; i++) {
			System.out.print("插入： "+ value[i] + ", \t排序序列");
			System.out.println("排序前：");
			SortedArray.print(value, i+1);
			SortedArray.insert(value, i, value[i]);
			System.out.println("排序后：");
			SortedArray.print(value, i+1);
		}
		int key = 100;
		int index = SortedArray.indexOf(value, key);
		System.out.println("顺序查找"+key+","+(index==-1?"不":"")+"成功");
	}
}
