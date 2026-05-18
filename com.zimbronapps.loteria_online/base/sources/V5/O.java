package V5;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class o implements DialogInterface.OnClickListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ String b;

    public /* synthetic */ o(u uVar, String str) {
        this.a = uVar;
        this.b = str;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        this.a.j(this.b, dialogInterface, i);
    }
}
