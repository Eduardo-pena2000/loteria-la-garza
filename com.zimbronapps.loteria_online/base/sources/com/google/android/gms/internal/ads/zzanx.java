package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzanx implements zzamf {
    private final zzer zza = new zzer();
    private final zzano zzb = new zzano();

    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i2 + i);
        zzerVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int zzg = zzerVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String zzN = zzerVar.zzN(charset);
            if (zzN == null || !zzN.startsWith("WEBVTT")) {
                zzerVar.zzh(zzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzerVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzerVar.zzg();
                    String zzN2 = zzerVar.zzN(StandardCharsets.UTF_8);
                    c = zzN2 == null ? (char) 0 : "STYLE".equals(zzN2) ? (char) 2 : zzN2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzerVar.zzh(i3);
                if (c == 0) {
                    zzalz.zza(new zzaoa(arrayList2), zzameVar, zzdrVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c != 2) {
                    zzanq zza = zzanw.zza(zzerVar, arrayList);
                    if (zza != null) {
                        arrayList2.add(zza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzerVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzerVar));
                }
            }
        } catch (zzat e) {
            throw new IllegalArgumentException(e);
        }
    }
}
