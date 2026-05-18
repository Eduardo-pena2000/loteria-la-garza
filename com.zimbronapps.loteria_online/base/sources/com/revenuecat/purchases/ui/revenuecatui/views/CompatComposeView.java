package com.revenuecat.purchases.ui.revenuecatui.views;

import P0.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ContextExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import j4.f;
import j4.h;
import j4.i;
import j4.m;
import kotlin.jvm.internal.k;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class CompatComposeView extends a implements r, i, Z {
    private static final String KEY_SAVED_INSTANCE_STATE = "com.revenuecat.CompatComposeView.saved_instance_state";
    private boolean isManagingLifecycle;
    private boolean isManagingSavedState;
    private boolean isManagingViewModelStore;
    private final CompatComposeView$lifecycleObserver$1 lifecycleObserver;
    private r lifecycleOwner;
    private final f savedStateRegistry;
    private final h savedStateRegistryController;
    private final Y viewModelStore;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class ViewLifecycleOwner implements r {
        private final Activity activity;
        private Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        private final t lifecycleRegistry = new t(this);

        public ViewLifecycleOwner(Activity activity) {
            this.activity = activity;
            if (activity != null) {
                CompatComposeView$ViewLifecycleOwner$1$1 compatComposeView$ViewLifecycleOwner$1$1 = new CompatComposeView$ViewLifecycleOwner$1$1(activity, this);
                Application application = activity.getApplication();
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(compatComposeView$ViewLifecycleOwner$1$1);
                }
                this.activityLifecycleCallbacks = compatComposeView$ViewLifecycleOwner$1$1;
            }
        }

        public final void destroy() {
            Application application;
            if (this.lifecycleRegistry.getCurrentState() == k.b.a) {
                return;
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.activityLifecycleCallbacks;
            if (activityLifecycleCallbacks != null) {
                Activity activity = this.activity;
                if (activity != null && (application = activity.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
                this.activityLifecycleCallbacks = null;
            }
            if (this.lifecycleRegistry.getCurrentState().b(k.b.d)) {
                this.lifecycleRegistry.g(k.a.ON_STOP);
            }
            this.lifecycleRegistry.g(k.a.ON_DESTROY);
        }

        public androidx.lifecycle.k getLifecycle() {
            return this.lifecycleRegistry;
        }

        public final void onAttachedToWindow() {
            this.lifecycleRegistry.g(k.a.ON_CREATE);
            this.lifecycleRegistry.g(k.a.ON_START);
        }

        public final void onDetachedFromWindow() {
            destroy();
        }

        public final void onWindowFocusChanged(boolean z) {
            if (z) {
                this.lifecycleRegistry.g(k.a.ON_RESUME);
            } else {
                this.lifecycleRegistry.g(k.a.ON_PAUSE);
            }
        }

        public final void onWindowVisibilityChanged(int i) {
            if (i == 0) {
                this.lifecycleRegistry.g(k.a.ON_START);
            } else {
                this.lifecycleRegistry.g(k.a.ON_STOP);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompatComposeView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.t.g(context, "context");
    }

    public static final /* synthetic */ void access$onDestroy(CompatComposeView compatComposeView) {
        compatComposeView.onDestroy();
    }

    private final void deinitViewTreeOwners() {
        View findWindowRoot;
        if (isManagingViewTree() && (findWindowRoot = findWindowRoot(this)) != null) {
            if (a0.a(findWindowRoot) == this) {
                a0.b(findWindowRoot, (r) null);
            }
            if (m.a(findWindowRoot) == this) {
                m.b(findWindowRoot, (i) null);
            }
            if (b0.a(findWindowRoot) == this) {
                b0.b(findWindowRoot, (Z) null);
            }
        }
    }

    private final View findWindowRoot(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = null;
        while (parent != null && (parent instanceof ViewGroup)) {
            viewGroup = (ViewGroup) parent;
            parent = viewGroup.getParent();
        }
        return viewGroup;
    }

    private final void initViewTreeOwners() {
        r rVar;
        View findWindowRoot = findWindowRoot(this);
        if (findWindowRoot == null) {
            return;
        }
        r a = a0.a(findWindowRoot);
        if (this.lifecycleOwner == null) {
            if (a == null) {
                Context context = getContext();
                kotlin.jvm.internal.t.f(context, "context");
                rVar = new ViewLifecycleOwner(ContextExtensionsKt.getActivity(context));
            } else {
                rVar = a;
            }
            this.lifecycleOwner = rVar;
            getLifecycle().addObserver(this.lifecycleObserver);
        }
        if (a == null) {
            a0.b(findWindowRoot, this);
            this.isManagingLifecycle = true;
        }
        if (m.a(findWindowRoot) == null) {
            m.b(findWindowRoot, this);
            this.isManagingSavedState = true;
        }
        if (b0.a(findWindowRoot) == null) {
            b0.b(findWindowRoot, this);
            this.isManagingViewModelStore = true;
        }
    }

    private final boolean isManagingViewTree() {
        return this.isManagingLifecycle || this.isManagingSavedState || this.isManagingViewModelStore;
    }

    private final void onDestroy() {
        androidx.lifecycle.k lifecycle;
        if (this.isManagingViewModelStore) {
            getViewModelStore().a();
        }
        r rVar = this.lifecycleOwner;
        if (rVar != null && (lifecycle = rVar.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = null;
    }

    private final void performRestore(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.revenuecat.CompatComposeView.saved_instance_state", parcelable);
        this.savedStateRegistryController.d(bundle);
    }

    private final Bundle performSave(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.revenuecat.CompatComposeView.saved_instance_state", parcelable);
        this.savedStateRegistryController.e(bundle);
        return bundle;
    }

    public final void destroy() {
        Logger.INSTANCE.d("CompatComposeView: Destroying lifecycle owner since destroy() was called.");
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.destroy();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.t.g(event, "event");
        if (!isManagingViewTree()) {
            return super/*android.view.View*/.dispatchKeyEvent(event);
        }
        if (event.getKeyCode() != 4 || event.getAction() != 1) {
            return super/*android.view.View*/.dispatchKeyEvent(event);
        }
        onBackPressed();
        return true;
    }

    public androidx.lifecycle.k getLifecycle() {
        androidx.lifecycle.k lifecycle;
        r rVar = this.lifecycleOwner;
        return (rVar == null || (lifecycle = rVar.getLifecycle()) == null) ? new CompatComposeView$lifecycle$1() : lifecycle;
    }

    public f getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public Y getViewModelStore() {
        return this.viewModelStore;
    }

    public void onAttachedToWindow() {
        r rVar = this.lifecycleOwner;
        if (rVar != null && (rVar instanceof ViewLifecycleOwner)) {
            Logger.INSTANCE.w("Attaching a previously-detached view to a window. Resetting state");
            ((ViewLifecycleOwner) rVar).destroy();
            onDestroy();
        }
        initViewTreeOwners();
        if (this.isManagingSavedState) {
            this.savedStateRegistryController.c();
            performRestore(null);
        }
        r rVar2 = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar2 instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar2 : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onAttachedToWindow();
        }
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        ViewGroup parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void onDetachedFromWindow() {
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onDetachedFromWindow();
        }
        deinitViewTreeOwners();
        super/*android.view.View*/.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super/*android.view.View*/.onRestoreInstanceState(parcelable);
        if (this.isManagingSavedState) {
            performRestore(parcelable);
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super/*android.view.View*/.onSaveInstanceState();
        if (this.isManagingSavedState) {
            performSave(onSaveInstanceState);
        }
        return onSaveInstanceState;
    }

    public void onWindowFocusChanged(boolean z) {
        super/*android.view.View*/.onWindowFocusChanged(z);
        if (z && isManagingViewTree()) {
            setFocusableInTouchMode(true);
            setFocusable(true);
            requestFocus();
        }
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onWindowFocusChanged(z);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super/*android.view.View*/.onWindowVisibilityChanged(i);
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onWindowVisibilityChanged(i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompatComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.t.g(context, "context");
    }

    public /* synthetic */ CompatComposeView(Context context, AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.k kVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.t.g(context, "context");
        this.lifecycleObserver = new CompatComposeView$lifecycleObserver$1(this);
        h b = h.c.b(this);
        this.savedStateRegistryController = b;
        this.savedStateRegistry = b.b();
        this.viewModelStore = new Y();
    }
}
