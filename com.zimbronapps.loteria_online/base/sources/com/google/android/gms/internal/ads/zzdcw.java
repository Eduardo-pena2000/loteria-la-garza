package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdcw implements zzikg {
    private final zzikp zza;

    private zzdcw(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdcw zzc(zzikp zzikpVar) {
        return new zzdcw(zzikpVar);
    }

    public static zzdcv zzd(Set set) {
        return new zzdcv(set);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdcv zzb() {
        return new zzdcv(((zziks) this.zza).zzc());
    }
}
