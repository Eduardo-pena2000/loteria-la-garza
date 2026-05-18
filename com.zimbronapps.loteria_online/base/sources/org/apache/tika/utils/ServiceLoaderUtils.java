package org.apache.tika.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.tika.config.ServiceLoader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ServiceLoaderUtils {
    public static Object newInstance(String str) {
        return newInstance(str, ServiceLoader.class.getClassLoader());
    }

    public static void sortLoadedClasses(List list) {
        list.sort(new j());
    }

    public static Object newInstance(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, true, classLoader).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object newInstance(Class cls, ServiceLoader serviceLoader) {
        try {
            try {
                try {
                    return cls.getDeclaredConstructor(new Class[]{ServiceLoader.class}).newInstance(new Object[]{serviceLoader});
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (InstantiationException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            } catch (NoSuchMethodException unused) {
                return cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchMethodException e4) {
            e = e4;
        } catch (InvocationTargetException e5) {
            e = e5;
        }
    }
}
