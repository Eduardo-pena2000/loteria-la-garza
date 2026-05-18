package V5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public x(y yVar, Context context, String str, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = z2;
        Objects.requireNonNull(yVar);
    }

    public final void run() {
        R5.t.g();
        Context context = this.a;
        AlertDialog.Builder p = F0.p(context);
        p.setMessage(this.b);
        if (this.c) {
            p.setTitle("Error");
        } else {
            p.setTitle("Info");
        }
        if (this.d) {
            p.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            p.setPositiveButton("Learn More", new w(this, context));
            p.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        p.create().show();
    }
}
