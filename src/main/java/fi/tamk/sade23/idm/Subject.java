package fi.tamk.sade23.idm;

public interface Subject {
    void registerObserver(IdentityObserver o);

    void removeObserver(IdentityObserver o);

    void notifyObservers();
}

