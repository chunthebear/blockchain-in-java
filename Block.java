import java.util.*;

public class Block {
	private int preHash;
	private Data data;
	private int currentHash;
	
	public Block (int preHash, Data data){
		this.preHash = preHash;
		this.data = data;

		//object array to store both preHash and data, representing a contens
		Object[] contens = {data.hashCode(), preHash};
		this.currentHash = Arrays.hashCode(contens);
	}
	
	public int getPreHash(){
		return preHash;
	}
	
	public Data getData(){
		return data;
	}
}