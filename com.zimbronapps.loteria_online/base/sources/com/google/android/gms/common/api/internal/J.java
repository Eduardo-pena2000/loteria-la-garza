package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class j {
    protected final k mLifecycleFragment;

    public j(k kVar) {
        this.mLifecycleFragment = kVar;
    }

    public static k getFragment(Activity activity) {
        return getFragment(new i(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity z = this.mLifecycleFragment.z();
        com.google.android.gms.common.internal.t.l(z);
        return z;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static k getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static k getFragment(i iVar) {
        if (iVar.a()) {
            return A0.Q(iVar.d());
        }
        if (iVar.b()) {
            return x0.a(iVar.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
