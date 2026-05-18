package M2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public final int a;
    public final float b;

    public e(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && Float.compare(eVar.b, this.b) == 0;
    }

    public int hashCode() {
        return ((527 + this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
