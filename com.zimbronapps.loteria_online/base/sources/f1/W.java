package f1;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w implements v {
    public final View a;
    public final Ca.l b = Ca.m.a(Ca.n.c, new a());
    public final T1.N c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = w.g(w.this).getContext().getSystemService("input_method");
            kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public w(View view) {
        this.a = view;
        this.c = new T1.N(view);
    }

    public static final /* synthetic */ View g(w wVar) {
        return wVar.a;
    }

    public void a(int i, ExtractedText extractedText) {
        h().updateExtractedText(this.a, i, extractedText);
    }

    public void b(int i, int i2, int i3, int i4) {
        h().updateSelection(this.a, i, i2, i3, i4);
    }

    public void c() {
        h().restartInput(this.a);
    }

    public void d() {
        this.c.b();
    }

    public void e(CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.a, cursorAnchorInfo);
    }

    public void f() {
        this.c.a();
    }

    public final InputMethodManager h() {
        return (InputMethodManager) this.b.getValue();
    }

    public boolean isActive() {
        return h().isActive(this.a);
    }
}
