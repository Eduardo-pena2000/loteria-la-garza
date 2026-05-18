package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzijo extends zzijr implements zzatj {
    protected final String zza = "moov";

    public zzijo(String str) {
    }

    public final String zza() {
        return this.zza;
    }

    public final void zzb(zzijs zzijsVar, ByteBuffer byteBuffer, long j, zzatg zzatgVar) throws IOException {
        zzijsVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzijsVar;
        this.zze = zzijsVar.zzc();
        zzijsVar.zzd(zzijsVar.zzc() + j);
        this.zzf = zzijsVar.zzc();
        this.zzb = zzatgVar;
    }
}
