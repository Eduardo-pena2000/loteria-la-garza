package androidx.fragment.app;

import G1.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u extends d.j implements b.d {
    public boolean c;
    public boolean d;
    public final y a = y.b(new a());
    public final androidx.lifecycle.t b = new androidx.lifecycle.t(this);
    public boolean e = true;

    public class a extends A implements H1.c, H1.d, G1.q, G1.r, androidx.lifecycle.Z, d.K, g.g, j4.i, N, T1.w {
        public a() {
            super(u.this);
        }

        public void a(J j, p pVar) {
            u.this.k0(pVar);
        }

        public void addMenuProvider(T1.B b) {
            u.this.addMenuProvider(b);
        }

        public void addOnConfigurationChangedListener(S1.b bVar) {
            u.this.addOnConfigurationChangedListener(bVar);
        }

        public void addOnMultiWindowModeChangedListener(S1.b bVar) {
            u.this.addOnMultiWindowModeChangedListener(bVar);
        }

        public void addOnPictureInPictureModeChangedListener(S1.b bVar) {
            u.this.addOnPictureInPictureModeChangedListener(bVar);
        }

        public void addOnTrimMemoryListener(S1.b bVar) {
            u.this.addOnTrimMemoryListener(bVar);
        }

        public View c(int i) {
            return u.this.findViewById(i);
        }

        public boolean d() {
            Window window = u.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public g.f getActivityResultRegistry() {
            return u.this.getActivityResultRegistry();
        }

        public androidx.lifecycle.k getLifecycle() {
            return u.this.b;
        }

        public d.H getOnBackPressedDispatcher() {
            return u.this.getOnBackPressedDispatcher();
        }

        public j4.f getSavedStateRegistry() {
            return u.this.getSavedStateRegistry();
        }

        public androidx.lifecycle.Y getViewModelStore() {
            return u.this.getViewModelStore();
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            u.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater k() {
            return u.this.getLayoutInflater().cloneInContext(u.this);
        }

        public boolean m(String str) {
            return G1.b.f(u.this, str);
        }

        public void p() {
            q();
        }

        public void q() {
            u.this.invalidateMenu();
        }

        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public u j() {
            return u.this;
        }

        public void removeMenuProvider(T1.B b) {
            u.this.removeMenuProvider(b);
        }

        public void removeOnConfigurationChangedListener(S1.b bVar) {
            u.this.removeOnConfigurationChangedListener(bVar);
        }

        public void removeOnMultiWindowModeChangedListener(S1.b bVar) {
            u.this.removeOnMultiWindowModeChangedListener(bVar);
        }

        public void removeOnPictureInPictureModeChangedListener(S1.b bVar) {
            u.this.removeOnPictureInPictureModeChangedListener(bVar);
        }

        public void removeOnTrimMemoryListener(S1.b bVar) {
            u.this.removeOnTrimMemoryListener(bVar);
        }
    }

    public u() {
        d0();
    }

    public static /* synthetic */ void W(u uVar, Context context) {
        uVar.h0(context);
    }

    public static /* synthetic */ void X(u uVar, Configuration configuration) {
        uVar.f0(configuration);
    }

    public static /* synthetic */ Bundle Y(u uVar) {
        return uVar.e0();
    }

    public static /* synthetic */ void Z(u uVar, Intent intent) {
        uVar.g0(intent);
    }

    private void d0() {
        getSavedStateRegistry().c("android:support:lifecycle", new q(this));
        addOnConfigurationChangedListener(new r(this));
        addOnNewIntentListener(new s(this));
        addOnContextAvailableListener(new t(this));
    }

    public static boolean j0(J j, k.b bVar) {
        boolean z = false;
        for (p pVar : j.z0()) {
            if (pVar != null) {
                if (pVar.getHost() != null) {
                    z |= j0(pVar.getChildFragmentManager(), bVar);
                }
                X x = pVar.mViewLifecycleOwner;
                if (x != null && x.getLifecycle().getCurrentState().b(k.b.d)) {
                    pVar.mViewLifecycleOwner.f(bVar);
                    z = true;
                }
                if (pVar.mLifecycleRegistry.getCurrentState().b(k.b.d)) {
                    pVar.mLifecycleRegistry.l(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View a0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.n(view, str, context, attributeSet);
    }

    public J b0() {
        return this.a.l();
    }

    public I2.a c0() {
        return I2.a.b(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.c);
            printWriter.print(" mResumed=");
            printWriter.print(this.d);
            printWriter.print(" mStopped=");
            printWriter.print(this.e);
            if (getApplication() != null) {
                I2.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.a.l().b0(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ Bundle e0() {
        i0();
        this.b.g(k.a.ON_STOP);
        return new Bundle();
    }

    public final /* synthetic */ void f0(Configuration configuration) {
        this.a.m();
    }

    public final /* synthetic */ void g0(Intent intent) {
        this.a.m();
    }

    public final /* synthetic */ void h0(Context context) {
        this.a.a(null);
    }

    public void i0() {
        while (j0(b0(), k.b.c)) {
        }
    }

    public void k0(p pVar) {
    }

    public void l0() {
        this.b.g(k.a.ON_RESUME);
        this.a.h();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.a.m();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.g(k.a.ON_CREATE);
        this.a.e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a0 = a0(view, str, context, attributeSet);
        return a0 == null ? super.onCreateView(view, str, context, attributeSet) : a0;
    }

    public void onDestroy() {
        super.onDestroy();
        this.a.f();
        this.b.g(k.a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.a.d(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.d = false;
        this.a.g();
        this.b.g(k.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        l0();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.a.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.a.m();
        super.onResume();
        this.d = true;
        this.a.k();
    }

    public void onStart() {
        this.a.m();
        super.onStart();
        this.e = false;
        if (!this.c) {
            this.c = true;
            this.a.c();
        }
        this.a.k();
        this.b.g(k.a.ON_START);
        this.a.i();
    }

    public void onStateNotSaved() {
        this.a.m();
    }

    public void onStop() {
        super.onStop();
        this.e = true;
        i0();
        this.a.j();
        this.b.g(k.a.ON_STOP);
    }

    public final void u(int i) {
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a0 = a0(null, str, context, attributeSet);
        return a0 == null ? super.onCreateView(str, context, attributeSet) : a0;
    }
}
