package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwt implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwu zza;

    public zzbwt(zzbwu zzbwuVar) {
        Objects.requireNonNull(zzbwuVar);
        this.zza = zzbwuVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
