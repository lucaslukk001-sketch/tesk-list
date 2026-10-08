package teskList.domain.tesk.runner;

public enum priority {

    BAIXA(1),
    MEDIA(2),
    ALTA(3);

    private final int valor;

    priority(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static priority deValor(int valor) {
        for (priority p : priority.values()) {
            if (p.getValor() == valor) {
                return p;
            }
        }
        throw new IllegalArgumentException("Código de prioridade inválido: " + valor);
    }

}
