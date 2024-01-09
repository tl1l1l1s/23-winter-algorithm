//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); 
		
		sc.close();

		int len = str.length(); 
		
		int max = 0, arr_num = 0, count = 0; 
		char alp_arr[] = new char[26]; 
		
		for(int i=0;i<len;i++) {
			int num = str.charAt(i) - 65; 
			
			if(num>=32 && num<=57)  
				num -= 32;			
					
			alp_arr[num] += 1; 
		}
		
		for(int i=0;i<alp_arr.length;i++) {
			if(alp_arr[i]>max) { 
				max = alp_arr[i]; 
				arr_num = i;
			}
		}
		
		for(int i=0;i<alp_arr.length;i++) {
			if(max == alp_arr[i]) { 
				count++;	
			}
		}
		
		if(count>=2) { 
			System.out.println('?');
		}else { 
			System.out.println((char)(arr_num+65));
		}
		sc.close();
	}
}