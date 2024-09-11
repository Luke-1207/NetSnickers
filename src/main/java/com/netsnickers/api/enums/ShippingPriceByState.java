package com.netsnickers.api.enums;

public enum ShippingPriceByState {

    SP(10.0f),  // São Paulo, frete mais barato
    RJ(20.0f),  // Rio de Janeiro
    MG(20.0f),  // Minas Gerais
    ES(25.0f),  // Espírito Santo
    PR(15.0f),  // Paraná
    SC(18.0f),  // Santa Catarina
    RS(20.0f),  // Rio Grande do Sul
    BA(30.0f),  // Bahia
    PE(35.0f),  // Pernambuco
    CE(40.0f),  // Ceará
    AM(50.0f),  // Amazonas
    AC(55.0f),  // Acre
    RO(55.0f),  // Rondônia
    RR(60.0f),  // Roraima
    AP(60.0f),  // Amapá
    PA(45.0f),  // Pará
    MA(50.0f),  // Maranhão
    PI(40.0f),  // Piauí
    RN(45.0f),  // Rio Grande do Norte
    PB(45.0f),  // Paraíba
    AL(40.0f),  // Alagoas
    SE(35.0f),  // Sergipe
    MT(30.0f),  // Mato Grosso
    MS(30.0f),  // Mato Grosso do Sul
    DF(25.0f),  // Distrito Federal
    GO(28.0f),  // Goiás
    TO(30.0f);  // Tocantins

    private final float shippingPrice;

    ShippingPriceByState(float shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public float getShippingPrice() {
        return shippingPrice;
    }

    public static float getFreightByState(String stateAbbreviation) {
        for (ShippingPriceByState price : values()) {
            if (price.name().equals(stateAbbreviation)) {
                return price.getShippingPrice();
            }
        }
        throw new IllegalArgumentException("Estado inválido para frete.");
    }
}