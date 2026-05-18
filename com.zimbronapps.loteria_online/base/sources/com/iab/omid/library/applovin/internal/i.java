package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {
    private static i f;
    private float a = 0.0f;
    private final com.iab.omid.library.applovin.devicevolume.e b;
    private final com.iab.omid.library.applovin.devicevolume.b c;
    private com.iab.omid.library.applovin.devicevolume.d d;
    private c e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private c a() {
        if (this.e == null) {
            this.e = c.c();
        }
        return this.e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.d();
    }

    public void a(float f2) {
        this.a = f2;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.applovin.adsession.a) it.next()).d().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.b.a(new Handler(), context, this.c.a(), this);
    }

    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
