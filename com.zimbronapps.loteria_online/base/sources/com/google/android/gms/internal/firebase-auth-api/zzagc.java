package com.google.android.gms.internal.firebase-auth-api;

import A6.a;
import G6.e;
import J7.O;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.applovin.impl.sdk.b0;
import com.applovin.impl.sdk.e0;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzagc {
    private static final a zza = new a("FirebaseAuth", new String[]{"SmsRetrieverHelper"});
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap zzd = new HashMap();

    public zzagc(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    public static /* bridge */ /* synthetic */ a zza() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzagc zzagcVar, String str) {
        zzagcVar.zzd(str);
    }

    public static /* synthetic */ void zzd(zzagc zzagcVar, String str) {
        zzagcVar.zze(str);
    }

    private final void zze(String str) {
        zzagj zzagjVar = (zzagj) this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        if (!zzagjVar.zzi) {
            zzd(str);
        }
        zzb(str);
    }

    public final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String zza2 = zza(packageName, (Build.VERSION.SDK_INT < 28 ? e.a(this.zzb).f(packageName, 64).signatures : e0.a(b0.a(e.a(this.zzb).f(packageName, 134217728))))[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ HashMap zza(zzagc zzagcVar) {
        return zzagcVar.zzd;
    }

    private final void zzd(String str) {
        zzagj zzagjVar = (zzagj) this.zzd.get(str);
        if (zzagjVar == null || zzagjVar.zzh || zzac.zzc(zzagjVar.zzd)) {
            return;
        }
        zza.h("Timed out waiting for SMS.", new Object[0]);
        Iterator it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzael) it.next()).zza(zzagjVar.zzd);
        }
        zzagjVar.zzi = true;
    }

    public final boolean zzc(String str) {
        return this.zzd.get(str) != null;
    }

    public final zzael zza(zzael zzaelVar, String str) {
        return new zzagh(this, zzaelVar, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            zza.c("NoSuchAlgorithm: " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void zzb(zzagc zzagcVar, String str) {
        zzagj zzagjVar = (zzagj) zzagcVar.zzd.get(str);
        if (zzagjVar == null || zzac.zzc(zzagjVar.zzd) || zzac.zzc(zzagjVar.zze) || zzagjVar.zzb.isEmpty()) {
            return;
        }
        Iterator it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzael) it.next()).zza(O.Q1(zzagjVar.zzd, zzagjVar.zze));
        }
        zzagjVar.zzh = true;
    }

    public static /* synthetic */ void zza(zzagc zzagcVar, String str) {
        zzagcVar.zze(str);
    }

    public final void zza(String str, zzael zzaelVar, long j, boolean z) {
        this.zzd.put(str, new zzagj(j, z));
        zzb(zzaelVar, str);
        zzagj zzagjVar = (zzagj) this.zzd.get(str);
        if (zzagjVar.zza <= 0) {
            zza.h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagjVar.zzf = this.zzc.schedule(new zzagf(this, str), zzagjVar.zza, TimeUnit.SECONDS);
        if (!zzagjVar.zzc) {
            zza.h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagg zzaggVar = new zzagg(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        H1.a.registerReceiver(this.zzb.getApplicationContext(), zzaggVar, intentFilter, 2);
        m6.a.a(this.zzb).startSmsRetriever().addOnFailureListener(new zzage(this));
    }

    public final void zzb(zzael zzaelVar, String str) {
        zzagj zzagjVar = (zzagj) this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        zzagjVar.zzb.add(zzaelVar);
        if (zzagjVar.zzg) {
            zzaelVar.zzb(zzagjVar.zzd);
        }
        if (zzagjVar.zzh) {
            zzaelVar.zza(O.Q1(zzagjVar.zzd, zzagjVar.zze));
        }
        if (zzagjVar.zzi) {
            zzaelVar.zza(zzagjVar.zzd);
        }
    }

    public final void zzb(String str) {
        zzagj zzagjVar = (zzagj) this.zzd.get(str);
        if (zzagjVar == null) {
            return;
        }
        ScheduledFuture scheduledFuture = zzagjVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzagjVar.zzf.cancel(false);
        }
        zzagjVar.zzb.clear();
        this.zzd.remove(str);
    }
}
