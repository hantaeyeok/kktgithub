package creational.abstractfactory;

public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>"+caption);
		buffer.append("<ul>");
		for(Object o : tray) {
			Item item = (Item) o;
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>");
		buffer.append("</li>");
		return buffer.toString();
	}
}
