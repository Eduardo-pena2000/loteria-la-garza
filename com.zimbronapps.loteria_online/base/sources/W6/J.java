package W6;

import T6.v;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j extends a {
    public final TaskCompletionSource a;

    public j(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public final void B0(DataHolder dataHolder, String str, H6.a aVar, H6.a aVar2, H6.a aVar3) {
        c7.f fVar = new c7.f(dataHolder);
        try {
            if (fVar.getCount() >= 2 && str != null && aVar3 != null) {
                c7.d dVar = new c7.d(new c7.i(fVar.a(0)), new c7.c(aVar));
                c7.d dVar2 = new c7.d(new c7.i(fVar.a(1)), new c7.c(aVar2));
                fVar.close();
                this.a.setResult(new v.a(null, new v.b(dVar, str, dVar2, new c7.c(aVar3))));
                return;
            }
            this.a.setResult((Object) null);
            fVar.close();
        } catch (Throwable th) {
            try {
                fVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(DataHolder dataHolder, H6.a aVar) {
        int Q1 = dataHolder.Q1();
        c7.f fVar = new c7.f(dataHolder);
        try {
            c7.d dVar = fVar.getCount() > 0 ? new c7.d(new c7.i(fVar.a(0)), new c7.c(aVar)) : null;
            fVar.close();
            if (Q1 == 0) {
                this.a.setResult(new v.a(dVar, null));
                return;
            }
            if (Q1 == 4002) {
                if (dVar != null && dVar.e() != null) {
                    this.a.setException(new v.c(T6.L.a(4002), dVar.e()));
                    return;
                }
                Q1 = 4002;
            }
            T6.k.a(this.a, Q1);
        } catch (Throwable th) {
            try {
                fVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
