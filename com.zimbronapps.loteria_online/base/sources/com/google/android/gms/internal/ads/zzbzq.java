package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzq extends zzbzn {
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbsp zzd;
    private final W5.a zze;
    private final Executor zzg;
    private final Object zza = new Object();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzbzq(Context context, zzbsp zzbspVar, W5.a aVar, Executor executor) {
        this.zzb = context.getApplicationContext();
        this.zze = aVar;
        this.zzd = zzbspVar;
        this.zzg = executor;
    }

    public static JSONObject zzc(Context context, W5.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbje.zzf.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.a);
            jSONObject.put("mf", zzbje.zzg.zze());
            jSONObject.put("cl", "839961582");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", 254715000);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, "com.google.android.gms.ads.dynamite"));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final x7.e zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (R5.t.o().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbje.zzh.zze()).longValue()) {
            return zzgzo.zza(null);
        }
        return zzgzo.zzk(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzbzo(this), ((Boolean) zzbje.zzm.zze()).booleanValue() ? this.zzg : zzcei.zzg);
    }

    public final x7.e zzb() {
        if (!((Boolean) zzbje.zza.zze()).booleanValue()) {
            return zza();
        }
        if (!this.zzf.compareAndSet(false, true)) {
            return zzgzo.zzb();
        }
        x7.e zza = zza();
        zza.addListener(new zzbzp(this), zzcei.zzg);
        return zza;
    }

    public final /* synthetic */ void zzd() {
        this.zzf.set(false);
    }

    public final /* synthetic */ Void zze(JSONObject jSONObject) {
        zzbgv zzbgvVar = zzbhe.zza;
        S5.D.a();
        Context context = this.zzb;
        SharedPreferences zzb = zzbgx.zzb(context);
        if (zzb == null) {
            return null;
        }
        SharedPreferences.Editor edit = zzb.edit();
        Objects.requireNonNull(S5.D.b());
        int i = zzbiu.zza;
        S5.D.b().zzd(edit, 1, jSONObject);
        if ((((Boolean) zzbje.zzo.zze()).booleanValue() || ((Boolean) zzbje.zzp.zze()).booleanValue()) && !E6.e.c()) {
            S5.D.a();
            edit.apply();
        } else {
            S5.D.a();
            edit.commit();
        }
        if (((Boolean) zzbje.zze.zze()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            S5.D.a();
            SharedPreferences zza = zzbgx.zza(context);
            if (zza != null) {
                SharedPreferences.Editor edit2 = zza.edit();
                S5.D.b();
                JSONObject jSONObject2 = new JSONObject();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    if (str.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(str, jSONObject.get(str));
                        } catch (JSONException unused) {
                        }
                    }
                }
                edit2.putString("flag_configuration", jSONObject2.toString());
                edit2.apply();
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", R5.t.o().a()).apply();
        return null;
    }
}
