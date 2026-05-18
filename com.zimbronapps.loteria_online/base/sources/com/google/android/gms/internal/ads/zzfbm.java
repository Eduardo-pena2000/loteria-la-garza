package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbm implements zzfax {
    private final zzgzy zza;
    private final Context zzb;

    public zzfbm(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    public final x7.e zza() {
        return this.zza.zzc(new zzfbl(this));
    }

    public final int zzb() {
        return 39;
    }

    public final /* synthetic */ zzfbk zzc() {
        boolean z;
        int i;
        Context context = this.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        R5.t.g();
        int i2 = -1;
        if (F0.f(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            z = false;
            i = -2;
        }
        return new zzfbk(networkOperator, i, R5.t.j().k(context), phoneType, z, i2);
    }
}
