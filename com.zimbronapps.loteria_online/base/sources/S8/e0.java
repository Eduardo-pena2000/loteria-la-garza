package s8;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class e0 implements OnCompleteListener {
    public final /* synthetic */ Intent a;

    public /* synthetic */ e0(Intent intent) {
        this.a = intent;
    }

    public final void onComplete(Task task) {
        f0.a(this.a, task);
    }
}
