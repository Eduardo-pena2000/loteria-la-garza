package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzibj {
    public static zzibb zzb(Class cls) {
        ClassLoader classLoader = zzibj.class.getClassLoader();
        if (cls.equals(zzibb.class)) {
            try {
                try {
                    return (zzibb) cls.cast(((zzibj) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null)).zza());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzibj.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzibb) cls.cast(((zzibj) it.next()).zza()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(zziaw.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zzibb) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzibb) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public abstract zzibb zza();
}
