package com.google.android.gms.ads.internal.offline.buffering;

import N6.b;
import S5.B;
import T5.a;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class OfflineNotificationPoster extends Worker {
    public final zzbxl b;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = B.b().j(context, new zzbtp());
    }

    public final ListenableWorker.a doWork() {
        try {
            this.b.zzj(b.s1(getApplicationContext()), new a(getInputData().i("uri"), getInputData().i("gws_query_id"), getInputData().i("image_url")));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
