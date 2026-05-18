package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;

    public static class a extends FrameLayout {
        public final io.flutter.plugin.platform.a a;
        public final View b;

        public a(Context context, io.flutter.plugin.platform.a aVar, View view) {
            super(context);
            this.a = aVar;
            this.b = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.b(this.b, view, accessibilityEvent);
        }
    }

    public static class b extends ContextWrapper {
        public final InputMethodManager a;

        public b(Context context) {
            this(context, null);
        }

        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.a);
        }

        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.a : super.getSystemService(str);
        }

        public b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    public static class c extends ContextWrapper {
        public final a0 a;
        public WindowManager b;
        public final Context c;

        public c(Context context, a0 a0Var, Context context2) {
            super(context);
            this.a = a0Var;
            this.c = context2;
        }

        public final WindowManager a() {
            if (this.b == null) {
                this.b = this.a;
            }
            return this.b;
        }

        public final boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 0; i < stackTrace.length && i < 11; i++) {
                if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    public static class d {
        public i a;
        public a0 b;
        public P c;

        public static /* synthetic */ i a(d dVar) {
            return dVar.a;
        }

        public static /* synthetic */ i b(d dVar, i iVar) {
            dVar.a = iVar;
            return iVar;
        }

        public static /* synthetic */ P c(d dVar) {
            return dVar.c;
        }

        public static /* synthetic */ P d(d dVar, P p) {
            dVar.c = p;
            return p;
        }

        public static /* synthetic */ a0 e(d dVar) {
            return dVar.b;
        }

        public static /* synthetic */ a0 f(d dVar, a0 a0Var) {
            dVar.b = a0Var;
            return a0Var;
        }
    }

    public SingleViewPresentation(Context context, Display display, i iVar, io.flutter.plugin.platform.a aVar, int i, View.OnFocusChangeListener onFocusChangeListener) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        d dVar = new d();
        this.state = dVar;
        d.b(dVar, iVar);
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        a aVar = this.rootView;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        return this.state;
    }

    public i getView() {
        return d.a(this.state);
    }

    public void onCreate(Bundle bundle) {
        super/*android.app.Dialog*/.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (d.c(this.state) == null) {
            d.d(this.state, new P(getContext()));
        }
        if (d.e(this.state) == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            d dVar = this.state;
            d.f(dVar, new a0(windowManager, d.c(dVar)));
        }
        this.container = new FrameLayout(getContext());
        c cVar = new c(getContext(), d.e(this.state), this.outerContext);
        View view = d.a(this.state).getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            view.getContext().setBaseContext(cVar);
        } else {
            Q9.b.g("PlatformViewsController", "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(d.c(this.state));
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, d dVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = dVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }
}
