package com.google.android.gms.internal.firebase-auth-api;

import E6.c;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaba implements zzafv {
    private final /* synthetic */ zzail zza;
    private final /* synthetic */ zzahk zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzahv zzd;
    private final /* synthetic */ zzafs zze;
    private final /* synthetic */ zzaar zzf;

    public zzaba(zzaar zzaarVar, zzail zzailVar, zzahk zzahkVar, zzael zzaelVar, zzahv zzahvVar, zzafs zzafsVar) {
        this.zza = zzailVar;
        this.zzb = zzahkVar;
        this.zzc = zzaelVar;
        this.zzd = zzahvVar;
        this.zze = zzafsVar;
        Objects.requireNonNull(zzaarVar);
        this.zzf = zzaarVar;
    }

    public final void zza(String str) {
        this.zze.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaik zzaikVar = (zzaik) obj;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb(null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzc(null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzc(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            t.f(c.c("redacted".getBytes()));
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza(zzah.zzg());
        }
        ArrayList zze = zzaikVar.zze();
        if (zze == null) {
            zze = new ArrayList();
        }
        this.zzb.zza((List) zze);
        zzael zzaelVar = this.zzc;
        zzahv zzahvVar = this.zzd;
        t.l(zzahvVar);
        t.l(zzaikVar);
        String zzc = zzaikVar.zzc();
        String zzd = zzaikVar.zzd();
        if (!TextUtils.isEmpty(zzc) && !TextUtils.isEmpty(zzd)) {
            zzahvVar = new zzahv(zzd, zzc, Long.valueOf(zzaikVar.zza()), zzahvVar.zze());
        }
        zzaelVar.zza(zzahvVar, this.zzb);
    }
}
