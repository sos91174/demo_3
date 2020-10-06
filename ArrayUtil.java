package demo_3;


//自定Array的工具
 
public class ArrayUtil {

	// Array的最大值
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	// Array的最小值
	public int getMin(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	// Array的總和
	public int getSum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Array的平均值
	public int getAvg(int[] arr) {

		return getSum(arr) / arr.length;
	}

	//重載範例
	// 反轉陣列
	public void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
	
	public void reverse(String[] arr){
		
	}

	// 複製array
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	// array排序
	public void sort(int[] arr) {
		// 冒泡排序
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
					//錯誤示範
//					swap(arr[j],arr[j + 1]);
					
					//正確
					swap(arr,j,j + 1);
				}

			}

		}
	}
	
	//錯誤示範  因為沒有加上[]array 會判定為int
//	public void swap(int i,int j){
//		int temp = i;
//		i = j;
//		j = temp;
//	}
	//交換array2個位置元素的值
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

	// 印出array
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	// 找出指定的值
	public int getIndex(int[] arr, int dest) {
		// 線性查詢：

		for (int i = 0; i < arr.length; i++) {

			if (dest == arr[i]) {
				return i;
			}

		}

		return -1;//返回-1代表沒找到
	}

}
