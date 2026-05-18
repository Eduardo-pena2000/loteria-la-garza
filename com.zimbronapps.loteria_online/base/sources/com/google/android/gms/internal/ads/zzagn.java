package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzagn {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzagk zzb(zzer zzerVar, boolean z, boolean z2) throws zzat {
        if (z) {
            zzd(3, zzerVar, false);
        }
        String zzK = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
        int length = zzK.length();
        long zzA = zzerVar.zzA();
        String[] strArr = new String[(int) zzA];
        int i = length + 15;
        for (int i2 = 0; i2 < zzA; i2++) {
            String zzK2 = zzerVar.zzK((int) zzerVar.zzA(), StandardCharsets.UTF_8);
            strArr[i2] = zzK2;
            i = i + 4 + zzK2.length();
        }
        if (z2 && (zzerVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzagk(zzK, strArr, i + 1);
    }

    public static zzap zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzfj.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzee.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaia.zzb(new zzer(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzee.zzd("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaiy(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }

    public static boolean zzd(int i, zzer zzerVar, boolean z) throws zzat {
        if (zzerVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int zzd = zzerVar.zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
            sb.append("too short header: ");
            sb.append(zzd);
            throw zzat.zzb(sb.toString(), null);
        }
        if (zzerVar.zzs() != i) {
            if (z) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzerVar.zzs() == 118 && zzerVar.zzs() == 111 && zzerVar.zzs() == 114 && zzerVar.zzs() == 98 && zzerVar.zzs() == 105 && zzerVar.zzs() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
