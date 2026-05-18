package ub;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class w extends n {
    public final tb.b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A writer, tb.b json) {
        super(writer);
        kotlin.jvm.internal.t.g(writer, "writer");
        kotlin.jvm.internal.t.g(json, "json");
        this.c = json;
    }

    public void b() {
        o(true);
        this.d++;
    }

    public void c() {
        o(false);
        k("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            k(this.c.f().n());
        }
    }

    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    public void p() {
        f(' ');
    }

    public void q() {
        this.d--;
    }
}
