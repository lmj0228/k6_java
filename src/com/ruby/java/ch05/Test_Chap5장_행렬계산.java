package com.ruby.java.ch05;

import java.util.Random;

/*
 * 하나의 자바 파일에서 함수 구현 실습
 */
public class Test_Chap5장_행렬계산 {
	/*
	 * 행렬 덧셈, 곱셈 연산 메소드 정의. 1차버젼: 덧셈후 바로 출력. 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
	 */
	
	static void getData(int[][] x) {
		Random rnd = new Random();

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = rnd.nextInt(10);
			}
		}
	}
	
	static int[][] addMatrix(int[][] B, int[][] C){
		int m[][];
		int r = B.length;
		int c = B[0].length;
		m = new int [r][c];
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				m[i][j] = B[i][j] + C[i][j];
			}
		}
		return m;
	}
	
	static int[][] multiplyMatrix(int[][] B, int[][] E){
		int m[][];
		int r = B.length;
		int c = B[0].length;
		int d = E[0].length;
		m = new int[r][d];
		
		for(int i =0; i < r; i++) {
			for(int j = 0; j < d; j++) {
				for(int k = 0; k < c; k++) {
					m[i][j] += B[i][k] * E[k][j];
				}
			}
		}
		return m;
	}
	
	
	static int[][] transposeMatrix(int[][] B) {
		int m[][];
		int r = B.length;
		int c = B[0].length;
		m =new int[c][r];
		
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				m[i][j] = B[j][i];
			}
			
		}
		return m;
	}
	
	static void showMatrix(int[][] X) {
		// 2차원 모습으로 출력
		for(int i = 0; i < X.length; i++) {
			for(int j = 0; j < X[0].length; j++) {
				System.out.print(X[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {

		/*
		 * 난수 생성으로 초기화 
		 * A[3][4] = B[3][4] + C[3][4]; 
		 * D[3][5] = B[3][4] * E[4][5]; 
		 * F[4][3] = B[3][4]의 전치 행렬 
		 */

		int A[][] = new int[3][4];
		int B[][] = new int[3][4];
		int C[][] = new int[3][4];
		int D[][] = new int[3][5];
		int E[][] = new int[4][5];
		int F[][] = new int[4][3];

		getData(B);
		getData(C);
		getData(E);

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		A = addMatrix(B, C);
		System.out.println("B행렬 : ");
		showMatrix(B);
		System.out.println("C행렬 : ");
		showMatrix(C);
		System.out.println("A행렬 : ");
		showMatrix(A);
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		D = multiplyMatrix(B, E);
		System.out.println("B행렬 : ");
		showMatrix(B);
		System.out.println("E행렬 : ");
		showMatrix(E);
		System.out.println("D행렬 : ");
		showMatrix(D);

		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = transposeMatrix(B);
		System.out.println("B행렬 : ");
		showMatrix(B);
		System.out.println("F행렬 : ");
		showMatrix(F);

	}
}
