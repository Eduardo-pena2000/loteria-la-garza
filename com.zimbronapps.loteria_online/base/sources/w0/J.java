package W0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public final Qa.a a;
    public final Qa.a b;
    public final boolean c;

    public j(Qa.a aVar, Qa.a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public final Qa.a a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final Qa.a c() {
        return this.a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}
