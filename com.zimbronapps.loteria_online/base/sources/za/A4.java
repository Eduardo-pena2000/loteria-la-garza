package za;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a4 extends S1 {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q0.values().length];
            a = iArr;
            try {
                iArr[q0.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[q0.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[q0.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[q0.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a4(R3 r3) {
        super(r3);
    }

    public a5 c(View view) {
        return new a5(view.getScrollX(), view.getScrollY());
    }

    public void f(View view, long j, long j2) {
        view.scrollBy((int) j, (int) j2);
    }

    public void g(View view, long j, long j2) {
        view.scrollTo((int) j, (int) j2);
    }

    public void h(View view, boolean z) {
        view.setHorizontalScrollBarEnabled(z);
    }

    public void i(View view, q0 q0Var) {
        int i = a.a[q0Var.ordinal()];
        if (i == 1) {
            view.setOverScrollMode(0);
            return;
        }
        if (i == 2) {
            view.setOverScrollMode(1);
        } else if (i == 3) {
            view.setOverScrollMode(2);
        } else if (i == 4) {
            throw b().M(q0.f);
        }
    }

    public void j(View view, boolean z) {
        view.setVerticalScrollBarEnabled(z);
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public R3 b() {
        return (R3) super.b();
    }
}
