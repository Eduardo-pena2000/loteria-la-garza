package V0;

import Ca.I;
import Qa.p;
import android.os.CancellationSignal;
import cb.B0;
import cb.O;
import cb.Q;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {

    public static final class a extends u implements Qa.l {
        public final /* synthetic */ CancellationSignal a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CancellationSignal cancellationSignal) {
            super(1);
            this.a = cancellationSignal;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.a;
        }

        public final void invoke(Throwable th) {
            if (th != null) {
                this.a.cancel();
            }
        }
    }

    public static /* synthetic */ void a(B0 b0) {
        d(b0);
    }

    public static final /* synthetic */ B0 b(O o, CancellationSignal cancellationSignal, p pVar) {
        return c(o, cancellationSignal, pVar);
    }

    public static final B0 c(O o, CancellationSignal cancellationSignal, p pVar) {
        B0 d = cb.i.d(o, (Ga.i) null, (Q) null, pVar, 3, (Object) null);
        d.invokeOnCompletion(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new d(d));
        return d;
    }

    public static final void d(B0 b0) {
        B0.a.b(b0, (CancellationException) null, 1, (Object) null);
    }
}
