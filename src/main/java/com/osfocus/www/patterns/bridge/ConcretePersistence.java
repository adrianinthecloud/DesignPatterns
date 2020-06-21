package com.osfocus.www.patterns.bridge;

public class ConcretePersistence extends Persistence {
    public ConcretePersistence(PersistenceMechanism mechanism) {
        super(mechanism);
    }

    @Override
    public void fetchData(Object object) {
        getMechanism().fetchData(object);
    }

    @Override
    public void updateData() {
        getMechanism().updateData();
    }
}
