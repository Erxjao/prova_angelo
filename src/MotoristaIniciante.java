public class MotoristaIniciante extends Motorista {
    private static final double PERCENTUAL_RECEBIDO = 0.75;
    private static final int CORRIDAS_MINIMAS_PARA_ISENCAO = 5;
    private static final double TAXA_INATIVIDADE = 50.0;

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBrutoArrecadado() * PERCENTUAL_RECEBIDO;
        if (getQuantidadeCorridas() < CORRIDAS_MINIMAS_PARA_ISENCAO) {
            pagamentoLiquido -= TAXA_INATIVIDADE;
        }
        return pagamentoLiquido;
    }
}
