package P1;

import Ca.s;
import Ca.t;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g extends AtomicBoolean implements OutcomeReceiver {
    public final Ga.e a;

    public g(Ga.e eVar) {
        super(false);
        this.a = eVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            Ga.e eVar = this.a;
            s.a aVar = s.b;
            eVar.resumeWith(s.b(t.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(s.b(obj));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
