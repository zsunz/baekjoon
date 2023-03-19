class 연속된수의합 {
    public int[] solution(int num, int total) {
        int [] answer = new int [num];
        int middle = total/num;

        if(total%num == 0){
            for(int i=0; i<num; i++){
                answer[i] = middle - ((num-1)/2) + i;
            }
        }
        else{
            for(int i=0; i<num; i++){
                answer[i] = middle - (num/2 - 1) + i;
            }
        }




        return answer;
    }
}
