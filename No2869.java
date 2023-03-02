//땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

//달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

//달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오

//첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

// 2 1 5 -> 4
import java.util.Scanner;

public class No2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();


            String[] arr = input.split(" ");
            String a = arr[0];
            String b = arr[1];
            String v = arr[2];

            int iv = Integer.parseInt(v);
            int ia = Integer.parseInt(a);
            int ib = Integer.parseInt(b);

            int moveForDay = ia-ib;
            int moveDay = iv / moveForDay;

            if(moveForDay * (moveDay-1) + ia >= iv){
                moveDay -= moveForDay * ib;
            }


        System.out.println(moveDay);


        }
    }