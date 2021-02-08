package com.company.arrays;

import java.util.Scanner;

class MatrixMax {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Rows:");
		int rows = scanner.nextInt();
		System.out.println("Columns:");
		int columns = scanner.nextInt();
		int[][] newMatrix = createMatrix(rows, columns);
		maxInMatrix(newMatrix);
	}

	public static int[][] createMatrix(int rows, int columns) {
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Input next element:");
				matrix[i][j] = scanner.nextInt();
			}
		}
		printMatrix(matrix);
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Find the indexes of the initial appearance of the maximum element in a matrix.
	 * @param matrix
	 */
	public static void maxInMatrix(int[][] matrix) {
		int max = Integer.MIN_VALUE;
		int row = 0;
		int column = 0;
		for (int i = 0; i < matrix.length; i++) {
			int[] inside = matrix[i];
			for (int j = 0; j < inside.length; j++) {
				if (inside[j] > max) {
					max = inside[j];
					row = i;
					column = j;
				}
			}
		}
		System.out.printf("Maximum element in a matrix: %d %d", row, column);
	}
}
