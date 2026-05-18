package d6;

import L5.E;
import S5.l0;
import W5.p;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c {
    public final l0 a;
    public final L5.c b;
    public final Context c;

    public c(Context context, L5.c cVar) {
        this.a = E.a(context);
        this.c = context.getApplicationContext();
        this.b = cVar;
    }

    public final void a() {
        try {
            this.a.zzv(this.b.b());
        } catch (RemoteException e) {
            p.i("#007 Could not call remote method.", e);
        }
    }
}
