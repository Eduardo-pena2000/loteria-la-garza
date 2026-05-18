package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.l;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class h1 {

    public class a implements OnSuccessListener {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            com.applovin.impl.sdk.l.a(new l.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    public static void a(Context context) {
        new Thread(new M1(context)).start();
    }

    private static /* synthetic */ void b(Context context) {
        com.applovin.impl.sdk.l.a(v.b(context));
        if (n7.a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        b(context);
    }
}
