public class MotoristaParceiroFrotista extends Motorista {
    private static final double PERCENTUAL_RECEBIDO = 0.80;
    private static final double ALUGUEL_VEICULO = 800.0;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBrutoArrecadado() * PERCENTUAL_RECEBIDO
                - ALUGUEL_VEICULO;
        return Math.max(0.0, pagamentoLiquido);
    }
}
