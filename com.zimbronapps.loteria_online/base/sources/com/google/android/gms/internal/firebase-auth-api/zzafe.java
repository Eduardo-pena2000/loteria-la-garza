package com.google.android.gms.internal.firebase-auth-api;

import B7.g;
import android.content.Context;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import j8.i;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzafe {
    private Context zza;
    private zzafx zzb;
    private String zzc;
    private final g zzd;
    private boolean zze;
    private String zzf;

    public zzafe(g gVar, String str) {
        this(gVar.m(), gVar, str);
    }

    private static String zza(g gVar) {
        b.a(FirebaseAuth.getInstance(gVar).u0().get());
        return null;
    }

    private static String zzb(g gVar) {
        i iVar = (i) FirebaseAuth.getInstance(gVar).x0().get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e.getMessage());
            }
        }
        return null;
    }

    public zzafe(Context context, g gVar, String str) {
        this.zze = false;
        this.zza = (Context) t.l(context);
        this.zzd = (g) t.l(gVar);
        this.zzc = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = this.zzc + "/FirebaseUI-Android";
        } else {
            str = this.zzc + "/FirebaseCore-Android";
        }
        if (this.zzb == null) {
            this.zzb = new zzafx(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzafd.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.r().c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
