package creational.abstractfactory;

public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() { //<a href="http://www.naver.com">네이버</a>
		return "<a href=\""+url+"\">"+caption+"</a>";
	}
	
}
