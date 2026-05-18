package M2;

import android.util.SparseBooleanArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p {
    public final SparseBooleanArray a;

    public static final class b {
        public final SparseBooleanArray a = new SparseBooleanArray();
        public boolean b;

        public b a(int i) {
            P2.a.f(!this.b);
            this.a.append(i, true);
            return this;
        }

        public b b(p pVar) {
            for (int i = 0; i < pVar.c(); i++) {
                a(pVar.b(i));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public b d(int i, boolean z) {
            return z ? a(i) : this;
        }

        public p e() {
            P2.a.f(!this.b);
            this.b = true;
            return new p(this.a, null);
        }
    }

    public /* synthetic */ p(SparseBooleanArray sparseBooleanArray, a aVar) {
        this(sparseBooleanArray);
    }

    public boolean a(int i) {
        return this.a.get(i);
    }

    public int b(int i) {
        P2.a.c(i, 0, c());
        return this.a.keyAt(i);
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (P2.K.a >= 24) {
            return this.a.equals(pVar.a);
        }
        if (c() != pVar.c()) {
            return false;
        }
        for (int i = 0; i < c(); i++) {
            if (b(i) != pVar.b(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (P2.K.a >= 24) {
            return this.a.hashCode();
        }
        int c = c();
        for (int i = 0; i < c(); i++) {
            c = (c * 31) + b(i);
        }
        return c;
    }

    public p(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }
}
