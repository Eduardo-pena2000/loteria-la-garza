package com.google.android.recaptcha.internal;

import cb.a1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzf {
    public static final zzbd zza(Exception exc, zzbd zzbdVar) {
        return exc instanceof a1 ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
