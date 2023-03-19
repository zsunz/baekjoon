class Solution {
    public int solution(int[] common) {
        int answer = 0;

        int plusMinus;
        int rate;
        if(common[1] - common[0] == common[2] - common[1]){
            plusMinus = common[1] - common[0];
            answer = common[common.length-1] + plusMinus;
        }
        else{
            rate = common[1] / common[0];
            answer = common[common.length-1] * rate;
        }






        return answer;
    }
}
