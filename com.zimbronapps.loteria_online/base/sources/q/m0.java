package Q;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m0 implements l0 {
    public final View a;
    public final Ca.l b = Ca.m.a(Ca.n.c, new a());
    public final T1.N c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = m0.f(m0.this).getContext().getSystemService("input_method");
            kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public m0(View view) {
        this.a = view;
        this.c = new T1.N(view);
    }

    public static final /* synthetic */ View f(m0 m0Var) {
        return m0Var.a;
    }

    public void a(int i, ExtractedText extractedText) {
        g().updateExtractedText(this.a, i, extractedText);
    }

    public void b(int i, int i2, int i3, int i4) {
        g().updateSelection(this.a, i, i2, i3, i4);
    }

    public void c() {
        g().restartInput(this.a);
    }

    public void d() {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a.a(g(), this.a);
        }
    }

    public void e(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.a, cursorAnchorInfo);
    }

    public final InputMethodManager g() {
        return (InputMethodManager) this.b.getValue();
    }

    public boolean isActive() {
        return g().isActive(this.a);
    }
}
