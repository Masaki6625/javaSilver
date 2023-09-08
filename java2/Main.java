public class Main {
  public static void main(String[] args) {
    byte b = 10; short s = 20; int i = 30;
    long l = 40l; float f = 1.15f; double d = 5.78;
    char c = 'A'; boolean o = true;
    System.out.println("byte :" + b);
    System.out.println("short :" + s);
    System.out.println("int :" + i);
    System.out.println("long :" + l);
    System.out.println("float :" + f);
    System.out.println("double :" + d);
    System.out.println("char :" + c);
    System.out.println("boolean :" + o);

    //定数の設定　final装飾詞をつけてあげると値の変えることのできない定数になる
    int num1 = 10;
    num1 = 20;
    final int num2 = 10;
    // num2 = 20;

    //varを利用した変数宣言　ローカル変数型推論（var）を使うとデータ型を宣言せずとも変数に値を代入できる。（勝手にデータがて決めてくれる）
    var c2 = "hello";
    var d2 = 100;
    final var g2 = 100;

    System.out.println(c2);
    System.out.println(d2);
    System.out.println(g2);

    //一次元配列　添え字[]が一つの配列
    char[] c3;
    c3 = new char[3];

    int[] i3 = new int[3];

    String str3[] = new String[]{"welcom","to","Java"};
    c3[0] = 'A'; c3[1] = 'B'; c3[2] = 'C';
    i3[0] = 100; i3[1] = 200; i3[2] = 300;
    System.out.println("strのサイズ：" + str3.length);
    System.out.println("c[0] :" + c3[0]);
    System.out.println("i[1] :" + i3[1]);

    //多次元配列　添え字[]が複数個ある配列

    int[][] array;
    array = new int[3][4];

    array[0][0] = 100;
    array[0][3] = 200;
    System.out.println("array[0][0]の値 :" + array[0][0]);
    System.out.println("array[0][3]の値 :" + array[0][3]);
    
    //コマンドライン引数
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
    System.out.println(args[1] + args[2]);
  }
}