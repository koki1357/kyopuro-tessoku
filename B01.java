import java.util.*;
class Main {
	public static void main(String[] args) {
      //「System.in」で標準入力
      Scanner sc = new Scanner(System.in);
 
      //int型の要素を代入する配列numbersを用意
      int[] numbers = new int[2];
      
      //forループを回して、nextInt()でスペースの直前の数字をnumbersに代入していく
      for(int i=0; i<numbers.length; i++){
        numbers[i]=sc.nextInt();
        }
 
      //標準出力
      System.out.println(numbers[0] + numbers[1]);
    }
}
