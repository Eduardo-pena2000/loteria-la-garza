package J8;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f extends O8.a {
    public static final Writer p = new a();
    public static final G8.k q = new G8.k("closed");
    public final List m;
    public String n;
    public G8.f o;

    public class a extends Writer {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public f() {
        super(p);
        this.m = new ArrayList();
        this.o = G8.h.a;
    }

    public O8.a J(double d) {
        if (o() || !(Double.isNaN(d) || Double.isInfinite(d))) {
            W(new G8.k((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    public O8.a L(long j) {
        W(new G8.k((Number) Long.valueOf(j)));
        return this;
    }

    public O8.a M(Boolean bool) {
        if (bool == null) {
            return u();
        }
        W(new G8.k(bool));
        return this;
    }

    public O8.a N(Number number) {
        if (number == null) {
            return u();
        }
        if (!o()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        W(new G8.k(number));
        return this;
    }

    public O8.a O(String str) {
        if (str == null) {
            return u();
        }
        W(new G8.k(str));
        return this;
    }

    public O8.a P(boolean z) {
        W(new G8.k(Boolean.valueOf(z)));
        return this;
    }

    public G8.f T() {
        if (this.m.isEmpty()) {
            return this.o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.m);
    }

    public final G8.f V() {
        return (G8.f) this.m.get(r0.size() - 1);
    }

    public final void W(G8.f fVar) {
        if (this.n != null) {
            if (!fVar.f() || k()) {
                ((G8.i) V()).i(this.n, fVar);
            }
            this.n = null;
            return;
        }
        if (this.m.isEmpty()) {
            this.o = fVar;
            return;
        }
        G8.f V = V();
        if (!(V instanceof G8.e)) {
            throw new IllegalStateException();
        }
        ((G8.e) V).i(fVar);
    }

    public O8.a c() {
        G8.e eVar = new G8.e();
        W(eVar);
        this.m.add(eVar);
        return this;
    }

    public void close() {
        if (!this.m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.m.add(q);
    }

    public O8.a d() {
        G8.i iVar = new G8.i();
        W(iVar);
        this.m.add(iVar);
        return this;
    }

    public O8.a g() {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(V() instanceof G8.e)) {
            throw new IllegalStateException();
        }
        this.m.remove(r0.size() - 1);
        return this;
    }

    public O8.a h() {
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(V() instanceof G8.i)) {
            throw new IllegalStateException();
        }
        this.m.remove(r0.size() - 1);
        return this;
    }

    public O8.a s(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.m.isEmpty() || this.n != null) {
            throw new IllegalStateException();
        }
        if (!(V() instanceof G8.i)) {
            throw new IllegalStateException();
        }
        this.n = str;
        return this;
    }

    public O8.a u() {
        W(G8.h.a);
        return this;
    }

    public void flush() {
    }
}
