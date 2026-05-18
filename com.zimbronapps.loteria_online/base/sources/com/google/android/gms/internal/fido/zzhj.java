package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhj extends IOException {
    public zzhj(String str) {
        super(str);
    }

    public zzhj(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
