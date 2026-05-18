package io.flutter.plugin.editing;

import T1.A0;
import T1.E0;
import T1.H0;
import T1.J0;
import T1.P;
import T1.R0;
import T1.S0;
import T1.V0;
import T1.Z;
import T1.r0;
import T1.v0;
import T1.y0;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;
import q.L;

@Keep
@SuppressLint({"NewApi", "Override"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class ImeSyncDeferringInsetsCallback {
    private b imeVisibilityListener;
    private WindowInsets lastWindowInsets;
    private View view;
    private final int deferredInsetTypes = P.a();
    private boolean animating = false;
    private boolean needsSave = false;
    private AnimationCallback animationCallback = new AnimationCallback();
    private c insetsListener = new c(this, null);

    @Keep
    public class AnimationCallback extends WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this) && (v0.a(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0) {
                ImeSyncDeferringInsetsCallback.access$302(ImeSyncDeferringInsetsCallback.this, false);
                if (ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this) != null && ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this) != null) {
                    ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this));
                }
            }
            A0 x = Z.x(ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this));
            if (x == null || ImeSyncDeferringInsetsCallback.access$600(ImeSyncDeferringInsetsCallback.this) == null) {
                return;
            }
            ImeSyncDeferringInsetsCallback.access$600(ImeSyncDeferringInsetsCallback.this).a(x.q(A0.l.d()));
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            ImeSyncDeferringInsetsCallback.access$102(ImeSyncDeferringInsetsCallback.this, true);
            if ((v0.a(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0) {
                ImeSyncDeferringInsetsCallback.access$302(ImeSyncDeferringInsetsCallback.this, true);
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List list) {
            if (ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this) && !ImeSyncDeferringInsetsCallback.access$100(ImeSyncDeferringInsetsCallback.this)) {
                Iterator it = list.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if ((v0.a(y0.a(it.next())) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0) {
                        z = true;
                    }
                }
                if (!z) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).getWindowSystemUiVisibility();
                int a = (Build.VERSION.SDK_INT < 35 && (windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? L.a(R0.a(windowInsets, V0.a())) : 0;
                io.flutter.plugin.editing.c.a();
                WindowInsets.Builder a2 = H0.a(ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this));
                J0.a(a2, ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this), io.flutter.plugin.editing.b.a(0, 0, 0, Math.max(L.a(R0.a(windowInsets, ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this))) - a, 0)));
                ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).onApplyWindowInsets(E0.a(a2));
            }
            return windowInsets;
        }
    }

    public interface b {
        void a(boolean z);
    }

    public class c implements View.OnApplyWindowInsetsListener {
        public c() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ImeSyncDeferringInsetsCallback.access$402(ImeSyncDeferringInsetsCallback.this, view);
            if (ImeSyncDeferringInsetsCallback.access$100(ImeSyncDeferringInsetsCallback.this)) {
                ImeSyncDeferringInsetsCallback.access$502(ImeSyncDeferringInsetsCallback.this, windowInsets);
                ImeSyncDeferringInsetsCallback.access$102(ImeSyncDeferringInsetsCallback.this, false);
            }
            return ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this) ? S0.a() : view.onApplyWindowInsets(windowInsets);
        }

        public /* synthetic */ c(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, a aVar) {
            this();
        }
    }

    public ImeSyncDeferringInsetsCallback(View view) {
        this.view = view;
    }

    public static /* synthetic */ boolean access$100(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.needsSave;
    }

    public static /* synthetic */ boolean access$102(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, boolean z) {
        imeSyncDeferringInsetsCallback.needsSave = z;
        return z;
    }

    public static /* synthetic */ int access$200(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.deferredInsetTypes;
    }

    public static /* synthetic */ boolean access$300(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.animating;
    }

    public static /* synthetic */ boolean access$302(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, boolean z) {
        imeSyncDeferringInsetsCallback.animating = z;
        return z;
    }

    public static /* synthetic */ View access$400(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.view;
    }

    public static /* synthetic */ View access$402(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, View view) {
        imeSyncDeferringInsetsCallback.view = view;
        return view;
    }

    public static /* synthetic */ WindowInsets access$500(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.lastWindowInsets;
    }

    public static /* synthetic */ WindowInsets access$502(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, WindowInsets windowInsets) {
        imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
        return windowInsets;
    }

    public static /* synthetic */ b access$600(ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.imeVisibilityListener;
    }

    public WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public b getImeVisibilityListener() {
        return this.imeVisibilityListener;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        r0.a(this.view, this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        r0.a(this.view, (WindowInsetsAnimation.Callback) null);
        this.view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
    }

    public void setImeVisibilityListener(b bVar) {
        this.imeVisibilityListener = bVar;
    }
}
