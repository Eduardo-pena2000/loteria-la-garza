package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbif {
    private v.f zza;
    private v.c zzb;
    private v.e zzc;
    private zzbie zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzikw.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        v.e eVar = this.zzc;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final v.f zzc() {
        v.c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.e((v.b) null);
        }
        return this.zza;
    }

    public final void zzd(zzbie zzbieVar) {
        this.zzd = zzbieVar;
    }

    public final void zze(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzikw.zza(activity)) != null) {
            zzikx zzikxVar = new zzikx(this);
            this.zzc = zzikxVar;
            v.c.a(activity, zza, zzikxVar);
        }
    }

    public final void zzf(v.c cVar) {
        this.zzb = cVar;
        cVar.g(0L);
        zzbie zzbieVar = this.zzd;
        if (zzbieVar != null) {
            zzbieVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
