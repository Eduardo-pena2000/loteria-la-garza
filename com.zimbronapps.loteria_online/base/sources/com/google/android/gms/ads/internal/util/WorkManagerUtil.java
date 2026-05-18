package com.google.android.gms.ads.internal.util;

import G4.b;
import G4.n;
import G4.o;
import G4.w;
import N6.b;
import V5.P;
import W5.p;
import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class WorkManagerUtil extends P {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void q1(Context context) {
        try {
            w.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    public final boolean zze(N6.a aVar, String str, String str2) {
        return zzg(aVar, new T5.a(str, str2, ""));
    }

    public final void zzf(N6.a aVar) {
        Context context = (Context) b.r1(aVar);
        q1(context);
        try {
            w d = w.d(context);
            d.a("offline_ping_sender_work");
            d.b(new o.a(OfflinePingSender.class).e(new b.a().b(n.b).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e) {
            p.g("Failed to instantiate WorkManager.", e);
        }
    }

    public final boolean zzg(N6.a aVar, T5.a aVar2) {
        Context context = (Context) N6.b.r1(aVar);
        q1(context);
        G4.b a = new b.a().b(n.b).a();
        try {
            w.d(context).b(new o.a(OfflineNotificationPoster.class).e(a).f(new b.a().e("uri", aVar2.a).e("gws_query_id", aVar2.b).e("image_url", aVar2.c).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e) {
            p.g("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
