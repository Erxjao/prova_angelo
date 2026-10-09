public class MotoristaPremium extends Motorista {
    private static final double PERCENTUAL_RECEBIDO = 0.85;
    private static final double BONUS_POR_CORRIDA = 2.0;

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public void registrarCorrida(double valor) {
        super.registrarCorrida(valor + BONUS_POR_CORRIDA);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBrutoArrecadado() * PERCENTUAL_RECEBIDO;
    }
}
