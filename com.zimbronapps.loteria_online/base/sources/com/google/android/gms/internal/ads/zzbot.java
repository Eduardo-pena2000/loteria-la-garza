package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbot {
    public static final Intent zza(Uri uri, Context context, zzazh zzazhVar, View view, zzfjo zzfjoVar) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final ResolveInfo zzb(Intent intent, Context context, zzazh zzazhVar, View view, zzfjo zzfjoVar) {
        return zzc(intent, new ArrayList(), context, zzazhVar, view, zzfjoVar);
    }

    public static final ResolveInfo zzc(Intent intent, ArrayList arrayList, Context context, zzazh zzazhVar, View view, zzfjo zzfjoVar) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            R5.t.l().zzg(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i = 0;
            while (true) {
                if (i >= queryIntentActivities.size()) {
                    break;
                }
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }

    public static final Intent zzd(Intent intent, ResolveInfo resolveInfo, Context context, zzazh zzazhVar, View view, zzfjo zzfjoVar) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }
}
