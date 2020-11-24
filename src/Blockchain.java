import chain_elements.Chain;

public class Blockchain {

    private Chain chain; // new chain_elements.Chain (ArrayList)

    public Blockchain() {
        chain = new Chain();
    }

    public Chain getChain() {
        return chain;
    }
}
