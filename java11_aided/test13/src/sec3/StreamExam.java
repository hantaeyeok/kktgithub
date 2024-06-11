package sec3;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
//Stream : 연속된 복합체(컬렉션 프레임워크 형태)로 이루어진 데이터
//Stream 방식이란? 연속된 복합체인 컬렉션 프레임워크를 훨씬 간결하고, 효과적으로 처리하기 
//위한 람다식 방식의 처리
//배열형은 별도의 stream을 생성하지 않고, Arrays 클래스를 활용합니다.
//Arrays.stream(연속된 복합체 이름).메소드();
public class StreamExam {
	public static void main(String[] args) {	
		int[] arr = {95, 80, 100, 85, 90};	//배열 선언
		//stream을 이용한 순회 출력 => stream 은 반복문을 forEach로 활용합니다.
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		//stream을 이용한 합계 계산
		int sum = Arrays.stream(arr).sum();
		//stream을 이용한 평균 계산
		OptionalDouble avg = Arrays.stream(arr).average();
		//stream을 이용한 최대값 계산
		OptionalInt max = Arrays.stream(arr).max();
		//stream을 이용한 최소값 계산
		OptionalInt min = Arrays.stream(arr).min();
		//stream을 이용한 요소수 계산
		int cnt = (int) Arrays.stream(arr).count();	
		System.out.println("arr의 개수 : "+cnt);
		System.out.println("arr의 합계 : "+sum);
		System.out.println("arr의 평균 : "+avg);
		System.out.println("arr의 최대값 : "+max);
		System.out.println("arr의 최소값 : "+min);
	}
}