
public class FormatadorCep {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234568");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep == null || cep.length() != 8) {
            throw new CepInvalidException("CEP inválido. O CEP deve conter 8 dígitos.");
        }
        return String.format("%s-%s", cep.substring(0, 5), cep.substring(5));
    }
}
