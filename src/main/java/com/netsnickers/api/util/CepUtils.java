package com.netsnickers.api.util;

public class CepUtils {

    public static String getStateFromCep(String cep) {
        String cepPrefix = cep.substring(0, 2);
        switch (cepPrefix) {
            case "01":
            case "02":
            case "03":
            case "04":
            case "05":
            case "06":
            case "07":
                return "SP"; // São Paulo
            case "10":
            case "11":
            case "12":
            case "13":
            case "14":
            case "15":
            case "16":
            case "17":
            case "18":
            case "19":
                return "SP"; // São Paulo (continuação)
            case "20":
            case "21":
            case "22":
            case "23":
            case "24":
                return "RJ"; // Rio de Janeiro
            case "30":
            case "31":
            case "32":
            case "33":
            case "34":
            case "35":
            case "36":
            case "37":
            case "38":
            case "39":
                return "MG"; // Minas Gerais
            case "40":
            case "41":
            case "42":
            case "43":
            case "44":
            case "45":
                return "BA"; // Bahia
            case "50":
            case "51":
            case "52":
            case "53":
            case "54":
            case "55":
                return "RS"; // Rio Grande do Sul
            case "56":
            case "57":
            case "58":
            case "59":
                return "SC"; // Santa Catarina
            case "60":
            case "61":
            case "62":
            case "63":
            case "64":
                return "GO"; // Goiás
            case "65":
            case "66":
                return "MT"; // Mato Grosso
            case "67":
                return "MS"; // Mato Grosso do Sul
            case "68":
                return "AC"; // Acre
            case "69":
                return "RO"; // Rondônia
            case "70":
            case "71":
            case "72":
            case "73":
            case "74":
            case "75":
                return "DF"; // Distrito Federal
            case "76":
            case "77":
                return "TO"; // Tocantins
            case "78":
            case "79":
                return "PA"; // Pará
            case "80":
            case "81":
            case "82":
            case "83":
            case "84":
                return "PR"; // Paraná
            case "85":
            case "86":
                return "CE"; // Ceará
            case "87":
            case "88":
            case "89":
                return "PE"; // Pernambuco
            case "90":
            case "91":
            case "92":
                return "RS"; // Rio Grande do Sul (continuação)
            case "93":
            case "94":
                return "AM"; // Amazonas
            case "95":
            case "96":
                return "RR"; // Roraima
            case "97":
                return "AP"; // Amapá
            case "98":
            case "99":
                return "MA"; // Maranhão
            default:
                throw new IllegalArgumentException("CEP inválido.");
        }
    }
}
