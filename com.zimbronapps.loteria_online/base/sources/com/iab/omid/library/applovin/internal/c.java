package com.iab.omid.library.applovin.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c {
    private static c c = new c();
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    private c() {
    }

    public static c c() {
        return c;
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.b);
    }

    public Collection b() {
        return Collections.unmodifiableCollection(this.a);
    }

    public boolean d() {
        return this.b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d = d();
        this.a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean d = d();
        this.b.add(aVar);
        if (d) {
            return;
        }
        i.c().d();
    }
}
