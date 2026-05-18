package Q;

import P0.r1;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final c a = new c();

    public static /* synthetic */ void a(IntConsumer intConsumer, int i) {
        c(intConsumer, i);
    }

    public static final void c(IntConsumer intConsumer, int i) {
        intConsumer.accept(i);
    }

    public final void b(N.y yVar, T.F f, HandwritingGesture handwritingGesture, r1 r1Var, Executor executor, IntConsumer intConsumer, Qa.l lVar) {
        int l = yVar != null ? i0.a.l(yVar, handwritingGesture, f, r1Var, lVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new b(intConsumer, l));
        } else {
            intConsumer.accept(l);
        }
    }

    public final boolean d(N.y yVar, T.F f, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (yVar != null) {
            return i0.a.D(yVar, previewableHandwritingGesture, f, cancellationSignal);
        }
        return false;
    }
}
