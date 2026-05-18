package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzco {
    private final Application zza;
    private zzha zzb;
    private zzgw zzd;
    private zzgt zzc = null;
    private String zze = null;

    public zzco(Application application) {
        this.zza = application;
    }

    public final zzif zza(int i, String str, long j) {
        Bundle bundle;
        zzid zza = zzif.zza();
        zzgu zza2 = zzhc.zza();
        zzgx zza3 = zzgy.zza();
        zza3.zzc(i);
        if (str != null) {
            zza3.zza(str);
        }
        if (j > 0) {
            zza3.zzb(j);
        }
        zza2.zze((zzgy) zza3.zzi());
        String str2 = this.zze;
        PackageInfo packageInfo = null;
        if (str2 == null) {
            try {
                Application application = this.zza;
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                this.zze = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(this.zze)) {
                Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
            str2 = this.zze;
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        zzha zzhaVar = this.zzb;
        if (zzhaVar == null) {
            zzgz zza4 = zzha.zza();
            zza4.zza("4.0.0");
            zzhaVar = (zzha) zza4.zzi();
            this.zzb = zzhaVar;
        }
        zza2.zzf(zzhaVar);
        zzgw zzgwVar = this.zzd;
        if (zzgwVar == null) {
            zzgv zza5 = zzgw.zza();
            zza5.zza(Build.VERSION.SDK_INT);
            zza5.zzb(Build.MODEL);
            zza5.zzd(3);
            zza5.zzc(Build.VERSION.RELEASE);
            zzgwVar = (zzgw) zza5.zzi();
            this.zzd = zzgwVar;
        }
        zza2.zzd(zzgwVar);
        zzgt zzgtVar = this.zzc;
        if (zzgtVar == null) {
            Application application2 = this.zza;
            String packageName = application2.getPackageName();
            try {
                packageInfo = application2.getPackageManager().getPackageInfo(packageName, 0);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (packageInfo != null) {
                zzgs zza6 = zzgt.zza();
                zza6.zzb(Long.toString(Build.VERSION.SDK_INT >= 28 ? a.a(packageInfo) : packageInfo.versionCode));
                zza6.zza(packageName);
                this.zzc = (zzgt) zza6.zzi();
            }
            zzgtVar = this.zzc;
        }
        if (zzgtVar != null) {
            zza2.zzc(zzgtVar);
        }
        CharSequence string = PreferenceManager.getDefaultSharedPreferences(this.zza).getString("UMP_eids", "");
        if (string != null && !string.isEmpty()) {
            Iterator it = zzdo.zza(',').zzb(string).iterator();
            while (it.hasNext()) {
                zza2.zza((String) it.next());
            }
        }
        zza.zza((zzhc) zza2.zzi());
        zza.zzb(System.currentTimeMillis());
        return (zzif) zza.zzi();
    }
}
