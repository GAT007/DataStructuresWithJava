package chapter1.JavaPrimer;

public class Counter {
	
	private int count;
	
	public Counter() {} //Default constructor
	public Counter(int initial) {count =initial;} // Parameterized Constructor
	public int getCount() {return count;} //return value function
	public void increment() {count++;} //increment by 1 update function
	public void increment(int delta) {count = count+delta;} // update function increment by delta
	public void reset() {count=0;} //update function reset value of count to 0

}
