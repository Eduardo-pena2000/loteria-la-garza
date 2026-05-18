package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdm implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzdo zzb;

    public zzdm(zzdo zzdoVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzdoVar);
        this.zzb = zzdoVar;
    }

    public final Iterator iterator() {
        return zzdo.zzc(this.zzb, this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzdi.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(zzdi.zza(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
