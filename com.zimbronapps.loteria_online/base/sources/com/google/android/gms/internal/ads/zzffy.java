package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzffy {
    public static void zza(AtomicReference atomicReference, zzffx zzffxVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzffxVar.zza(obj);
        } catch (NullPointerException e) {
            int i = o0.b;
            W5.p.g("NullPointerException occurs when invoking a method from a delegating listener.", e);
        } catch (RemoteException e2) {
            int i2 = o0.b;
            W5.p.i("#007 Could not call remote method.", e2);
        }
    }
}
