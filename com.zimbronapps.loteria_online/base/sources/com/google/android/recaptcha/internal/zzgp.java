package com.google.android.recaptcha.internal;

import Da.D;
import Da.r;
import Qa.l;
import java.util.Collection;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String n0;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            n0 = r.z0((int[]) zza2, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, Za.c.b);
            } else if (zza2 instanceof long[]) {
                n0 = r.A0((long[]) zza2, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
            } else if (zza2 instanceof short[]) {
                n0 = r.C0((short[]) zza2, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
            } else if (zza2 instanceof float[]) {
                n0 = r.y0((float[]) zza2, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
            } else if (zza2 instanceof double[]) {
                n0 = r.x0((double[]) zza2, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                n0 = r.B0((Object[]) zza2, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                n0 = D.n0((Iterable) zza2, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
            }
            n0 = str;
        }
        zzgdVar.zzc().zze(i, n0);
    }
}
