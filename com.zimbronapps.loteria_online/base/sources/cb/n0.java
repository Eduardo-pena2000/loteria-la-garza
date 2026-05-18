package cb;

import cb.B0;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class N0 extends Ga.a implements B0 {
    public static final N0 a = new N0();

    public N0() {
        super(B0.P8);
    }

    public u attachChild(w wVar) {
        return O0.a;
    }

    public /* synthetic */ void cancel() {
        B0.a.a(this);
    }

    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    public Ya.h getChildren() {
        return Ya.o.g();
    }

    public kb.d getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    public B0 getParent() {
        return null;
    }

    public g0 invokeOnCompletion(Qa.l lVar) {
        return O0.a;
    }

    public boolean isActive() {
        return true;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isCompleted() {
        return false;
    }

    public Object join(Ga.e eVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public B0 plus(B0 b0) {
        return B0.a.g(this, b0);
    }

    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    public void cancel(CancellationException cancellationException) {
    }

    public g0 invokeOnCompletion(boolean z, boolean z2, Qa.l lVar) {
        return O0.a;
    }

    public /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }
}
