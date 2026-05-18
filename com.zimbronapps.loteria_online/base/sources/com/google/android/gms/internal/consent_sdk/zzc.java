package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzc implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzd[] zzc;

    public /* synthetic */ zzc(String str, String str2, zzd[] zzdVarArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzdVarArr;
    }

    public final void run() {
        JSONObject jSONObject;
        String str = this.zza;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        String str2 = this.zzb;
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                return;
            }
        }
        zzd[] zzdVarArr = this.zzc;
        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
        for (zzd zzdVar : zzdVarArr) {
            FutureTask futureTask = new FutureTask(new zzb(zzdVar, lowerCase, jSONObject));
            zzdVar.zza().execute(futureTask);
            try {
            } catch (InterruptedException e) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
            } catch (ExecutionException e2) {
                Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e2.getCause());
            }
            if (((Boolean) futureTask.get()).booleanValue()) {
                return;
            }
        }
    }
}
