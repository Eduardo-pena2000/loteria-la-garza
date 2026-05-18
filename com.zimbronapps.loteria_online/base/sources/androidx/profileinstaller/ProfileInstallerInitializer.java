package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import e1.g;
import e4.f;
import e4.h;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ProfileInstallerInitializer implements o4.b {

    public static class a {
        public static Handler a(Looper looper) {
            return g.a(looper);
        }
    }

    public static class b {
    }

    public static /* synthetic */ void a(Context context) {
        h(context);
    }

    public static /* synthetic */ void b(Context context) {
        g(context);
    }

    public static /* synthetic */ void c(ProfileInstallerInitializer profileInstallerInitializer, Context context, long j) {
        profileInstallerInitializer.f(context, j);
    }

    public static /* synthetic */ void g(Context context) {
        i(context);
    }

    public static /* synthetic */ void h(Context context) {
        c.i(context);
    }

    public static void i(Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(context));
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b create(Context context) {
        Choreographer.getInstance().postFrameCallback(new f(this, context.getApplicationContext()));
        return new b();
    }

    public List dependencies() {
        return Collections.emptyList();
    }

    public void e(Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e4.g(context), new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    public final /* synthetic */ void f(Context context, long j) {
        e(context);
    }
}
