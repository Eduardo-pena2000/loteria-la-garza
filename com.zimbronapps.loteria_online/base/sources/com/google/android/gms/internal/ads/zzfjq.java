package com.google.android.gms.internal.ads;

import S5.q2;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfjq {
    public static q2 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfis zzfisVar = (zzfis) it.next();
            if (zzfisVar.zzc) {
                arrayList.add(L5.h.p);
            } else {
                arrayList.add(new L5.h(zzfisVar.zza, zzfisVar.zzb));
            }
        }
        return new q2(context, (L5.h[]) arrayList.toArray(new L5.h[arrayList.size()]));
    }

    public static zzfis zzb(q2 q2Var) {
        return q2Var.i ? new zzfis(-3, 0, true) : new zzfis(q2Var.e, q2Var.b, false);
    }
}
