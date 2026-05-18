package com.google.android.recaptcha.internal;

import Da.p;
import Da.v;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List n;
        if (!t.c(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr == null || (n = p.c(objArr)) == null) {
            n = v.n();
        }
        zzfzVar.zzb(n);
        return true;
    }
}
