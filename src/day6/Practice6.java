package day6;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Nhap n:");
		int n = scanner.nextInt();*/
		//System.out.println("Tong S la: " + tinhTong(n));
		//System.out.println("Tich cac uoc le la: " + tichUSL(n));
		//System.out.println("Tong cac uoc nho hon chinh no la: " + tongUSN(n));
		//System.out.println("Tich cac chu so le cua n la : " + tichCSL(n));
		//System.out.println("Chu so dau cua n la : " + csdau(n));
		//System.out.println("So dao cua n la : " + daoNguoc(n));
		//System.out.println("Chu so lon nhat cua n la : " + csln(n));
		
		//cau 8 va 9
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		System.out.println("UCLN cua a va b la: " + ucln(a,b));
		System.out.println("BCNN cua a va b la: " + bcnn(a,b));
	}
	
	//cau 1
	public static float tinhTong(int n) {
		float s = 0;
		for (int i=1; i<=n; i++) {
			s=s+(i/(i+1.00f));
		}
		return s;
	}
	
	//cau 2
	public static int tichUSL(int n) {
		int tich = 1;
		for (int i=1; i<=n; i++) {
			if (n%i==0 & i%2!=0) {
				tich = tich*i;
			}
		}
		return tich;
	}
	
	//cau 3
	public static int tongUSN(int n) {
		int tong = 0;
		for (int i=1; i<n; i++) {
			if (n%i==0) {
				tong = tong+i;
			}
		}
		return tong;
	}
	
	//cau 4
	public static int tichCSL(int n) {
		int tich = 1;
		int cs;
		while (n>0) {
			cs = n%10;
			if (cs%2!=0) {
				tich = tich * cs;
			}
			n = n/10;
		}
		return tich;
	}
	
	//cau 5
	public static int csdau(int n) {
		int tam;
		int y = 0;
		for (int i=0; i<=n; i++) {
			while (n>0) {
				tam = n/10;
				if (tam == 0) {
					y = n%10;
				}
				n = n/10;
			}
		}
		return y; 
	}
	
	//cau 6
	public static int daoNguoc(int n) {
		int cscuoi;
		int sodao = 0;
		while (n>0) {
			cscuoi = n%10;
			sodao = (sodao + cscuoi);
			sodao = sodao * 10; 
			n = n/10;
		}
		sodao = sodao/10;
		return sodao;
	}
	
	//cau 7
	public static int csln(int n) {
		int max = 0;
		int i;
		while (n>0){
			i = n%10;
			if (i>max) {
				max = i;
			}
			n = n/10;
		}
		return max;
	}
	
	//cau 8
	public static int ucln(int a, int b) {
		int max = 0;
		for (int i=1; i<=a; i++) {
			if (a%i == 0 & b%i ==0 &i>max) {
				max = i;
			}
		}
		return max;
	}
	
	//cau 9
	public static int bcnn(int a, int b) {
		int min = a*b/ucln(a,b);
		return min;
	}
}
	
