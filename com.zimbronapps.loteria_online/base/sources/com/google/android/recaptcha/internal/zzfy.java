package com.google.android.recaptcha.internal;

import Da.v;
import Qa.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfy extends zzfx {
    private final p zza;
    private final String zzb;

    public zzfy(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        ArrayList n;
        if (!t.c(method.getName(), this.zzb)) {
            return false;
        }
        zztf zzf = zzti.zzf();
        if (objArr != null) {
            n = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zzf2 = zzth.zzf();
                zzf2.zzw(obj2.toString());
                n.add((zzth) zzf2.zzi());
            }
        } else {
            n = v.n();
        }
        zzf.zze(n);
        zzti zztiVar = (zzti) zzf.zzi();
        p pVar = this.zza;
        byte[] zzd = zztiVar.zzd();
        pVar.invoke(objArr, zzkh.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
