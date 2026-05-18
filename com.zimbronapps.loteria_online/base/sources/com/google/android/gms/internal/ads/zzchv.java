package com.google.android.gms.internal.ads;

import V5.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchv extends zzchr {
    public zzchv(zzcge zzcgeVar) {
        super(zzcgeVar);
    }

    public final boolean zze(String str) {
        String o = W5.g.o(str);
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null && o != null) {
            zzcgeVar.zzt(o, this);
        }
        int i = o0.b;
        W5.p.f("VideoStreamNoopCache is doing nothing.");
        zzq(str, o, "noop", "Noop cache is a noop.");
        return false;
    }

    public final void zzl() {
    }
}
