package structural.composite;

import java.util.ArrayList;
import java.util.List;
//Composite Pattern : 컴파일 단계에서가 아닌 런타임 단계에서 복합 방법이나 대상을 변경할 수 있다는 점에서 유연성을 갖는 구조 패턴
//그러므로, 여러 개의 객체들로 구성된 복합 객체와 단일 객체를 클라이언트에서 동일하게 사용하는 패턴이다.
public class CompositePattern {

	public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();
		
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);
		
        drawing.draw("Red");
		
        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());
        
        for(Shape shape : shapes) {
            shape.draw("Green");
        }
	}

}
