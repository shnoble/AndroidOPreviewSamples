package com.shnoble.android.o.preview.system;

import android.os.Build;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by shhong on 2017. 7. 7..
 */

public class HostName {
    public static String getHostNameFromBuildClass() {
        try {
            Method getString =Build.class.getDeclaredMethod("getString", String.class);
            getString.setAccessible(true);
            return getString.invoke(null, "net.hostname").toString();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getHostNameFromSystemProperties() {
        // String str = SystemProperties.get("net.hostname");
        try {
            Class<?> clz = Class.forName("android.os.SystemProperties");
            Method get = clz.getMethod("get", String.class);
            return (String) get.invoke(clz, "net.hostname");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
