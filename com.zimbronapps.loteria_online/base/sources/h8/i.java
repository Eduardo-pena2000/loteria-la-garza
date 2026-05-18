package h8;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class i implements e8.h {
    public boolean a = false;
    public boolean b = false;
    public e8.d c;
    public final f d;

    public i(f fVar) {
        this.d = fVar;
    }

    public e8.h a(String str) {
        b();
        this.d.i(this.c, str, this.b);
        return this;
    }

    public final void b() {
        if (this.a) {
            throw new e8.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    public void c(e8.d dVar, boolean z) {
        this.a = false;
        this.c = dVar;
        this.b = z;
    }

    public e8.h g(boolean z) {
        b();
        this.d.o(this.c, z, this.b);
        return this;
    }
}
