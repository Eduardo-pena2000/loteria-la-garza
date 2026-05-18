package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhyx extends AbstractSet {
    final /* synthetic */ zzhzc zza;

    public zzhyx(zzhzc zzhzcVar) {
        Objects.requireNonNull(zzhzcVar);
        this.zza = zzhzcVar;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.zza.zzc((Map.Entry) obj) != null;
    }

    public final Iterator iterator() {
        return new zzhyw(this);
    }

    public final boolean remove(Object obj) {
        zzhzc zzhzcVar;
        zzhzb zzc;
        if (!(obj instanceof Map.Entry) || (zzc = (zzhzcVar = this.zza).zzc((Map.Entry) obj)) == null) {
            return false;
        }
        zzhzcVar.zzd(zzc, true);
        return true;
    }

    public final int size() {
        return this.zza.zzb;
    }
}
