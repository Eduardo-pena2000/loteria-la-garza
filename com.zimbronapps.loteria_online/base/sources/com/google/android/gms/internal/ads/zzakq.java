package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzakq {
    public static void zza(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzd = zzapVar.zzd(zzfs.class);
            int size = zzd.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzfs zzfsVar = (zzfs) zzd.get(i2);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i, zzafn zzafnVar, zzt zztVar) {
        if (i == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0285 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:8:0x003b, B:10:0x0046, B:15:0x0055, B:18:0x0061, B:21:0x006e, B:24:0x007b, B:27:0x0088, B:30:0x0096, B:32:0x00a2, B:36:0x00bf, B:37:0x00dd, B:42:0x00ef, B:45:0x00fb, B:48:0x0108, B:51:0x0115, B:54:0x0122, B:57:0x012f, B:60:0x013c, B:63:0x0149, B:65:0x0153, B:67:0x015d, B:69:0x0167, B:73:0x0178, B:75:0x017e, B:92:0x0192, B:78:0x0199, B:89:0x01a0, B:85:0x01ab, B:99:0x01b7, B:100:0x0285, B:101:0x01cc, B:103:0x01d3, B:105:0x01df, B:106:0x01f3, B:119:0x021d, B:122:0x022a, B:125:0x0237, B:128:0x0244, B:131:0x0250, B:134:0x025c, B:137:0x0266, B:140:0x0272, B:143:0x027e, B:144:0x02a2, B:145:0x02a9), top: B:2:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzer r17) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakq.zzc(com.google.android.gms.internal.ads.zzer):com.google.android.gms.internal.ads.zzao");
    }

    private static zzais zzd(int i, String str, zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(zzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i)));
        return null;
    }

    private static zzain zze(int i, String str, zzer zzerVar, boolean z, boolean z2) {
        int zzf = zzf(zzerVar);
        if (z2) {
            zzf = Math.min(1, zzf);
        }
        if (zzf >= 0) {
            return z ? new zzais(str, null, zzguf.zzj(Integer.toString(zzf))) : new zzaih("und", str, Integer.toString(zzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i = zzB - 16;
            if (i == 1) {
                return zzerVar.zzs();
            }
            if (i == 2) {
                return zzerVar.zzt();
            }
            if (i == 3) {
                return zzerVar.zzx();
            }
            if (i == 4 && (zzerVar.zzn() & 128) == 0) {
                return zzerVar.zzH();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzais zzg(int i, String str, zzer zzerVar) {
        int zzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && zzB >= 22) {
            zzerVar.zzk(10);
            int zzt = zzerVar.zzt();
            if (zzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzt).length());
                sb.append(zzt);
                String sb2 = sb.toString();
                int zzt2 = zzerVar.zzt();
                if (zzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(zzt2).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(zzt2);
                    sb2 = sb3.toString();
                }
                return new zzais(str, null, zzguf.zzj(sb2));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i)));
        return null;
    }
}
