package com.google.android.recaptcha.internal;

import Da.r;
import Da.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return r.N0((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return r.T0((short[]) obj);
        }
        if (obj instanceof int[]) {
            return r.Q0((int[]) obj);
        }
        if (obj instanceof long[]) {
            return r.R0((long[]) obj);
        }
        if (obj instanceof float[]) {
            return r.P0((float[]) obj);
        }
        if (obj instanceof double[]) {
            return r.O0((double[]) obj);
        }
        return null;
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != Objects.nonNull(zza3)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        zzgdVar.zzc().zze(i, zzb(zza2, zza3));
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(w.y(zzc2, 10));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(w.y(zzc, 10));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(Math.pow(((Number) zzc.get(i)).doubleValue(), ((Number) zzc2.get(i)).doubleValue()));
        }
        return dArr;
    }
}
