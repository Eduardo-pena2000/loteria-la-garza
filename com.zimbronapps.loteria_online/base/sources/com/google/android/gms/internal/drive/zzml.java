package com.google.android.gms.internal.drive;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzml extends zzmr {
    private final /* synthetic */ zzmi zzvk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzml(zzmi zzmiVar) {
        super(zzmiVar, null);
        this.zzvk = zzmiVar;
    }

    public final Iterator iterator() {
        return new zzmk(this.zzvk, null);
    }

    public /* synthetic */ zzml(zzmi zzmiVar, zzmj zzmjVar) {
        this(zzmiVar);
    }
}
