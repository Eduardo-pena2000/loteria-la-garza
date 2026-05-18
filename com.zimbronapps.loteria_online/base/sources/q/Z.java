package Q;

import Z0.W0;
import android.view.inputmethod.EditorInfo;
import f1.s;
import f1.y;
import f1.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {
    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void b(EditorInfo editorInfo, CharSequence charSequence, long j, f1.t tVar, String[] strArr) {
        int e = tVar.e();
        s.a aVar = f1.s.b;
        int i = 3;
        int i2 = 6;
        if (f1.s.m(e, aVar.a())) {
            if (!tVar.h()) {
                i2 = 0;
            }
        } else if (f1.s.m(e, aVar.e())) {
            i2 = 1;
        } else if (f1.s.m(e, aVar.c())) {
            i2 = 2;
        } else if (f1.s.m(e, aVar.d())) {
            i2 = 5;
        } else if (f1.s.m(e, aVar.f())) {
            i2 = 7;
        } else if (f1.s.m(e, aVar.g())) {
            i2 = 3;
        } else if (f1.s.m(e, aVar.h())) {
            i2 = 4;
        } else if (!f1.s.m(e, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        tVar.g();
        t0.a.a(editorInfo, tVar.d());
        int f = tVar.f();
        z.a aVar2 = f1.z.b;
        if (f1.z.n(f, aVar2.h())) {
            i = 1;
        } else if (f1.z.n(f, aVar2.a())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i = 1;
        } else if (f1.z.n(f, aVar2.d())) {
            i = 2;
        } else if (!f1.z.n(f, aVar2.g())) {
            if (f1.z.n(f, aVar2.j())) {
                i = 17;
            } else if (f1.z.n(f, aVar2.c())) {
                i = 33;
            } else if (f1.z.n(f, aVar2.f())) {
                i = 129;
            } else if (f1.z.n(f, aVar2.e())) {
                i = 18;
            } else {
                if (!f1.z.n(f, aVar2.b())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i = 8194;
            }
        }
        editorInfo.inputType = i;
        if (!tVar.h() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (f1.s.m(tVar.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int c = tVar.c();
            y.a aVar3 = f1.y.b;
            if (f1.y.i(c, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (f1.y.i(c, aVar3.e())) {
                editorInfo.inputType |= 8192;
            } else if (f1.y.i(c, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (tVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = W0.n(j);
        editorInfo.initialSelEnd = W0.i(j);
        V1.c.f(editorInfo, charSequence);
        if (strArr != null) {
            V1.c.d(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!O.c.a() || f1.z.n(tVar.f(), aVar2.f()) || f1.z.n(tVar.f(), aVar2.e())) {
            V1.c.g(editorInfo, false);
        } else {
            V1.c.g(editorInfo, true);
            y.a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j, f1.t tVar, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j, tVar, strArr);
    }
}
