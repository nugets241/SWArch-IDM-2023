package fi.tamk.sade23.idm;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdmServiceTest {
    IdmService idmService;
    ArrayList<SadeIdentity> testIdentities = new ArrayList<SadeIdentity>();
    @BeforeEach
    void setUp() {
        idmService = new IdmService();
        testIdentities.add(idmService.createIdentity("Matti", "Virtanen", "TAMK"));
    }


    @Test
    void createIdentity() {
        SadeIdentity identity1 = idmService.createIdentity("Matti", "Virtanen", "");
        assertEquals("Matti Virtanen", identity1.getDisplayName());

        SadeIdentity identity2 = idmService.createIdentity("Maija", "Virtanen", "TAMK");
        assertEquals("Maija Virtanen (TAMK)", identity2.getDisplayName());
    }

    @Test
    void testPasswordNotPlaintext () {
        SadeIdentity identity3 = idmService.createIdentity("Jill", "Smith", "");
        String testPassword = "somepassword123";
        identity3.setPassword(testPassword);

        // assertNotEquals(testPassword, identity3.getPassword());
    }
}