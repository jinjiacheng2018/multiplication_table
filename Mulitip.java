public class Mulitip{
	
	public static void main(String[] args){
		// 打印九九乘法表
		for (int i = 1; i < 10; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i*j) + " ");
			}
			System.out.println();
		}
		
	}
	
}