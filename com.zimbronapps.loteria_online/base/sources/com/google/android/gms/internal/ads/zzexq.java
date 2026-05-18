package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzexq implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzexq(Context context, zzgzy zzgzyVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    public final x7.e zza() {
        return this.zzb.submit(new zzexp(this));
    }

    public final int zzb() {
        return 18;
    }

    public final /* synthetic */ zzexo zzc() {
        Bundle bundle;
        R5.t.g();
        String string = !((Boolean) S5.D.c().zzd(zzbhe.zzgY)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) S5.D.c().zzd(zzbhe.zzha)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        R5.t.g();
        Context context = this.zza;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgZ)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, (String) null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzexo(string, string2, bundle, null);
    }
}
