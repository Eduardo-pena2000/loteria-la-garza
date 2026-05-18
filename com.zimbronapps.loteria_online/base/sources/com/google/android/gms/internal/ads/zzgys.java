package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgys extends zzgyr {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgyu.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgyu.class, "remainingField");

    private zzgys() {
        throw null;
    }

    public final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        s1.b.a(zza, zzgyuVar, (Object) null, set2);
    }

    public final int zzb(zzgyu zzgyuVar) {
        return zzb.decrementAndGet(zzgyuVar);
    }

    public /* synthetic */ zzgys(byte[] bArr) {
        super(null);
    }
}
