package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgyu extends zzgyh.zzf {
    private static final zzgyr zzbn;
    private static final zzgzw zzbo = new zzgzw(zzgyu.class);
    volatile int remainingField;
    volatile Set seenExceptionsField = null;

    static {
        Throwable th;
        zzgyr zzgytVar;
        try {
            zzgytVar = new zzgys(null);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgytVar = new zzgyt(null);
        }
        zzbn = zzgytVar;
        if (th != null) {
            zzbo.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgyu(int i) {
        this.remainingField = i;
    }

    public final Set zzB() {
        Set set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzbn.zza(this, null, newSetFromMap);
        Set set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbn.zzb(this);
    }

    public abstract void zzf(Set set);
}
