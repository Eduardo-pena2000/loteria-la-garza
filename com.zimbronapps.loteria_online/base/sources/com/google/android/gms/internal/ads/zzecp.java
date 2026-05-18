package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzecp {
    private final Context zza;
    private final W5.a zzb;
    private final Executor zzc;
    private final AtomicReference zzd = new AtomicReference("");

    public zzecp(Context context, W5.a aVar, Executor executor) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = executor;
    }

    private final String zzc() {
        String str;
        W5.a aVar = this.zzb;
        String str2 = null;
        if (aVar.d) {
            str = zzcjw.class.getName();
        } else {
            try {
                str = (String) new JSONObject(zzd((String) S5.D.c().zzd(zzbhe.zzpL))).get(Integer.toString(aVar.c));
            } catch (ClassCastException | NullPointerException | JSONException | IllegalArgumentException e) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzpK)).booleanValue()) {
                    R5.t.l().zzg(e, "SdkIE");
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = zzd((String) S5.D.c().zzd(zzbhe.zzpM));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpK)).booleanValue()) {
                R5.t.l().zzg(e2, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "3";
        }
        try {
            for (Method method : this.zza.getClassLoader().loadClass(str).getDeclaredMethods()) {
                if (method.getName().matches(str2)) {
                    return "1";
                }
            }
            return "0";
        } catch (SecurityException unused) {
            return "7";
        } catch (PatternSyntaxException unused2) {
            return "5";
        } catch (NoClassDefFoundError unused3) {
            return "6";
        } catch (ClassNotFoundException unused4) {
            return "4";
        }
    }

    private static final String zzd(String str) throws IllegalArgumentException {
        return F0.Y(new String(Base64.decode(str, 0)), new String(Base64.decode((String) S5.D.c().zzd(zzbhe.zzpN), 10), StandardCharsets.UTF_8));
    }

    public final String zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpJ)).booleanValue()) {
            if (!((String) S5.D.c().zzd(zzbhe.zzpL)).isEmpty()) {
                if (!((String) S5.D.c().zzd(zzbhe.zzpM)).isEmpty()) {
                    if (!((String) S5.D.c().zzd(zzbhe.zzpN)).isEmpty()) {
                        String str = (String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new zzeco(this));
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb() {
        AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(zzc());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
