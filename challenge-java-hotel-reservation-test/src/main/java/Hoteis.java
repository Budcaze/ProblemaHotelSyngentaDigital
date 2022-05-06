public class Hoteis {
    private String nome_hotel;
    private int classificação;
    private int custo_cliente_regular_semana;
    private int custo_cliente_rewards_semana;
    private int custo_cliente_regular_fimdesemana;
    private int custo_cliente_rewards_fimdesemana;

    public Hoteis(String nome_hotel, int classificação, int custo_cliente_regular_semana,
                  int custo_cliente_rewards_semana, int custo_cliente_regular_fimdesemana,
                  int custo_cliente_rewards_fimdesemana) {
        this.custo_cliente_regular_semana = custo_cliente_regular_semana;
        this.custo_cliente_rewards_semana = custo_cliente_rewards_semana;
        this.custo_cliente_regular_fimdesemana = custo_cliente_regular_fimdesemana;
        this.custo_cliente_rewards_fimdesemana = custo_cliente_rewards_fimdesemana;
        this.classificação = classificação;
        this.nome_hotel = nome_hotel;
    }

    public int getCusto_cliente_regular_semana() {
        return custo_cliente_regular_semana;
    }

    public void setCusto_cliente_regular_semana(int custo_cliente_regular_semana) {
        this.custo_cliente_regular_semana = custo_cliente_regular_semana;
    }

    public int getCusto_cliente_rewards_semana() {
        return custo_cliente_rewards_semana;
    }

    public void setCusto_cliente_rewards_semana(int custo_cliente_rewards_semana) {
        this.custo_cliente_rewards_semana = custo_cliente_rewards_semana;
    }

    public int getCusto_cliente_regular_fimdesemana() {
        return custo_cliente_regular_fimdesemana;
    }

    public void setCusto_cliente_regular_fimdesemana(int custo_cliente_regular_fimdesemana) {
        this.custo_cliente_regular_fimdesemana = custo_cliente_regular_fimdesemana;
    }

    public int getCusto_cliente_rewards_fimdesemana() {
        return custo_cliente_rewards_fimdesemana;
    }

    public void setCusto_cliente_rewards_fimdesemana(int custo_cliente_rewards_fimdesemana) {
        this.custo_cliente_rewards_fimdesemana = custo_cliente_rewards_fimdesemana;
    }

    public String getNome_hotel() {
        return nome_hotel;
    }

    public void setNome_hotel(String nome_hotel) {
        this.nome_hotel = nome_hotel;
    }

    public int getClassificação() {
        return classificação;
    }

    public void setClassificação(int classificação) {
        this.classificação = classificação;
    }
}
