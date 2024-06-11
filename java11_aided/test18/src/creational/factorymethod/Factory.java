package creational.factorymethod;
//Product 추상 클래스의 객체를 생성하는 Factory 추상 클래스 
//Factory Method 패턴 : Product를 만드는 create()가 있으므로 이러한 것은 Factory Method 패턴이라고 함.
public abstract class Factory {	//추상체로서 create() 메소드를 활용하여 Product를 만듦
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
