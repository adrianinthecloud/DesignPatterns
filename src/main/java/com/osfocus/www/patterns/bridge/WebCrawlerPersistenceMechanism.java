package com.osfocus.www.patterns.bridge;

public class WebCrawlerPersistenceMechanism extends PersistenceMechanism {
    @Override
    public void fetchData(Object object) {
        System.out.println("The system is fetching data from " + object.toString() + " using our bots.");
    }

    @Override
    public void updateData() {
        System.out.println("The system is updating data fetched from our bots.");
    }
}
