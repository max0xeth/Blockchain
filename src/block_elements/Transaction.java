package block_elements;

public class Transaction {
    private double amount;
    private String outputAdress;
    private String inputAdress;

    public Transaction(String outputAdress, String inputAdress, double amount) {
        this.outputAdress = outputAdress;
        this.inputAdress = inputAdress;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "asdfasdf.Transaction{" +
                "amount=" + amount +
                ", outputAdress='" + outputAdress + '\'' +
                ", inputAdress='" + inputAdress + '\'' +
                '}';
    }
}
