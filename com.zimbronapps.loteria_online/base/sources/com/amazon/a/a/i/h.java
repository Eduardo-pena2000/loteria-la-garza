package com.amazon.a.a.i;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.amazon.a.a.i.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h extends b {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("SimplePrompt");
    private static final String e = "OK";
    protected final c c;
    protected final a d;

    public class 1 implements DialogInterface.OnClickListener {
        public 1() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (h.this.k()) {
                h.this.i();
            }
        }
    }

    public class 2 implements DialogInterface.OnClickListener {
        public 2() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (h.this.k()) {
                h.this.a(0);
            }
        }
    }

    public class 3 implements DialogInterface.OnClickListener {
        public 3() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (h.this.k()) {
                h.this.a(1);
            }
        }
    }

    public class 4 implements DialogInterface.OnClickListener {
        final /* synthetic */ int a;

        public 4(int i) {
            this.a = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (h.this.k()) {
                h.this.a(this.a);
            }
        }
    }

    public enum a {
        LEGACY,
        EXTENDED
    }

    public h(c cVar) {
        this(cVar, a.LEGACY);
    }

    private void a(AlertDialog.Builder builder) {
        String[] b2 = this.c.b();
        if (b2.length < 1 || b2.length > 2) {
            b.b("Unexpected button count: " + b2.length);
            return;
        }
        boolean[] a2 = a(this.c.c());
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < a2.length; i3++) {
            if (a2[i3]) {
                i2++;
                i = i3;
            }
        }
        if (i2 == 1) {
            b.a("single button dialog");
            a(builder, b2[i], i);
        } else {
            b.a("two button dialog");
            builder.setNegativeButton(b2[0], new 2());
            builder.setPositiveButton(b2[1], new 3());
        }
    }

    private final Dialog e(Activity activity) {
        b.a("Legacy mode dialog, legacy title = " + this.c.e() + ", extended title = " + this.c.f());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.c.f()).setMessage(this.c.d()).setCancelable(false).setNeutralButton("OK", new 1());
        return builder.create();
    }

    private final Dialog f(Activity activity) {
        com.amazon.a.a.o.c cVar = b;
        cVar.a("doCreate() called to create extended dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.c.f()).setMessage(this.c.d()).setCancelable(false);
        a(builder);
        cVar.a("doCreate() returning");
        return builder.create();
    }

    public boolean b(Activity activity) {
        return this.c.h();
    }

    public final Dialog d(Activity activity) {
        return this.d == a.LEGACY ? e(activity) : f(activity);
    }

    public abstract void i();

    public h(c cVar, a aVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "content");
        this.c = cVar;
        this.d = aVar;
        b.a("created SimplePrompt with mode " + aVar);
    }

    private void a(AlertDialog.Builder builder, String str, int i) {
        builder.setNeutralButton(str, new 4(i));
    }

    private boolean[] a(c.a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            boolean a2 = a(aVarArr[i]);
            zArr[i] = a2;
            if (!a2) {
                b.a("filterActions() filtering item " + i);
            }
        }
        return zArr;
    }

    public void a(d dVar) {
        i();
    }

    public void a(int i) {
        b.b("extended doAction from base class called, this should never happen.");
        i();
    }

    public boolean a(c.a aVar) {
        return aVar == c.a.DEFAULT;
    }
}
