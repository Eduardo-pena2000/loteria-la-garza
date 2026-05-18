package com.google.android.gms.internal.ads;

import V5.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdhb implements Runnable {
    private final /* synthetic */ zzdhc zza;
    private final /* synthetic */ Object zzb;

    public /* synthetic */ zzdhb(zzdhc zzdhcVar, Object obj) {
        this.zza = zzdhcVar;
        this.zzb = obj;
    }

    public final /* synthetic */ void run() {
        try {
            this.zza.zza(this.zzb);
        } catch (Throwable th) {
            R5.t.l().zzh(th, "EventEmitter.notify");
            o0.l("Event emitter exception.", th);
        }
    }
}
