  package Task5_2SumOfElementsInArrray;
  /**
   * @Author: Truong Ngoc Tinh Anh
   * @Date: 13- 09 -2016
   * @Version: 01
   * @Class for declare field to calculate sum of elements in array
   */
  public class SumThread extends Thread{
	private int lo, hi;
	private int[]arr;
	private int sum = 0;
	
	public SumThread(int lo, int hi, int[] arr) {
		super();
		this.lo = lo;
		this.hi = hi;
		this.arr = arr;
	}
	public SumThread() {
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	/**
	 * @Function for override run method
	 */
	@Override
	public void run() {
		for(int i = this.lo; i < this.hi; i++){
			this.sum += this.arr[i];
		}
	}

}
