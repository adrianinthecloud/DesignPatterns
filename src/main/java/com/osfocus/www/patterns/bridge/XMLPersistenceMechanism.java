package com.osfocus.www.patterns.bridge;

public class XMLPersistenceMechanism extends PersistenceMechanism {
    @Override
    public void fetchData(Object object) {
        System.out.println("The system is fetching data from " + object.toString());
    }

    @Override
    public void updateData() {
        System.out.println("The system is updating data from the XML file");
    }
}
