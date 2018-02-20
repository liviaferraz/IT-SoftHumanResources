package bus;

import java.io.Serializable;

public class Sequence implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2310708743090067880L;
	
	private static int index = 100;

	public static int getIndex() {
		return Sequence.index++;
	}

	public static void setIndex(int index) {
		Sequence.index = index;
	}
}
