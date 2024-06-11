package creational.abstractfactory;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>"+title+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("</body>\n");
		buffer.append("<h1>"+title+"</h1>");
		buffer.append("<ul>\n");
		for(Object o : content) {
			Item item = (Item) o;
			buffer.append("<li>"+item.makeHTML()+"</li>");
		}
		buffer.append("</ul>\n");
		buffer.append("</html>");
		return buffer.toString();
	}
	
}
