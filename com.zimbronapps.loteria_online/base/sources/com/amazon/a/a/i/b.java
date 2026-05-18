package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b extends com.amazon.a.a.e.c {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("Prompt");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c c;
    private final int d;
    private Activity e;
    private d f;
    private Dialog g;
    private final AtomicBoolean h = new AtomicBoolean(false);

    public class 1 implements DialogInterface.OnKeyListener {
        public 1() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 84;
        }
    }

    public class 2 implements com.amazon.a.a.n.a {
        public 2() {
        }

        public void a() {
            b.this.k();
        }

        public String toString() {
            return "DismissPromptTask: " + b.this.toString();
        }
    }

    public b() {
        int i = i();
        this.d = i;
        if (com.amazon.a.a.o.c.a) {
            b.a("Creating Prompt: " + i);
        }
    }

    private boolean e(Activity activity) {
        if (this.c.b("TEST_MODE")) {
            return false;
        }
        return b(activity);
    }

    private void f(Activity activity) {
        if (com.amazon.a.a.o.c.a) {
            b.a("Showing prompt, id: " + j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.e != null) {
            m();
        }
        activity.showDialog(j());
    }

    private int i() {
        int nextInt = new Random().nextInt(2146249079) + 1234567;
        if (nextInt <= 1234567) {
            return 1234567;
        }
        return nextInt;
    }

    private void m() {
        if (com.amazon.a.a.o.c.a) {
            b.b("Dismissing dialog: " + this.d);
        }
        try {
            this.e.dismissDialog(this.d);
            this.e.removeDialog(this.d);
        } catch (Exception unused) {
            if (com.amazon.a.a.o.c.a) {
                b.b("Unable to remove dialog: " + this.d);
            }
        }
        this.e = null;
        this.g = null;
    }

    public final void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        if (e(activity)) {
            f(activity);
        } else {
            b(d.a);
        }
    }

    public abstract void a(d dVar);

    public boolean b(Activity activity) {
        return true;
    }

    public final Dialog c(Activity activity) {
        this.e = activity;
        Dialog d = d(activity);
        this.g = d;
        d.setCancelable(false);
        this.g.setOnKeyListener(new 1());
        return this.g;
    }

    public abstract Dialog d(Activity activity);

    public final void d() {
        if (com.amazon.a.a.o.c.a) {
            b.a("Expiring prompt: " + this);
        }
        this.a.a(com.amazon.a.a.n.b.d.a, new 2());
        a(l());
    }

    public int j() {
        return this.d;
    }

    public final boolean k() {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.a) {
            b.a("Dismissing Prompt: " + this.d);
        }
        if (!this.h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.a) {
                b.b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.e != null) {
            m();
        }
        f();
        return true;
    }

    public d l() {
        if (!g()) {
            return null;
        }
        d dVar = this.f;
        return dVar == null ? d.b : dVar;
    }

    private void b(d dVar) {
        if (com.amazon.a.a.o.c.a) {
            b.a("Expiring prompt pre-maturely: id: " + j() + ", prompt: " + this + ",, reason: " + dVar);
        }
        this.f = dVar;
        c();
    }

    public void a(Activity activity, boolean z) {
        if (activity != this.e) {
            if (com.amazon.a.a.o.c.a) {
                b.a("Unrecognized context");
            }
        } else {
            if (!z || this.g.isShowing()) {
                return;
            }
            if (com.amazon.a.a.o.c.a) {
                b.a("showing dialog because it was not showing");
            }
            this.g.show();
        }
    }
}
