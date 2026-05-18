package com.google.android.gms.ads;

import S5.B;
import W5.p;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbtp;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    public final void onHandleIntent(Intent intent) {
        try {
            B.b().j(this, new zzbtp()).zze(intent);
        } catch (RemoteException e) {
            p.c("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
