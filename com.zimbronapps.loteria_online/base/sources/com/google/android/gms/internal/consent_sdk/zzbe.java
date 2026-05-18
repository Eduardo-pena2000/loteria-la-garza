package com.google.android.gms.internal.consent_sdk;

import T1.m0;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbe implements ConsentForm {
    private final Application zzc;
    private final zzbz zzd;
    private final zzaq zze;
    private final zzbs zzf;
    private final zztm zzg;
    private final zzcr zzh;
    private Dialog zzi;
    private zzbx zzj;
    private final AtomicBoolean zzk = new AtomicBoolean();
    private final AtomicReference zzl = new AtomicReference();
    private final AtomicReference zzm = new AtomicReference();
    private final AtomicReference zzn = new AtomicReference();
    boolean zza = false;
    boolean zzb = false;

    public zzbe(Application application, zzad zzadVar, zzbz zzbzVar, zzaq zzaqVar, zzbs zzbsVar, zztm zztmVar, zzcr zzcrVar) {
        this.zzc = application;
        this.zzd = zzbzVar;
        this.zze = zzaqVar;
        this.zzf = zzbsVar;
        this.zzg = zztmVar;
        this.zzh = zzcrVar;
    }

    public static /* bridge */ /* synthetic */ Application zza(zzbe zzbeVar) {
        return zzbeVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Dialog zzb(zzbe zzbeVar) {
        return zzbeVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzbz zzd(zzbe zzbeVar) {
        return zzbeVar.zzd;
    }

    public static /* bridge */ /* synthetic */ AtomicReference zze(zzbe zzbeVar) {
        return zzbeVar.zzn;
    }

    private final void zzk() {
        Dialog dialog = this.zzi;
        if (dialog != null) {
            dialog.dismiss();
            this.zzi = null;
        }
        this.zzd.zza(null);
        zzbb zzbbVar = (zzbb) this.zzn.getAndSet((Object) null);
        if (zzbbVar != null) {
            zzbb.zza(zzbbVar);
        }
    }

    private final void zzl(zzg zzgVar) {
        if (this.zza) {
            return;
        }
        String message = zzgVar == null ? null : zzgVar.getMessage();
        if (this.zzb) {
            this.zzh.zzb(message);
        } else {
            this.zzh.zze(message);
        }
    }

    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzcz.zza();
        this.zzh.zzf();
        if (!this.zzk.compareAndSet(false, true)) {
            zzg zzgVar = new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            zzl(zzgVar);
            onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
            return;
        }
        this.zzj.zzc();
        zzbb zzbbVar = new zzbb(this, activity);
        this.zzc.registerActivityLifecycleCallbacks(zzbbVar);
        this.zzn.set(zzbbVar);
        this.zzd.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzj);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            zzg zzgVar2 = new zzg(3, "Activity with null windows is passed in.");
            zzl(zzgVar2);
            onConsentFormDismissedListener.onConsentFormDismissed(zzgVar2.zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        m0.b(window, false);
        this.zzm.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzi = dialog;
        this.zzj.zzd("UMP_messagePresented", "");
        zzl(null);
    }

    public final zzbx zzc() {
        return this.zzj;
    }

    public final void zzf(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        this.zzj = ((zzby) this.zzg).zza();
        if (!this.zza) {
            this.zzh.zzi();
        }
        zzbx zzbxVar = this.zzj;
        zzbxVar.setBackgroundColor(0);
        zzbxVar.getSettings().setJavaScriptEnabled(true);
        zzbxVar.getSettings().setAllowFileAccess(false);
        zzbxVar.getSettings().setAllowContentAccess(false);
        zzbxVar.setWebViewClient(new zzbv(zzbxVar, null));
        if (!this.zza) {
            this.zzh.zzj();
        }
        this.zzl.set(new zzbc(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, null));
        zzbx zzbxVar2 = this.zzj;
        zzbs zzbsVar = this.zzf;
        zzbxVar2.loadDataWithBaseURL(zzbsVar.zza(), zzbsVar.zzb(), "text/html", "UTF-8", (String) null);
        zzcz.zza.postDelayed(new zzba(this), 10000L);
    }

    public final void zzg(int i) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzm.getAndSet((Object) null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        this.zze.zzg(i);
        onConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzm.getAndSet((Object) null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        zzl(zzgVar);
        onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
    }

    public final void zzi() {
        zzbc zzbcVar = (zzbc) this.zzl.getAndSet((Object) null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza && !this.zzb) {
            this.zzh.zzd(null);
        }
        zzbcVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzbc zzbcVar = (zzbc) this.zzl.getAndSet((Object) null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza) {
            String message = zzgVar.getMessage();
            if (this.zzb) {
                this.zzh.zzb(message);
            } else {
                this.zzh.zzd(message);
            }
        }
        zzbcVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
