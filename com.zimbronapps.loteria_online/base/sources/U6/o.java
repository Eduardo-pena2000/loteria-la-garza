package u6;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ a b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ o(Context context, a aVar, CountDownLatch countDownLatch) {
        this.a = context;
        this.b = aVar;
        this.c = countDownLatch;
    }

    public final void run() {
        Task c;
        a aVar = this.b;
        if (TextUtils.isEmpty(aVar.N1())) {
            c = Tasks.forResult((Object) null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", aVar.N1());
            Integer O1 = aVar.O1();
            if (O1 != null) {
                bundle.putInt("google.product_id", O1.intValue());
            }
            Context context = this.a;
            bundle.putBoolean("supports_message_handled", true);
            c = D.b(context).c(2, bundle);
        }
        c.addOnCompleteListener(m.a, new n(this.c));
    }
}
