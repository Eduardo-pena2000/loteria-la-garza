package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Tasks {
    private Tasks() {
    }

    public static Object await(Task task) throws ExecutionException, InterruptedException {
        t.j();
        t.h();
        t.m(task, "Task must not be null");
        if (task.isComplete()) {
            return zza(task);
        }
        zzaa zzaaVar = new zzaa(null);
        zzb(task, zzaaVar);
        zzaaVar.zza();
        return zza(task);
    }

    @Deprecated
    public static Task call(Callable callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    public static Task forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zze();
        return zzwVar;
    }

    public static Task forException(Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zzc(exc);
        return zzwVar;
    }

    public static Task forResult(Object obj) {
        zzw zzwVar = new zzw();
        zzwVar.zza(obj);
        return zzwVar;
    }

    public static Task whenAll(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzwVar = new zzw();
        zzae zzaeVar = new zzae(collection.size(), zzwVar);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            zzb((Task) it2.next(), zzaeVar);
        }
        return zzwVar;
    }

    public static Task whenAllComplete(Collection collection) {
        return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    public static Task whenAllSuccess(Collection collection) {
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }

    public static Task withTimeout(Task task, long j, TimeUnit timeUnit) {
        t.m(task, "Task must not be null");
        t.b(j > 0, "Timeout must be positive");
        t.m(timeUnit, "TimeUnit must not be null");
        zzb zzbVar = new zzb();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
        zzaVar.postDelayed(new zzad(taskCompletionSource), timeUnit.toMillis(j));
        task.addOnCompleteListener(new zzac(zzaVar, taskCompletionSource, zzbVar));
        return taskCompletionSource.getTask();
    }

    private static Object zza(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzab zzabVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzabVar);
        task.addOnFailureListener(executor, zzabVar);
        task.addOnCanceledListener(executor, zzabVar);
    }

    @Deprecated
    public static Task call(Executor executor, Callable callable) {
        t.m(executor, "Executor must not be null");
        t.m(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzx(zzwVar, callable));
        return zzwVar;
    }

    public static Task whenAllComplete(Executor executor, Collection collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : whenAll(collection).continueWithTask(executor, new zzz(collection));
    }

    public static Task whenAllSuccess(Executor executor, Collection collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.emptyList()) : whenAll(collection).continueWith(executor, new zzy(collection));
    }

    public static Task whenAllComplete(Executor executor, Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(executor, (Collection) Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static Task whenAllSuccess(Executor executor, Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(executor, (Collection) Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static Task whenAllComplete(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete((Collection) Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static Task whenAllSuccess(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess((Collection) Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static Task whenAll(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll((Collection) Arrays.asList(taskArr));
        }
        return forResult(null);
    }

    public static Object await(Task task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        t.j();
        t.h();
        t.m(task, "Task must not be null");
        t.m(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return zza(task);
        }
        zzaa zzaaVar = new zzaa(null);
        zzb(task, zzaaVar);
        if (zzaaVar.zzb(j, timeUnit)) {
            return zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
