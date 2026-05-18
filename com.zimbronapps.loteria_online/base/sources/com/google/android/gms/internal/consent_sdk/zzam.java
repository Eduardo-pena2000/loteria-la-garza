package com.google.android.gms.internal.consent_sdk;

import G6.e;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzam {
    private final Context zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();

    public zzam(Application application) {
        this.zza = application.getApplicationContext();
    }

    public final Object zza(String str) {
        Object obj;
        AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null || (obj = ((Bundle) atomicReference.get()).get(str)) == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void zzb(Context context) {
        AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null) {
            try {
                atomicReference.set(e.a(context).c(context.getPackageName(), 128).metaData);
            } catch (NullPointerException | PackageManager.NameNotFoundException e) {
                Log.w("UserMessagingPlatform", "Failed to get metadata. ", e);
            }
        }
    }

    public final void zzc(Map map) {
        Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map.toString()));
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            try {
                hashMap.put((Enum) ((Method) this.zze.get()).invoke((Object) null, new Object[]{str}), (Enum) ((Method) this.zzd.get()).invoke((Object) null, new Object[]{map.get(str)}));
            } catch (Exception e) {
                Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
            }
        }
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == null || hashMap.isEmpty()) {
            return;
        }
        try {
            ((Method) atomicReference.get()).invoke(this.zzb.get(), new Object[]{hashMap});
        } catch (Exception e2) {
            Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e2);
        }
    }

    public final boolean zzd() {
        AtomicReference atomicReference = this.zzg;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context context = this.zza;
        if (context == null) {
            atomicReference.set(Boolean.FALSE);
            return false;
        }
        try {
            this.zzb.set(FirebaseAnalytics.class.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            this.zzc.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", new Class[]{Map.class}));
            FirebaseAnalytics.a aVar = FirebaseAnalytics.a.GRANTED;
            FirebaseAnalytics.b bVar = FirebaseAnalytics.b.AD_STORAGE;
            Method declaredMethod = FirebaseAnalytics.a.class.getDeclaredMethod("valueOf", new Class[]{String.class});
            Method declaredMethod2 = FirebaseAnalytics.b.class.getDeclaredMethod("valueOf", new Class[]{String.class});
            this.zzd.set(declaredMethod);
            this.zze.set(declaredMethod2);
            this.zzg.set(Boolean.TRUE);
            return true;
        } catch (Exception e) {
            Log.w("UserMessagingPlatform", "No Firebase class found. ", e);
            this.zzg.set(Boolean.FALSE);
            return false;
        }
    }
}
