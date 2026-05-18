package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzei extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzep zza;

    public zzei(zzep zzepVar) {
        this.zza = zzepVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int a = P2.x.a(telephonyDisplayInfo);
        this.zza.zze(true == (a == 3 || a == 4 || a == 5) ? 10 : 5);
    }
}
