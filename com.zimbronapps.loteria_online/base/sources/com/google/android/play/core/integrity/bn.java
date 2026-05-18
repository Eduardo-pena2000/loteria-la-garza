package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import r7.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class bn {
    final r7.f a;
    private final G b;
    private final String c;
    private final TaskCompletionSource d;
    private final at e;
    private final k f;

    public bn(Context context, G g, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = g;
        this.e = atVar;
        this.f = kVar;
        r7.f fVar = new r7.f(context, g, "ExpressIntegrityService", bo.a, bd.a, null);
        this.a = fVar;
        fVar.c().post(new be(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j, long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        r7.r.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(r7.r.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        r7.r.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(r7.r.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ TaskCompletionSource f(bn bnVar) {
        return bnVar.d;
    }

    public static /* bridge */ /* synthetic */ k g(bn bnVar) {
        return bnVar.f;
    }

    public static /* bridge */ /* synthetic */ at h(bn bnVar) {
        return bnVar.e;
    }

    public static /* bridge */ /* synthetic */ G i(bn bnVar) {
        return bnVar.b;
    }

    public static /* bridge */ /* synthetic */ String j(bn bnVar) {
        return bnVar.c;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.d.getTask().isSuccessful() && ((Integer) bnVar.d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.b.d("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j, long j2, int i) {
        this.b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.t(new bg(this, taskCompletionSource, 0, str, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i) {
        this.b.d("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.t(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
