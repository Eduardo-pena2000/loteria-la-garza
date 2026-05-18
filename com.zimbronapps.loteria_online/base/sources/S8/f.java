package s8;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class f implements OnCompleteListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ f(h hVar, Intent intent) {
        this.a = hVar;
        this.b = intent;
    }

    public final void onComplete(Task task) {
        h.b(this.a, this.b, task);
    }
}
