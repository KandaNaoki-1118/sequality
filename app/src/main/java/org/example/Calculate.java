package org.example;

public class Calculate {

  // 二つの数値の和を計算するメソッド
  public int sum(int x, int y) {
    return x + y;
  }

  // 配列の和を計算するメソッド
  public int sum(int[] numbers) {
    int total = 0;
    for (int number : numbers) {
      total += number;
    }
    return total;
  }

  // 配列の平均を計算するメソッド
  public double average(int[] numbers) {
    int total = sum(numbers);
    return (double) total / numbers.length;
  }

  // メインメソッド
  public static void main(String[] args) {
    Calculate calc = new Calculate();

    // 2と3の和と平均を計算
    int sumOfTwoAndThree = calc.sum(2, 3);
    double averageOfTwoAndThree = calc.average(new int[] { 2, 3 });
    System.out.println("Hello World!");
    System.out.println("Sum of 2and 3is " + sumOfTwoAndThree + ". Average is " + averageOfTwoAndThree + ".");

    // 1から10までの和と平均を計算
    int[] numbers1To10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sumOf1To10 = calc.sum(numbers1To10);
    double averageOf1To10 = calc.average(numbers1To10);
    System.out.println("Sum of 1to 10is " + sumOf1To10 + ". Average is " + averageOf1To10 + ".");

    // 1から10までの奇数と偶数の和を計算
    int[] oddNumbers1To10 = { 1, 3, 5, 7, 9 };
    int[] evenNumbers1To10 = { 2, 4, 6, 8, 10 };
    int sumOfOddNumbers = calc.sum(oddNumbers1To10);
    int sumOfEvenNumbers = calc.sum(evenNumbers1To10);
    System.out.println("Sum of odd of 1to 10is " + sumOfOddNumbers + ". Sum of even is " + sumOfEvenNumbers + ".");
  }
}
