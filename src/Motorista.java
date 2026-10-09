public abstract class Motorista {
    private final String nome;
    private final String placaVeiculo;
    private int quantidadeCorridas;
    private double valorBrutoArrecadado;

    protected Motorista(String nome, String placaVeiculo) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do motorista é obrigatório.");
        }
        if (placaVeiculo == null || placaVeiculo.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa do veículo é obrigatória.");
        }

        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridas = 0;
        this.valorBrutoArrecadado = 0.0;
    }

    public void registrarCorrida(double valor) {
        if (!Double.isFinite(valor) || valor < 0.0) {
            throw new IllegalArgumentException("O valor da corrida deve ser finito e não negativo.");
        }

        quantidadeCorridas++;
        valorBrutoArrecadado += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public final String getNome() {
        return nome;
    }

    public final String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public final int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public final double getValorBrutoArrecadado() {
        return valorBrutoArrecadado;
    }
}
