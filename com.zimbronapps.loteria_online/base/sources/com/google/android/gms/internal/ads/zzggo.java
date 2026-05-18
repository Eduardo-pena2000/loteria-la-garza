package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzggo extends zzghb {
    private final zzgbf zza;

    public zzggo(zzawg zzawgVar, zzgfx zzgfxVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", zzawgVar, zzgfxVar, zzgoeVar.zza(116));
        this.zza = zzgbfVar;
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", new Object[]{this.zza.zzb()});
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzb((String) objArr[0]);
            zzawgVar.zzaa((String) objArr[1]);
        }
    }
}
