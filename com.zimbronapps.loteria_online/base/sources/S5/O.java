package S5;

import android.content.Context;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o extends A {
    public final /* synthetic */ Context b;
    public final /* synthetic */ q2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ y e;

    public o(y yVar, Context context, q2 q2Var, String str) {
        this.b = context;
        this.c = q2Var;
        this.d = str;
        Objects.requireNonNull(yVar);
        this.e = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        y.l(this.b, "search");
        return new O1();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.e.m().a(this.b, this.c, this.d, null, 3);
    }

    public final /* bridge */ /* synthetic */ Object c(s0 s0Var) {
        return s0Var.C0(N6.b.s1(this.b), this.c, this.d, 254715000);
    }
}
