package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzgus extends zzgun implements zzgvn {
    private final transient zzgup emptySet;
    private transient zzgup zza;

    public zzgus(zzgui zzguiVar, int i, Comparator comparator) {
        super(zzguiVar, i);
        this.emptySet = zzgwg.zza;
    }

    public final zzgup zza() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgur zzgurVar = new zzgur(this);
        this.zza = zzgurVar;
        return zzgurVar;
    }
}
