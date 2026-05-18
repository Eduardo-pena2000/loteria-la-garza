package Xb;

import Wb.g;
import Yb.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class d implements c {
    public b a;
    public List b;
    public String c;
    public m d;
    public String e;
    public String f;
    public Object[] g;
    public long h;
    public Throwable i;

    public void a(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(2);
        }
        this.b.add(gVar);
    }

    public b b() {
        return this.a;
    }

    public m c() {
        return this.d;
    }

    public void d(Object[] objArr) {
        this.g = objArr;
    }

    public void e(b bVar) {
        this.a = bVar;
    }

    public void f(m mVar) {
        this.d = mVar;
    }

    public void g(String str) {
        this.c = str;
    }

    public void h(String str) {
        this.f = str;
    }

    public void i(String str) {
        this.e = str;
    }

    public void j(Throwable th) {
        this.i = th;
    }

    public void k(long j) {
        this.h = j;
    }
}
