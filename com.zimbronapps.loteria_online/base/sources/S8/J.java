package s8;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j implements Continuation {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j(Context context, Intent intent, boolean z) {
        this.a = context;
        this.b = intent;
        this.c = z;
    }

    public final Object then(Task task) {
        return m.a(this.a, this.b, this.c, task);
    }
}
