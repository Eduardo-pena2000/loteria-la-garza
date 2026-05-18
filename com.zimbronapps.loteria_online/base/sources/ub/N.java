package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class n {
    public final A a;
    public boolean b;

    public n(A writer) {
        kotlin.jvm.internal.t.g(writer, "writer");
        this.a = writer;
        this.b = true;
    }

    public final boolean a() {
        return this.b;
    }

    public void b() {
        this.b = true;
    }

    public void c() {
        this.b = false;
    }

    public void d() {
        this.b = false;
    }

    public void e(byte b) {
        this.a.writeLong(b);
    }

    public final void f(char c) {
        this.a.a(c);
    }

    public void g(double d) {
        this.a.c(String.valueOf(d));
    }

    public void h(float f) {
        this.a.c(String.valueOf(f));
    }

    public void i(int i) {
        this.a.writeLong(i);
    }

    public void j(long j) {
        this.a.writeLong(j);
    }

    public final void k(String v) {
        kotlin.jvm.internal.t.g(v, "v");
        this.a.c(v);
    }

    public void l(short s) {
        this.a.writeLong(s);
    }

    public void m(boolean z) {
        this.a.c(String.valueOf(z));
    }

    public void n(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        this.a.b(value);
    }

    public final void o(boolean z) {
        this.b = z;
    }

    public void p() {
    }

    public void q() {
    }
}
