package com.osfocus.www.patterns.bridge;

public class BridgeTester {
    public static void main(String[] args) {
        XMLPersistenceMechanism xmlMerchanism = new XMLPersistenceMechanism();
        RestfulAPIPersistenceMechanism restAPIMerchanism = new RestfulAPIPersistenceMechanism();
        WebCrawlerPersistenceMechanism botsMerchanism = new WebCrawlerPersistenceMechanism();

        ConcretePersistence xmlPersistence = new ConcretePersistence(xmlMerchanism);
        ConcretePersistence restAPIPersistence = new ConcretePersistence(restAPIMerchanism);
        ConcretePersistence botsPersistence = new ConcretePersistence(botsMerchanism);

        xmlMerchanism.fetchData("file.xml");
        xmlMerchanism.updateData();

        restAPIPersistence.fetchData("http://www.osfocus.com/apis");
        restAPIPersistence.updateData();

        botsPersistence.fetchData("http://www.osfocus.com");
        botsPersistence.updateData();
    }
}
