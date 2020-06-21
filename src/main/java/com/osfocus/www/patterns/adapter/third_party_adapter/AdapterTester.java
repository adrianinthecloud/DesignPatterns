package com.osfocus.www.patterns.adapter.third_party_adapter;

public class AdapterTester {
    public static void main(String[] args) {
        ClientCode clientCode = new ClientCode();
        ThirdPartyCode<Integer> thirdPartyCode = new ThirdPartyCode<>();
        GlueCode<Integer> gc = new GlueCode(clientCode.getItems());
        thirdPartyCode.listItems(gc);
    }
}
