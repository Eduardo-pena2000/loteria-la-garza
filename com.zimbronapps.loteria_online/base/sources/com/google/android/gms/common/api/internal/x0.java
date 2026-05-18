package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x0 extends Fragment implements k {
    public static final WeakHashMap b = new WeakHashMap();
    public final z0 a = new z0();

    public static x0 a(Activity activity) {
        x0 x0Var;
        WeakHashMap weakHashMap = b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (x0Var = (x0) weakReference.get()) != null) {
            return x0Var;
        }
        try {
            x0 x0Var2 = (x0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (x0Var2 == null || x0Var2.isRemoving()) {
                x0Var2 = new x0();
                activity.getFragmentManager().beginTransaction().add(x0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(x0Var2));
            return x0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.a.j(str, fileDescriptor, printWriter, strArr);
    }

    public final void j(String str, j jVar) {
        this.a.b(str, jVar);
    }

    public final j n(String str, Class cls) {
        return this.a.a(str, cls);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.a.f(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.c(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a.i();
    }

    public final void onResume() {
        super.onResume();
        this.a.e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.g(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.a.d();
    }

    public final void onStop() {
        super.onStop();
        this.a.h();
    }

    public final Activity z() {
        return getActivity();
    }
}
