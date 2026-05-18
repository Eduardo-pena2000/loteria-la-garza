package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzann implements zzamf {
    private final zzer zza = new zzer();

    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzcx zzr;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i2 + i);
        zzerVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        while (zzerVar.zzd() > 0) {
            zzgrc.zzb(zzerVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int zzB = zzerVar.zzB() - 8;
            if (zzerVar.zzB() == 1987343459) {
                CharSequence charSequence = null;
                zzcw zzcwVar = null;
                while (zzB > 0) {
                    zzgrc.zzb(zzB >= 8, "Incomplete vtt cue box header found.");
                    int zzB2 = zzerVar.zzB();
                    int zzB3 = zzerVar.zzB();
                    int i3 = zzB - 8;
                    int i4 = zzB2 - 8;
                    String zzj = zzfj.zzj(zzerVar.zzi(), zzerVar.zzg(), i4);
                    zzerVar.zzk(i4);
                    if (zzB3 == 1937011815) {
                        zzcwVar = zzanw.zzb(zzj);
                    } else if (zzB3 == 1885436268) {
                        charSequence = zzanw.zzc(null, zzj.trim(), Collections.emptyList());
                    }
                    zzB = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcwVar != null) {
                    zzcwVar.zza(charSequence);
                    zzr = zzcwVar.zzr();
                } else {
                    Pattern pattern = zzanw.zza;
                    zzanv zzanvVar = new zzanv();
                    zzanvVar.zzc = charSequence;
                    zzr = zzanvVar.zza().zzr();
                }
                arrayList.add(zzr);
            } else {
                zzerVar.zzk(zzB);
            }
        }
        zzdrVar.zza(new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
