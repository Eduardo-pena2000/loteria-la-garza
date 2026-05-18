package com.google.android.gms.internal.ads;

import V5.o0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdqv {
    private final V5.N zza;
    private final E6.f zzb;
    private final Executor zzc;

    public zzdqv(V5.N n, E6.f fVar, Executor executor) {
        this.zza = n;
        this.zzb = fVar;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        E6.f fVar = this.zzb;
        long b = fVar.b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b2 = fVar.b();
        if (decodeByteArray != null) {
            long j = b2 - b;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + String.valueOf(j).length() + 15 + String.valueOf(z).length());
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            o0.k(sb.toString());
        }
        return decodeByteArray;
    }

    public final x7.e zza(String str, double d, boolean z) {
        return zzgzo.zzk(this.zza.a(str), new zzdqu(this, d, z), this.zzc);
    }

    public final /* synthetic */ Bitmap zzb(double d, boolean z, zzaru zzaruVar) {
        byte[] bArr = zzaruVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhc)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) S5.D.c().zzd(zzbhe.zzhd)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }
}
