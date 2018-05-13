import java.util.*;

public class Blockchain{
	//private final String name;
	
	ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main (String[] args){
		String name = "Name";
		
		String[] conditions = {"fever", "flu"};
		Data genesisData = new Data(conditions, 20180512);
		Block genesisBlock = new Block (0, genesisData);
		
		System.out.println(genesisBlock.getData());
	}
}