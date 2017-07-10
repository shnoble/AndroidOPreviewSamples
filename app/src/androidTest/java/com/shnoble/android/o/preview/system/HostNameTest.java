package com.shnoble.android.o.preview.system;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by shhong on 2017. 7. 7..
 */
public class HostNameTest {
    @Test
    public void getHostNameFromBuildClass() throws Exception {
        String hostName = HostName.getHostNameFromBuildClass();
        assertNotNull(hostName);
        assertNotEquals(hostName, "");
        assertNotEquals(hostName, "unknown");
        assertTrue(hostName.startsWith("android-"));
    }

    @Test
    public void getHostNameFromSystemProperties() throws Exception {
        String hostName = HostName.getHostNameFromSystemProperties();
        assertNotNull(hostName);
        assertNotEquals(hostName, "");
        assertNotEquals(hostName, "unknown");
        assertTrue(hostName.startsWith("android-"));
    }

}