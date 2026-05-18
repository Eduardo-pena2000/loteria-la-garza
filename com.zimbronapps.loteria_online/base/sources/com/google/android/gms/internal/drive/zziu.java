package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zziu implements zzlr {
    public abstract zziu zza(zzit zzitVar);

    public final /* synthetic */ zzlr zza(zzlq zzlqVar) {
        if (zzda().getClass().isInstance(zzlqVar)) {
            return zza((zzit) zzlqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public abstract zziu clone();
}
