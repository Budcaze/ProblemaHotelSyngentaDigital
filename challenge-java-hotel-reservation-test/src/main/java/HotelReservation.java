import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HotelReservation {
    public String getCheapestHotel(String input) {
        String palavras[] = input.split("[\\W]");
        String diasdasemana[] = {"mon", "tues", "wed", "thur", "fri"};
        String fimdesemana[] = {"sat", "sun"};
        List<String> escolhe_dia_semana = Arrays.asList(diasdasemana);
        List<String> escolhe_dia_fimdesemana = Arrays.asList(fimdesemana);
        int contador_dias_semana = 0;
        int contador_fimdesemana = 0;
        for (int c = 0; c < palavras.length; c++) {
            if (escolhe_dia_semana.contains(palavras[c])) {
                contador_dias_semana += 1;
            } else if (escolhe_dia_fimdesemana.contains(palavras[c])) {
                contador_fimdesemana += 1;
            }
        }
        Hoteis Lakewood = new Hoteis("Lakewood", 3, 110, 80,
                90, 80);
        Hoteis Bridgewood = new Hoteis("Bridgewood", 4, 160, 110,
                60, 50);
        Hoteis Ridgewood = new Hoteis("Ridgewood", 5, 220, 100,
                150, 40);
        Hospedagem hospedagemL = new Hospedagem(Lakewood, contador_dias_semana, contador_fimdesemana);
        Hospedagem hospedagemB = new Hospedagem(Bridgewood, contador_dias_semana, contador_fimdesemana);
        Hospedagem hospedagemR = new Hospedagem(Ridgewood, contador_dias_semana, contador_fimdesemana);
        //Possibilidade Lakewood
        if (palavras[0].equals("Regular")) {
            int preço1 = hospedagemL.getQtd_dias_hospeados_fimdesemana() * Lakewood.getCusto_cliente_regular_fimdesemana();
            int preço2 = hospedagemL.getQtd_dias_hospedados_semana() * Lakewood.getCusto_cliente_regular_semana();
            hospedagemL.setPreçoFinal(preço1 + preço2);
        } else {
            int preço1 = hospedagemL.getQtd_dias_hospeados_fimdesemana() * Lakewood.getCusto_cliente_rewards_fimdesemana();
            int preço2 = hospedagemL.getQtd_dias_hospedados_semana() * Lakewood.getCusto_cliente_rewards_semana();
            hospedagemL.setPreçoFinal(preço1 + preço2);
        }
        //Possibilidade Bridgewood
        if (palavras[0].equals("Regular")) {
            int preço1 = hospedagemB.getQtd_dias_hospedados_semana() * Bridgewood.getCusto_cliente_regular_semana();
            int preço2 = hospedagemB.getQtd_dias_hospeados_fimdesemana() * Bridgewood.getCusto_cliente_regular_fimdesemana();
            hospedagemB.setPreçoFinal(preço1 + preço2);
        } else {
            int preço1 = hospedagemB.getQtd_dias_hospedados_semana() * Bridgewood.getCusto_cliente_rewards_semana();
            int preço2 = hospedagemB.getQtd_dias_hospeados_fimdesemana() * Bridgewood.getCusto_cliente_rewards_fimdesemana();
            hospedagemB.setPreçoFinal(preço1 + preço2);
        }
        //Possibilidade Ridgewood
        if (palavras[0].equals("Regular")) {
            int preço1 = hospedagemR.getQtd_dias_hospedados_semana() * Ridgewood.getCusto_cliente_regular_semana();
            int preço2 = hospedagemR.getQtd_dias_hospeados_fimdesemana() * Ridgewood.getCusto_cliente_regular_fimdesemana();
            hospedagemR.setPreçoFinal(preço1 + preço2);
        } else {
            int preço1 = hospedagemR.getQtd_dias_hospedados_semana() * Ridgewood.getCusto_cliente_rewards_semana();
            int preço2 = hospedagemR.getQtd_dias_hospeados_fimdesemana() * Ridgewood.getCusto_cliente_rewards_fimdesemana();
            hospedagemR.setPreçoFinal(preço1 + preço2);
        }
        //Verificando o mais barato
        if (hospedagemL.getPreçoFinal() < hospedagemB.getPreçoFinal() && hospedagemL.getPreçoFinal() < hospedagemR.getPreçoFinal()) {
            return hospedagemL.getHotel().getNome_hotel();
        } else if (hospedagemB.getPreçoFinal() < hospedagemR.getPreçoFinal() && hospedagemB.getPreçoFinal() < hospedagemL.getPreçoFinal()) {
            return hospedagemB.getHotel().getNome_hotel();
        } else if (hospedagemR.getPreçoFinal() < hospedagemB.getPreçoFinal() && hospedagemR.getPreçoFinal() < hospedagemL.getPreçoFinal()) {
            return hospedagemR.getHotel().getNome_hotel();
        } else {
            if (hospedagemR.getPreçoFinal() == hospedagemB.getPreçoFinal() || hospedagemR.getPreçoFinal() == hospedagemL.getPreçoFinal()) {
                if (hospedagemR.getHotel().getClassificação() > hospedagemB.getHotel().getClassificação() || hospedagemR.getHotel().getClassificação() >
                        hospedagemL.getHotel().getClassificação()) {
                    return hospedagemR.getHotel().getNome_hotel();
                }
            }
        }
        return "Error";
    }
}
