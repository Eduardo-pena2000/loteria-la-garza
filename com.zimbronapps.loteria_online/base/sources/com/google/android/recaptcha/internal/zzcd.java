package com.google.android.recaptcha.internal;

import Na.l;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) throws IOException, GeneralSecurityException {
        return l.g(file);
    }

    public static final void zzb(File file, byte[] bArr) throws IOException, GeneralSecurityException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        l.m(file, bArr);
    }
}
