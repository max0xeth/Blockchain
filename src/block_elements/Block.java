package block_elements;

import java.util.Arrays;

public class Block {

    private final int index; // Index of the asdfasdf.Block
    private final String timestamp; // Time when asdfasdf.Block was created
    private final int previousHash; // Hash from the asdfasdf.Block before
    private Transaction transaction;// asdfasdf.Transaction inofrmations
    private final int blockHash; // Hash from the current block


    public Block(int index, String timestamp, int previousHash, Transaction transaction) {
        this.index = index;
        this.timestamp = timestamp;
        this.previousHash = previousHash;

        //timestamp = java.time.LocalDate.now().toString() + " " + java.time.LocalTime.now();

        Object[] blockData = {Arrays.hashCode(new Object[]{index, previousHash, transaction})};

        this.blockHash = Arrays.hashCode(blockData);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public String getTimestamp() {
        return timestamp;
    }

}
