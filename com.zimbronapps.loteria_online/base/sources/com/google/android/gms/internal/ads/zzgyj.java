package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyi;
import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgyj implements PrivilegedExceptionAction {
    static final /* synthetic */ zzgyj zza = new zzgyj();

    private /* synthetic */ zzgyj() {
    }

    public final /* synthetic */ Object run() {
        int i = zzgyi.zzd.zzg;
        for (AccessibleObject accessibleObject : Unsafe.class.getDeclaredFields()) {
            accessibleObject.setAccessible(true);
            Object obj = accessibleObject.get((Object) null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
