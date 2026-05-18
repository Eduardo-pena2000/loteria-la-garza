package com.google.android.gms.internal.games_v2;

import W6.k;
import c7.a;
import c7.b;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzeq implements r {
    public final /* synthetic */ a zza;

    public /* synthetic */ zzeq(a aVar) {
        this.zza = aVar;
    }

    public final void accept(Object obj, Object obj2) {
        b I1 = this.zza.I1();
        t.p(!I1.n1(), "Snapshot already closed");
        H6.a zza = I1.zza();
        I1.zzb();
        ((k) obj).getService().W1(zza);
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
