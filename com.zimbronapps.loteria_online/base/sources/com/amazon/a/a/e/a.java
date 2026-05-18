package com.amazon.a.a.e;

import com.amazon.a.a.k.d;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a implements d {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("Expirable");

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b a;
    private AtomicBoolean c = new AtomicBoolean(false);
    private final List d = new Vector();

    public class 1 implements com.amazon.a.a.n.a {
        public 1() {
        }

        public void a() {
            a.this.c();
        }

        public String toString() {
            return "Expire: " + a.this.toString();
        }
    }

    private void h() {
        this.a.a(com.amazon.a.a.n.b.d.c, new 1(), a());
    }

    private void i() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this);
        }
    }

    public abstract Date a();

    public final void a(b bVar) {
        this.d.add(bVar);
    }

    public void b() {
    }

    public void c() {
        if (this.c.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.a) {
                b.a("Expiring: " + this);
            }
            d();
            if (com.amazon.a.a.o.c.a) {
                b.a("Notifying Observers of expiration: " + this);
            }
            i();
        }
    }

    public abstract void d();

    public final void e() {
        h();
        b();
    }

    public final void f() {
        if (this.c.compareAndSet(false, true)) {
            i();
        }
    }

    public boolean g() {
        return this.c.get();
    }
}
