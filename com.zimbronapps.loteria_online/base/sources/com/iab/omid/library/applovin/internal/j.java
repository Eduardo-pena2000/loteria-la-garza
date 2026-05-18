package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class j {

    @SuppressLint({"StaticFieldLeak"})
    private static j d = new j();
    private WeakReference a;
    private boolean b = false;
    private boolean c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean a;
            boolean z;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                a = j.a(jVar);
                z = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                a = j.a(jVar);
                z = false;
            }
            jVar.a(z, a);
            j.a(j.this, z);
        }
    }

    public static j b() {
        return d;
    }

    public void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.b, isDeviceLocked);
        this.c = isDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = c.c().b().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.applovin.adsession.a) it.next()).d().b(z2 || z);
        }
    }

    public static /* synthetic */ boolean a(j jVar) {
        return jVar.c;
    }

    public static /* synthetic */ boolean a(j jVar, boolean z) {
        jVar.b = z;
        return z;
    }
}
