package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a implements d.a {
    private static a f = new a(new d());
    protected com.iab.omid.library.applovin.utils.f a = new com.iab.omid.library.applovin.utils.f();
    private Date b;
    private boolean c;
    private d d;
    private boolean e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        Iterator it = c.c().a().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.applovin.adsession.a) it.next()).d().a(b());
        }
    }

    public Date b() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a = this.a.a();
        Date date = this.b;
        if (date == null || a.after(date)) {
            this.b = a;
            c();
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }
}
