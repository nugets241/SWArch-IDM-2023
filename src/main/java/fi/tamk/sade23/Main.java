package fi.tamk.sade23;

import fi.tamk.sade23.idm.IdmService;
import fi.tamk.sade23.idm.SadeIdentity;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        IdmService idmService = new IdmService();
        SadeIdentity identity1 = idmService.createIdentity("Bob", "Marley","Reggae");
        System.out.println("First: " + identity1.getDisplayName());

    }
}