package com.google.android.gms.internal.consent_sdk;

import E4.j;
import T1.K0;
import V5.R0;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    public static /* bridge */ /* synthetic */ zzcl zza(zzp zzpVar) {
        Bundle bundle;
        List list;
        List list2;
        PackageInfo packageInfo;
        zzcl zzclVar = new zzcl();
        String zza = zzpVar.zzd.zza();
        if (TextUtils.isEmpty(zza)) {
            try {
                zzn zznVar = zzpVar.zza;
                bundle = zzn.zza(zznVar).getPackageManager().getApplicationInfo(zzn.zza(zznVar).getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                zza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(zza)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzclVar.zza = zza;
        ConsentDebugSettings consentDebugSettings = zzpVar.zzc;
        if (consentDebugSettings.isTestDevice()) {
            List arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzcg.zzc);
            } else if (debugGeography == 2) {
                arrayList.add(zzcg.zzf);
            } else if (debugGeography == 3) {
                arrayList.add(zzcg.zzd);
            } else if (debugGeography == 4) {
                arrayList.add(zzcg.zze);
            }
            arrayList.add(zzcg.zzg);
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        zzclVar.zzj = list;
        zzn zznVar2 = zzpVar.zza;
        zzclVar.zzf = zzn.zzb(zznVar2).zzc();
        zzclVar.zze = Boolean.valueOf(zzpVar.zzd.isTagForUnderAgeOfConsent());
        zzclVar.zzd = Locale.getDefault().toLanguageTag();
        zzch zzchVar = new zzch();
        int i = Build.VERSION.SDK_INT;
        zzchVar.zzb = Integer.valueOf(i);
        zzchVar.zza = Build.MODEL;
        zzchVar.zzc = 2;
        zzclVar.zzc = zzchVar;
        Configuration configuration = zzn.zza(zznVar2).getResources().getConfiguration();
        zzn.zza(zznVar2).getResources().getConfiguration();
        zzcj zzcjVar = new zzcj();
        zzcjVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcjVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzcjVar.zzc = Double.valueOf(zzn.zza(zznVar2).getResources().getDisplayMetrics().density);
        if (i < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = zzpVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout a = rootWindowInsets == null ? null : K0.a(rootWindowInsets);
            if (a == null) {
                list2 = Collections.emptyList();
            } else {
                j.a(a);
                List arrayList2 = new ArrayList();
                for (Rect rect : R0.a(a)) {
                    if (rect != null) {
                        zzci zzciVar = new zzci();
                        zzciVar.zzb = Integer.valueOf(rect.left);
                        zzciVar.zzc = Integer.valueOf(rect.right);
                        zzciVar.zza = Integer.valueOf(rect.top);
                        zzciVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzciVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzcjVar.zzd = list2;
        zzclVar.zzg = zzcjVar;
        Application zza2 = zzn.zza(zznVar2);
        try {
            packageInfo = zzn.zza(zznVar2).getPackageManager().getPackageInfo(zza2.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcf zzcfVar = new zzcf();
        zzcfVar.zza = zza2.getPackageName();
        zzn zznVar3 = zzpVar.zza;
        CharSequence applicationLabel = zzn.zza(zznVar3).getPackageManager().getApplicationLabel(zzn.zza(zznVar3).getApplicationInfo());
        zzcfVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcfVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? a.a(packageInfo) : packageInfo.versionCode);
        }
        zzclVar.zzh = zzcfVar;
        zzck zzckVar = new zzck();
        zzckVar.zza = "4.0.0";
        zzclVar.zzi = zzckVar;
        zzclVar.zzb = zzpVar.zzd.getConsentSyncId();
        return zzclVar;
    }
}
