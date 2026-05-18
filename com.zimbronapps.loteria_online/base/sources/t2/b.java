package T2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public final Context a;
    public final a b;
    public boolean c;

    public final class a extends BroadcastReceiver implements Runnable {
        public final b a;
        public final Handler b;

        public a(Handler handler, b bVar) {
            this.b = handler;
            this.a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(this);
            }
        }

        public void run() {
            if (b.a(b.this)) {
                this.a.A();
            }
        }
    }

    public interface b {
        void A();
    }

    public b(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.c;
    }

    public void b(boolean z) {
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (z || !this.c) {
                return;
            }
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
