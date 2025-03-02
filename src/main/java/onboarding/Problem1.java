package onboarding;

import java.util.List;

class Problem1 {

    //페이지 계산 중 큰 숫자 저장할 변수
    private static int pobinum; //포비 최종 점수
    private static int crongnum; //크롱 최종 점수
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        //점수 초기화
        pobinum = 0;
        crongnum = 0;

        //페이지가 제대로 들어오지 않을 경우(예외 상황) -1 리턴하는 기능
        if( pobi.get(0) + 1 != pobi.get(1) || crong.get(0) + 1 != crong.get(1) ) {
            return -1;
        }

        //페이지 별 계산 점수가 더 큰 숫자를 저장하는 기능
        for(int i = 0 ; i < 2 ; i++){
            if( pobinum < pagecal(pobi.get(i)) ) pobinum = pagecal(pobi.get(i));
            if( crongnum < pagecal(crong.get(i)) ) crongnum = pagecal(crong.get(i));
        }

        //answer 선언
        int answer;

        //포비와 크롱의 점수를 비교하여 해당 숫자를 리턴하는 기능
        if(pobinum > crongnum) { //포비가 크롱을 이겼을 경우
            answer = 1;
        } else if (pobinum < crongnum) { //크롱이 포비를 이겼을 경우
            answer = 2;
        } else { //포비가 크롱이 동점일 경우
            answer = 0;
        }

        return answer;
    }

    //페이지 번호를 입력받아 점수를 계산하는 기능
    public static int pagecal(int pagenum){
        //페이지 덧셈 변수 초기화
        int pagesum = 0;
        //페이지 곱셈 변수 초기화
        int pagemulti = 1;

        //페이지 자릿수에 따른 계산 반복문을 통해 점수를 저장하는 기능
        while(pagenum > 0){
            //자릿수 덧셈 저장
            pagesum += pagenum % 10;
            //자릿수 곱셈 저장
            pagemulti *= pagenum % 10;
            //10으로 나눈 몫
            pagenum /= 10;
        }

        //덧셈과 곱셈 중 더 큰 수를 리턴하는 기능
        return Math.max(pagesum, pagemulti);
    }

}