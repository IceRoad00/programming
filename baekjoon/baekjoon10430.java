package java;

import java.util.Scanner;

public class baekjoon10430 {
    public static void main(String[] args) {
// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
Scanner scan = new Scanner(System.in);
int A = scan.nextInt();
int B = scan.nextInt();
int C = scan.nextInt();

System.out.println((A+B)%C);
System.out.println(((A%C)+(B%C))%C);
System.out.println((A*B)%C);
System.out.println(((A%C)*(B%C))%C);


    }
}
