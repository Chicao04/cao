package tuan3;
import java.util.Scanner ;
public class bai3 {
	public static void main(String[] args ) {
		Scanner c = new Scanner(System.in);
		System.out.println("Nhập họ và tên của bạn: ");
		String ten = c.nextLine();
		String[] chuoiCon = ten.split(" ");
		String email = chuoiCon[chuoiCon.length - 1 ];
		for(int i = 0 ; i < chuoiCon.length - 1 ; i++) {
			email += chuoiCon[i].charAt(0); 
		}
		System.out.println(email.toLowerCase() + "@gmail.com");
		
		
	}
}
