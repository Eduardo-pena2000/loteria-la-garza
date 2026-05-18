package Xb;

import Wb.g;
import Yb.m;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a extends Yb.d {
    public String a;
    public m b;
    public Queue c;

    public a(m mVar, Queue queue) {
        this.b = mVar;
        this.a = mVar.getName();
        this.c = queue;
    }

    public void A(b bVar, g gVar, String str, Object[] objArr, Throwable th) {
        d dVar = new d();
        dVar.k(System.currentTimeMillis());
        dVar.e(bVar);
        dVar.f(this.b);
        dVar.g(this.a);
        if (gVar != null) {
            dVar.a(gVar);
        }
        dVar.h(str);
        dVar.i(Thread.currentThread().getName());
        dVar.d(objArr);
        dVar.j(th);
        this.c.add(dVar);
    }

    public boolean a() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean f() {
        return true;
    }

    public String getName() {
        return this.a;
    }

    public boolean h() {
        return true;
    }

    public boolean r() {
        return true;
    }
}
