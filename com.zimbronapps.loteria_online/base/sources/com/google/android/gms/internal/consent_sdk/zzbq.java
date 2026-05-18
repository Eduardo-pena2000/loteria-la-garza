package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbq {
    private final zztm zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbq(zztm zztmVar, Executor executor) {
        this.zza = zztmVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbq zzbqVar, zzbe zzbeVar) {
        AtomicReference atomicReference = zzbqVar.zzd;
        Objects.requireNonNull(atomicReference);
        zzbeVar.zzf(new zzbh(atomicReference), new zzbi());
    }

    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener, boolean z) {
        zzcz.zza();
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
            return;
        }
        zzbe zza = ((zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zza.zzb = z;
        zza.zzf(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public final void zzc() {
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        zzbe zza = ((zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zza.zza = true;
        zzcz.zza.post(new zzbg(this, zza));
    }

    public final void zzd(zzbs zzbsVar) {
        this.zzc.set(zzbsVar);
    }

    public final void zze(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzcz.zza();
        zzj zzb = zza.zza(activity).zzb();
        if (zzb == null) {
            zzcz.zza.post(new zzbj(onConsentFormDismissedListener));
            return;
        }
        if (!zzb.isConsentFormAvailable() && zzb.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcz.zza.post(new zzbk(onConsentFormDismissedListener));
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                zzcz.zza.post(new zzbl(onConsentFormDismissedListener));
                return;
            }
            ConsentForm consentForm = (ConsentForm) this.zzd.get();
            if (consentForm == null) {
                zzcz.zza.post(new zzbm(onConsentFormDismissedListener));
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                this.zzb.execute(new zzbn(this));
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
