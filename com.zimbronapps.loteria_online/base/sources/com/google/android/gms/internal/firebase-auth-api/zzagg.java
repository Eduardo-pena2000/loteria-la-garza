package com.google.android.gms.internal.firebase-auth-api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzagg extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzagc zzb;

    public zzagg(zzagc zzagcVar, String str) {
        Objects.requireNonNull(zzagcVar);
        this.zzb = zzagcVar;
        this.zza = str;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).O1() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzagj zzagjVar = (zzagj) zzagc.zza(this.zzb).get(this.zza);
                if (zzagjVar == null) {
                    zzagc.zza().c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zza = zzagc.zza(str);
                    zzagjVar.zze = zza;
                    if (zza == null) {
                        zzagc.zza().c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzac.zzc(zzagjVar.zzd)) {
                        zzagc.zzb(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
