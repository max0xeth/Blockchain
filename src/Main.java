import block_elements.Block;
import block_elements.Transaction;

public class Main {

    public static void main(String[] args) {
        // init block
        Block initBlock = new Block(0, "24/11/2020", 0, new Transaction("0","0",0));

        Blockchain blockchain = new Blockchain();
        blockchain.getChain().add(initBlock);

        System.out.println(blockchain.getChain().get(0).getBlockHash());
        System.out.println(blockchain.getChain().get(0).getTimestamp());
        System.out.println(blockchain.getChain().get(0).getPreviousHash());
    }
}
