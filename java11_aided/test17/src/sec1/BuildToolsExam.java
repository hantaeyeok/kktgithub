package sec1;
//Ant : 자바 프로젝트의 빌드 도구 시초(X)
//Maven : Springframework 의 빌드 도구(O)
//Gradle : Spring boot 의 빌드 도구(O)
public class BuildToolsExam {
	public static void main(String[] args) {
		String build1 = "Ant - 자바 프로젝트의 빌드 도구 시초(X)";
		String build2 = "Maven - Springframework 의 빌드 도구(O) -> pom.xml";
		String build3 = "Gradle - Spring boot 의 빌드 도구(O) -> build.gradle";
		System.out.println("자바의 빌드 도구");
		System.out.println("빌드(Build) 도구 : 프로젝트에 필요한 구조를 만들어 주는 도구");
		System.out.println("빌드 방식1 : "+build1);
		System.out.println("빌드 방식2 : "+build2);
		System.out.println("빌드 방식3 : "+build3);
	}
}
