//最近一直被问到斐波那契数列的问题,干脆写一个实现吧
//递归实现的
public class Rabbit {
	
	/*
	 * @param index  
	 * @return 返回斐波那契数列的第index个数据
	 */
	public int fibo(int index){
		if(index==1||index==2){
			return 1;
		}
		return fibo(index-1)+fibo(index-2);
	}
	 
