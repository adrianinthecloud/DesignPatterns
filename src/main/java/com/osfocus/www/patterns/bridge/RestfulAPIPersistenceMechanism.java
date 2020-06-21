package com.osfocus.www.patterns.bridge;

public class RestfulAPIPersistenceMechanism extends PersistenceMechanism {
    @Override
    public void fetchData(Object object) {
        System.out.println("The system is fetching data using the REST APIs: " + object.toString());
    }

    @Override
    public void updateData() {
        System.out.println("The system is updating data fetched from the REST APIs");
    }
}
