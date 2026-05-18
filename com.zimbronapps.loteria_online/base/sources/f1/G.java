package f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements i {
    public final int a;
    public final int b;

    public g(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        g1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public void a(m mVar) {
        int j = mVar.j();
        int i = this.b;
        int i2 = j + i;
        if (((j ^ i2) & (i ^ i2)) < 0) {
            i2 = mVar.h();
        }
        mVar.b(mVar.j(), Math.min(i2, mVar.h()));
        int k = mVar.k();
        int i3 = this.a;
        int i4 = k - i3;
        if (((k ^ i4) & (i3 ^ k)) < 0) {
            i4 = 0;
        }
        mVar.b(Math.max(0, i4), mVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
