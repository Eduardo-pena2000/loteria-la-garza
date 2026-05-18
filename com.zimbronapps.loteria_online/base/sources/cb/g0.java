package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class G0 extends hb.o implements g0, w0 {
    public H0 d;

    public M0 b() {
        return null;
    }

    public void dispose() {
        t().B0(this);
    }

    public boolean isActive() {
        return true;
    }

    public final H0 t() {
        H0 h0 = this.d;
        if (h0 != null) {
            return h0;
        }
        kotlin.jvm.internal.t.v("job");
        return null;
    }

    public String toString() {
        return T.a(this) + '@' + T.b(this) + "[job@" + T.b(t()) + ']';
    }

    public abstract boolean u();

    public abstract void v(Throwable th);

    public final void w(H0 h0) {
        this.d = h0;
    }
}
