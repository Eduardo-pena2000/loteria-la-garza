package V5;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ m(u uVar, AtomicInteger atomicInteger, int i, int i2, int i3) {
        this.a = uVar;
        this.b = atomicInteger;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        this.a.i(this.b, this.c, this.d, this.e, dialogInterface, i);
    }
}
