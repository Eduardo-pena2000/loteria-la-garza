package u6;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class b extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public Executor a() {
        ExecutorService executorService;
        synchronized (b.class) {
            try {
                SoftReference softReference = a;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    zze.zza();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new F6.b("firebase-iid-executor")));
                    a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public abstract int b(Context context, a aVar);

    public abstract void c(Context context, Bundle bundle);

    public final /* synthetic */ void d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Executor executor;
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = e(context, intent2);
            } else if (intent.getExtras() == null) {
                i = 500;
            } else {
                a aVar = new a(intent);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (b.class) {
                    try {
                        SoftReference softReference = b;
                        executor = softReference != null ? (Executor) softReference.get() : null;
                        if (executor == null) {
                            zze.zza();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new F6.b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            b = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new o(context, aVar, countDownLatch));
                int b2 = b(context, aVar);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                }
                i = b2;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(i);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    public final int e(Context context, Intent intent) {
        PendingIntent parcelableExtra = intent.getParcelableExtra("pending_intent");
        if (parcelableExtra != null) {
            try {
                parcelableExtra.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        a().execute(new p(this, intent, context, isOrderedBroadcast(), goAsync()));
    }
}
