package com.google.android.gms.common.api.internal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class t0 extends j implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    public final AtomicReference b;
    public final Handler c;
    public final v6.g d;

    public t0(k kVar, v6.g gVar) {
        super(kVar);
        this.b = new AtomicReference((Object) null);
        this.c = new zau(Looper.getMainLooper());
        this.d = gVar;
    }

    public static final int e(q0 q0Var) {
        if (q0Var == null) {
            return -1;
        }
        return q0Var.a();
    }

    public static /* bridge */ /* synthetic */ void f(t0 t0Var, v6.b bVar, int i) {
        t0Var.a(bVar, i);
    }

    public static /* bridge */ /* synthetic */ void g(t0 t0Var) {
        t0Var.d();
    }

    public final void a(v6.b bVar, int i) {
        this.b.set((Object) null);
        b(bVar, i);
    }

    public abstract void b(v6.b bVar, int i);

    public abstract void c();

    public final void d() {
        this.b.set((Object) null);
        c();
    }

    public final void h(v6.b bVar, int i) {
        AtomicReference atomicReference;
        q0 q0Var = new q0(bVar, i);
        do {
            atomicReference = this.b;
            if (z.Y.a(atomicReference, (Object) null, q0Var)) {
                this.c.post(new s0(this, q0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        q0 q0Var = (q0) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.d.g(getActivity());
                if (g == 0) {
                    d();
                    return;
                } else {
                    if (q0Var == null) {
                        return;
                    }
                    if (q0Var.b().N1() == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            d();
            return;
        } else if (i2 == 0) {
            if (q0Var != null) {
                a(new v6.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, q0Var.b().toString()), e(q0Var));
                return;
            }
            return;
        }
        if (q0Var != null) {
            a(q0Var.b(), q0Var.a());
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a(new v6.b(13, null), e((q0) this.b.get()));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new q0(new v6.b(bundle.getInt("failed_status"), bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q0 q0Var = (q0) this.b.get();
        if (q0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", q0Var.a());
        bundle.putInt("failed_status", q0Var.b().N1());
        bundle.putParcelable("failed_resolution", q0Var.b().P1());
    }

    public void onStart() {
        super.onStart();
        this.a = true;
    }

    public void onStop() {
        super.onStop();
        this.a = false;
    }
}
