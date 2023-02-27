import java.util.Scanner;

public class No4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfCase = sc.nextInt();

        sc.nextLine();

        for(int i=0; i<numOfCase; i++){
            String numOfStu = sc.nextLine();
            String [] arr = numOfStu.split(" ");

            int num = Integer.parseInt(arr[0]);
            int sum = 0;
            for(int j=1; j<=num; j++){
                sum += Integer.parseInt(arr[j]);
            }
            double ave;


            ave = sum / num;

            double cnt = 0.0;
            for(int j=0; j<num; j++){
                if(Double.parseDouble(arr[j+1]) > ave){
                    cnt++;
                }
            }

            double rate;
            rate = (cnt / num) * 100.0;

            System.out.printf("%.3f", rate);
            System.out.println("%");


        }

    }
}