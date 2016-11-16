package com.google.challenges.level1a;

import java.util.Arrays;

public class Answer {
	static private int[][] factorization = { { 0 }, { 1 }, { 1, 2 }, { 1, 3 }, { 1, 2, 4 }, { 1, 5 }, { 1, 2, 3, 6 },
			{ 1, 7 }, { 1, 2, 4, 8 }, { 1, 3, 9 }, { 1, 2, 5, 10 }, { 1, 11 }, { 1, 2, 3, 4, 6, 12 }, { 1, 13 },
			{ 1, 2, 7, 14 }, { 1, 3, 5, 15 }, { 1, 2, 4, 8, 16 }, { 1, 17 }, { 1, 2, 3, 6, 9, 18 }, { 1, 19 },
			{ 1, 2, 4, 5, 10, 20 }, { 1, 3, 7, 21 }, { 1, 2, 11, 22 }, { 1, 23 }, { 1, 2, 3, 4, 6, 8, 12, 24 },
			{ 1, 5, 25 }, { 1, 2, 13, 26 }, { 1, 3, 9, 27 }, { 1, 2, 4, 7, 14, 28 }, { 1, 29 },
			{ 1, 2, 3, 5, 6, 10, 15, 30 }, { 1, 31 }, { 1, 2, 4, 8, 16, 32 }, { 1, 3, 11, 33 }, { 1, 2, 17, 34 },
			{ 1, 5, 7, 35 }, { 1, 2, 3, 4, 6, 9, 12, 18, 36 }, { 1, 37 }, { 1, 2, 19, 38 }, { 1, 3, 13, 39 },
			{ 1, 2, 4, 5, 8, 10, 20, 40 }, { 1, 41 }, { 1, 2, 3, 6, 7, 14, 21, 42 }, { 1, 43 }, { 1, 2, 4, 11, 22, 44 },
			{ 1, 3, 5, 9, 15, 45 }, { 1, 2, 23, 46 }, { 1, 47 }, { 1, 2, 3, 4, 6, 8, 12, 16, 24, 48 }, { 1, 7, 49 },
			{ 1, 2, 5, 10, 25, 50 }, { 1, 3, 17, 51 }, { 1, 2, 4, 13, 26, 52 }, { 1, 53 },
			{ 1, 2, 3, 6, 9, 18, 27, 54 }, { 1, 5, 11, 55 }, { 1, 2, 4, 7, 8, 14, 28, 56 }, { 1, 3, 19, 57 },
			{ 1, 2, 29, 58 }, { 1, 59 }, { 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60 }, { 1, 61 }, { 1, 2, 31, 62 },
			{ 1, 3, 7, 9, 21, 63 }, { 1, 2, 4, 8, 16, 32, 64 }, { 1, 5, 13, 65 }, { 1, 2, 3, 6, 11, 22, 33, 66 },
			{ 1, 67 }, { 1, 2, 4, 17, 34, 68 }, { 1, 3, 23, 69 }, { 1, 2, 5, 7, 10, 14, 35, 70 }, { 1, 71 },
			{ 1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72 }, { 1, 73 }, { 1, 2, 37, 74 }, { 1, 3, 5, 15, 25, 75 },
			{ 1, 2, 4, 19, 38, 76 }, { 1, 7, 11, 77 }, { 1, 2, 3, 6, 13, 26, 39, 78 }, { 1, 79 },
			{ 1, 2, 4, 5, 8, 10, 16, 20, 40, 80 }, { 1, 3, 9, 27, 81 }, { 1, 2, 41, 82 }, { 1, 83 },
			{ 1, 2, 3, 4, 6, 7, 12, 14, 21, 28, 42, 84 }, { 1, 5, 17, 85 }, { 1, 2, 43, 86 }, { 1, 3, 29, 87 },
			{ 1, 2, 4, 8, 11, 22, 44, 88 }, { 1, 89 }, { 1, 2, 3, 5, 6, 9, 10, 15, 18, 30, 45, 90 }, { 1, 7, 13, 91 },
			{ 1, 2, 4, 23, 46, 92 }, { 1, 3, 31, 93 }, { 1, 2, 47, 94 }, { 1, 5, 19, 95 },
			{ 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 96 }, { 1, 97 }, { 1, 2, 7, 14, 49, 98 }, { 1, 3, 9, 11, 33, 99 },
			{ 1, 2, 4, 5, 10, 20, 25, 50, 100 }, { 1, 101 }, { 1, 2, 3, 6, 17, 34, 51, 102 }, { 1, 103 },
			{ 1, 2, 4, 8, 13, 26, 52, 104 }, { 1, 3, 5, 7, 15, 21, 35, 105 }, { 1, 2, 53, 106 }, { 1, 107 },
			{ 1, 2, 3, 4, 6, 9, 12, 18, 27, 36, 54, 108 }, { 1, 109 }, { 1, 2, 5, 10, 11, 22, 55, 110 },
			{ 1, 3, 37, 111 }, { 1, 2, 4, 7, 8, 14, 16, 28, 56, 112 }, { 1, 113 }, { 1, 2, 3, 6, 19, 38, 57, 114 },
			{ 1, 5, 23, 115 }, { 1, 2, 4, 29, 58, 116 }, { 1, 3, 9, 13, 39, 117 }, { 1, 2, 59, 118 }, { 1, 7, 17, 119 },
			{ 1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40, 60, 120 }, { 1, 11, 121 }, { 1, 2, 61, 122 },
			{ 1, 3, 41, 123 }, { 1, 2, 4, 31, 62, 124 }, { 1, 5, 25, 125 },
			{ 1, 2, 3, 6, 7, 9, 14, 18, 21, 42, 63, 126 }, { 1, 127 }, { 1, 2, 4, 8, 16, 32, 64, 128 },
			{ 1, 3, 43, 129 }, { 1, 2, 5, 10, 13, 26, 65, 130 }, { 1, 131 },
			{ 1, 2, 3, 4, 6, 11, 12, 22, 33, 44, 66, 132 }, { 1, 7, 19, 133 }, { 1, 2, 67, 134 },
			{ 1, 3, 5, 9, 15, 27, 45, 135 }, { 1, 2, 4, 8, 17, 34, 68, 136 }, { 1, 137 },
			{ 1, 2, 3, 6, 23, 46, 69, 138 }, { 1, 139 }, { 1, 2, 4, 5, 7, 10, 14, 20, 28, 35, 70, 140 },
			{ 1, 3, 47, 141 }, { 1, 2, 71, 142 }, { 1, 11, 13, 143 },
			{ 1, 2, 3, 4, 6, 8, 9, 12, 16, 18, 24, 36, 48, 72, 144 }, { 1, 5, 29, 145 }, { 1, 2, 73, 146 },
			{ 1, 3, 7, 21, 49, 147 }, { 1, 2, 4, 37, 74, 148 }, { 1, 149 },
			{ 1, 2, 3, 5, 6, 10, 15, 25, 30, 50, 75, 150 }, { 1, 151 }, { 1, 2, 4, 8, 19, 38, 76, 152 },
			{ 1, 3, 9, 17, 51, 153 }, { 1, 2, 7, 11, 14, 22, 77, 154 }, { 1, 5, 31, 155 },
			{ 1, 2, 3, 4, 6, 12, 13, 26, 39, 52, 78, 156 }, { 1, 157 }, { 1, 2, 79, 158 }, { 1, 3, 53, 159 },
			{ 1, 2, 4, 5, 8, 10, 16, 20, 32, 40, 80, 160 }, { 1, 7, 23, 161 }, { 1, 2, 3, 6, 9, 18, 27, 54, 81, 162 },
			{ 1, 163 }, { 1, 2, 4, 41, 82, 164 }, { 1, 3, 5, 11, 15, 33, 55, 165 }, { 1, 2, 83, 166 }, { 1, 167 },
			{ 1, 2, 3, 4, 6, 7, 8, 12, 14, 21, 24, 28, 42, 56, 84, 168 }, { 1, 13, 169 },
			{ 1, 2, 5, 10, 17, 34, 85, 170 }, { 1, 3, 9, 19, 57, 171 }, { 1, 2, 4, 43, 86, 172 }, { 1, 173 },
			{ 1, 2, 3, 6, 29, 58, 87, 174 }, { 1, 5, 7, 25, 35, 175 }, { 1, 2, 4, 8, 11, 16, 22, 44, 88, 176 },
			{ 1, 3, 59, 177 }, { 1, 2, 89, 178 }, { 1, 179 },
			{ 1, 2, 3, 4, 5, 6, 9, 10, 12, 15, 18, 20, 30, 36, 45, 60, 90, 180 }, { 1, 181 },
			{ 1, 2, 7, 13, 14, 26, 91, 182 }, { 1, 3, 61, 183 }, { 1, 2, 4, 8, 23, 46, 92, 184 }, { 1, 5, 37, 185 },
			{ 1, 2, 3, 6, 31, 62, 93, 186 }, { 1, 11, 17, 187 }, { 1, 2, 4, 47, 94, 188 },
			{ 1, 3, 7, 9, 21, 27, 63, 189 }, { 1, 2, 5, 10, 19, 38, 95, 190 }, { 1, 191 },
			{ 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 192 }, { 1, 193 }, { 1, 2, 97, 194 },
			{ 1, 3, 5, 13, 15, 39, 65, 195 }, { 1, 2, 4, 7, 14, 28, 49, 98, 196 }, { 1, 197 },
			{ 1, 2, 3, 6, 9, 11, 18, 22, 33, 66, 99, 198 }, { 1, 199 },
			{ 1, 2, 4, 5, 8, 10, 20, 25, 40, 50, 100, 200 } };

	public static int answer(String s) {
		int size = s.length();

		int numberOfFactors = factorization[size].length;
		int[] factors = Arrays.copyOf(factorization[size], numberOfFactors);

		char[] c = s.toCharArray();
		int factorsToProcess = numberOfFactors - 1;
		for (int i = 1; i < c.length; i++) {
			for (int j = 0; j < numberOfFactors; j++) {
				int thisFactor = factors[j];

				if (thisFactor > 0 && i >= thisFactor) {
					if (c[i] != c[i - thisFactor]) {
						factors[j] = -1;
						factorsToProcess--;
					}
				}
			}
			if (factorsToProcess == 0) return 1;
		}
		for (int factor : factors) {
			if (factor > 0) return size / factor;
		}
		return 1;
	}
}