package k7;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcn;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w6 extends h2 {
    public Handler c;
    public boolean d;
    public final v6 e;
    public final u6 f;
    public final r6 g;

    public w6(q3 q3Var) {
        super(q3Var);
        this.d = true;
        this.e = new v6(this);
        this.f = new u6(this);
        this.g = new r6(this);
    }

    public final boolean m() {
        return false;
    }

    public final void o(boolean z) {
        h();
        this.d = z;
    }

    public final boolean p() {
        h();
        return this.d;
    }

    public final /* synthetic */ void r(long j) {
        h();
        q();
        q3 q3Var = this.a;
        q3Var.a().w().b("Activity resumed, time", Long.valueOf(j));
        if (q3Var.w().H(null, f2.V0)) {
            if (q3Var.w().N() || this.d) {
                this.f.a(j);
            }
        } else if (q3Var.w().N() || q3Var.x().t.a()) {
            this.f.a(j);
        }
        this.g.a();
        v6 v6Var = this.e;
        w6 w6Var = v6Var.a;
        w6Var.h();
        if (w6Var.a.g()) {
            v6Var.b(w6Var.a.e().a(), false);
        }
    }

    public final /* synthetic */ void s(long j) {
        h();
        q();
        q3 q3Var = this.a;
        q3Var.a().w().b("Activity paused, time", Long.valueOf(j));
        this.g.b(j);
        if (q3Var.w().N()) {
            this.f.b(j);
        }
    }

    public final /* synthetic */ Handler t() {
        return this.c;
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.c == null) {
            this.c = new zzcn(Looper.getMainLooper());
        }
    }
}
