package com.google.android.gms.ads;

import S5.B;
import W5.p;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class NotificationHandlerActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbxl j = B.b().j(this, new zzbtp());
            if (j == null) {
                p.c("OfflineUtils is null");
            } else {
                j.zze(getIntent());
            }
        } catch (RemoteException e) {
            p.c("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    public final void onResume() {
        super.onResume();
        finish();
    }
}
