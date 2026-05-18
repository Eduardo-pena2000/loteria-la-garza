package j5;

import Ca.I;
import Ca.s;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements Callback, Qa.l {
    public final Call a;
    public final cb.n b;

    public k(Call call, cb.n nVar) {
        this.a = call;
        this.b = nVar;
    }

    public void a(Throwable th) {
        try {
            this.a.cancel();
        } catch (Throwable unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return I.a;
    }

    public void onFailure(Call call, IOException iOException) {
        if (call.isCanceled()) {
            return;
        }
        cb.n nVar = this.b;
        s.a aVar = Ca.s.b;
        nVar.resumeWith(Ca.s.b(Ca.t.a(iOException)));
    }

    public void onResponse(Call call, Response response) {
        this.b.resumeWith(Ca.s.b(response));
    }
}
