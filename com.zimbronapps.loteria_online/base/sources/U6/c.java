package u6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c {
    public static int h;
    public static PendingIntent i;
    public static final Executor j = G.a;
    public static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final E c;
    public final ScheduledExecutorService d;
    public Messenger f;
    public l g;
    public final i0 a = new i0();
    public final Messenger e = new Messenger(new i(this, Looper.getMainLooper()));

    public c(Context context) {
        this.b = context;
        this.c = new E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? Tasks.forResult((Object) null) : Tasks.forResult(bundle);
    }

    public static /* bridge */ /* synthetic */ void g(c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Messenger parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        cVar.g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f = parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        cVar.l(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (cVar.a) {
                        for (int i2 = 0; i2 < cVar.a.size(); i2++) {
                            try {
                                cVar.l((String) cVar.a.h(i2), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                cVar.l(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String j() {
        String num;
        synchronized (c.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    public static synchronized void k(Context context, Intent intent) {
        synchronized (c.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task a() {
        return this.c.a() >= 241100000 ? D.b(this.b).d(5, Bundle.EMPTY).continueWith(j, f.a) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(a aVar) {
        if (this.c.a() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.N1());
        Integer O1 = aVar.O1();
        if (O1 != null) {
            bundle.putInt("google.product_id", O1.intValue());
        }
        return D.b(this.b).c(3, bundle);
    }

    public Task c(Bundle bundle) {
        return this.c.a() < 12000000 ? this.c.b() != 0 ? i(bundle).continueWithTask(j, new H(this, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE")) : D.b(this.b).d(1, bundle).continueWith(j, e.a);
    }

    public Task d(boolean z) {
        if (this.c.a() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        return D.b(this.b).c(4, bundle);
    }

    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).onSuccessTask(j, F.a) : task;
    }

    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final Task i(Bundle bundle) {
        String j2 = j();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.a) {
            this.a.put(j2, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.b, intent);
        intent.putExtra("kid", "|ID|" + j2 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.c(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(j, new h(this, j2, this.d.schedule(new g(taskCompletionSource), 30L, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    public final void l(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
