package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class n extends p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler a;
    public boolean j;
    public Dialog l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Runnable b = new a();
    public DialogInterface.OnCancelListener c = new b();
    public DialogInterface.OnDismissListener d = new c();
    public int e = 0;
    public int f = 0;
    public boolean g = true;
    public boolean h = true;
    public int i = -1;
    public androidx.lifecycle.B k = new d();
    public boolean p = false;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            n.R(n.this).onDismiss(n.Q(n.this));
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (n.Q(n.this) != null) {
                n nVar = n.this;
                nVar.onCancel(n.Q(nVar));
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (n.Q(n.this) != null) {
                n nVar = n.this;
                nVar.onDismiss(n.Q(nVar));
            }
        }
    }

    public class d implements androidx.lifecycle.B {
        public d() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.r rVar) {
            if (rVar == null || !n.S(n.this)) {
                return;
            }
            View requireView = n.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (n.Q(n.this) != null) {
                if (J.N0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + n.Q(n.this));
                }
                n.Q(n.this).setContentView(requireView);
            }
        }
    }

    public class e extends w {
        public final /* synthetic */ w a;

        public e(w wVar) {
            this.a = wVar;
        }

        public View c(int i) {
            return this.a.d() ? this.a.c(i) : n.this.W(i);
        }

        public boolean d() {
            return this.a.d() || n.this.X();
        }
    }

    public static /* synthetic */ Dialog Q(n nVar) {
        return nVar.l;
    }

    public static /* synthetic */ DialogInterface.OnDismissListener R(n nVar) {
        return nVar.d;
    }

    public static /* synthetic */ boolean S(n nVar) {
        return nVar.h;
    }

    public final void T(boolean z, boolean z2, boolean z3) {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = false;
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.l.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.a.getLooper()) {
                    onDismiss(this.l);
                } else {
                    this.a.post(this.b);
                }
            }
        }
        this.m = true;
        if (this.i >= 0) {
            if (z3) {
                getParentFragmentManager().j1(this.i, 1);
            } else {
                getParentFragmentManager().h1(this.i, 1, z);
            }
            this.i = -1;
            return;
        }
        T q = getParentFragmentManager().q();
        q.m(true);
        q.l(this);
        if (z3) {
            q.h();
        } else if (z) {
            q.g();
        } else {
            q.f();
        }
    }

    public int U() {
        return this.f;
    }

    public Dialog V(Bundle bundle) {
        if (J.N0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.r(requireContext(), U());
    }

    public View W(int i) {
        Dialog dialog = this.l;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public boolean X() {
        return this.p;
    }

    public final void Y(Bundle bundle) {
        if (this.h && !this.p) {
            try {
                this.j = true;
                Dialog V = V(bundle);
                this.l = V;
                if (this.h) {
                    a0(V, this.e);
                    Activity context = getContext();
                    if (context instanceof Activity) {
                        this.l.setOwnerActivity(context);
                    }
                    this.l.setCancelable(this.g);
                    this.l.setOnCancelListener(this.c);
                    this.l.setOnDismissListener(this.d);
                    this.p = true;
                } else {
                    this.l = null;
                }
                this.j = false;
            } catch (Throwable th) {
                this.j = false;
                throw th;
            }
        }
    }

    public void Z(boolean z) {
        this.h = z;
    }

    public void a0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void b0(J j, String str) {
        this.n = false;
        this.o = true;
        T q = j.q();
        q.m(true);
        q.d(this, str);
        q.f();
    }

    public w createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.k);
        if (this.o) {
            return;
        }
        this.n = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new Handler();
        this.h = this.mContainerId == 0;
        if (bundle != null) {
            this.e = bundle.getInt("android:style", 0);
            this.f = bundle.getInt("android:theme", 0);
            this.g = bundle.getBoolean("android:cancelable", true);
            this.h = bundle.getBoolean("android:showsDialog", this.h);
            this.i = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.m = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.l.dismiss();
            if (!this.n) {
                onDismiss(this.l);
            }
            this.l = null;
            this.p = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.o && !this.n) {
            this.n = true;
        }
        getViewLifecycleOwnerLiveData().m(this.k);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.m) {
            return;
        }
        if (J.N0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        T(true, true, false);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.h && !this.j) {
            Y(bundle);
            if (J.N0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.l;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (J.N0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.h) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.e;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.g;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.h;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.i;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.m = false;
            dialog.show();
            View decorView = this.l.getWindow().getDecorView();
            androidx.lifecycle.a0.b(decorView, this);
            androidx.lifecycle.b0.b(decorView, this);
            j4.m.b(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.l.onRestoreInstanceState(bundle2);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.l.onRestoreInstanceState(bundle2);
    }
}
