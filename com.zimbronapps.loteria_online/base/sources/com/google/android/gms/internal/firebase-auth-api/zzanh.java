package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzanh extends zzanm {
    private final /* synthetic */ zzang zza;

    public /* synthetic */ zzanh(zzang zzangVar, zzanl zzanlVar) {
        this(zzangVar);
    }

    public final Iterator iterator() {
        return new zzani(this.zza, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzanh(zzang zzangVar) {
        super(zzangVar, null);
        Objects.requireNonNull(zzangVar);
        this.zza = zzangVar;
    }
}
