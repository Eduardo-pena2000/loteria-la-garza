package com.google.android.gms.internal.drive;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzki {
    private static final Logger logger = Logger.getLogger(zzjr.class.getName());
    private static String zzro = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzjx zza(Class cls) {
        String format;
        ClassLoader classLoader = zzki.class.getClassLoader();
        if (cls.equals(zzjx.class)) {
            format = zzro;
        } else {
            if (!cls.getPackage().equals(zzki.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        }
        try {
            try {
                try {
                    return (zzjx) cls.cast(((zzki) Class.forName(format, true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null)).zzcu());
                } catch (InvocationTargetException e) {
                    throw new IllegalStateException(e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzki.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzjx) cls.cast(((zzki) it.next()).zzcu()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger2 = logger;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger2.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), e5);
                }
            }
            if (arrayList.size() == 1) {
                return (zzjx) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzjx) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (InvocationTargetException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract zzjx zzcu();
}
