package com.osfocus.www.patterns.bridge;

public abstract class Persistence {
    private PersistenceMechanism mechanism;

    public Persistence(PersistenceMechanism mechanism) {
        this.mechanism = mechanism;
    }

    public abstract void fetchData(Object object);
    public abstract void updateData();

    public PersistenceMechanism getMechanism() {
        return mechanism;
    }
}
