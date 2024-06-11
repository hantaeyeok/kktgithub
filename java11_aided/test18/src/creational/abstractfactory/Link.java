package creational.abstractfactory;

public abstract class Link extends Item {
	protected String url;
	//<a href="http://www.naver.com">네이버</a>
	//href 속성의 값("http://www.naver.com")이 url
	//a 태그 사이에 있는 "네이버"는 caption
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
	public abstract String makeHTML();
}
