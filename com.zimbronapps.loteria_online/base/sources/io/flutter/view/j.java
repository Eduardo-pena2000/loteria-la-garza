package io.flutter.view;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import ca.a;
import io.flutter.view.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j extends AccessibilityNodeProvider {
    public static final int A = ((g.SCROLL_RIGHT.a | g.SCROLL_LEFT.a) | g.SCROLL_UP.a) | g.SCROLL_DOWN.a;
    public static final int B = ((((((((((i.HAS_CHECKED_STATE.a | i.IS_CHECKED.a) | i.IS_SELECTED.a) | i.IS_TEXT_FIELD.a) | i.IS_FOCUSED.a) | i.HAS_ENABLED_STATE.a) | i.IS_ENABLED.a) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.a) | i.HAS_TOGGLED_STATE.a) | i.IS_TOGGLED.a) | i.IS_FOCUSABLE.a) | i.IS_SLIDER.a;
    public static int C = 267386881;
    public static int D = -1;
    public static int E = (g.DID_GAIN_ACCESSIBILITY_FOCUS.a & g.DID_LOSE_ACCESSIBILITY_FOCUS.a) & g.SHOW_ON_SCREEN.a;
    public final View a;
    public final ca.a b;
    public final AccessibilityManager c;
    public final AccessibilityViewEmbedder d;
    public final io.flutter.plugin.platform.o e;
    public final ContentResolver f;
    public final Map g;
    public final Map h;
    public k i;
    public Integer j;
    public Integer k;
    public int l;
    public String m;
    public k n;
    public k o;
    public k p;
    public final List q;
    public int r;
    public Integer s;
    public j t;
    public boolean u;
    public boolean v;
    public final a.b w;
    public final AccessibilityManager.AccessibilityStateChangeListener x;
    public final AccessibilityManager.TouchExplorationStateChangeListener y;
    public final ContentObserver z;

    public class a implements a.b {
        public a() {
        }

        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            j.this.j0(byteBuffer, strArr, byteBufferArr);
        }

        public void b(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent h = j.h(j.this, 0, 32);
            h.getText().add(str);
            j.i(j.this, h);
        }

        public void c(int i) {
            j.this.X(i, 8);
        }

        public void d(int i) {
            j.this.X(i, 2);
        }

        public void e(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            j.this.i0(byteBuffer, strArr);
        }

        public void f(int i) {
            j.this.X(i, 1);
        }

        public void g() {
            j.this.W();
        }

        public void h(String str) {
            if (Build.VERSION.SDK_INT >= 36) {
                Q9.b.g("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
            }
            j.c(j.this).announceForAccessibility(str);
        }

        public void i(String str) {
            j.this.e0(str);
        }
    }

    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        public void onAccessibilityStateChanged(boolean z) {
            if (j.j(j.this)) {
                return;
            }
            if (z) {
                j.k(j.this).e();
            } else {
                j.l(j.this, false);
                j.k(j.this).d();
            }
            if (j.o(j.this) != null) {
                j.o(j.this).a(z, j.u(j.this).isTouchExplorationEnabled());
            }
        }
    }

    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            onChange(z, null);
        }

        public void onChange(boolean z, Uri uri) {
            if (j.j(j.this)) {
                return;
            }
            if (Settings.Global.getFloat(j.v(j.this), "transition_animation_scale", 1.0f) == 0.0f) {
                j.e(j.this, f.DISABLE_ANIMATIONS.a);
            } else {
                j.d(j.this, ~f.DISABLE_ANIMATIONS.a);
            }
            j.f(j.this);
        }
    }

    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final /* synthetic */ AccessibilityManager a;

        public d(AccessibilityManager accessibilityManager) {
            this.a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z) {
            if (j.j(j.this)) {
                return;
            }
            if (!z) {
                j.l(j.this, false);
                j.g(j.this);
            }
            if (j.o(j.this) != null) {
                j.o(j.this).a(this.a.isEnabled(), z);
            }
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.d.values().length];
            a = iArr;
            try {
                iArr[k.d.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.d.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64),
        NO_ANNOUNCE(128);

        public final int a;

        f(int i) {
            this.a = i;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304),
        SCROLL_TO_OFFSET(8388608),
        EXPAND(16777216),
        COLLAPSE(33554432);

        public final int a;

        g(int i) {
            this.a = i;
        }
    }

    public static class h {
        public int a = -1;
        public int b = -1;
        public int c = -1;
        public String d;
        public String e;

        public static /* synthetic */ String a(h hVar) {
            return hVar.e;
        }

        public static /* synthetic */ String b(h hVar, String str) {
            hVar.e = str;
            return str;
        }

        public static /* synthetic */ int c(h hVar) {
            return hVar.a;
        }

        public static /* synthetic */ int d(h hVar, int i) {
            hVar.a = i;
            return i;
        }

        public static /* synthetic */ String e(h hVar) {
            return hVar.d;
        }

        public static /* synthetic */ String f(h hVar, String str) {
            hVar.d = str;
            return str;
        }

        public static /* synthetic */ int g(h hVar) {
            return hVar.b;
        }

        public static /* synthetic */ int h(h hVar, int i) {
            hVar.b = i;
            return i;
        }

        public static /* synthetic */ int i(h hVar) {
            return hVar.c;
        }

        public static /* synthetic */ int j(h hVar, int i) {
            hVar.c = i;
            return i;
        }
    }

    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728),
        HAS_SELECTED_STATE(268435456),
        HAS_REQUIRED_STATE(536870912),
        IS_REQUIRED(1073741824),
        IS_ACCESSIBILITY_FOCUS_BLOCKED(Integer.MIN_VALUE);

        public final int a;

        i(int i) {
            this.a = i;
        }
    }

    public interface j {
        void a(boolean z, boolean z2);
    }

    public static class k {
        public String A;
        public String B;
        public String C;
        public int D;
        public l F;
        public long H;
        public int I;
        public int J;
        public int K;
        public float L;
        public float M;
        public float N;
        public String O;
        public String P;
        public float Q;
        public float R;
        public float S;
        public float T;
        public float[] U;
        public float[] V;
        public k W;
        public List Z;
        public final j a;
        public h a0;
        public h b0;
        public long c;
        public int d;
        public float[] d0;
        public int e;
        public int f;
        public float[] f0;
        public int g;
        public Rect g0;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public float m;
        public float n;
        public float o;
        public String p;
        public String q;
        public List r;
        public String s;
        public List t;
        public String u;
        public List v;
        public String w;
        public List x;
        public String y;
        public List z;
        public int b = -1;
        public int E = -1;
        public boolean G = false;
        public List X = new ArrayList();
        public List Y = new ArrayList();
        public boolean c0 = true;
        public boolean e0 = true;

        public k(j jVar) {
            this.a = jVar;
        }

        public static /* synthetic */ List A(k kVar) {
            return kVar.X;
        }

        public static /* synthetic */ CharSequence B(k kVar) {
            return kVar.s0();
        }

        public static /* synthetic */ CharSequence C(k kVar) {
            return kVar.r0();
        }

        public static boolean C0(k kVar, Predicate predicate) {
            return (kVar == null || kVar.k0(predicate) == null) ? false : true;
        }

        public static /* synthetic */ CharSequence D(k kVar) {
            return kVar.t0();
        }

        public static /* synthetic */ String E(k kVar) {
            return kVar.A;
        }

        public static /* synthetic */ int F(k kVar) {
            return kVar.D;
        }

        public static /* synthetic */ List G(k kVar) {
            return kVar.Z;
        }

        public static /* synthetic */ int H(k kVar) {
            return kVar.d;
        }

        public static /* synthetic */ String I(k kVar) {
            return kVar.u;
        }

        public static /* synthetic */ List J(k kVar, List list) {
            kVar.t = list;
            return list;
        }

        public static /* synthetic */ List K(k kVar) {
            return kVar.v;
        }

        public static /* synthetic */ String L(k kVar) {
            return kVar.w;
        }

        public static /* synthetic */ List M(k kVar) {
            return kVar.x;
        }

        public static /* synthetic */ k N(k kVar, float[] fArr, boolean z) {
            return kVar.y0(fArr, z);
        }

        public static /* synthetic */ void O(k kVar, ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            kVar.G0(byteBuffer, strArr, byteBufferArr);
        }

        public static /* synthetic */ boolean P(k kVar) {
            return kVar.G;
        }

        public static /* synthetic */ void Q(k kVar, float[] fArr, Set set, boolean z) {
            kVar.F0(fArr, set, z);
        }

        public static /* synthetic */ void R(k kVar, List list) {
            kVar.g0(list);
        }

        public static /* synthetic */ boolean S(k kVar) {
            return kVar.i0();
        }

        public static /* synthetic */ float T(k kVar) {
            return kVar.m;
        }

        public static /* synthetic */ float U(k kVar) {
            return kVar.n;
        }

        public static /* synthetic */ float V(k kVar) {
            return kVar.o;
        }

        public static /* synthetic */ boolean W(k kVar, g gVar) {
            return kVar.u0(gVar);
        }

        public static /* synthetic */ int X(k kVar) {
            return kVar.k;
        }

        public static /* synthetic */ List Y(k kVar) {
            return kVar.Y;
        }

        public static /* synthetic */ boolean Z(k kVar) {
            return kVar.h0();
        }

        public static /* synthetic */ int a(k kVar) {
            return kVar.b;
        }

        public static /* synthetic */ boolean a0(k kVar, i iVar) {
            return kVar.v0(iVar);
        }

        public static /* synthetic */ int b(k kVar, int i) {
            kVar.b = i;
            return i;
        }

        public static /* synthetic */ String b0(k kVar) {
            return kVar.q;
        }

        public static /* synthetic */ int c(k kVar) {
            return kVar.j;
        }

        public static /* synthetic */ String c0(k kVar) {
            return kVar.O;
        }

        public static /* synthetic */ boolean d(k kVar, Predicate predicate) {
            return C0(kVar, predicate);
        }

        public static /* synthetic */ int d0(k kVar) {
            return kVar.J;
        }

        public static /* synthetic */ k e(k kVar) {
            return kVar.W;
        }

        public static /* synthetic */ int e0(k kVar) {
            return kVar.K;
        }

        public static /* synthetic */ k f(k kVar, k kVar2) {
            kVar.W = kVar2;
            return kVar2;
        }

        public static /* synthetic */ String f0(k kVar) {
            return kVar.p0();
        }

        public static /* synthetic */ boolean g(k kVar, i iVar) {
            return kVar.x0(iVar);
        }

        public static /* synthetic */ int h(k kVar) {
            return kVar.i;
        }

        public static /* synthetic */ Rect i(k kVar) {
            return kVar.m0();
        }

        public static /* synthetic */ String j(k kVar) {
            return kVar.p;
        }

        public static /* synthetic */ boolean k(k kVar) {
            return kVar.z0();
        }

        public static /* synthetic */ int l(k kVar) {
            return kVar.g;
        }

        public static /* synthetic */ int m(k kVar, int i) {
            kVar.g = i;
            return i;
        }

        public static /* synthetic */ int n(k kVar) {
            return kVar.h;
        }

        public static /* synthetic */ int o(k kVar, int i) {
            kVar.h = i;
            return i;
        }

        public static /* synthetic */ int p(k kVar, int i) {
            int i2 = kVar.h + i;
            kVar.h = i2;
            return i2;
        }

        public static /* synthetic */ int q(k kVar, int i) {
            int i2 = kVar.h - i;
            kVar.h = i2;
            return i2;
        }

        public static /* synthetic */ boolean r(k kVar, g gVar) {
            return kVar.w0(gVar);
        }

        public static /* synthetic */ int s(k kVar) {
            return kVar.e;
        }

        public static /* synthetic */ String t(k kVar) {
            return kVar.s;
        }

        public static /* synthetic */ String u(k kVar, String str) {
            kVar.s = str;
            return str;
        }

        public static /* synthetic */ int v(k kVar) {
            return kVar.f;
        }

        public static /* synthetic */ boolean w(k kVar) {
            return kVar.D0();
        }

        public static /* synthetic */ int x(k kVar) {
            return kVar.E;
        }

        public static /* synthetic */ h y(k kVar) {
            return kVar.a0;
        }

        public static /* synthetic */ h z(k kVar) {
            return kVar.b0;
        }

        public final float A0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        public final float B0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        public final boolean D0() {
            if (x0(i.IS_BUTTON)) {
                return true;
            }
            String str = this.B;
            if (str == null || str.isEmpty()) {
                return x0(i.IS_LINK);
            }
            return false;
        }

        public final void E0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        public final void F0(float[] fArr, Set set, boolean z) {
            set.add(this);
            if (this.e0) {
                z = true;
            }
            if (z) {
                if (this.f0 == null) {
                    this.f0 = new float[16];
                }
                if (this.U == null) {
                    this.U = new float[16];
                }
                Matrix.multiplyMM(this.f0, 0, fArr, 0, this.U, 0);
                float[] fArr2 = {this.Q, this.R, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                E0(fArr3, this.f0, fArr2);
                fArr2[0] = this.S;
                fArr2[1] = this.R;
                E0(fArr4, this.f0, fArr2);
                fArr2[0] = this.S;
                fArr2[1] = this.T;
                E0(fArr5, this.f0, fArr2);
                fArr2[0] = this.Q;
                fArr2[1] = this.T;
                E0(fArr6, this.f0, fArr2);
                if (this.g0 == null) {
                    this.g0 = new Rect();
                }
                this.g0.set(Math.round(B0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(B0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.e0 = false;
            }
            int i = -1;
            for (k kVar : this.X) {
                kVar.E = i;
                i = kVar.b;
                kVar.F0(this.f0, set, z);
            }
        }

        public final void G0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.G = true;
            this.O = this.s;
            this.P = this.q;
            this.H = this.c;
            this.I = this.d;
            this.J = this.g;
            this.K = this.h;
            this.L = this.m;
            this.M = this.n;
            this.N = this.o;
            this.c = byteBuffer.getLong();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getInt();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            this.o = byteBuffer.getFloat();
            this.p = j.m(byteBuffer, strArr);
            this.q = j.m(byteBuffer, strArr);
            this.r = q0(byteBuffer, byteBufferArr);
            this.s = j.m(byteBuffer, strArr);
            this.t = q0(byteBuffer, byteBufferArr);
            this.u = j.m(byteBuffer, strArr);
            this.v = q0(byteBuffer, byteBufferArr);
            this.w = j.m(byteBuffer, strArr);
            this.x = q0(byteBuffer, byteBufferArr);
            this.y = j.m(byteBuffer, strArr);
            this.z = q0(byteBuffer, byteBufferArr);
            this.A = j.m(byteBuffer, strArr);
            this.B = j.m(byteBuffer, strArr);
            this.C = j.m(byteBuffer, strArr);
            this.D = byteBuffer.getInt();
            this.F = l.b(byteBuffer.getInt());
            this.Q = byteBuffer.getFloat();
            this.R = byteBuffer.getFloat();
            this.S = byteBuffer.getFloat();
            this.T = byteBuffer.getFloat();
            this.U = j.n(byteBuffer, this.U);
            this.V = j.n(byteBuffer, this.V);
            this.c0 = true;
            this.e0 = true;
            int i = byteBuffer.getInt();
            this.X.clear();
            for (int i2 = 0; i2 < i; i2++) {
                k p = j.p(this.a, byteBuffer.getInt());
                p.W = this;
                this.X.add(p);
            }
            int i3 = byteBuffer.getInt();
            this.Y.clear();
            for (int i4 = 0; i4 < i3; i4++) {
                k p2 = j.p(this.a, byteBuffer.getInt());
                p2.W = this;
                this.Y.add(p2);
            }
            int i5 = byteBuffer.getInt();
            if (i5 == 0) {
                this.Z = null;
                return;
            }
            List list = this.Z;
            if (list == null) {
                this.Z = new ArrayList(i5);
            } else {
                list.clear();
            }
            for (int i6 = 0; i6 < i5; i6++) {
                h q = j.q(this.a, byteBuffer.getInt());
                if (h.i(q) == g.TAP.a) {
                    this.a0 = q;
                } else if (h.i(q) == g.LONG_PRESS.a) {
                    this.b0 = q;
                } else {
                    this.Z.add(q);
                }
                this.Z.add(q);
            }
        }

        public final void g0(List list) {
            if (x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((k) it.next()).g0(list);
            }
        }

        public final boolean h0() {
            String str = this.q;
            if (str == null && this.P == null) {
                return false;
            }
            return str == null || !str.equals(this.P);
        }

        public final boolean i0() {
            return (Float.isNaN(this.m) || Float.isNaN(this.L) || this.L == this.m) ? false : true;
        }

        public final void j0() {
            if (this.c0) {
                this.c0 = false;
                if (this.d0 == null) {
                    this.d0 = new float[16];
                }
                if (Matrix.invertM(this.d0, 0, this.V, 0)) {
                    return;
                }
                Arrays.fill(this.d0, 0.0f);
            }
        }

        public final k k0(Predicate predicate) {
            for (k kVar = this.W; kVar != null; kVar = kVar.W) {
                if (predicate.test(kVar)) {
                    return kVar;
                }
            }
            return null;
        }

        public final String l0() {
            String str = this.C;
            return (str == null || str.isEmpty()) ? j.t(this.a) : this.C;
        }

        public final Rect m0() {
            return this.g0;
        }

        public final CharSequence n0() {
            return new io.flutter.view.k().c(this.y).a(this.z).b(l0()).e();
        }

        public final CharSequence o0() {
            return new io.flutter.view.k().c(this.q).a(this.r).d(this.B).b(l0()).e();
        }

        public final String p0() {
            String str;
            if (x0(i.NAMES_ROUTE) && (str = this.q) != null && !str.isEmpty()) {
                return this.q;
            }
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                String p0 = ((k) it.next()).p0();
                if (p0 != null && !p0.isEmpty()) {
                    return p0;
                }
            }
            return null;
        }

        public final List q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i = byteBuffer.getInt();
            if (i == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                int i4 = byteBuffer.getInt();
                k.d dVar = k.d.values()[byteBuffer.getInt()];
                int i5 = e.a[dVar.ordinal()];
                if (i5 == 1) {
                    byteBuffer.getInt();
                    k.b bVar = new k.b();
                    bVar.a = i3;
                    bVar.b = i4;
                    bVar.c = dVar;
                    arrayList.add(bVar);
                } else if (i5 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    k.a aVar = new k.a();
                    aVar.a = i3;
                    aVar.b = i4;
                    aVar.c = dVar;
                    aVar.d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        public final CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 2; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                }
            }
            return charSequence;
        }

        public final CharSequence s0() {
            return new io.flutter.view.k().c(this.s).a(this.t).b(l0()).e();
        }

        public final CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 3; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                }
            }
            return charSequence;
        }

        public final boolean u0(g gVar) {
            return (gVar.a & this.I) != 0;
        }

        public final boolean v0(i iVar) {
            return (this.H & ((long) iVar.a)) != 0;
        }

        public final boolean w0(g gVar) {
            return (gVar.a & this.d) != 0;
        }

        public final boolean x0(i iVar) {
            return (this.c & ((long) iVar.a)) != 0;
        }

        public final k y0(float[] fArr, boolean z) {
            float f = fArr[3];
            boolean z2 = false;
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.Q || f2 >= this.S || f3 < this.R || f3 >= this.T) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (k kVar : this.Y) {
                if (!kVar.x0(i.IS_HIDDEN)) {
                    kVar.j0();
                    Matrix.multiplyMV(fArr2, 0, kVar.d0, 0, fArr, 0);
                    k y0 = kVar.y0(fArr2, z);
                    if (y0 != null) {
                        return y0;
                    }
                }
            }
            if (z && this.i != -1) {
                z2 = true;
            }
            if (z0() || z2) {
                return this;
            }
            return null;
        }

        public final boolean z0() {
            String str;
            String str2;
            String str3;
            if (x0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (x0(i.IS_FOCUSABLE)) {
                return true;
            }
            if (x0(i.IS_ACCESSIBILITY_FOCUS_BLOCKED)) {
                return false;
            }
            return ((this.d & (~j.r())) == 0 && (this.c & ((long) j.s())) == 0 && ((str = this.q) == null || str.isEmpty()) && (((str2 = this.s) == null || str2.isEmpty()) && ((str3 = this.y) == null || str3.isEmpty()))) ? false : true;
        }
    }

    public enum l {
        UNKNOWN,
        LTR,
        RTL;

        public static l b(int i) {
            return i != 1 ? i != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public j(View view, ca.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), oVar);
    }

    public static String D(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == D) {
            return null;
        }
        return strArr[i2];
    }

    public static /* synthetic */ boolean I(k kVar, k kVar2) {
        return kVar2 == kVar;
    }

    public static /* synthetic */ boolean J(k kVar) {
        return k.g(kVar, i.HAS_IMPLICIT_SCROLLING);
    }

    public static /* synthetic */ boolean a(k kVar, k kVar2) {
        return I(kVar, kVar2);
    }

    public static /* synthetic */ boolean b(k kVar) {
        return J(kVar);
    }

    public static /* synthetic */ View c(j jVar) {
        return jVar.a;
    }

    public static /* synthetic */ int d(j jVar, int i2) {
        int i3 = i2 & jVar.l;
        jVar.l = i3;
        return i3;
    }

    public static /* synthetic */ int e(j jVar, int i2) {
        int i3 = i2 | jVar.l;
        jVar.l = i3;
        return i3;
    }

    public static /* synthetic */ void f(j jVar) {
        jVar.Z();
    }

    public static /* synthetic */ void g(j jVar) {
        jVar.Q();
    }

    public static /* synthetic */ AccessibilityEvent h(j jVar, int i2, int i3) {
        return jVar.L(i2, i3);
    }

    public static /* synthetic */ void i(j jVar, AccessibilityEvent accessibilityEvent) {
        jVar.Y(accessibilityEvent);
    }

    public static /* synthetic */ boolean j(j jVar) {
        return jVar.v;
    }

    public static /* synthetic */ ca.a k(j jVar) {
        return jVar.b;
    }

    public static /* synthetic */ void l(j jVar, boolean z) {
        jVar.c0(z);
    }

    public static /* synthetic */ String m(ByteBuffer byteBuffer, String[] strArr) {
        return D(byteBuffer, strArr);
    }

    public static /* synthetic */ float[] n(ByteBuffer byteBuffer, float[] fArr) {
        return z(byteBuffer, fArr);
    }

    public static /* synthetic */ j o(j jVar) {
        return jVar.t;
    }

    public static /* synthetic */ k p(j jVar, int i2) {
        return jVar.B(i2);
    }

    public static /* synthetic */ h q(j jVar, int i2) {
        return jVar.A(i2);
    }

    public static /* synthetic */ int r() {
        return A;
    }

    public static /* synthetic */ int s() {
        return B;
    }

    public static /* synthetic */ String t(j jVar) {
        return jVar.m;
    }

    public static /* synthetic */ AccessibilityManager u(j jVar) {
        return jVar.c;
    }

    public static /* synthetic */ ContentResolver v(j jVar) {
        return jVar.f;
    }

    public static float[] z(ByteBuffer byteBuffer, float[] fArr) {
        if (fArr == null) {
            fArr = new float[16];
        }
        for (int i2 = 0; i2 < 16; i2++) {
            fArr[i2] = byteBuffer.getFloat();
        }
        return fArr;
    }

    public final h A(int i2) {
        h hVar = (h) this.h.get(Integer.valueOf(i2));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        h.h(hVar2, i2);
        h.d(hVar2, C + i2);
        this.h.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    public final k B(int i2) {
        k kVar = (k) this.g.get(Integer.valueOf(i2));
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        k.b(kVar2, i2);
        this.g.put(Integer.valueOf(i2), kVar2);
        return kVar2;
    }

    public final k C() {
        return (k) this.g.get(0);
    }

    public final void E(float f2, float f3, boolean z) {
        k N;
        if (this.g.isEmpty() || (N = k.N(C(), new float[]{f2, f3, 0.0f, 1.0f}, z)) == this.p) {
            return;
        }
        if (N != null) {
            X(k.a(N), 128);
        }
        k kVar = this.p;
        if (kVar != null) {
            X(k.a(kVar), 256);
        }
        this.p = N;
    }

    public boolean F() {
        return this.c.isEnabled();
    }

    public final boolean G(k kVar) {
        if (k.g(kVar, i.SCOPES_ROUTE)) {
            return false;
        }
        return (k.D(kVar) == null && (k.H(kVar) & (~E)) == 0) ? false : true;
    }

    public boolean H() {
        return this.c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent K(int i2) {
        return AccessibilityEvent.obtain(i2);
    }

    public final AccessibilityEvent L(int i2, int i3) {
        AccessibilityEvent K = K(i3);
        K.setPackageName(this.a.getContext().getPackageName());
        K.setSource(this.a, i2);
        return K;
    }

    public AccessibilityNodeInfo M(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo N(View view, int i2) {
        return AccessibilityNodeInfo.obtain(view, i2);
    }

    public boolean O(MotionEvent motionEvent) {
        return P(motionEvent, false);
    }

    public boolean P(MotionEvent motionEvent, boolean z) {
        if (!this.c.isTouchExplorationEnabled() || this.g.isEmpty()) {
            return false;
        }
        k N = k.N(C(), new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
        if (N != null && k.h(N) != -1) {
            if (z) {
                return false;
            }
            return this.d.onAccessibilityHoverEvent(k.a(N), motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            E(motionEvent.getX(), motionEvent.getY(), z);
        } else {
            if (motionEvent.getAction() != 10) {
                Q9.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            Q();
        }
        return true;
    }

    public final void Q() {
        k kVar = this.p;
        if (kVar != null) {
            X(k.a(kVar), 256);
            this.p = null;
        }
    }

    public final void R(k kVar) {
        String f0 = k.f0(kVar);
        if (f0 == null) {
            f0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            b0(f0);
            return;
        }
        AccessibilityEvent L = L(k.a(kVar), 32);
        L.getText().add(f0);
        Y(L);
    }

    public final boolean S(k kVar, int i2, Bundle bundle, boolean z) {
        int i3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int l2 = k.l(kVar);
        int n = k.n(kVar);
        U(kVar, i3, z, z2);
        if (l2 != k.l(kVar) || n != k.n(kVar)) {
            String t = k.t(kVar) != null ? k.t(kVar) : "";
            AccessibilityEvent L = L(k.a(kVar), 8192);
            L.getText().add(t);
            L.setFromIndex(k.l(kVar));
            L.setToIndex(k.n(kVar));
            L.setItemCount(t.length());
            Y(L);
        }
        if (i3 == 1) {
            if (z) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (k.r(kVar, gVar)) {
                    this.b.c(i2, gVar, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (z) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!k.r(kVar, gVar2)) {
                return false;
            }
            this.b.c(i2, gVar2, Boolean.valueOf(z2));
            return true;
        }
        if (i3 != 2) {
            return i3 == 4 || i3 == 8 || i3 == 16;
        }
        if (z) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (k.r(kVar, gVar3)) {
                this.b.c(i2, gVar3, Boolean.valueOf(z2));
                return true;
            }
        }
        if (z) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!k.r(kVar, gVar4)) {
            return false;
        }
        this.b.c(i2, gVar4, Boolean.valueOf(z2));
        return true;
    }

    public final boolean T(k kVar, int i2, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.b.c(i2, g.SET_TEXT, string);
        k.u(kVar, string);
        k.J(kVar, null);
        return true;
    }

    public final void U(k kVar, int i2, boolean z, boolean z2) {
        if (k.n(kVar) < 0 || k.l(kVar) < 0) {
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 == 8 || i2 == 16) {
                        if (z) {
                            k.o(kVar, k.t(kVar).length());
                        } else {
                            k.o(kVar, 0);
                        }
                    }
                } else if (z && k.n(kVar) < k.t(kVar).length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(k.t(kVar).substring(k.n(kVar)));
                    if (matcher.find()) {
                        k.p(kVar, matcher.start(1));
                    } else {
                        k.o(kVar, k.t(kVar).length());
                    }
                } else if (!z && k.n(kVar) > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(k.t(kVar).substring(0, k.n(kVar)));
                    if (matcher2.find()) {
                        k.o(kVar, matcher2.start(1));
                    } else {
                        k.o(kVar, 0);
                    }
                }
            } else if (z && k.n(kVar) < k.t(kVar).length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(k.t(kVar).substring(k.n(kVar)));
                matcher3.find();
                if (matcher3.find()) {
                    k.p(kVar, matcher3.start(1));
                } else {
                    k.o(kVar, k.t(kVar).length());
                }
            } else if (!z && k.n(kVar) > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(k.t(kVar).substring(0, k.n(kVar)));
                if (matcher4.find()) {
                    k.o(kVar, matcher4.start(1));
                }
            }
        } else if (z && k.n(kVar) < k.t(kVar).length()) {
            k.p(kVar, 1);
        } else if (!z && k.n(kVar) > 0) {
            k.q(kVar, 1);
        }
        if (z2) {
            return;
        }
        k.m(kVar, k.n(kVar));
    }

    public void V() {
        this.v = true;
        this.e.m();
        f0(null);
        this.c.removeAccessibilityStateChangeListener(this.x);
        this.c.removeTouchExplorationStateChangeListener(this.y);
        this.f.unregisterContentObserver(this.z);
        this.b.g(null);
    }

    public void W() {
        this.g.clear();
        k kVar = this.i;
        if (kVar != null) {
            X(k.a(kVar), 65536);
        }
        this.i = null;
        this.p = null;
        a0(0);
    }

    public void X(int i2, int i3) {
        if (this.c.isEnabled()) {
            Y(L(i2, i3));
        }
    }

    public final void Y(AccessibilityEvent accessibilityEvent) {
        if (this.c.isEnabled()) {
            this.a.getParent().requestSendAccessibilityEvent(this.a, accessibilityEvent);
        }
    }

    public final void Z() {
        this.b.f(this.l);
    }

    public final void a0(int i2) {
        AccessibilityEvent L = L(i2, 2048);
        L.setContentChangeTypes(1);
        Y(L);
    }

    public final void b0(String str) {
        io.flutter.view.c.a(this.a, str);
    }

    public final void c0(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        if (z) {
            this.l |= f.ACCESSIBLE_NAVIGATION.a;
        } else {
            this.l &= ~f.ACCESSIBLE_NAVIGATION.a;
        }
        Z();
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        int i3;
        c0(true);
        if (i2 >= 65536) {
            return this.d.createAccessibilityNodeInfo(i2);
        }
        if (i2 == -1) {
            AccessibilityNodeInfo M = M(this.a);
            this.a.onInitializeAccessibilityNodeInfo(M);
            if (this.g.containsKey(0)) {
                M.addChild(this.a, 0);
            }
            M.setImportantForAccessibility(false);
            return M;
        }
        k kVar = (k) this.g.get(Integer.valueOf(i2));
        if (kVar == null) {
            return null;
        }
        if (k.h(kVar) != -1 && this.e.k(k.h(kVar))) {
            View h2 = this.e.h(k.h(kVar));
            if (h2 == null) {
                return null;
            }
            return this.d.getRootNode(h2, k.a(kVar), k.i(kVar));
        }
        AccessibilityNodeInfo N = N(this.a, i2);
        N.setImportantForAccessibility(G(kVar));
        N.setViewIdResourceName("");
        if (k.j(kVar) != null) {
            N.setViewIdResourceName(k.j(kVar));
        }
        N.setPackageName(this.a.getContext().getPackageName());
        N.setClassName("android.view.View");
        N.setSource(this.a, i2);
        N.setFocusable(k.k(kVar));
        k kVar2 = this.n;
        if (kVar2 != null) {
            N.setFocused(k.a(kVar2) == i2);
        }
        k kVar3 = this.i;
        if (kVar3 != null) {
            N.setAccessibilityFocused(k.a(kVar3) == i2);
        }
        i iVar = i.IS_TEXT_FIELD;
        if (k.g(kVar, iVar)) {
            N.setPassword(k.g(kVar, i.IS_OBSCURED));
            if (!k.g(kVar, i.IS_READ_ONLY)) {
                N.setClassName("android.widget.EditText");
            }
            N.setEditable(!k.g(kVar, r8));
            if (k.l(kVar) != -1 && k.n(kVar) != -1) {
                N.setTextSelection(k.l(kVar), k.n(kVar));
            }
            k kVar4 = this.i;
            if (kVar4 != null && k.a(kVar4) == i2) {
                N.setLiveRegion(1);
            }
            if (k.r(kVar, g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                N.addAction(256);
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (k.r(kVar, g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                N.addAction(512);
                i3 = 1;
            }
            if (k.r(kVar, g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                N.addAction(256);
                i3 |= 2;
            }
            if (k.r(kVar, g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                N.addAction(512);
                i3 |= 2;
            }
            N.setMovementGranularities(i3);
            if (k.s(kVar) >= 0) {
                int length = k.t(kVar) == null ? 0 : k.t(kVar).length();
                k.v(kVar);
                k.s(kVar);
                N.setMaxTextLength((length - k.v(kVar)) + k.s(kVar));
            }
        }
        if (k.r(kVar, g.SET_SELECTION)) {
            N.addAction(131072);
        }
        if (k.r(kVar, g.COPY)) {
            N.addAction(16384);
        }
        if (k.r(kVar, g.CUT)) {
            N.addAction(65536);
        }
        if (k.r(kVar, g.PASTE)) {
            N.addAction(32768);
        }
        if (k.r(kVar, g.SET_TEXT)) {
            N.addAction(2097152);
        }
        if (k.w(kVar)) {
            N.setClassName("android.widget.Button");
        }
        if (k.g(kVar, i.IS_IMAGE)) {
            N.setClassName("android.widget.ImageView");
        }
        if (k.r(kVar, g.DISMISS)) {
            N.setDismissable(true);
            N.addAction(1048576);
        }
        if (k.e(kVar) != null) {
            N.setParent(this.a, k.a(k.e(kVar)));
        } else {
            N.setParent(this.a);
        }
        if (k.x(kVar) != -1) {
            N.setTraversalAfter(this.a, k.x(kVar));
        }
        Rect i4 = k.i(kVar);
        if (k.e(kVar) != null) {
            Rect i5 = k.i(k.e(kVar));
            Rect rect = new Rect(i4);
            rect.offset(-i5.left, -i5.top);
            N.setBoundsInParent(rect);
        } else {
            N.setBoundsInParent(i4);
        }
        N.setBoundsInScreen(y(i4));
        N.setVisibleToUser(true);
        N.setEnabled(!k.g(kVar, i.HAS_ENABLED_STATE) || k.g(kVar, i.IS_ENABLED));
        if (k.r(kVar, g.TAP)) {
            if (k.y(kVar) != null) {
                N.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, h.a(k.y(kVar))));
                N.setClickable(true);
            } else {
                N.addAction(16);
                N.setClickable(true);
            }
        } else if (k.g(kVar, i.IS_SLIDER)) {
            N.addAction(16);
            N.setClickable(true);
        }
        if (k.r(kVar, g.LONG_PRESS)) {
            if (k.z(kVar) != null) {
                N.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, h.a(k.z(kVar))));
                N.setLongClickable(true);
            } else {
                N.addAction(32);
                N.setLongClickable(true);
            }
        }
        g gVar = g.SCROLL_LEFT;
        if (k.r(kVar, gVar) || k.r(kVar, g.SCROLL_UP) || k.r(kVar, g.SCROLL_RIGHT) || k.r(kVar, g.SCROLL_DOWN)) {
            N.setScrollable(true);
            if (k.g(kVar, i.HAS_IMPLICIT_SCROLLING)) {
                if (k.r(kVar, gVar) || k.r(kVar, g.SCROLL_RIGHT)) {
                    N.setClassName("android.widget.HorizontalScrollView");
                } else {
                    N.setClassName("android.widget.ScrollView");
                }
            }
        }
        if (g0(kVar)) {
            if (k.r(kVar, gVar) || k.r(kVar, g.SCROLL_RIGHT)) {
                if (Build.VERSION.SDK_INT < 33) {
                    N.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, k.c(kVar), false));
                } else {
                    io.flutter.view.f.a();
                    N.setCollectionInfo(io.flutter.view.d.a(1, k.c(kVar), false));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                N.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(k.c(kVar), 1, false));
            } else {
                io.flutter.view.f.a();
                N.setCollectionInfo(io.flutter.view.d.a(k.c(kVar), 1, false));
            }
        }
        if (h0(kVar)) {
            k e2 = k.e(kVar);
            List A2 = k.A(e2);
            boolean z = (k.r(e2, gVar) || k.r(e2, g.SCROLL_RIGHT)) ? false : true;
            int indexOf = A2.indexOf(kVar);
            if (z) {
                if (Build.VERSION.SDK_INT < 33) {
                    N.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, k.g(kVar, i.IS_HEADER)));
                } else {
                    io.flutter.view.g.a();
                    N.setCollectionItemInfo(io.flutter.view.e.a(indexOf, 1, 0, 1, k.g(kVar, i.IS_HEADER)));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                N.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, k.g(kVar, i.IS_HEADER)));
            } else {
                io.flutter.view.g.a();
                N.setCollectionItemInfo(io.flutter.view.e.a(0, 1, indexOf, 1, k.g(kVar, i.IS_HEADER)));
            }
        }
        if (k.r(kVar, gVar) || k.r(kVar, g.SCROLL_UP)) {
            N.addAction(4096);
        }
        if (k.r(kVar, g.SCROLL_RIGHT) || k.r(kVar, g.SCROLL_DOWN)) {
            N.addAction(8192);
        }
        g gVar2 = g.INCREASE;
        if (k.r(kVar, gVar2) || k.r(kVar, g.DECREASE)) {
            N.setClassName("android.widget.SeekBar");
            if (k.r(kVar, gVar2)) {
                N.addAction(4096);
            }
            if (k.r(kVar, g.DECREASE)) {
                N.addAction(8192);
            }
        }
        if (k.g(kVar, i.IS_LIVE_REGION)) {
            N.setLiveRegion(1);
        }
        if (k.g(kVar, iVar)) {
            N.setText(k.B(kVar));
            if (Build.VERSION.SDK_INT >= 28) {
                io.flutter.view.a.a(N, k.C(kVar));
            }
        } else if (!k.g(kVar, i.SCOPES_ROUTE)) {
            String D2 = k.D(kVar);
            if (Build.VERSION.SDK_INT < 28 && k.E(kVar) != null) {
                D2 = (D2 != null ? D2 : "") + "\n" + k.E(kVar);
            }
            if (D2 != null) {
                N.setContentDescription(D2);
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28 && k.E(kVar) != null) {
            io.flutter.view.b.a(N, k.E(kVar));
            if (k.D(kVar) == null) {
                N.setContentDescription(k.E(kVar));
            }
        }
        boolean g2 = k.g(kVar, i.HAS_CHECKED_STATE);
        boolean g3 = k.g(kVar, i.HAS_TOGGLED_STATE);
        N.setCheckable(g2 || g3);
        if (g2) {
            N.setChecked(k.g(kVar, i.IS_CHECKED));
            if (k.g(kVar, i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                N.setClassName("android.widget.RadioButton");
            } else {
                N.setClassName("android.widget.CheckBox");
            }
        } else if (g3) {
            N.setChecked(k.g(kVar, i.IS_TOGGLED));
            N.setClassName("android.widget.Switch");
        }
        N.setSelected(k.g(kVar, i.IS_SELECTED));
        if (i6 >= 36 && k.g(kVar, i.HAS_EXPANDED_STATE)) {
            N.setExpandedState(k.g(kVar, i.IS_EXPANDED) ? 3 : 1);
            if (k.r(kVar, g.EXPAND)) {
                N.addAction(262144);
            }
            if (k.r(kVar, g.COLLAPSE)) {
                N.addAction(524288);
            }
        }
        if (i6 >= 28) {
            U1.f.a(N, k.F(kVar) > 0);
        }
        k kVar5 = this.i;
        if (kVar5 == null || k.a(kVar5) != i2) {
            N.addAction(64);
        } else {
            N.addAction(128);
        }
        if (k.G(kVar) != null) {
            for (h hVar : k.G(kVar)) {
                N.addAction(new AccessibilityNodeInfo.AccessibilityAction(h.c(hVar), h.e(hVar)));
            }
        }
        for (k kVar6 : k.A(kVar)) {
            if (!k.g(kVar6, i.IS_HIDDEN)) {
                if (k.h(kVar6) != -1) {
                    View h3 = this.e.h(k.h(kVar6));
                    if (!this.e.k(k.h(kVar6)) && h3 != null) {
                        h3.setImportantForAccessibility(0);
                        N.addChild(h3);
                    }
                }
                N.addChild(this.a, k.a(kVar6));
            }
        }
        return N;
    }

    public final void d0() {
        View view = this.a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int a2 = P0.h.a(this.a.getResources().getConfiguration());
        if (a2 == Integer.MAX_VALUE || a2 < 300) {
            this.l &= ~f.BOLD_TEXT.a;
        } else {
            this.l |= f.BOLD_TEXT.a;
        }
        Z();
    }

    public void e0(String str) {
        this.m = str;
    }

    public void f0(j jVar) {
        this.t = jVar;
    }

    public AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            k kVar = this.n;
            if (kVar != null) {
                return createAccessibilityNodeInfo(k.a(kVar));
            }
            Integer num = this.k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i2 != 2) {
            return null;
        }
        k kVar2 = this.i;
        if (kVar2 != null) {
            return createAccessibilityNodeInfo(k.a(kVar2));
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g0(k kVar) {
        return k.c(kVar) > 1 && (k.d(this.i, new io.flutter.view.h(kVar)) || !k.d(this.i, new io.flutter.view.i()));
    }

    public final boolean h0(k kVar) {
        return k.e(kVar) != null && g0(k.e(kVar)) && k.g(k.e(kVar), i.HAS_IMPLICIT_SCROLLING);
    }

    public void i0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h A2 = A(byteBuffer.getInt());
            h.j(A2, byteBuffer.getInt());
            h.f(A2, D(byteBuffer, strArr));
            h.b(A2, D(byteBuffer, strArr));
        }
    }

    public void j0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        k kVar;
        k kVar2;
        float V;
        float V2;
        View h2;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            k B2 = B(byteBuffer.getInt());
            k.O(B2, byteBuffer, strArr, byteBufferArr);
            if (!k.g(B2, i.IS_HIDDEN)) {
                if (k.g(B2, i.IS_FOCUSED)) {
                    this.n = B2;
                }
                if (k.P(B2)) {
                    arrayList.add(B2);
                }
                if (k.h(B2) != -1 && !this.e.k(k.h(B2)) && (h2 = this.e.h(k.h(B2))) != null) {
                    h2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        k C2 = C();
        ArrayList<k> arrayList2 = new ArrayList();
        if (C2 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            k.Q(C2, fArr, hashSet, false);
            k.R(C2, arrayList2);
        }
        k kVar3 = null;
        for (k kVar4 : arrayList2) {
            if (!this.q.contains(Integer.valueOf(k.a(kVar4)))) {
                kVar3 = kVar4;
            }
        }
        if (kVar3 == null && !arrayList2.isEmpty()) {
            kVar3 = (k) arrayList2.get(arrayList2.size() - 1);
        }
        if (kVar3 != null && (k.a(kVar3) != this.r || arrayList2.size() != this.q.size())) {
            this.r = k.a(kVar3);
            R(kVar3);
        }
        this.q.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.q.add(Integer.valueOf(k.a((k) it.next())));
        }
        Iterator it2 = this.g.entrySet().iterator();
        while (it2.hasNext()) {
            k kVar5 = (k) ((Map.Entry) it2.next()).getValue();
            if (!hashSet.contains(kVar5)) {
                k0(kVar5);
                it2.remove();
            }
        }
        a0(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            k kVar6 = (k) it3.next();
            if (k.S(kVar6)) {
                AccessibilityEvent L = L(k.a(kVar6), 4096);
                float T = k.T(kVar6);
                float U = k.U(kVar6);
                if (Float.isInfinite(k.U(kVar6))) {
                    if (T > 70000.0f) {
                        T = 70000.0f;
                    }
                    U = 100000.0f;
                }
                if (Float.isInfinite(k.V(kVar6))) {
                    V = U + 100000.0f;
                    if (T < -70000.0f) {
                        T = -70000.0f;
                    }
                    V2 = T + 100000.0f;
                } else {
                    V = U - k.V(kVar6);
                    V2 = T - k.V(kVar6);
                }
                if (k.W(kVar6, g.SCROLL_UP) || k.W(kVar6, g.SCROLL_DOWN)) {
                    L.setScrollY((int) V2);
                    L.setMaxScrollY((int) V);
                } else if (k.W(kVar6, g.SCROLL_LEFT) || k.W(kVar6, g.SCROLL_RIGHT)) {
                    L.setScrollX((int) V2);
                    L.setMaxScrollX((int) V);
                }
                if (k.c(kVar6) > 0) {
                    L.setItemCount(k.c(kVar6));
                    L.setFromIndex(k.X(kVar6));
                    Iterator it4 = k.Y(kVar6).iterator();
                    int i2 = 0;
                    while (it4.hasNext()) {
                        if (!k.g((k) it4.next(), i.IS_HIDDEN)) {
                            i2++;
                        }
                    }
                    L.setToIndex((k.X(kVar6) + i2) - 1);
                }
                Y(L);
            }
            if (k.g(kVar6, i.IS_LIVE_REGION) && k.Z(kVar6)) {
                a0(k.a(kVar6));
            }
            k kVar7 = this.i;
            if (kVar7 != null && k.a(kVar7) == k.a(kVar6)) {
                i iVar = i.IS_SELECTED;
                if (!k.a0(kVar6, iVar) && k.g(kVar6, iVar)) {
                    AccessibilityEvent L2 = L(k.a(kVar6), 4);
                    L2.getText().add(k.b0(kVar6));
                    Y(L2);
                }
            }
            k kVar8 = this.n;
            if (kVar8 != null && k.a(kVar8) == k.a(kVar6) && ((kVar2 = this.o) == null || k.a(kVar2) != k.a(this.n))) {
                this.o = this.n;
                Y(L(k.a(kVar6), 8));
            } else if (this.n == null) {
                this.o = null;
            }
            k kVar9 = this.n;
            if (kVar9 != null && k.a(kVar9) == k.a(kVar6)) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (k.a0(kVar6, iVar2) && k.g(kVar6, iVar2) && ((kVar = this.i) == null || k.a(kVar) == k.a(this.n))) {
                    String c0 = k.c0(kVar6) != null ? k.c0(kVar6) : "";
                    String t = k.t(kVar6) != null ? k.t(kVar6) : "";
                    AccessibilityEvent w = w(k.a(kVar6), c0, t);
                    if (w != null) {
                        Y(w);
                    }
                    if (k.d0(kVar6) != k.l(kVar6) || k.e0(kVar6) != k.n(kVar6)) {
                        AccessibilityEvent L3 = L(k.a(kVar6), 8192);
                        L3.getText().add(t);
                        L3.setFromIndex(k.l(kVar6));
                        L3.setToIndex(k.n(kVar6));
                        L3.setItemCount(t.length());
                        Y(L3);
                    }
                }
            }
        }
    }

    public final void k0(k kVar) {
        View h2;
        Integer num;
        k.f(kVar, null);
        if (k.h(kVar) != -1 && (num = this.j) != null && this.d.platformViewOfNode(num.intValue()) == this.e.h(k.h(kVar))) {
            X(this.j.intValue(), 65536);
            this.j = null;
        }
        if (k.h(kVar) != -1 && (h2 = this.e.h(k.h(kVar))) != null) {
            h2.setImportantForAccessibility(4);
        }
        k kVar2 = this.i;
        if (kVar2 == kVar) {
            X(k.a(kVar2), 65536);
            this.i = null;
        }
        if (this.n == kVar) {
            this.n = null;
        }
        if (this.p == kVar) {
            this.p = null;
        }
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.j = null;
            }
            return performAction;
        }
        k kVar = (k) this.g.get(Integer.valueOf(i2));
        if (kVar == null) {
            return false;
        }
        switch (i3) {
            case 16:
                this.b.b(i2, g.TAP);
                return true;
            case 32:
                this.b.b(i2, g.LONG_PRESS);
                return true;
            case 64:
                if (this.i == null) {
                    this.a.invalidate();
                }
                this.i = kVar;
                this.b.b(i2, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(k.a(kVar)));
                this.b.a.c(hashMap);
                X(i2, 32768);
                if (k.r(kVar, g.INCREASE) || k.r(kVar, g.DECREASE)) {
                    X(i2, 4);
                }
                return true;
            case 128:
                k kVar2 = this.i;
                if (kVar2 != null && k.a(kVar2) == i2) {
                    this.i = null;
                }
                Integer num = this.j;
                if (num != null && num.intValue() == i2) {
                    this.j = null;
                }
                this.b.b(i2, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                X(i2, 65536);
                return true;
            case 256:
                return S(kVar, i2, bundle, true);
            case 512:
                return S(kVar, i2, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (k.r(kVar, gVar)) {
                    this.b.b(i2, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (k.r(kVar, gVar2)) {
                        this.b.b(i2, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!k.r(kVar, gVar3)) {
                            return false;
                        }
                        k.u(kVar, k.I(kVar));
                        k.J(kVar, k.K(kVar));
                        X(i2, 4);
                        this.b.b(i2, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (k.r(kVar, gVar4)) {
                    this.b.b(i2, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (k.r(kVar, gVar5)) {
                        this.b.b(i2, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!k.r(kVar, gVar6)) {
                            return false;
                        }
                        k.u(kVar, k.L(kVar));
                        k.J(kVar, k.M(kVar));
                        X(i2, 4);
                        this.b.b(i2, gVar6);
                    }
                }
                return true;
            case 16384:
                this.b.b(i2, g.COPY);
                return true;
            case 32768:
                this.b.b(i2, g.PASTE);
                return true;
            case 65536:
                this.b.b(i2, g.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put("base", Integer.valueOf(k.n(kVar)));
                    hashMap2.put("extent", Integer.valueOf(k.n(kVar)));
                }
                this.b.c(i2, g.SET_SELECTION, hashMap2);
                k kVar3 = (k) this.g.get(Integer.valueOf(i2));
                k.m(kVar3, ((Integer) hashMap2.get("base")).intValue());
                k.o(kVar3, ((Integer) hashMap2.get("extent")).intValue());
                return true;
            case 262144:
                this.b.b(i2, g.EXPAND);
                return true;
            case 524288:
                this.b.b(i2, g.COLLAPSE);
                return true;
            case 1048576:
                this.b.b(i2, g.DISMISS);
                return true;
            case 2097152:
                return T(kVar, i2, bundle);
            case 16908342:
                this.b.b(i2, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.h.get(Integer.valueOf(i3 - C));
                if (hVar == null) {
                    return false;
                }
                this.b.c(i2, g.CUSTOM_ACTION, Integer.valueOf(h.g(hVar)));
                return true;
        }
    }

    public final AccessibilityEvent w(int i2, String str, String str2) {
        AccessibilityEvent L = L(i2, 16);
        L.setBeforeText(str);
        L.getText().add(str2);
        int i3 = 0;
        while (i3 < str.length() && i3 < str2.length() && str.charAt(i3) == str2.charAt(i3)) {
            i3++;
        }
        if (i3 >= str.length() && i3 >= str2.length()) {
            return null;
        }
        L.setFromIndex(i3);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i3 && length2 >= i3 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        L.setRemovedCount((length - i3) + 1);
        L.setAddedCount((length2 - i3) + 1);
        return L;
    }

    public boolean x(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.k = recordFlutterId;
            this.n = null;
            return true;
        }
        if (eventType == 128) {
            this.p = null;
            return true;
        }
        if (eventType == 32768) {
            this.j = recordFlutterId;
            this.i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.k = null;
        this.j = null;
        return true;
    }

    public final Rect y(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public j(View view, ca.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.o oVar) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.l = 0;
        this.q = new ArrayList();
        this.r = 0;
        this.s = 0;
        this.u = false;
        this.v = false;
        a aVar2 = new a();
        this.w = aVar2;
        b bVar = new b();
        this.x = bVar;
        c cVar = new c(new Handler());
        this.z = cVar;
        this.a = view;
        this.b = aVar;
        this.c = accessibilityManager;
        this.f = contentResolver;
        this.d = accessibilityViewEmbedder;
        this.e = oVar;
        aVar.g(aVar2);
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.y = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        this.l |= f.NO_ANNOUNCE.a;
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            d0();
        }
        oVar.f(this);
    }
}
