package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class b extends d {

    @SuppressLint({"StaticFieldLeak"})
    private static b d = new b();

    private b() {
    }

    public static b g() {
        return d;
    }

    public void b(boolean z) {
        Iterator it = c.c().b().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.applovin.adsession.a) it.next()).d().a(z);
        }
    }

    public boolean d() {
        Iterator it = c.c().a().iterator();
        while (it.hasNext()) {
            View e = ((com.iab.omid.library.applovin.adsession.a) it.next()).e();
            if (e != null && e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
