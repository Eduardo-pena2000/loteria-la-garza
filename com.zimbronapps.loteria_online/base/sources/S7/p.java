package s7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class p extends l {
    public final Object a;

    public p(Object obj) {
        this.a = obj;
    }

    public Object b() {
        return this.a;
    }

    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.a.equals(((p) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
