package creational.prototype;
import java.util.List;
//Prototype(원형) Pattern : 원형이 되는 객체를 복제하여 새로운 객체를 생성하는 패턴 
public class PrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee();	//Employee는 원본(Prototype)
		emp1.loadData();
		
		Employee emp2 = (Employee) emp1.clone();	//Prototype의 임시 제품
		List<String> list = emp2.getEmpList();	//Prototype으로 얻어진 복제품
		list.add("김민식");
		for(String s:list) {
			System.out.println(s);
		}
	}
}
