package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdcz extends zzdhd implements zzbmx {
    private final Bundle zzb;

    public zzdcz(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzs(zzdcy.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
