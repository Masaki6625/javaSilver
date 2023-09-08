package com.se;

class Foo {
  void print() {
    System.out.println("package sample");
  }
}

class Bar{}
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello!");

    //p17　時間を測るクラスメソッド
    int result = 0;
    long start = System.currentTimeMillis();
    for(int i = 0; i < 100000000; i++) {
      result += i;
    }
    long end = System.currentTimeMillis();
    System.out.println((end - start) + "ms");

    //p21　パッケージ化の解説
    com.se.Foo f = new com.se.Foo();
    f.print();
  }
}