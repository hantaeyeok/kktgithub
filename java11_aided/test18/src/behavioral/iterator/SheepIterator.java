package behavioral.iterator;

import java.util.Iterator;
//Sheep 을 배열로 선언하고, 분리하고자 할 경우 
public class SheepIterator implements Iterator<Sheep>{
	private Sheep[] sheeps;
	int position = 0;
	public SheepIterator(Sheep[] sheeps) {
		super();
		this.sheeps = sheeps;
	}
	@Override
	public boolean hasNext() {
		if(position >= sheeps.length || sheeps[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	@Override
	public Sheep next() {
		Sheep tmpSheep = sheeps[position];
		position++;
		return tmpSheep;
	}
}
