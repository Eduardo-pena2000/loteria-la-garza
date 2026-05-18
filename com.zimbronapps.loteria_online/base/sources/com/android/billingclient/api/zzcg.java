package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;
import o5.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzcg {
    public static final /* synthetic */ int zza = 0;

    static {
        int i = m.a;
    }

    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbj.zzb(exc.getMessage());
            int i = com.google.android.gms.internal.play_billing.zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzhx zzb(zzie zzieVar, int i, BillingResult billingResult, String str, zzil zzilVar) {
        try {
            zzic zzc = zzig.zzc();
            zzc.zzo(billingResult.getResponseCode());
            zzc.zzl(billingResult.getDebugMessage());
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                zzc.zzm(billingResult.getOnPurchasesUpdatedSubResponseCode());
            }
            if (zzieVar != null) {
                zzc.zzn(zzieVar);
            }
            if (str != null) {
                zzc.zza(str);
            }
            zzhv zzc2 = zzhx.zzc();
            zzc2.zzl(zzc);
            zzc2.zzp(i);
            if (!zzilVar.equals(zzil.zza)) {
                zzc2.zza(zzilVar);
            }
            return zzc2.zze();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzib zzc(int i, zzil zzilVar) {
        try {
            zzhz zzc = zzib.zzc();
            zzc.zzo(i);
            if (!zzilVar.equals(zzil.zza)) {
                zzc.zza(zzilVar);
            }
            return zzc.zze();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
