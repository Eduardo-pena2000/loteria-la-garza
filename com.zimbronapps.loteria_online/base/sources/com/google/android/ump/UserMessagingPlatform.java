package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzbo;
import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import com.google.android.ump.ConsentForm;
import java.util.Objects;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UserMessagingPlatform {

    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return com.google.android.gms.internal.consent_sdk.zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza zza = com.google.android.gms.internal.consent_sdk.zza.zza(activity);
        if (zza.zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        zza.zzd().zzc();
        zzbq zzc = zza.zzc();
        zzcz.zza();
        zzbo zzboVar = new zzbo(activity, onConsentFormDismissedListener);
        Objects.requireNonNull(onConsentFormDismissedListener);
        zzc.zzb(zzboVar, new zzbp(onConsentFormDismissedListener), true);
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zza zza = com.google.android.gms.internal.consent_sdk.zza.zza(context);
        ((Queue) zza.zzd().zzb.get()).add(Long.valueOf(System.currentTimeMillis()));
        zza.zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, false);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
