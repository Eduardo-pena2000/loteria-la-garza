package k7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j4 extends z {
    public final /* synthetic */ b5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(b5 b5Var, V3 v3) {
        super(v3);
        Objects.requireNonNull(b5Var);
        this.e = b5Var;
    }

    public final void a() {
        b5 B = this.e.a.B();
        Objects.requireNonNull(B);
        new Thread(new i4(B)).start();
    }
}
