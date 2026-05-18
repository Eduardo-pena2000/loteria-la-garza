package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Parcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbzr implements Runnable {
    private final /* synthetic */ OutputStream zza;
    private final /* synthetic */ byte[] zzb;

    public /* synthetic */ zzbzr(OutputStream outputStream, byte[] bArr) {
        this.zza = outputStream;
        this.zzb = bArr;
    }

    public final /* synthetic */ void run() {
        Closeable dataOutputStream;
        Parcelable.Creator creator = zzbzs.CREATOR;
        byte[] bArr = this.zzb;
        OutputStream outputStream = this.zza;
        Closeable closeable = null;
        try {
            try {
                dataOutputStream = new DataOutputStream(outputStream);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
            E6.m.b(dataOutputStream);
        } catch (IOException e2) {
            e = e2;
            closeable = dataOutputStream;
            int i = o0.b;
            W5.p.d("Error transporting the ad response", e);
            R5.t.l().zzg(e, "LargeParcelTeleporter.pipeData.1");
            if (closeable == null) {
                E6.m.b(outputStream);
            } else {
                E6.m.b(closeable);
            }
        } catch (Throwable th2) {
            th = th2;
            closeable = dataOutputStream;
            if (closeable == null) {
                E6.m.b(outputStream);
            } else {
                E6.m.b(closeable);
            }
            throw th;
        }
    }
}
