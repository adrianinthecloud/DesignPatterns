package com.osfocus.www.patterns.bridge;

public abstract class PersistenceMechanism {
    public abstract void fetchData(Object object);
    public abstract void updateData();
}
