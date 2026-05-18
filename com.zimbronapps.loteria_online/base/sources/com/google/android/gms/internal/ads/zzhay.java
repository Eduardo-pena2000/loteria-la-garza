package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhay implements zzhbl {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzhay(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhay zza(String str) {
        return new zzhay(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzhyl zzhylVar) throws IOException {
        if (!(zzhylVar instanceof zzhyp)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzhylVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long zzc = zzhja.zzc(zzhylVar.zzg().zzh());
            if (zzc > 4294967295L || zzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) zzc;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzhql zzb() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhay.zzb():com.google.android.gms.internal.ads.zzhql");
    }
}
