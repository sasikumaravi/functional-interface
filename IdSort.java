package functionInterface;

import java.util.Comparator;

public class IdSort implements Comparator<Mobi> {
	public int compare(Mobi m1,Mobi m2) {
		return m2.getRam()-m1.getRam();
	}
}
