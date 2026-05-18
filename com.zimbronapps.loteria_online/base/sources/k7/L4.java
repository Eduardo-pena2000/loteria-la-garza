package k7;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l4 implements x7.b {
    public final /* synthetic */ B6 a;
    public final /* synthetic */ b5 b;

    public l4(b5 b5Var, B6 b6) {
        this.a = b6;
        Objects.requireNonNull(b5Var);
        this.b = b5Var;
    }

    public final void a(Throwable th) {
        b5 b5Var = this.b;
        b5Var.h();
        b5Var.Z(false);
        q3 q3Var = b5Var.a;
        int d0 = (q3Var.w().H(null, f2.U0) ? b5Var.d0(th) : 2) - 1;
        if (d0 == 0) {
            q3Var.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C2.x(b5Var.a.L().q()), C2.x(th.toString()));
            b5Var.b0(1);
            b5Var.w0().add(this.a);
            return;
        }
        if (d0 != 1) {
            q3Var.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C2.x(b5Var.a.L().q()), th);
            b();
            b5Var.b0(1);
            b5Var.x0();
            return;
        }
        b5Var.w0().add(this.a);
        if (b5Var.a0() > ((Integer) f2.x0.b(null)).intValue()) {
            b5Var.b0(1);
            q3Var.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", C2.x(b5Var.a.L().q()), C2.x(th.toString()));
        } else {
            q3Var.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C2.x(b5Var.a.L().q()), C2.x(String.valueOf(b5Var.a0())), C2.x(th.toString()));
            b5Var.V(b5Var.a0());
            int a0 = b5Var.a0();
            b5Var.b0(a0 + a0);
        }
    }

    public final void b() {
        q3 q3Var = this.b.a;
        SparseArray r = q3Var.x().r();
        B6 b6 = this.a;
        r.put(b6.c, Long.valueOf(b6.b));
        Q2 x = q3Var.x();
        int[] iArr = new int[r.size()];
        long[] jArr = new long[r.size()];
        for (int i = 0; i < r.size(); i++) {
            iArr[i] = r.keyAt(i);
            jArr[i] = ((Long) r.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        x.o.b(bundle);
    }

    public final void onSuccess(Object obj) {
        b5 b5Var = this.b;
        b5Var.h();
        b();
        b5Var.Z(false);
        b5Var.b0(1);
        b5Var.a.a().v().b("Successfully registered trigger URI", this.a.a);
        b5Var.x0();
    }
}
