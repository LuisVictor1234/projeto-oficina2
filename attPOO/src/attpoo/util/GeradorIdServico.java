public class GeradorIdServico {
    private static int id = 1;

    public static int novoId() {
        return id++;
    }
}