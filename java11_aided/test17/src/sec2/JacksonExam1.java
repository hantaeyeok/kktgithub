package sec2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

class User {
	private String name;
	private int age;
	public User() {}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
public class JacksonExam1 {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
	
		User user = new User("김기태", 43);
		try {
			//객체를 JSON 타입의 파일로 변환
			mapper.writeValue(new File("member.json"), user); //User:{"name":"김기태","age":43} 이 파일로 저장
			//객체를 JSON 타입의 String으로 변환
			String jsonUser = mapper.writeValueAsString(user);
			//System.out.println(jsonUser);
			//"User:{'name':'김기태','age':43}"
		} catch(JsonGenerationException e) {
			System.out.println("JSON 변환 실패");
		}
	}
}
