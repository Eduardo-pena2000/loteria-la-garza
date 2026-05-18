package com.google.android.gms.internal.firebase-auth-api;

import J7.A0;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaaz implements zzafv {
    private final /* synthetic */ zzafs zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ A0 zze;
    private final /* synthetic */ zzael zzf;
    private final /* synthetic */ zzahv zzg;

    public zzaaz(zzaar zzaarVar, zzafs zzafsVar, String str, String str2, Boolean bool, A0 a0, zzael zzaelVar, zzahv zzahvVar) {
        this.zza = zzafsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = a0;
        this.zzf = zzaelVar;
        this.zzg = zzahvVar;
        Objects.requireNonNull(zzaarVar);
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List zza = ((zzahl) obj).zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzahk zzahkVar = (zzahk) zza.get(0);
        zzaia zzf = zzahkVar.zzf();
        List zza2 = zzf != null ? zzf.zza() : null;
        if (zza2 != null && !zza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                ((zzaib) zza2.get(0)).zza(this.zzc);
            } else {
                int i = 0;
                while (true) {
                    if (i >= zza2.size()) {
                        break;
                    }
                    if (((zzaib) zza2.get(i)).zzf().equals(this.zzb)) {
                        ((zzaib) zza2.get(i)).zza(this.zzc);
                        break;
                    }
                    i++;
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzahkVar.zza(bool.booleanValue());
        } else {
            zzahkVar.zza(zzahkVar.zzb() - zzahkVar.zza() < 1000);
        }
        zzahkVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzahkVar);
    }
}
