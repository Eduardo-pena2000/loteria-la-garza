package Q;

import P0.r1;
import Z0.W0;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u0 implements InputConnection {
    public final k0 a;
    public final boolean b;
    public final N.y c;
    public final T.F d;
    public final r1 e;
    public int f;
    public f1.U g;
    public int h;
    public boolean i;
    public final List j = new ArrayList();
    public boolean k = true;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public a() {
            super(1);
        }

        public final void a(f1.i iVar) {
            u0.b(u0.this, iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f1.i) obj);
            return Ca.I.a;
        }
    }

    public u0(f1.U u, k0 k0Var, boolean z, N.y yVar, T.F f, r1 r1Var) {
        this.a = k0Var;
        this.b = z;
        this.c = yVar;
        this.d = f;
        this.e = r1Var;
        this.g = u;
    }

    public static final /* synthetic */ void b(u0 u0Var, f1.i iVar) {
        u0Var.c(iVar);
    }

    public boolean beginBatchEdit() {
        boolean z = this.k;
        return z ? d() : z;
    }

    public final void c(f1.i iVar) {
        d();
        try {
            this.j.add(iVar);
        } finally {
            e();
        }
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        this.a.e(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            c(new f1.a(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final boolean d() {
        this.f++;
        return true;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        c(new f1.g(i, i2));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        c(new f1.h(i, i2));
        return true;
    }

    public final boolean e() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0 && !this.j.isEmpty()) {
            this.a.d(Da.D.O0(this.j));
            this.j.clear();
        }
        return this.f > 0;
    }

    public boolean endBatchEdit() {
        return e();
    }

    public final void f(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        c(new f1.o());
        return true;
    }

    public final void g(f1.U u) {
        this.g = u;
    }

    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.g.l(), W0.l(this.g.k()), i);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return v0.a(this.g);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i) {
        if (W0.h(this.g.k())) {
            return null;
        }
        return f1.V.a(this.g).toString();
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        return f1.V.b(this.g, i).toString();
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        return f1.V.c(this.g, i).toString();
    }

    public final void h(f1.U u, l0 l0Var) {
        if (this.k) {
            g(u);
            if (this.i) {
                l0Var.a(this.h, v0.a(u));
            }
            W0 j = u.j();
            int l = j != null ? W0.l(j.r()) : -1;
            W0 j2 = u.j();
            l0Var.b(W0.l(u.k()), W0.k(u.k()), l, j2 != null ? W0.k(j2.r()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    c(new f1.Q(0, this.g.l().length()));
                    break;
                case 16908320:
                    f(277);
                    break;
                case 16908321:
                    f(278);
                    break;
                case 16908322:
                    f(279);
                    break;
            }
        }
        return z;
    }

    public boolean performEditorAction(int i) {
        int a2;
        boolean z = this.k;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    a2 = f1.s.b.c();
                    break;
                case 3:
                    a2 = f1.s.b.g();
                    break;
                case 4:
                    a2 = f1.s.b.h();
                    break;
                case 5:
                    a2 = f1.s.b.d();
                    break;
                case 6:
                    a2 = f1.s.b.b();
                    break;
                case 7:
                    a2 = f1.s.b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                    a2 = f1.s.b.a();
                    break;
            }
        } else {
            a2 = f1.s.b.a();
        }
        this.a.c(a2);
        return true;
    }

    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.a.b(this.c, this.d, handwritingGesture, this.e, executor, intConsumer, new a());
        }
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a.d(this.c, this.d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.k;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (i & 1) != 0;
        boolean z8 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            boolean z9 = (i & 16) != 0;
            boolean z10 = (i & 8) != 0;
            boolean z11 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z = z11;
                z4 = z10;
                z3 = z9;
            } else if (i2 >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.a.b(z7, z8, z3, z4, z, z2);
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.a.a(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            c(new f1.O(i, i2));
        }
        return z;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            c(new f1.P(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        c(new f1.Q(i, i2));
        return true;
    }
}
