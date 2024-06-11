package behavioral.iterator;

import java.util.HashMap;
import java.util.Iterator;
//Sheep를 Map으로 선언하고, 키와 값들로 분리
public class SheepThread {
	
	public static final int MAX_SHEEPS = 100; //상수
	private int sheepNum = 0;	//염소의 순번(키)
	public static final HashMap<Integer, Sheep> SHEEPS = new HashMap<>();
	public SheepThread() {
		super();
		int i;
		for(i=0;i<30;i++) {	//0~29 => 30마리의 임의 Sheep Map을 생성
			SHEEPS.put(i, new Sheep());
		}
		sheepNum = i;
	}
	
	public void addGoat() {	//염소 추가
		if(SHEEPS.size() <= MAX_SHEEPS) {
			SHEEPS.put(++sheepNum, new Sheep());
		}
	}
	
	public void removeGoat() {
		if(SHEEPS.size()>0) {
			SHEEPS.remove(--sheepNum);
		}
	}
	
	public Iterator<Integer> createIterator(){
		return SHEEPS.keySet().iterator();
	}
	
	public Iterator<Sheep> sheepIterator(){
		return SHEEPS.values().iterator();
	}
}
