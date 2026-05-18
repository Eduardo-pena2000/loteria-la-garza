package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfkk implements Runnable {
    private final /* synthetic */ InputStream zza;
    private final /* synthetic */ ParcelFileDescriptor zzb;

    public /* synthetic */ zzfkk(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = inputStream;
        this.zzb = parcelFileDescriptor;
    }

    public final /* synthetic */ void run() {
        ParcelFileDescriptor parcelFileDescriptor = this.zzb;
        InputStream inputStream = this.zza;
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    E6.m.c(inputStream, autoCloseOutputStream);
                    autoCloseOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
