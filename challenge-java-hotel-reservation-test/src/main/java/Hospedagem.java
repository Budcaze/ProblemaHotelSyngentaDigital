public class Hospedagem {
    private Hoteis hotel;
    private int qtd_dias_hospedados_semana;
    private int qtd_dias_hospeados_fimdesemana;
    private int preçoFinal;

    public Hospedagem(Hoteis hotel, int qtd_dias_hospedados_semana, int qtd_dias_hospeados_fimdesemana) {
        this.hotel = hotel;
        this.qtd_dias_hospedados_semana = qtd_dias_hospedados_semana;
        this.qtd_dias_hospeados_fimdesemana = qtd_dias_hospeados_fimdesemana;

    }

    public Hoteis getHotel() {
        return hotel;
    }

    public void setHotel(Hoteis hotel) {
        this.hotel = hotel;
    }

    public int getQtd_dias_hospedados_semana() {
        return qtd_dias_hospedados_semana;
    }

    public void setQtd_dias_hospedados_semana(int qtd_dias_hospedados_semana) {
        this.qtd_dias_hospedados_semana = qtd_dias_hospedados_semana;
    }

    public int getQtd_dias_hospeados_fimdesemana() {
        return qtd_dias_hospeados_fimdesemana;
    }

    public void setQtd_dias_hospeados_fimdesemana(int qtd_dias_hospeados_fimdesemana) {
        this.qtd_dias_hospeados_fimdesemana = qtd_dias_hospeados_fimdesemana;
    }



    public int getPreçoFinal() {
        return preçoFinal;
    }

    public void setPreçoFinal(int preçoFinal) {
        this.preçoFinal = preçoFinal;
    }
}
