package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        //제거 메서드 호출
        String answer = removeString(cryptogram);
        return answer;
    }

    //인접문자가 같으면 제거하는 기능
    public static String removeString(String cryptogram){
        //추출할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        //정답 변수
        String word = "";
        //인스턴스 한글자씩 쪼개기
        String[] arr = cryptogram.split("");
        //처음 글자수
        int initSize = arr.length;
        //sb에 저장되는 횟수
        int count = 0;

        //1글자일때
        if( initSize == 1 ) {
            return cryptogram;
        }else if( initSize == 2 ) { //2글자일때
            //2글자가 서로 같으면 빈문자열 리턴
            if ((arr[0].equals(arr[1]))) {
                return word;
            } else { //2글자인데 서로 다르면 그냥 단어 리턴
                return cryptogram;
            }
        }

        return word;
    }
}
