package V5;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {
    public final /* synthetic */ AtomicInteger a;

    public /* synthetic */ k(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        this.a.set(i);
    }
}
