package aula07.ex7_3;

public class ObraDigital extends Obra {
    private String blockchain;
    private String enderecoNFT;

    public ObraDigital(String nome, String autor, double precoBase, String blockchain, String enderecoNFT) {
        super(nome, autor, precoBase);
        this.blockchain = blockchain;
        this.enderecoNFT = enderecoNFT;
    }

    @Override
    public String toString() {
        return super.toString() + " [Digital: " + blockchain + ", Endereço: " + enderecoNFT + "]";
    }
}

