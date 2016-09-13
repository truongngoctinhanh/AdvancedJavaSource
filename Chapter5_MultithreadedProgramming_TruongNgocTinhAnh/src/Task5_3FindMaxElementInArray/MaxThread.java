package Task5_3FindMaxElementInArray;
/**
 * @Author: Truong Ngoc Tinh Anh
 * @Date: 13- 09 -2016
 * @Version: 01
 * @Class for declare field to find max element in array
 */
public class MaxThread extends Thread{
	private int lo, hi;
	private int[]arr;
	private int max;
	public MaxThread(int lo, int hi, int[] arr) {
		super();
		this.lo = lo;
		this.hi = hi;
		this.arr = arr;
	}
	public MaxThread() {
		super();
	}
	public int getLo() {
		return lo;
	}
	public void setLo(int lo) {
		this.lo = lo;
	}
	public int getHi() {
		return hi;
	}
	public void setHi(int hi) {
		this.hi = hi;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	/**
	 * @Function for override run method
	 */
	@Override
	public void run() {
		max = arr[0];
		for(int i = this.lo; i < this.hi; i++){
			if(max < arr[i])
				max = arr[i];
		}
	}
}
