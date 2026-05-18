package V5;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ e(u uVar, int i, int i2, int i3, int i4, int i5) {
        this.a = uVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        this.a.h(this.b, this.c, this.d, this.e, this.f, dialogInterface, i);
    }
}
