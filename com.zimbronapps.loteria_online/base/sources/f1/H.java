package f1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements i {
    public final int a;
    public final int b;

    public h(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        g1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public void a(m mVar) {
        int i = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < i) {
                int i5 = i4 + 1;
                if (mVar.k() <= i5) {
                    i4 = mVar.k();
                    break;
                } else {
                    i4 = j.a(mVar.c((mVar.k() - i5) + (-1)), mVar.c(mVar.k() - i5)) ? i4 + 2 : i5;
                    i3++;
                }
            } else {
                break;
            }
        }
        int i6 = this.b;
        int i7 = 0;
        while (true) {
            if (i2 >= i6) {
                break;
            }
            int i8 = i7 + 1;
            if (mVar.j() + i8 >= mVar.h()) {
                i7 = mVar.h() - mVar.j();
                break;
            } else {
                i7 = j.a(mVar.c((mVar.j() + i8) + (-1)), mVar.c(mVar.j() + i8)) ? i7 + 2 : i8;
                i2++;
            }
        }
        mVar.b(mVar.j(), mVar.j() + i7);
        mVar.b(mVar.k() - i4, mVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.a + ", lengthAfterCursor=" + this.b + ')';
    }
}
