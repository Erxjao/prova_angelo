import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Ana Souza", "ABC-1234");
        iniciante.registrarCorrida(120.0);
        iniciante.registrarCorrida(85.5);
        iniciante.registrarCorrida(64.0);

        Motorista premium = new MotoristaPremium("Bruno Lima", "DEF-5678");
        premium.registrarCorrida(150.0);
        premium.registrarCorrida(92.5);
        premium.registrarCorrida(110.0);
        premium.registrarCorrida(75.0);
        premium.registrarCorrida(130.0);

        Motorista frotista = new MotoristaParceiroFrotista("Carla Mendes", "GHI-9012");
        frotista.registrarCorrida(320.0);
        frotista.registrarCorrida(280.0);
        frotista.registrarCorrida(450.0);

        imprimirExtrato(iniciante);
        imprimirExtrato(premium);
        imprimirExtrato(frotista);
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println("========================================");
        System.out.println("Extrato do motorista");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Placa: " + motorista.getPlacaVeiculo());
        System.out.println("Corridas no mês: " + motorista.getQuantidadeCorridas());
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Valor bruto: R$ %.2f%n", motorista.getValorBrutoArrecadado());
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Valor líquido a receber: R$ %.2f%n", motorista.calcularPagamentoLiquido());
    }
}
