package D0;

import D0.b;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements a {
    public final View a;

    public c(View view) {
        this.a = view;
    }

    public void a(int i) {
        b.a aVar = b.a;
        if (b.b(i, aVar.a())) {
            this.a.performHapticFeedback(16);
            return;
        }
        if (b.b(i, aVar.b())) {
            this.a.performHapticFeedback(6);
            return;
        }
        if (b.b(i, aVar.c())) {
            this.a.performHapticFeedback(13);
            return;
        }
        if (b.b(i, aVar.d())) {
            this.a.performHapticFeedback(23);
            return;
        }
        if (b.b(i, aVar.e())) {
            this.a.performHapticFeedback(3);
            return;
        }
        if (b.b(i, aVar.f())) {
            this.a.performHapticFeedback(0);
            return;
        }
        if (b.b(i, aVar.g())) {
            this.a.performHapticFeedback(17);
            return;
        }
        if (b.b(i, aVar.h())) {
            this.a.performHapticFeedback(27);
            return;
        }
        if (b.b(i, aVar.i())) {
            this.a.performHapticFeedback(26);
            return;
        }
        if (b.b(i, aVar.j())) {
            this.a.performHapticFeedback(9);
            return;
        }
        if (b.b(i, aVar.k())) {
            this.a.performHapticFeedback(22);
        } else if (b.b(i, aVar.l())) {
            this.a.performHapticFeedback(21);
        } else if (b.b(i, aVar.m())) {
            this.a.performHapticFeedback(1);
        }
    }
}
