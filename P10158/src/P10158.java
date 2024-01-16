import java.util.Scanner;

public class P10158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt(); // 가로
		int h = sc.nextInt(); // 세로
		int p = sc.nextInt(); // x좌표
		int q = sc.nextInt(); // y좌표
		int t = sc.nextInt(); // 시간

		/*int[][] arr = new int[w + 1][h + 1]; 

		for(int i = 0; i <= w; i++){
			for(int j = 0; j <= h; j++)
				arr[i][j] = j;
		}
*/
		int time_count = 0;
		boolean check_p = false;
		boolean check_q = false;

		while(time_count != t){
			if(p >= w){
				check_p = true;
			} else{
				if(p == 0)
					check_p = false;
			}

			if(q >= h){
				check_q = true;
			} else{
				if(q == 0)
					check_q = false;
			}

			if(p < w && check_p == false){
				p++;
			}else{
				p--;
			}

			if(q < h && check_q == false){
				q++;
			}else{
				q--;
			}

			time_count++;
	
			// System.out.println(p + " " + q);
		}

		System.out.println(p + " " + q);

		sc.close();
	}
}
