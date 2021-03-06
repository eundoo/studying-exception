package day1;

public class ExceptionApp1 {

	public static void main(String[] args) {
		//개발자의 코딩 실수로 발생하는 예외들
		
		//NullPointerException
		//참조변수가 null값을 가지고 있다. 즉 그 참조변수는 객체를 참조하고 있지 않는 상태다.
		//그 참조변수로 해당 객체에서 제공하는 속성이나 기능을 사용하는 경우 발생하는 예외이다.
		
		//String text = null;
		//System.out.println(text.length());
		
		//IndexOutofBoundsException
		//		ArrayIndexOutofBoundException
		//		배열의 인텍스범위를 벗어난 인덱스를 사용했을 때 발생하는 예외이다.
		//		StringIndexOutOfBoundException
		//		문자열의 길이를 초과한 인덱스를 사용했을 때 발생하는 예외다.
		//String[] names = {"김유신","강감찬","이순신"};
		//System.out.println(names[1]);
		//System.out.println(names[2]);
		//System.out.println(names[3]);
	
		//String text = "안녕하세요";
		//String subText = text.substring(0, 10);
		//System.out.println("부분문자열: " + subText);
	
		//AritimeticException
		//숫자를 0으로 나눌때 발생하는 예외이다.
		//System.out.println(10/0);
		
		//ClassCastException
		//클래스 형변환이 잘못되었을 때 발생하는 에러
		//Phone p = new SmartPhone();
		//SmartPhone p1 = (SmartPhone) p;
		//FeaturePhone p2 = (FeaturePhone) p;
	}
	
	static class Phone{}
	static class FeaturePhone extends Phone{}
	static class smartPhone extends Phone{}

}
