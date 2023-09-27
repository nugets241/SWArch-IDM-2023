package fi.tamk.sade23.idm;


import java.util.HashMap;

public class IdmService {

    private HashMap<Integer, SadeIdentity> identityHashMap = new HashMap<>();
    static private Integer idCounter = 1;

    public SadeIdentity createIdentity (String firstName, String lastName, String organization) {
        SadeIdentity identity = new SadeIdentity(firstName, lastName, organization);
        identity.setId(idCounter);
        identityHashMap.put(idCounter, identity);

        idCounter++;
        return identity;
    }

}
