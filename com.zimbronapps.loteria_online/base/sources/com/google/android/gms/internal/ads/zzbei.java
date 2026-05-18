package com.google.android.gms.internal.ads;

import V5.o0;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbei {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e) {
            int i = o0.b;
            W5.p.d("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e2) {
                int i2 = o0.b;
                W5.p.d("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
