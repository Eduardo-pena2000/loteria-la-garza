package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import s8.T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e {
    public final Executor a;
    public final Map b = new w.a();

    public interface a {
        Task start();
    }

    public e(Executor executor) {
        this.a = executor;
    }

    public static /* synthetic */ Task a(e eVar, String str, Task task) {
        return eVar.c(str, task);
    }

    public synchronized Task b(String str, a aVar) {
        Task task = (Task) this.b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.a, new T(this, str));
        this.b.put(str, continueWithTask);
        return continueWithTask;
    }

    public final /* synthetic */ Task c(String str, Task task) {
        synchronized (this) {
            this.b.remove(str);
        }
        return task;
    }
}
