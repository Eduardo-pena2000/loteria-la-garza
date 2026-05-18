package Z0;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class t {
    public static /* synthetic */ CharSequence a(w wVar) {
        return c(wVar);
    }

    public static final int b(List list, int i) {
        int i2;
        int b = ((w) Da.D.p0(list)).b();
        boolean z = false;
        if (!(i <= ((w) Da.D.p0(list)).b())) {
            g1.a.a("Index " + i + " should be less or equal than last line's end " + b);
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            w wVar = (w) list.get(i2);
            char c = wVar.f() > i ? (char) 1 : wVar.b() <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            z = true;
        }
        if (!z) {
            g1.a.a("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + p1.a.e(list, null, null, null, 0, null, new s(), 31, null) + ']');
        }
        return i2;
    }

    public static final CharSequence c(w wVar) {
        return '[' + wVar.f() + ", " + wVar.b() + ')';
    }

    public static final int d(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            w wVar = (w) list.get(i3);
            char c = wVar.g() > i ? (char) 1 : wVar.c() <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int e(List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((w) Da.D.p0(list)).a()) {
            return Da.v.p(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            w wVar = (w) list.get(i2);
            char c = wVar.h() > f ? (char) 1 : wVar.a() <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void f(List list, long j, Qa.l lVar) {
        int size = list.size();
        for (int b = b(list, W0.l(j)); b < size; b++) {
            w wVar = (w) list.get(b);
            if (wVar.f() >= W0.k(j)) {
                return;
            }
            if (wVar.f() != wVar.b()) {
                lVar.invoke(wVar);
            }
        }
    }
}
