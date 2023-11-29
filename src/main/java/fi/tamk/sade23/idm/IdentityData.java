package fi.tamk.sade23.idm;

import java.util.ArrayList;
import java.util.List;

public class IdentityData implements Subject {
    private List<IdentityObserver> observers;
    private Identity identity;

    public IdentityData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IdentityObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IdentityObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IdentityObserver observer : observers) {
            observer.update(identity);
        }
    }

    public void identityChanged() {
        notifyObservers();
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
        identityChanged();
    }
}

