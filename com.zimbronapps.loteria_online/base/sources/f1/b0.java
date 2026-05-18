package f1;

import Z0.W0;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import f1.s;
import f1.y;
import f1.z;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b0 {
    public static /* synthetic */ void a(Runnable runnable, long j) {
        f(runnable, j);
    }

    public static /* synthetic */ void b(Choreographer choreographer, Runnable runnable) {
        e(choreographer, runnable);
    }

    public static final /* synthetic */ void c(EditorInfo editorInfo) {
        i(editorInfo);
    }

    public static final Executor d(Choreographer choreographer) {
        return new Z(choreographer);
    }

    public static final void e(Choreographer choreographer, Runnable runnable) {
        choreographer.postFrameCallback(new a0(runnable));
    }

    public static final void f(Runnable runnable, long j) {
        runnable.run();
    }

    public static final boolean g(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void h(EditorInfo editorInfo, t tVar, U u) {
        int e = tVar.e();
        s.a aVar = s.b;
        int i = 6;
        if (s.m(e, aVar.a())) {
            if (!tVar.h()) {
                i = 0;
            }
        } else if (s.m(e, aVar.e())) {
            i = 1;
        } else if (s.m(e, aVar.c())) {
            i = 2;
        } else if (s.m(e, aVar.d())) {
            i = 5;
        } else if (s.m(e, aVar.f())) {
            i = 7;
        } else if (s.m(e, aVar.g())) {
            i = 3;
        } else if (s.m(e, aVar.h())) {
            i = 4;
        } else if (!s.m(e, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        tVar.g();
        int f = tVar.f();
        z.a aVar2 = z.b;
        if (z.n(f, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (z.n(f, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (z.n(f, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (z.n(f, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (z.n(f, aVar2.j())) {
            editorInfo.inputType = 17;
        } else if (z.n(f, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (z.n(f, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (z.n(f, aVar2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!z.n(f, aVar2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!tVar.h() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (s.m(tVar.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int c = tVar.c();
            y.a aVar3 = y.b;
            if (y.i(c, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (y.i(c, aVar3.e())) {
                editorInfo.inputType |= 8192;
            } else if (y.i(c, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (tVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = W0.n(u.k());
        editorInfo.initialSelEnd = W0.i(u.k());
        V1.c.f(editorInfo, u.l());
        editorInfo.imeOptions |= 33554432;
    }

    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.c.k()) {
            androidx.emoji2.text.c.c().x(editorInfo);
        }
    }
}
