package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzasr {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzasr(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    public static zzasr zza(zzass zzassVar) throws IOException {
        if (zzasu.zzi(zzassVar) != 538247942) {
            throw new IOException();
        }
        String zzm = zzasu.zzm(zzassVar);
        String zzm2 = zzasu.zzm(zzassVar);
        long zzk = zzasu.zzk(zzassVar);
        long zzk2 = zzasu.zzk(zzassVar);
        long zzk3 = zzasu.zzk(zzassVar);
        long zzk4 = zzasu.zzk(zzassVar);
        int zzi = zzasu.zzi(zzassVar);
        if (zzi < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(zzi);
            throw new IOException(sb.toString());
        }
        List emptyList = zzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zzi; i++) {
            emptyList.add(new zzarq(zzasu.zzm(zzassVar).intern(), zzasu.zzm(zzassVar).intern()));
        }
        return new zzasr(zzm, zzm2, zzk, zzk2, zzk3, zzk4, emptyList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzasr(String str, zzarh zzarhVar) {
        String str2 = zzarhVar.zzb;
        long j = zzarhVar.zzc;
        long j2 = zzarhVar.zzd;
        long j3 = zzarhVar.zze;
        long j4 = zzarhVar.zzf;
        List list = zzarhVar.zzh;
        if (list == null) {
            Map map = zzarhVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, list);
    }
}
