package Pb;

import Sb.A;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f implements Vb.b {
    public final List a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public f f;
    public f g;

    public f(List list, char c, boolean z, boolean z2, f fVar) {
        this.a = list;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = fVar;
        this.c = list.size();
    }

    public Iterable a(int i) {
        if (i >= 1 && i <= length()) {
            List list = this.a;
            return list.subList(list.size() - i, this.a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i);
    }

    public A b() {
        return (A) this.a.get(0);
    }

    public boolean c() {
        return this.e;
    }

    public A d() {
        return (A) this.a.get(r0.size() - 1);
    }

    public Iterable e(int i) {
        if (i >= 1 && i <= length()) {
            return this.a.subList(0, i);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i);
    }

    public int f() {
        return this.c;
    }

    public boolean g() {
        return this.d;
    }

    public int length() {
        return this.a.size();
    }
}
