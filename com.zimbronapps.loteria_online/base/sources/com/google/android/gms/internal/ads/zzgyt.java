package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgyt extends zzgyr {
    private zzgyt() {
        throw null;
    }

    public final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        synchronized (zzgyuVar) {
            try {
                if (zzgyuVar.seenExceptionsField == null) {
                    zzgyuVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzb(zzgyu zzgyuVar) {
        int i;
        synchronized (zzgyuVar) {
            i = zzgyuVar.remainingField - 1;
            zzgyuVar.remainingField = i;
        }
        return i;
    }

    public /* synthetic */ zzgyt(byte[] bArr) {
        super(null);
    }
}
