package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzz {
    private String zza;
    private Uri zzb;
    private final zzaa zzc = new zzaa();
    private final List zzd;
    private final zzguf zze;
    private final zzae zzf;
    private final zzai zzg;

    public zzz() {
        zzguf.zzi();
        this.zzd = Collections.emptyList();
        this.zze = zzguf.zzi();
        this.zzf = new zzae();
        this.zzg = zzai.zza;
    }

    public final zzz zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzz zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzak zzc() {
        Uri uri = this.zzb;
        zzag zzagVar = uri != null ? new zzag(uri, null, null, null, this.zzd, null, this.zze, null, -9223372036854775807L, null) : null;
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(this.zzc, null), zzagVar, new zzaf(this.zzf, null), zzan.zza, this.zzg, null);
    }
}
