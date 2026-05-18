package u6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ BroadcastReceiver.PendingResult e;

    public /* synthetic */ p(b bVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = bVar;
        this.b = intent;
        this.c = context;
        this.d = z;
        this.e = pendingResult;
    }

    public final void run() {
        this.a.d(this.b, this.c, this.d, this.e);
    }
}
