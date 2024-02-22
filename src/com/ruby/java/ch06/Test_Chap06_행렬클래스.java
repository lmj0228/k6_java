package com.ruby.java.ch06;

import java.util.Random;

class Matrix {
    int rows;
    int cols;
    int[] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows * cols];
    }

    void getData() {
        Random rnd = new Random();

        for (int i = 0; i < rows * cols; i++) {
            data[i] = rnd.nextInt(10); // 난수로 초기화
        }
    }

    Matrix addMatrix(Matrix b) {
        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows * cols; i++) {
            result.data[i] = this.data[i] + b.data[i];
        }

        return result;
    }

    Matrix multiplyMatrix(Matrix b) {
        Matrix result = new Matrix(rows, b.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < b.cols; j++) {
                int sum = 0;
                for (int k = 0; k < cols; k++) {
                    sum += this.data[i * cols + k] * b.data[k * b.cols + j];
                }
                result.data[i * result.cols + j] = sum;
            }
        }

        return result;
    }

    Matrix transposeMatrix() {
        Matrix result = new Matrix(cols, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[j * result.cols + i] = this.data[i * cols + j];
            }
        }

        return result;
    }

    void showMatrix(String str) {
        System.out.println(str);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i * cols + j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class Test_Chap06_행렬클래스 {

    public static void main(String[] args) {
        Matrix A, D, F;
        Matrix B = new Matrix(3, 4);
        Matrix C = new Matrix(3, 4);
        Matrix E = new Matrix(4, 5);

        B.getData();
        C.getData();
        E.getData();

        System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
        A = B.addMatrix(C);
        B.showMatrix("B[3][4]");
        C.showMatrix("C[3][4]");
        A.showMatrix("A[3][4]");

        System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
        D = B.multiplyMatrix(E);
        B.showMatrix("B[3][4]");
        E.showMatrix("E[4][5]");
        D.showMatrix("D[3][5]");

        System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
        F = B.transposeMatrix();
        B.showMatrix("B[3][4]");
        F.showMatrix("F[4][3]");
    }
}
