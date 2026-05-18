package androidx.recyclerview.widget;

import T1.C;
import T1.D;
import T1.L;
import T1.Z;
import T1.c0;
import U1.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class RecyclerView extends ViewGroup implements L {
    public static final Class[] E0;
    public static final Interpolator F0;
    public final AccessibilityManager A;
    public List B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public k G;
    public EdgeEffect H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public l L;
    public int M;
    public int N;
    public VelocityTracker O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final int V;
    public float W;
    public final w a;
    public float a0;
    public final u b;
    public boolean b0;
    public x c;
    public final A c0;
    public androidx.recyclerview.widget.a d;
    public androidx.recyclerview.widget.e d0;
    public androidx.recyclerview.widget.b e;
    public e.b e0;
    public final androidx.recyclerview.widget.m f;
    public final y f0;
    public boolean g;
    public s g0;
    public final Runnable h;
    public List h0;
    public final Rect i;
    public boolean i0;
    public final Rect j;
    public boolean j0;
    public final RectF k;
    public l.a k0;
    public g l;
    public boolean l0;
    public o m;
    public androidx.recyclerview.widget.i m0;
    public final ArrayList n;
    public final int[] n0;
    public final ArrayList o;
    public D o0;
    public r p;
    public final int[] p0;
    public boolean q;
    public final int[] q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final int[] s0;
    public boolean t;
    public final List t0;
    public int u;
    public Runnable u0;
    public boolean v;
    public final m.b v0;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;
    public static final int[] w0 = {16843830};
    public static final int[] x0 = {16842987};
    public static final boolean y0 = false;
    public static final boolean z0 = true;
    public static final boolean A0 = true;
    public static final boolean B0 = true;
    public static final boolean C0 = false;
    public static final boolean D0 = false;

    public class A implements Runnable {
        public int a;
        public int b;
        public OverScroller c;
        public Interpolator d;
        public boolean e;
        public boolean f;

        public A() {
            Interpolator interpolator = RecyclerView.F0;
            this.d = interpolator;
            this.e = false;
            this.f = false;
            this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float c = f2 + (c(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(c / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        public final void b() {
            this.f = false;
            this.e = true;
        }

        public final float c(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        public final void d() {
            this.e = false;
            if (this.f) {
                f();
            }
        }

        public void e(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            f();
        }

        public void f() {
            if (this.e) {
                this.f = true;
            } else {
                RecyclerView.this.removeCallbacks(this);
                Z.P(RecyclerView.this, this);
            }
        }

        public void g(int i, int i2, int i3, Interpolator interpolator) {
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            this.c.startScroll(0, 0, i, i2, i3);
            f();
        }

        public void h(int i, int i2, Interpolator interpolator) {
            int a = a(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.F0;
            }
            g(i, i2, a, interpolator);
        }

        public void i() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 345
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A.run():void");
        }
    }

    public static abstract class B {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        WeakReference mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        B mShadowedHolder = null;
        B mShadowingHolder = null;
        List mPayloads = null;
        List mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        u mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public B(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public final void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && Z.E(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.a0(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !Z.E(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                this.itemView.getLayoutParams().c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = Z.r(this.itemView);
            }
            recyclerView.f1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.f1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.q(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(u uVar, boolean z) {
            this.mScrapContainer = uVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.J(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.q) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.w) {
                recyclerView2.v = true;
            } else {
                recyclerView2.t();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            l lVar = RecyclerView.this.L;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.l0 = false;
        }
    }

    public static class c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class d implements m.b {
        public d() {
        }

        public void a(B b, l.b bVar, l.b bVar2) {
            RecyclerView.this.k(b, bVar, bVar2);
        }

        public void b(B b) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m.j1(b.itemView, recyclerView.b);
        }

        public void c(B b, l.b bVar, l.b bVar2) {
            RecyclerView.this.b.J(b);
            RecyclerView.this.m(b, bVar, bVar2);
        }

        public void d(B b, l.b bVar, l.b bVar2) {
            b.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C) {
                if (recyclerView.L.b(b, b, bVar, bVar2)) {
                    RecyclerView.this.J0();
                }
            } else if (recyclerView.L.d(b, bVar, bVar2)) {
                RecyclerView.this.J0();
            }
        }
    }

    public class e implements b.b {
        public e() {
        }

        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public void b(View view) {
            B d0 = RecyclerView.d0(view);
            if (d0 != null) {
                d0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        public int c() {
            return RecyclerView.this.getChildCount();
        }

        public B d(View view) {
            return RecyclerView.d0(view);
        }

        public void e(int i) {
            B d0;
            View a = a(i);
            if (a != null && (d0 = RecyclerView.d0(a)) != null) {
                if (d0.isTmpDetached() && !d0.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + d0 + RecyclerView.this.P());
                }
                d0.addFlags(256);
            }
            RecyclerView.c(RecyclerView.this, i);
        }

        public void f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.x(view);
        }

        public void g() {
            int c = c();
            for (int i = 0; i < c; i++) {
                View a = a(i);
                RecyclerView.this.y(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public void i(View view) {
            B d0 = RecyclerView.d0(view);
            if (d0 != null) {
                d0.onLeftHiddenState(RecyclerView.this);
            }
        }

        public void j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.y(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        public void k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            B d0 = RecyclerView.d0(view);
            if (d0 != null) {
                if (!d0.isTmpDetached() && !d0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + d0 + RecyclerView.this.P());
                }
                d0.clearTmpDetachFlag();
            }
            RecyclerView.b(RecyclerView.this, view, i, layoutParams);
        }
    }

    public class f implements a.a {
        public f() {
        }

        public void a(int i, int i2) {
            RecyclerView.this.z0(i, i2);
            RecyclerView.this.i0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(a.b bVar) {
            i(bVar);
        }

        public void d(int i, int i2) {
            RecyclerView.this.A0(i, i2, false);
            RecyclerView.this.i0 = true;
        }

        public void e(int i, int i2, Object obj) {
            RecyclerView.this.p1(i, i2, obj);
            RecyclerView.this.j0 = true;
        }

        public B f(int i) {
            B Y = RecyclerView.this.Y(i, true);
            if (Y == null || RecyclerView.this.e.n(Y.itemView)) {
                return null;
            }
            return Y;
        }

        public void g(int i, int i2) {
            RecyclerView.this.y0(i, i2);
            RecyclerView.this.i0 = true;
        }

        public void h(int i, int i2) {
            RecyclerView.this.A0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i0 = true;
            recyclerView.f0.d += i2;
        }

        public void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.m.P0(recyclerView, bVar.b, bVar.d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.m.S0(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.m.U0(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.m.R0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    public static abstract class g {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(B b, int i) {
            b.mPosition = i;
            if (hasStableIds()) {
                b.mItemId = getItemId(i);
            }
            b.setFlags(1, 519);
            P1.o.a("RV OnBindView");
            onBindViewHolder(b, i, b.getUnmodifiedPayloads());
            b.clearPayload();
            p layoutParams = b.itemView.getLayoutParams();
            if (layoutParams instanceof p) {
                layoutParams.c = true;
            }
            P1.o.b();
        }

        public final B createViewHolder(ViewGroup viewGroup, int i) {
            try {
                P1.o.a("RV CreateView");
                B onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i;
                return onCreateViewHolder;
            } finally {
                P1.o.b();
            }
        }

        public abstract int getItemCount();

        public abstract long getItemId(int i);

        public abstract int getItemViewType(int i);

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(B b, int i);

        public void onBindViewHolder(B b, int i, List list) {
            onBindViewHolder(b, i);
        }

        public abstract B onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(B b) {
            return false;
        }

        public void onViewAttachedToWindow(B b) {
        }

        public void onViewDetachedFromWindow(B b) {
        }

        public void onViewRecycled(B b) {
        }

        public void registerAdapterDataObserver(i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void unregisterAdapterDataObserver(i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.e(i, i2, obj);
        }
    }

    public static class h extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        public void d(int i, int i2) {
            e(i, i2, null);
        }

        public void e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        public void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public void g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }
    }

    public static abstract class i {
        public abstract void onChanged();

        public void onItemRangeChanged(int i, int i2) {
        }

        public abstract void onItemRangeInserted(int i, int i2);

        public abstract void onItemRangeMoved(int i, int i2, int i3);

        public abstract void onItemRangeRemoved(int i, int i2);

        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    public interface j {
    }

    public static class k {
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        public a a = null;
        public ArrayList b = new ArrayList();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        public interface a {
            void a(B b);
        }

        public static class b {
            public int a;
            public int b;
            public int c;
            public int d;

            public b a(B b) {
                return b(b, 0);
            }

            public b b(B b, int i) {
                View view = b.itemView;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public static int e(B b2) {
            int i = b2.mFlags;
            int i2 = i & 14;
            if (b2.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i2;
            }
            int oldPosition = b2.getOldPosition();
            int adapterPosition = b2.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i2 : i2 | 2048;
        }

        public abstract boolean a(B b2, b bVar, b bVar2);

        public abstract boolean b(B b2, B b3, b bVar, b bVar2);

        public abstract boolean c(B b2, b bVar, b bVar2);

        public abstract boolean d(B b2, b bVar, b bVar2);

        public abstract boolean f(B b2);

        public boolean g(B b2, List list) {
            return f(b2);
        }

        public final void h(B b2) {
            r(b2);
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(b2);
            }
        }

        public final void i() {
            if (this.b.size() <= 0) {
                this.b.clear();
            } else {
                android.support.v4.media.session.b.a(this.b.get(0));
                throw null;
            }
        }

        public abstract void j(B b2);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(B b2) {
        }

        public b s(y yVar, B b2) {
            return q().a(b2);
        }

        public b t(y yVar, B b2, int i, List list) {
            return q().a(b2);
        }

        public abstract void u();

        public void v(a aVar) {
            this.a = aVar;
        }
    }

    public class m implements l.a {
        public m() {
        }

        public void a(B b) {
            b.setIsRecyclable(true);
            if (b.mShadowedHolder != null && b.mShadowingHolder == null) {
                b.mShadowedHolder = null;
            }
            b.mShadowingHolder = null;
            if (b.shouldBeKeptAsChild() || RecyclerView.this.S0(b.itemView) || !b.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(b.itemView, false);
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            d(rect, view.getLayoutParams().a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, y yVar) {
            f(canvas, recyclerView);
        }

        public abstract void h(Canvas canvas, RecyclerView recyclerView, y yVar);
    }

    public static abstract class o {
        public androidx.recyclerview.widget.b a;
        public RecyclerView b;
        public final l.b c;
        public final l.b d;
        public androidx.recyclerview.widget.l e;
        public androidx.recyclerview.widget.l f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public int l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;

        public class a implements l.b {
            public a() {
            }

            public View a(int i) {
                return o.this.H(i);
            }

            public int b(View view) {
                return o.this.P(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
            }

            public int c() {
                return o.this.c0();
            }

            public int d() {
                return o.this.m0() - o.this.d0();
            }

            public int e(View view) {
                return o.this.S(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements l.b {
            public b() {
            }

            public View a(int i) {
                return o.this.H(i);
            }

            public int b(View view) {
                return o.this.T(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
            }

            public int c() {
                return o.this.e0();
            }

            public int d() {
                return o.this.V() - o.this.b0();
            }

            public int e(View view) {
                return o.this.N(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new androidx.recyclerview.widget.l(aVar);
            this.f = new androidx.recyclerview.widget.l(bVar);
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = true;
            this.k = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int J(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.J(int, int, int, int, boolean):int");
        }

        public static d g0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4.b.h, i, i2);
            dVar.a = obtainStyledAttributes.getInt(f4.b.i, 1);
            dVar.b = obtainStyledAttributes.getInt(f4.b.r, 1);
            dVar.c = obtainStyledAttributes.getBoolean(f4.b.q, false);
            dVar.d = obtainStyledAttributes.getBoolean(f4.b.s, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int m(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public static boolean u0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public View A(View view) {
            View R;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (R = recyclerView.R(view)) == null || this.a.n(R)) {
                return null;
            }
            return R;
        }

        public void A0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.w0(i);
            }
        }

        public void A1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.p = 0;
                this.q = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.e;
                this.p = recyclerView.getWidth();
                this.q = recyclerView.getHeight();
            }
            this.n = 1073741824;
            this.o = 1073741824;
        }

        public View B(int i) {
            int I = I();
            for (int i2 = 0; i2 < I; i2++) {
                View H = H(i2);
                B d0 = RecyclerView.d0(H);
                if (d0 != null && d0.getLayoutPosition() == i && !d0.shouldIgnore() && (this.b.f0.e() || !d0.isRemoved())) {
                    return H;
                }
            }
            return null;
        }

        public void B0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.x0(i);
            }
        }

        public boolean B1(View view, int i, int i2, p pVar) {
            return (!view.isLayoutRequested() && this.j && u0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && u0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public abstract p C();

        public void C0(g gVar, g gVar2) {
        }

        public boolean C1() {
            return false;
        }

        public p D(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean D0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        public boolean D1(View view, int i, int i2, p pVar) {
            return (this.j && u0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && u0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public p E(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void E0(RecyclerView recyclerView) {
        }

        public void E1() {
        }

        public int F() {
            return -1;
        }

        public void F0(RecyclerView recyclerView) {
        }

        public abstract boolean F1();

        public int G(View view) {
            return view.getLayoutParams().b.bottom;
        }

        public void G0(RecyclerView recyclerView, u uVar) {
            F0(recyclerView);
        }

        public View H(int i) {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.f(i);
            }
            return null;
        }

        public abstract View H0(View view, int i, u uVar, y yVar);

        public int I() {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void I0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            J0(recyclerView.b, recyclerView.f0, accessibilityEvent);
        }

        public void J0(u uVar, y yVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.b.l;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.getItemCount());
            }
        }

        public final int[] K(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int c0 = c0();
            int e0 = e0();
            int m0 = m0() - d0();
            int V = V() - b0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - c0;
            int min = Math.min(0, i);
            int i2 = top - e0;
            int min2 = Math.min(0, i2);
            int i3 = width - m0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - V);
            if (X() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            return new int[]{max, min2};
        }

        public void K0(U1.v vVar) {
            RecyclerView recyclerView = this.b;
            L0(recyclerView.b, recyclerView.f0, vVar);
        }

        public boolean L() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.g;
        }

        public void L0(u uVar, y yVar, U1.v vVar) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                vVar.a(8192);
                vVar.G0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                vVar.a(4096);
                vVar.G0(true);
            }
            vVar.i0(v.e.a(i0(uVar, yVar), M(uVar, yVar), t0(uVar, yVar), j0(uVar, yVar)));
        }

        public int M(u uVar, y yVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.l == null || !j()) {
                return 1;
            }
            return this.b.l.getItemCount();
        }

        public void M0(View view, U1.v vVar) {
            B d0 = RecyclerView.d0(view);
            if (d0 == null || d0.isRemoved() || this.a.n(d0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            N0(recyclerView.b, recyclerView.f0, view, vVar);
        }

        public int N(View view) {
            return view.getBottom() + G(view);
        }

        public void N0(u uVar, y yVar, View view, U1.v vVar) {
            vVar.j0(v.f.a(k() ? f0(view) : 0, 1, j() ? f0(view) : 0, 1, false, false));
        }

        public void O(View view, Rect rect) {
            RecyclerView.e0(view, rect);
        }

        public View O0(View view, int i) {
            return null;
        }

        public int P(View view) {
            return view.getLeft() - Y(view);
        }

        public void P0(RecyclerView recyclerView, int i, int i2) {
        }

        public int Q(View view) {
            Rect rect = view.getLayoutParams().b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void Q0(RecyclerView recyclerView) {
        }

        public int R(View view) {
            Rect rect = view.getLayoutParams().b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void R0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int S(View view) {
            return view.getRight() + h0(view);
        }

        public void S0(RecyclerView recyclerView, int i, int i2) {
        }

        public int T(View view) {
            return view.getTop() - k0(view);
        }

        public void T0(RecyclerView recyclerView, int i, int i2) {
        }

        public View U() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void U0(RecyclerView recyclerView, int i, int i2, Object obj) {
            T0(recyclerView, i, i2);
        }

        public int V() {
            return this.q;
        }

        public abstract void V0(u uVar, y yVar);

        public int W() {
            return this.o;
        }

        public void W0(y yVar) {
        }

        public int X() {
            return Z.t(this.b);
        }

        public void X0(u uVar, y yVar, int i, int i2) {
            this.b.v(i, i2);
        }

        public int Y(View view) {
            return view.getLayoutParams().b.left;
        }

        public boolean Y0(RecyclerView recyclerView, View view, View view2) {
            return v0() || recyclerView.s0();
        }

        public int Z() {
            return Z.u(this.b);
        }

        public boolean Z0(RecyclerView recyclerView, y yVar, View view, View view2) {
            return Y0(recyclerView, view, view2);
        }

        public void a(View view) {
            b(view, -1);
        }

        public int a0() {
            return Z.v(this.b);
        }

        public abstract void a1(Parcelable parcelable);

        public void b(View view, int i) {
            e(view, i, true);
        }

        public int b0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable b1();

        public void c(View view) {
            d(view, -1);
        }

        public int c0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void c1(int i) {
        }

        public void d(View view, int i) {
            e(view, i, false);
        }

        public int d0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public boolean d1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return e1(recyclerView.b, recyclerView.f0, i, bundle);
        }

        public final void e(View view, int i, boolean z) {
            B d0 = RecyclerView.d0(view);
            if (z || d0.isRemoved()) {
                this.b.f.b(d0);
            } else {
                this.b.f.p(d0);
            }
            p layoutParams = view.getLayoutParams();
            if (d0.wasReturnedFromScrap() || d0.isScrap()) {
                if (d0.isScrap()) {
                    d0.unScrap();
                } else {
                    d0.clearReturnedFromScrapFlag();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int m = this.a.m(view);
                if (i == -1) {
                    i = this.a.g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.P());
                }
                if (m != i) {
                    this.b.m.z0(m, i);
                }
            } else {
                this.a.a(view, i, false);
                layoutParams.c = true;
            }
            if (layoutParams.d) {
                d0.itemView.invalidate();
                layoutParams.d = false;
            }
        }

        public int e0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[PHI: r2
          0x0042: PHI (r2v8 int) = (r2v4 int), (r2v12 int) binds: [B:27:0x0060, B:19:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean e1(androidx.recyclerview.widget.RecyclerView.u r2, androidx.recyclerview.widget.RecyclerView.y r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.b
                r3 = 0
                if (r2 != 0) goto L6
                return r3
            L6:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L44
                r5 = 8192(0x2000, float:1.148E-41)
                if (r4 == r5) goto L12
                r2 = r3
                r4 = r2
                goto L70
            L12:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L29
                int r2 = r1.V()
                int r5 = r1.e0()
                int r2 = r2 - r5
                int r5 = r1.b0()
                int r2 = r2 - r5
                int r2 = -r2
                goto L2a
            L29:
                r2 = r3
            L2a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L42
                int r4 = r1.m0()
                int r5 = r1.c0()
                int r4 = r4 - r5
                int r5 = r1.d0()
                int r4 = r4 - r5
                int r4 = -r4
                goto L70
            L42:
                r4 = r3
                goto L70
            L44:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L59
                int r2 = r1.V()
                int r4 = r1.e0()
                int r2 = r2 - r4
                int r4 = r1.b0()
                int r2 = r2 - r4
                goto L5a
            L59:
                r2 = r3
            L5a:
                androidx.recyclerview.widget.RecyclerView r4 = r1.b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L42
                int r4 = r1.m0()
                int r5 = r1.c0()
                int r4 = r4 - r5
                int r5 = r1.d0()
                int r4 = r4 - r5
            L70:
                if (r2 != 0) goto L75
                if (r4 != 0) goto L75
                return r3
            L75:
                androidx.recyclerview.widget.RecyclerView r3 = r1.b
                r3.h1(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.e1(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        public void f(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.n(str);
            }
        }

        public int f0(View view) {
            return view.getLayoutParams().a();
        }

        public boolean f1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return g1(recyclerView.b, recyclerView.f0, view, i, bundle);
        }

        public void g(View view, int i) {
            h(view, i, (p) view.getLayoutParams());
        }

        public boolean g1(u uVar, y yVar, View view, int i, Bundle bundle) {
            return false;
        }

        public void h(View view, int i, p pVar) {
            B d0 = RecyclerView.d0(view);
            if (d0.isRemoved()) {
                this.b.f.b(d0);
            } else {
                this.b.f.p(d0);
            }
            this.a.c(view, i, pVar, d0.isRemoved());
        }

        public int h0(View view) {
            return view.getLayoutParams().b.right;
        }

        public void h1(u uVar) {
            for (int I = I() - 1; I >= 0; I--) {
                if (!RecyclerView.d0(H(I)).shouldIgnore()) {
                    k1(I, uVar);
                }
            }
        }

        public void i(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.h0(view));
            }
        }

        public int i0(u uVar, y yVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.l == null || !k()) {
                return 1;
            }
            return this.b.l.getItemCount();
        }

        public void i1(u uVar) {
            int j = uVar.j();
            for (int i = j - 1; i >= 0; i--) {
                View n = uVar.n(i);
                B d0 = RecyclerView.d0(n);
                if (!d0.shouldIgnore()) {
                    d0.setIsRecyclable(false);
                    if (d0.isTmpDetached()) {
                        this.b.removeDetachedView(n, false);
                    }
                    l lVar = this.b.L;
                    if (lVar != null) {
                        lVar.j(d0);
                    }
                    d0.setIsRecyclable(true);
                    uVar.y(n);
                }
            }
            uVar.e();
            if (j > 0) {
                this.b.invalidate();
            }
        }

        public abstract boolean j();

        public int j0(u uVar, y yVar) {
            return 0;
        }

        public void j1(View view, u uVar) {
            m1(view);
            uVar.B(view);
        }

        public abstract boolean k();

        public int k0(View view) {
            return view.getLayoutParams().b.top;
        }

        public void k1(int i, u uVar) {
            View H = H(i);
            n1(i);
            uVar.B(H);
        }

        public boolean l(p pVar) {
            return pVar != null;
        }

        public void l0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = view.getLayoutParams().b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean l1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int m0() {
            return this.p;
        }

        public void m1(View view) {
            this.a.p(view);
        }

        public abstract void n(int i, int i2, y yVar, c cVar);

        public int n0() {
            return this.n;
        }

        public void n1(int i) {
            if (H(i) != null) {
                this.a.q(i);
            }
        }

        public void o(int i, c cVar) {
        }

        public boolean o0() {
            int I = I();
            for (int i = 0; i < I; i++) {
                ViewGroup.LayoutParams layoutParams = H(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean o1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return p1(recyclerView, view, rect, z, false);
        }

        public abstract int p(y yVar);

        public boolean p0() {
            return this.h;
        }

        public boolean p1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] K = K(recyclerView, view, rect, z);
            int i = K[0];
            int i2 = K[1];
            if ((z2 && !r0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.h1(i, i2);
            }
            return true;
        }

        public abstract int q(y yVar);

        public abstract boolean q0();

        public void q1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int r(y yVar);

        public final boolean r0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int c0 = c0();
            int e0 = e0();
            int m0 = m0() - d0();
            int V = V() - b0();
            Rect rect = this.b.i;
            O(focusedChild, rect);
            return rect.left - i < m0 && rect.right - i > c0 && rect.top - i2 < V && rect.bottom - i2 > e0;
        }

        public void r1() {
            this.g = true;
        }

        public abstract int s(y yVar);

        public final boolean s0() {
            return this.k;
        }

        public final void s1(u uVar, int i, View view) {
            B d0 = RecyclerView.d0(view);
            if (d0.shouldIgnore()) {
                return;
            }
            if (d0.isInvalid() && !d0.isRemoved() && !this.b.l.hasStableIds()) {
                n1(i);
                uVar.C(d0);
            } else {
                w(i);
                uVar.D(view);
                this.b.f.k(d0);
            }
        }

        public abstract int t(y yVar);

        public boolean t0(u uVar, y yVar) {
            return false;
        }

        public abstract int t1(int i, u uVar, y yVar);

        public abstract int u(y yVar);

        public abstract int u1(int i, u uVar, y yVar);

        public void v(u uVar) {
            for (int I = I() - 1; I >= 0; I--) {
                s1(uVar, I, H(I));
            }
        }

        public boolean v0() {
            return false;
        }

        public void v1(RecyclerView recyclerView) {
            w1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void w(int i) {
            x(i, H(i));
        }

        public boolean w0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public void w1(int i, int i2) {
            this.p = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.n = mode;
            if (mode == 0 && !RecyclerView.z0) {
                this.p = 0;
            }
            this.q = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.o = mode2;
            if (mode2 != 0 || RecyclerView.z0) {
                return;
            }
            this.q = 0;
        }

        public final void x(int i, View view) {
            this.a.d(i);
        }

        public void x0(View view, int i, int i2, int i3, int i4) {
            p layoutParams = view.getLayoutParams();
            Rect rect = layoutParams.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void x1(int i, int i2) {
            RecyclerView.e(this.b, i, i2);
        }

        public void y(RecyclerView recyclerView) {
            this.h = true;
            E0(recyclerView);
        }

        public void y0(View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect h0 = this.b.h0(view);
            int i3 = i + h0.left + h0.right;
            int i4 = i2 + h0.top + h0.bottom;
            int J = J(m0(), n0(), c0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, j());
            int J2 = J(V(), W(), e0() + b0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, k());
            if (B1(view, J, J2, pVar)) {
                view.measure(J, J2);
            }
        }

        public void y1(Rect rect, int i, int i2) {
            x1(m(i, rect.width() + c0() + d0(), a0()), m(i2, rect.height() + e0() + b0(), Z()));
        }

        public void z(RecyclerView recyclerView, u uVar) {
            this.h = false;
            G0(recyclerView, uVar);
        }

        public void z0(int i, int i2) {
            View H = H(i);
            if (H != null) {
                w(i);
                g(H, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
            }
        }

        public void z1(int i, int i2) {
            int I = I();
            if (I == 0) {
                this.b.v(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < I; i7++) {
                View H = H(i7);
                Rect rect = this.b.i;
                O(H, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.i.set(i6, i4, i3, i5);
            y1(this.b.i, i, i2);
        }
    }

    public static abstract class q {
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i) {
        }

        public abstract void b(RecyclerView recyclerView, int i, int i2);
    }

    public static class t {
        public SparseArray a = new SparseArray();
        public int b = 0;

        public static class a {
            public final ArrayList a = new ArrayList();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                ((a) this.a.valueAt(i)).a.clear();
            }
        }

        public void c() {
            this.b--;
        }

        public void d(int i, long j) {
            a g = g(i);
            g.d = j(g.d, j);
        }

        public void e(int i, long j) {
            a g = g(i);
            g.c = j(g.c, j);
        }

        public B f(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            return (B) aVar.a.remove(r2.size() - 1);
        }

        public final a g(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        public void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(B b) {
            int itemViewType = b.getItemViewType();
            ArrayList arrayList = g(itemViewType).a;
            if (((a) this.a.get(itemViewType)).b <= arrayList.size()) {
                return;
            }
            b.resetInternal();
            arrayList.add(b);
        }

        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public boolean k(int i, long j, long j2) {
            long j3 = g(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean l(int i, long j, long j2) {
            long j3 = g(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class u {
        public final ArrayList a;
        public ArrayList b;
        public final ArrayList c;
        public final List d;
        public int e;
        public int f;
        public t g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void A(int i) {
            a((B) this.c.get(i), true);
            this.c.remove(i);
        }

        public void B(View view) {
            B d0 = RecyclerView.d0(view);
            if (d0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d0.isScrap()) {
                d0.unScrap();
            } else if (d0.wasReturnedFromScrap()) {
                d0.clearReturnedFromScrapFlag();
            }
            C(d0);
        }

        public void C(B b) {
            boolean z;
            boolean z2 = true;
            if (b.isScrap() || b.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(b.isScrap());
                sb.append(" isAttached:");
                sb.append(b.itemView.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (b.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b + RecyclerView.this.P());
            }
            if (b.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean doesTransientStatePreventRecycling = b.doesTransientStatePreventRecycling();
            g gVar = RecyclerView.this.l;
            if ((gVar != null && doesTransientStatePreventRecycling && gVar.onFailedToRecycleView(b)) || b.isRecyclable()) {
                if (this.f <= 0 || b.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.B0 && size > 0 && !RecyclerView.this.e0.d(b.mPosition)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.e0.d(((B) this.c.get(i)).mPosition)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.c.add(size, b);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    a(b, true);
                }
                r1 = z;
            } else {
                z2 = false;
            }
            RecyclerView.this.f.q(b);
            if (r1 || z2 || !doesTransientStatePreventRecycling) {
                return;
            }
            b.mOwnerRecyclerView = null;
        }

        public void D(View view) {
            B d0 = RecyclerView.d0(view);
            if (!d0.hasAnyOfTheFlags(12) && d0.isUpdated() && !RecyclerView.this.o(d0)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                d0.setScrapContainer(this, true);
                this.b.add(d0);
                return;
            }
            if (!d0.isInvalid() || d0.isRemoved() || RecyclerView.this.l.hasStableIds()) {
                d0.setScrapContainer(this, false);
                this.a.add(d0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
        }

        public void E(t tVar) {
            t tVar2 = this.g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.g = tVar;
            if (tVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.g.a();
        }

        public void F(z zVar) {
        }

        public void G(int i) {
            this.e = i;
            K();
        }

        public final boolean H(B b, int i, int i2, long j) {
            b.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = b.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.g.k(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.l.bindViewHolder(b, i);
            this.g.d(b.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(b);
            if (!RecyclerView.this.f0.e()) {
                return true;
            }
            b.mPreLayoutPosition = i2;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01d9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00f5 A[PHI: r1 r4
          0x00f5: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$B) = (r1v11 androidx.recyclerview.widget.RecyclerView$B), (r1v30 androidx.recyclerview.widget.RecyclerView$B) binds: [B:25:0x005d, B:42:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x00f5: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:25:0x005d, B:42:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.B I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 536
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$B");
        }

        public void J(B b) {
            if (b.mInChangeScrap) {
                this.b.remove(b);
            } else {
                this.a.remove(b);
            }
            b.mScrapContainer = null;
            b.mInChangeScrap = false;
            b.clearReturnedFromScrapFlag();
        }

        public void K() {
            o oVar = RecyclerView.this.m;
            this.f = this.e + (oVar != null ? oVar.l : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                A(size);
            }
        }

        public boolean L(B b) {
            if (b.isRemoved()) {
                return RecyclerView.this.f0.e();
            }
            int i = b.mPosition;
            if (i >= 0 && i < RecyclerView.this.l.getItemCount()) {
                if (RecyclerView.this.f0.e() || RecyclerView.this.l.getItemViewType(b.mPosition) == b.getItemViewType()) {
                    return !RecyclerView.this.l.hasStableIds() || b.getItemId() == RecyclerView.this.l.getItemId(b.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b + RecyclerView.this.P());
        }

        public void M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                B b = (B) this.c.get(size);
                if (b != null && (i3 = b.mPosition) >= i && i3 < i4) {
                    b.addFlags(2);
                    A(size);
                }
            }
        }

        public void a(B b, boolean z) {
            RecyclerView.q(b);
            if (b.hasAnyOfTheFlags(16384)) {
                b.setFlags(0, 16384);
                Z.U(b.itemView, null);
            }
            if (z) {
                g(b);
            }
            b.mOwnerRecyclerView = null;
            i().i(b);
        }

        public final void b(B b) {
            if (RecyclerView.this.r0()) {
                View view = b.itemView;
                if (Z.r(view) == 0) {
                    Z.d0(view, 1);
                }
                if (Z.B(view)) {
                    return;
                }
                b.addFlags(16384);
                Z.U(view, RecyclerView.this.m0.n());
            }
        }

        public void c() {
            this.a.clear();
            z();
        }

        public void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((B) this.c.get(i)).clearOldPosition();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((B) this.a.get(i2)).clearOldPosition();
            }
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((B) this.b.get(i3)).clearOldPosition();
                }
            }
        }

        public void e() {
            this.a.clear();
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.f0.b()) {
                return !RecyclerView.this.f0.e() ? i : RecyclerView.this.d.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f0.b() + RecyclerView.this.P());
        }

        public void g(B b) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.l;
            if (gVar != null) {
                gVar.onViewRecycled(b);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f0 != null) {
                recyclerView.f.q(b);
            }
        }

        public B h(int i) {
            int size;
            int m;
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    B b = (B) this.b.get(i2);
                    if (!b.wasReturnedFromScrap() && b.getLayoutPosition() == i) {
                        b.addFlags(32);
                        return b;
                    }
                }
                if (RecyclerView.this.l.hasStableIds() && (m = RecyclerView.this.d.m(i)) > 0 && m < RecyclerView.this.l.getItemCount()) {
                    long itemId = RecyclerView.this.l.getItemId(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        B b2 = (B) this.b.get(i3);
                        if (!b2.wasReturnedFromScrap() && b2.getItemId() == itemId) {
                            b2.addFlags(32);
                            return b2;
                        }
                    }
                }
            }
            return null;
        }

        public t i() {
            if (this.g == null) {
                this.g = new t();
            }
            return this.g;
        }

        public int j() {
            return this.a.size();
        }

        public List k() {
            return this.d;
        }

        public B l(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                B b = (B) this.a.get(size);
                if (b.getItemId() == j && !b.wasReturnedFromScrap()) {
                    if (i == b.getItemViewType()) {
                        b.addFlags(32);
                        if (b.isRemoved() && !RecyclerView.this.f0.e()) {
                            b.setFlags(2, 14);
                        }
                        return b;
                    }
                    if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(b.itemView, false);
                        y(b.itemView);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                B b2 = (B) this.c.get(size2);
                if (b2.getItemId() == j) {
                    if (i == b2.getItemViewType()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return b2;
                    }
                    if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public B m(int i, boolean z) {
            View e;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                B b = (B) this.a.get(i2);
                if (!b.wasReturnedFromScrap() && b.getLayoutPosition() == i && !b.isInvalid() && (RecyclerView.this.f0.h || !b.isRemoved())) {
                    b.addFlags(32);
                    return b;
                }
            }
            if (z || (e = RecyclerView.this.e.e(i)) == null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    B b2 = (B) this.c.get(i3);
                    if (!b2.isInvalid() && b2.getLayoutPosition() == i) {
                        if (!z) {
                            this.c.remove(i3);
                        }
                        return b2;
                    }
                }
                return null;
            }
            B d0 = RecyclerView.d0(e);
            RecyclerView.this.e.s(e);
            int m = RecyclerView.this.e.m(e);
            if (m != -1) {
                RecyclerView.this.e.d(m);
                D(e);
                d0.addFlags(8224);
                return d0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + d0 + RecyclerView.this.P());
        }

        public View n(int i) {
            return ((B) this.a.get(i)).itemView;
        }

        public View o(int i) {
            return p(i, false);
        }

        public View p(int i, boolean z) {
            return I(i, z, Long.MAX_VALUE).itemView;
        }

        public final void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(B b) {
            View view = b.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                p layoutParams = ((B) this.c.get(i)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.c = true;
                }
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                B b = (B) this.c.get(i);
                if (b != null) {
                    b.addFlags(6);
                    b.addChangePayload(null);
                }
            }
            g gVar = RecyclerView.this.l;
            if (gVar == null || !gVar.hasStableIds()) {
                z();
            }
        }

        public void u(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                B b = (B) this.c.get(i3);
                if (b != null && b.mPosition >= i) {
                    b.offsetPosition(i2, true);
                }
            }
        }

        public void v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                B b = (B) this.c.get(i7);
                if (b != null && (i6 = b.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        b.offsetPosition(i2 - i, false);
                    } else {
                        b.offsetPosition(i3, false);
                    }
                }
            }
        }

        public void w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                B b = (B) this.c.get(size);
                if (b != null) {
                    int i4 = b.mPosition;
                    if (i4 >= i3) {
                        b.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        b.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        public void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        public void y(View view) {
            B d0 = RecyclerView.d0(view);
            d0.mScrapContainer = null;
            d0.mInChangeScrap = false;
            d0.clearReturnedFromScrapFlag();
            C(d0);
        }

        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.B0) {
                RecyclerView.this.e0.b();
            }
        }
    }

    public interface v {
    }

    public class w extends i {
        public w() {
        }

        public void a() {
            if (RecyclerView.A0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.r && recyclerView.q) {
                    Z.P(recyclerView, recyclerView.h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.z = true;
            recyclerView2.requestLayout();
        }

        public void onChanged() {
            RecyclerView.this.n(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f0.g = true;
            recyclerView.M0(true);
            if (RecyclerView.this.d.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.d.r(i, i2, obj)) {
                a();
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.d.s(i, i2)) {
                a();
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.d.t(i, i2, i3)) {
                a();
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.n(null);
            if (RecyclerView.this.d.u(i, i2)) {
                a();
            }
        }
    }

    public static class y {
        public SparseArray b;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;
        public int a = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        public void f(g gVar) {
            this.e = 1;
            this.f = gVar.getItemCount();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    public static abstract class z {
    }

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static RecyclerView U(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView U = U(viewGroup.getChildAt(i2));
            if (U != null) {
                return U;
            }
        }
        return null;
    }

    public static /* synthetic */ void b(RecyclerView recyclerView, View view, int i2, ViewGroup.LayoutParams layoutParams) {
        recyclerView.attachViewToParent(view, i2, layoutParams);
    }

    public static /* synthetic */ void c(RecyclerView recyclerView, int i2) {
        recyclerView.detachViewFromParent(i2);
    }

    public static /* synthetic */ boolean d(RecyclerView recyclerView) {
        return recyclerView.awakenScrollBars();
    }

    public static B d0(View view) {
        if (view == null) {
            return null;
        }
        return view.getLayoutParams().a;
    }

    public static /* synthetic */ void e(RecyclerView recyclerView, int i2, int i3) {
        recyclerView.setMeasuredDimension(i2, i3);
    }

    public static void e0(View view, Rect rect) {
        p layoutParams = view.getLayoutParams();
        Rect rect2 = layoutParams.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private D getScrollingChildHelper() {
        if (this.o0 == null) {
            this.o0 = new D(this);
        }
        return this.o0;
    }

    public static void q(B b2) {
        WeakReference weakReference = b2.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == b2.itemView) {
                    return;
                }
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            b2.mNestedRecyclerView = null;
        }
    }

    public void A() {
        if (this.l == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        y yVar = this.f0;
        yVar.j = false;
        if (yVar.e == 1) {
            B();
            this.m.v1(this);
            C();
        } else if (!this.d.q() && this.m.m0() == getWidth() && this.m.V() == getHeight()) {
            this.m.v1(this);
        } else {
            this.m.v1(this);
            C();
        }
        D();
    }

    public void A0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.e.j();
        for (int i5 = 0; i5 < j2; i5++) {
            B d0 = d0(this.e.i(i5));
            if (d0 != null && !d0.shouldIgnore()) {
                int i6 = d0.mPosition;
                if (i6 >= i4) {
                    d0.offsetPosition(-i3, z2);
                    this.f0.g = true;
                } else if (i6 >= i2) {
                    d0.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.f0.g = true;
                }
            }
        }
        this.b.w(i2, i3, z2);
        requestLayout();
    }

    public final void B() {
        this.f0.a(1);
        Q(this.f0);
        this.f0.j = false;
        j1();
        this.f.f();
        D0();
        L0();
        a1();
        y yVar = this.f0;
        yVar.i = yVar.k && this.j0;
        this.j0 = false;
        this.i0 = false;
        yVar.h = yVar.l;
        yVar.f = this.l.getItemCount();
        T(this.n0);
        if (this.f0.k) {
            int g2 = this.e.g();
            for (int i2 = 0; i2 < g2; i2++) {
                B d0 = d0(this.e.f(i2));
                if (!d0.shouldIgnore() && (!d0.isInvalid() || this.l.hasStableIds())) {
                    this.f.e(d0, this.L.t(this.f0, d0, l.e(d0), d0.getUnmodifiedPayloads()));
                    if (this.f0.i && d0.isUpdated() && !d0.isRemoved() && !d0.shouldIgnore() && !d0.isInvalid()) {
                        this.f.c(b0(d0), d0);
                    }
                }
            }
        }
        if (this.f0.l) {
            b1();
            y yVar2 = this.f0;
            boolean z2 = yVar2.g;
            yVar2.g = false;
            this.m.V0(this.b, yVar2);
            this.f0.g = z2;
            for (int i3 = 0; i3 < this.e.g(); i3++) {
                B d02 = d0(this.e.f(i3));
                if (!d02.shouldIgnore() && !this.f.i(d02)) {
                    int e2 = l.e(d02);
                    boolean hasAnyOfTheFlags = d02.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e2 |= 4096;
                    }
                    l.b t2 = this.L.t(this.f0, d02, e2, d02.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        O0(d02, t2);
                    } else {
                        this.f.a(d02, t2);
                    }
                }
            }
            r();
        } else {
            r();
        }
        E0();
        l1(false);
        this.f0.e = 2;
    }

    public void B0(View view) {
    }

    public final void C() {
        j1();
        D0();
        this.f0.a(6);
        this.d.j();
        this.f0.f = this.l.getItemCount();
        y yVar = this.f0;
        yVar.d = 0;
        yVar.h = false;
        this.m.V0(this.b, yVar);
        y yVar2 = this.f0;
        yVar2.g = false;
        this.c = null;
        yVar2.k = yVar2.k && this.L != null;
        yVar2.e = 4;
        E0();
        l1(false);
    }

    public void C0(View view) {
    }

    public final void D() {
        this.f0.a(4);
        j1();
        D0();
        y yVar = this.f0;
        yVar.e = 1;
        if (yVar.k) {
            for (int g2 = this.e.g() - 1; g2 >= 0; g2--) {
                B d0 = d0(this.e.f(g2));
                if (!d0.shouldIgnore()) {
                    long b0 = b0(d0);
                    l.b s2 = this.L.s(this.f0, d0);
                    B g3 = this.f.g(b0);
                    if (g3 == null || g3.shouldIgnore()) {
                        this.f.d(d0, s2);
                    } else {
                        boolean h2 = this.f.h(g3);
                        boolean h3 = this.f.h(d0);
                        if (h2 && g3 == d0) {
                            this.f.d(d0, s2);
                        } else {
                            l.b n2 = this.f.n(g3);
                            this.f.d(d0, s2);
                            l.b m2 = this.f.m(d0);
                            if (n2 == null) {
                                i0(b0, d0, g3);
                            } else {
                                l(g3, d0, n2, m2, h2, h3);
                            }
                        }
                    }
                }
            }
            this.f.o(this.v0);
        }
        this.m.i1(this.b);
        y yVar2 = this.f0;
        yVar2.c = yVar2.f;
        this.C = false;
        this.D = false;
        yVar2.k = false;
        yVar2.l = false;
        this.m.g = false;
        ArrayList arrayList = this.b.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.m;
        if (oVar.m) {
            oVar.l = 0;
            oVar.m = false;
            this.b.K();
        }
        this.m.W0(this.f0);
        E0();
        l1(false);
        this.f.f();
        int[] iArr = this.n0;
        if (w(iArr[0], iArr[1])) {
            J(0, 0);
        }
        P0();
        Y0();
    }

    public void D0() {
        this.E++;
    }

    public boolean E(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void E0() {
        F0(true);
    }

    public boolean F(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().g(i2, i3, i4, i5, iArr, i6);
    }

    public void F0(boolean z2) {
        int i2 = this.E - 1;
        this.E = i2;
        if (i2 < 1) {
            this.E = 0;
            if (z2) {
                z();
                K();
            }
        }
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        r rVar = this.p;
        if (rVar != null) {
            if (action != 0) {
                rVar.a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.p = null;
                }
                return true;
            }
            this.p = null;
        }
        if (action != 0) {
            int size = this.o.size();
            for (int i2 = 0; i2 < size; i2++) {
                r rVar2 = (r) this.o.get(i2);
                if (rVar2.b(this, motionEvent)) {
                    this.p = rVar2;
                    return true;
                }
            }
        }
        return false;
    }

    public final void G0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.N = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.R = x2;
            this.P = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.S = y2;
            this.Q = y2;
        }
    }

    public final boolean H(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.p = null;
        }
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) this.o.get(i2);
            if (rVar.b(this, motionEvent) && action != 3) {
                this.p = rVar;
                return true;
            }
        }
        return false;
    }

    public void H0(int i2) {
    }

    public void I(int i2) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.c1(i2);
        }
        H0(i2);
        s sVar = this.g0;
        if (sVar != null) {
            sVar.a(this, i2);
        }
        List list = this.h0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.h0.get(size)).a(this, i2);
            }
        }
    }

    public void I0(int i2, int i3) {
    }

    public void J(int i2, int i3) {
        this.F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        I0(i2, i3);
        s sVar = this.g0;
        if (sVar != null) {
            sVar.b(this, i2, i3);
        }
        List list = this.h0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.h0.get(size)).b(this, i2, i3);
            }
        }
        this.F--;
    }

    public void J0() {
        if (this.l0 || !this.q) {
            return;
        }
        Z.P(this, this.u0);
        this.l0 = true;
    }

    public void K() {
        int i2;
        for (int size = this.t0.size() - 1; size >= 0; size--) {
            B b2 = (B) this.t0.get(size);
            if (b2.itemView.getParent() == this && !b2.shouldIgnore() && (i2 = b2.mPendingAccessibilityState) != -1) {
                Z.d0(b2.itemView, i2);
                b2.mPendingAccessibilityState = -1;
            }
        }
        this.t0.clear();
    }

    public final boolean K0() {
        return this.L != null && this.m.F1();
    }

    public void L() {
        if (this.K != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 3);
        this.K = a2;
        if (this.g) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void L0() {
        boolean z2;
        if (this.C) {
            this.d.y();
            if (this.D) {
                this.m.Q0(this);
            }
        }
        if (K0()) {
            this.d.w();
        } else {
            this.d.j();
        }
        boolean z3 = this.i0 || this.j0;
        this.f0.k = this.t && this.L != null && ((z2 = this.C) || z3 || this.m.g) && (!z2 || this.l.hasStableIds());
        y yVar = this.f0;
        yVar.l = yVar.k && z3 && !this.C && K0();
    }

    public void M() {
        if (this.H != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 0);
        this.H = a2;
        if (this.g) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void M0(boolean z2) {
        this.D = z2 | this.D;
        this.C = true;
        v0();
    }

    public void N() {
        if (this.J != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 2);
        this.J = a2;
        if (this.g) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.M()
            android.widget.EdgeEffect r1 = r6.H
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            X1.d.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.N()
            android.widget.EdgeEffect r1 = r6.J
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            X1.d.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.O()
            android.widget.EdgeEffect r9 = r6.I
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            X1.d.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.L()
            android.widget.EdgeEffect r9 = r6.K
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            X1.d.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            T1.Z.O(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.N0(float, float, float, float):void");
    }

    public void O() {
        if (this.I != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 1);
        this.I = a2;
        if (this.g) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void O0(B b2, l.b bVar) {
        b2.setFlags(0, 8192);
        if (this.f0.i && b2.isUpdated() && !b2.isRemoved() && !b2.shouldIgnore()) {
            this.f.c(b0(b2), b2);
        }
        this.f.e(b2, bVar);
    }

    public String P() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    public final void P0() {
        View findViewById;
        if (!this.b0 || this.l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!D0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.e.n(focusedChild)) {
                    return;
                }
            } else if (this.e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        B X = (this.f0.n == -1 || !this.l.hasStableIds()) ? null : X(this.f0.n);
        if (X != null && !this.e.n(X.itemView) && X.itemView.hasFocusable()) {
            view = X.itemView;
        } else if (this.e.g() > 0) {
            view = V();
        }
        if (view != null) {
            int i2 = this.f0.o;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public final void Q(y yVar) {
        if (getScrollState() != 2) {
            yVar.p = 0;
            yVar.q = 0;
        } else {
            OverScroller overScroller = this.c0.c;
            yVar.p = overScroller.getFinalX() - overScroller.getCurrX();
            yVar.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public final void Q0() {
        boolean z2;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.H.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.K.isFinished();
        }
        if (z2) {
            Z.O(this);
        }
    }

    public View R(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void R0() {
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.h1(this.b);
            this.m.i1(this.b);
        }
        this.b.c();
    }

    public B S(View view) {
        View R = R(view);
        if (R == null) {
            return null;
        }
        return c0(R);
    }

    public boolean S0(View view) {
        j1();
        boolean r2 = this.e.r(view);
        if (r2) {
            B d0 = d0(view);
            this.b.J(d0);
            this.b.C(d0);
        }
        l1(!r2);
        return r2;
    }

    public final void T(int[] iArr) {
        int g2 = this.e.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            B d0 = d0(this.e.f(i4));
            if (!d0.shouldIgnore()) {
                int layoutPosition = d0.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public void T0(n nVar) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.f("Cannot remove item decoration during a scroll  or layout");
        }
        this.n.remove(nVar);
        if (this.n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        u0();
        requestLayout();
    }

    public void U0(r rVar) {
        this.o.remove(rVar);
        if (this.p == rVar) {
            this.p = null;
        }
    }

    public final View V() {
        B W;
        y yVar = this.f0;
        int i2 = yVar.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = yVar.b();
        for (int i3 = i2; i3 < b2; i3++) {
            B W2 = W(i3);
            if (W2 == null) {
                break;
            }
            if (W2.itemView.hasFocusable()) {
                return W2.itemView;
            }
        }
        int min = Math.min(b2, i2);
        do {
            min--;
            if (min < 0 || (W = W(min)) == null) {
                return null;
            }
        } while (!W.itemView.hasFocusable());
        return W.itemView;
    }

    public void V0(s sVar) {
        List list = this.h0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public B W(int i2) {
        B b2 = null;
        if (this.C) {
            return null;
        }
        int j2 = this.e.j();
        for (int i3 = 0; i3 < j2; i3++) {
            B d0 = d0(this.e.i(i3));
            if (d0 != null && !d0.isRemoved() && a0(d0) == i2) {
                if (!this.e.n(d0.itemView)) {
                    return d0;
                }
                b2 = d0;
            }
        }
        return b2;
    }

    public void W0() {
        B b2;
        int g2 = this.e.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.e.f(i2);
            B c0 = c0(f2);
            if (c0 != null && (b2 = c0.mShadowingHolder) != null) {
                View view = b2.itemView;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public B X(long j2) {
        g gVar = this.l;
        B b2 = null;
        if (gVar != null && gVar.hasStableIds()) {
            int j3 = this.e.j();
            for (int i2 = 0; i2 < j3; i2++) {
                B d0 = d0(this.e.i(i2));
                if (d0 != null && !d0.isRemoved() && d0.getItemId() == j2) {
                    if (!this.e.n(d0.itemView)) {
                        return d0;
                    }
                    b2 = d0;
                }
            }
        }
        return b2;
    }

    public final void X0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        p layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = layoutParams;
            if (!pVar.c) {
                Rect rect = pVar.b;
                Rect rect2 = this.i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.i);
            offsetRectIntoDescendantCoords(view, this.i);
        }
        this.m.p1(this, view, this.i, !this.t, view2 == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.B Y(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$B r3 = d0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.e
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, boolean):androidx.recyclerview.widget.RecyclerView$B");
    }

    public final void Y0() {
        y yVar = this.f0;
        yVar.n = -1L;
        yVar.m = -1;
        yVar.o = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Z(int i2, int i3) {
        o oVar = this.m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.w) {
            return false;
        }
        boolean j2 = oVar.j();
        boolean k2 = this.m.k();
        if (j2 == 0 || Math.abs(i2) < this.U) {
            i2 = 0;
        }
        if (!k2 || Math.abs(i3) < this.U) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = j2 != 0 || k2;
            dispatchNestedFling(f2, f3, z2);
            int i4 = j2;
            if (z2) {
                if (k2) {
                    i4 = (j2 ? 1 : 0) | 2;
                }
                k1(i4, 1);
                int i5 = this.V;
                int max = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.V;
                this.c0.e(max, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    public final void Z0() {
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m1(0);
        Q0();
    }

    public void a(int i2, int i3) {
        if (i2 < 0) {
            M();
            this.H.onAbsorb(-i2);
        } else if (i2 > 0) {
            N();
            this.J.onAbsorb(i2);
        }
        if (i3 < 0) {
            O();
            this.I.onAbsorb(-i3);
        } else if (i3 > 0) {
            L();
            this.K.onAbsorb(i3);
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        Z.O(this);
    }

    public int a0(B b2) {
        if (b2.hasAnyOfTheFlags(524) || !b2.isBound()) {
            return -1;
        }
        return this.d.e(b2.mPosition);
    }

    public final void a1() {
        View focusedChild = (this.b0 && hasFocus() && this.l != null) ? getFocusedChild() : null;
        B S = focusedChild != null ? S(focusedChild) : null;
        if (S == null) {
            Y0();
            return;
        }
        this.f0.n = this.l.hasStableIds() ? S.getItemId() : -1L;
        this.f0.m = this.C ? -1 : S.isRemoved() ? S.mOldPosition : S.getAdapterPosition();
        this.f0.o = f0(S.itemView);
    }

    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        o oVar = this.m;
        if (oVar == null || !oVar.D0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public long b0(B b2) {
        return this.l.hasStableIds() ? b2.getItemId() : b2.mPosition;
    }

    public void b1() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            B d0 = d0(this.e.i(i2));
            if (!d0.shouldIgnore()) {
                d0.saveOldPosition();
            }
        }
    }

    public B c0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return d0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean c1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        t();
        if (this.l != null) {
            d1(i2, i3, this.s0);
            int[] iArr = this.s0;
            int i8 = iArr[0];
            int i9 = iArr[1];
            i5 = i9;
            i6 = i8;
            i7 = i2 - i8;
            i4 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.n.isEmpty()) {
            invalidate();
        }
        int i10 = i4;
        if (F(i6, i5, i7, i4, this.p0, 0)) {
            int i11 = this.R;
            int[] iArr2 = this.p0;
            int i12 = iArr2[0];
            this.R = i11 - i12;
            int i13 = this.S;
            int i14 = iArr2[1];
            this.S = i13 - i14;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i12, i14);
            }
            int[] iArr3 = this.r0;
            int i15 = iArr3[0];
            int[] iArr4 = this.p0;
            iArr3[0] = i15 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C.a(motionEvent, 8194)) {
                N0(motionEvent.getX(), i7, motionEvent.getY(), i10);
            }
            s(i2, i3);
        }
        if (i6 != 0 || i5 != 0) {
            J(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i6 == 0 && i5 == 0) ? false : true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.m.l((p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.m;
        if (oVar != null && oVar.j()) {
            return this.m.p(this.f0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.m;
        if (oVar != null && oVar.j()) {
            return this.m.q(this.f0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.m;
        if (oVar != null && oVar.j()) {
            return this.m.r(this.f0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.m;
        if (oVar != null && oVar.k()) {
            return this.m.s(this.f0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.m;
        if (oVar != null && oVar.k()) {
            return this.m.t(this.f0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.m;
        if (oVar != null && oVar.k()) {
            return this.m.u(this.f0);
        }
        return 0;
    }

    public void d1(int i2, int i3, int[] iArr) {
        j1();
        D0();
        P1.o.a("RV Scroll");
        Q(this.f0);
        int t1 = i2 != 0 ? this.m.t1(i2, this.b, this.f0) : 0;
        int u1 = i3 != 0 ? this.m.u1(i3, this.b, this.f0) : 0;
        P1.o.b();
        W0();
        E0();
        l1(false);
        if (iArr != null) {
            iArr[0] = t1;
            iArr[1] = u1;
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        super/*android.view.View*/.draw(canvas);
        int size = this.n.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.n.get(i2)).h(canvas, this, this.f0);
        }
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.J;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.L == null || this.n.size() <= 0 || !this.L.p()) ? z2 : true) {
            Z.O(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.l;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.a);
            this.l.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            R0();
        }
        this.d.y();
        g gVar3 = this.l;
        this.l = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.a);
            gVar.onAttachedToRecyclerView(this);
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.C0(gVar3, this.l);
        }
        this.b.x(gVar3, this.l, z2);
        this.f0.g = true;
    }

    public final void f(B b2) {
        View view = b2.itemView;
        boolean z2 = view.getParent() == this;
        this.b.J(c0(view));
        if (b2.isTmpDetached()) {
            this.e.c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.e.k(view);
        } else {
            this.e.b(view, true);
        }
    }

    public final int f0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public boolean f1(B b2, int i2) {
        if (!s0()) {
            Z.d0(b2.itemView, i2);
            return true;
        }
        b2.mPendingAccessibilityState = i2;
        this.t0.add(b2);
        return false;
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View O0 = this.m.O0(view, i2);
        if (O0 != null) {
            return O0;
        }
        boolean z3 = (this.l == null || this.m == null || s0() || this.w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.m.k()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (C0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.m.j()) {
                int i4 = (this.m.X() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (C0) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                t();
                if (R(view) == null) {
                    return null;
                }
                j1();
                this.m.H0(view, i2, this.b, this.f0);
                l1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                t();
                if (R(view) == null) {
                    return null;
                }
                j1();
                view2 = this.m.H0(view, i2, this.b, this.f0);
                l1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return t0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        X0(view2, null);
        return view;
    }

    public void g(n nVar) {
        h(nVar, -1);
    }

    public final String g0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public boolean g1(AccessibilityEvent accessibilityEvent) {
        if (!s0()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? U1.b.a(accessibilityEvent) : 0;
        this.y |= a2 != 0 ? a2 : 0;
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.C();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.D(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    public g getAdapter() {
        return this.l;
    }

    public int getBaseline() {
        o oVar = this.m;
        return oVar != null ? oVar.F() : super/*android.view.View*/.getBaseline();
    }

    public int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.g;
    }

    public androidx.recyclerview.widget.i getCompatAccessibilityDelegate() {
        return this.m0;
    }

    public k getEdgeEffectFactory() {
        return this.G;
    }

    public l getItemAnimator() {
        return this.L;
    }

    public int getItemDecorationCount() {
        return this.n.size();
    }

    public o getLayoutManager() {
        return this.m;
    }

    public int getMaxFlingVelocity() {
        return this.V;
    }

    public int getMinFlingVelocity() {
        return this.U;
    }

    public long getNanoTime() {
        if (B0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.b0;
    }

    public t getRecycledViewPool() {
        return this.b.i();
    }

    public int getScrollState() {
        return this.M;
    }

    public void h(n nVar, int i2) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.f("Cannot add item decoration during a scroll  or layout");
        }
        if (this.n.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.n.add(nVar);
        } else {
            this.n.add(i2, nVar);
        }
        u0();
        requestLayout();
    }

    public Rect h0(View view) {
        p layoutParams = view.getLayoutParams();
        if (!layoutParams.c) {
            return layoutParams.b;
        }
        if (this.f0.e() && (layoutParams.b() || layoutParams.d())) {
            return layoutParams.b;
        }
        Rect rect = layoutParams.b;
        rect.set(0, 0, 0, 0);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.set(0, 0, 0, 0);
            ((n) this.n.get(i2)).e(this.i, view, this, this.f0);
            int i3 = rect.left;
            Rect rect2 = this.i;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.c = false;
        return rect;
    }

    public void h1(int i2, int i3) {
        i1(i2, i3, null);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public void i(r rVar) {
        this.o.add(rVar);
    }

    public final void i0(long j2, B b2, B b3) {
        int g2 = this.e.g();
        for (int i2 = 0; i2 < g2; i2++) {
            B d0 = d0(this.e.f(i2));
            if (d0 != b2 && b0(d0) == j2) {
                g gVar = this.l;
                if (gVar == null || !gVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + d0 + " \n View Holder 2:" + b2 + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + d0 + " \n View Holder 2:" + b2 + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b3 + " cannot be found but it is necessary for " + b2 + P());
    }

    public void i1(int i2, int i3, Interpolator interpolator) {
        o oVar = this.m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) {
            return;
        }
        if (!oVar.j()) {
            i2 = 0;
        }
        if (!this.m.k()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        this.c0.h(i2, i3, interpolator);
    }

    public boolean isAttachedToWindow() {
        return this.q;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public void j(s sVar) {
        if (this.h0 == null) {
            this.h0 = new ArrayList();
        }
        this.h0.add(sVar);
    }

    public boolean j0(int i2) {
        return getScrollingChildHelper().l(i2);
    }

    public void j1() {
        int i2 = this.u + 1;
        this.u = i2;
        if (i2 != 1 || this.w) {
            return;
        }
        this.v = false;
    }

    public void k(B b2, l.b bVar, l.b bVar2) {
        b2.setIsRecyclable(false);
        if (this.L.a(b2, bVar, bVar2)) {
            J0();
        }
    }

    public boolean k0() {
        return !this.t || this.C || this.d.p();
    }

    public boolean k1(int i2, int i3) {
        return getScrollingChildHelper().q(i2, i3);
    }

    public final void l(B b2, B b3, l.b bVar, l.b bVar2, boolean z2, boolean z3) {
        b2.setIsRecyclable(false);
        if (z2) {
            f(b2);
        }
        if (b2 != b3) {
            if (z3) {
                f(b3);
            }
            b2.mShadowedHolder = b3;
            f(b2);
            this.b.J(b2);
            b3.setIsRecyclable(false);
            b3.mShadowingHolder = b2;
        }
        if (this.L.b(b2, b3, bVar, bVar2)) {
            J0();
        }
    }

    public final boolean l0() {
        int g2 = this.e.g();
        for (int i2 = 0; i2 < g2; i2++) {
            B d0 = d0(this.e.f(i2));
            if (d0 != null && !d0.shouldIgnore() && d0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public void l1(boolean z2) {
        if (this.u < 1) {
            this.u = 1;
        }
        if (!z2 && !this.w) {
            this.v = false;
        }
        if (this.u == 1) {
            if (z2 && this.v && !this.w && this.m != null && this.l != null) {
                A();
            }
            if (!this.w) {
                this.v = false;
            }
        }
        this.u--;
    }

    public void m(B b2, l.b bVar, l.b bVar2) {
        f(b2);
        b2.setIsRecyclable(false);
        if (this.L.c(b2, bVar, bVar2)) {
            J0();
        }
    }

    public void m0() {
        this.d = new androidx.recyclerview.widget.a(new f());
    }

    public void m1(int i2) {
        getScrollingChildHelper().s(i2);
    }

    public void n(String str) {
        if (s0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public final void n0() {
        if (Z.s(this) == 0) {
            Z.f0(this, 8);
        }
    }

    public void n1() {
        setScrollState(0);
        o1();
    }

    public boolean o(B b2) {
        l lVar = this.L;
        return lVar == null || lVar.g(b2, b2.getUnmodifiedPayloads());
    }

    public final void o0() {
        this.e = new androidx.recyclerview.widget.b(new e());
    }

    public final void o1() {
        this.c0.i();
        o oVar = this.m;
        if (oVar != null) {
            oVar.E1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.E = r0
            r1 = 1
            r5.q = r1
            boolean r2 = r5.t
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.t = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.m
            if (r1 == 0) goto L1e
            r1.y(r5)
        L1e:
            r5.l0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.B0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.d0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.d0 = r1
            android.view.Display r1 = T1.Z.p(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.d0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.d0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        n1();
        this.q = false;
        o oVar = this.m;
        if (oVar != null) {
            oVar.z(this, this.b);
        }
        this.t0.clear();
        removeCallbacks(this.u0);
        this.f.j();
        if (!B0 || (eVar = this.d0) == null) {
            return;
        }
        eVar.j(this);
        this.d0 = null;
    }

    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.n.get(i2)).g(canvas, this, this.f0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.w
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.m
            boolean r0 = r0.k()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.m
            boolean r3 = r3.j()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.m
            boolean r3 = r3.k()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.m
            boolean r3 = r3.j()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.W
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.a0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.c1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.w) {
            return false;
        }
        if (H(motionEvent)) {
            p();
            return true;
        }
        o oVar = this.m;
        if (oVar == null) {
            return false;
        }
        boolean j2 = oVar.j();
        boolean k2 = this.m.k();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.x) {
                this.x = false;
            }
            this.N = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.R = x2;
            this.P = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.S = y2;
            this.Q = y2;
            if (this.M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.r0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = j2;
            if (k2) {
                i2 = (j2 ? 1 : 0) | 2;
            }
            k1(i2, 0);
        } else if (actionMasked == 1) {
            this.O.clear();
            m1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.N);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.M != 1) {
                int i3 = x3 - this.P;
                int i4 = y3 - this.Q;
                if (j2 == 0 || Math.abs(i3) <= this.T) {
                    z2 = false;
                } else {
                    this.R = x3;
                    z2 = true;
                }
                if (k2 && Math.abs(i4) > this.T) {
                    this.S = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
        } else if (actionMasked == 5) {
            this.N = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.R = x4;
            this.P = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.S = y4;
            this.Q = y4;
        } else if (actionMasked == 6) {
            G0(motionEvent);
        }
        return this.M == 1;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        P1.o.a("RV OnLayout");
        A();
        P1.o.b();
        this.t = true;
    }

    public void onMeasure(int i2, int i3) {
        o oVar = this.m;
        if (oVar == null) {
            v(i2, i3);
            return;
        }
        if (oVar.q0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.m.X0(this.b, this.f0, i2, i3);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.l == null) {
                return;
            }
            if (this.f0.e == 1) {
                B();
            }
            this.m.w1(i2, i3);
            this.f0.j = true;
            C();
            this.m.z1(i2, i3);
            if (this.m.C1()) {
                this.m.w1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f0.j = true;
                C();
                this.m.z1(i2, i3);
                return;
            }
            return;
        }
        if (this.r) {
            this.m.X0(this.b, this.f0, i2, i3);
            return;
        }
        if (this.z) {
            j1();
            D0();
            L0();
            E0();
            y yVar = this.f0;
            if (yVar.l) {
                yVar.h = true;
            } else {
                this.d.j();
                this.f0.h = false;
            }
            this.z = false;
            l1(false);
        } else if (this.f0.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.l;
        if (gVar != null) {
            this.f0.f = gVar.getItemCount();
        } else {
            this.f0.f = 0;
        }
        j1();
        this.m.X0(this.b, this.f0, i2, i3);
        l1(false);
        this.f0.h = false;
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (s0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.c = xVar;
        super/*android.view.View*/.onRestoreInstanceState(xVar.b());
        o oVar = this.m;
        if (oVar == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        oVar.a1(parcelable2);
    }

    public Parcelable onSaveInstanceState() {
        x xVar = new x(super/*android.view.View*/.onSaveInstanceState());
        x xVar2 = this.c;
        if (xVar2 != null) {
            xVar.c(xVar2);
        } else {
            o oVar = this.m;
            if (oVar != null) {
                xVar.c = oVar.b1();
            } else {
                xVar.c = null;
            }
        }
        return xVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super/*android.view.View*/.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        Z0();
        setScrollState(0);
    }

    public void p0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(f4.a.a), resources.getDimensionPixelSize(f4.a.c), resources.getDimensionPixelOffset(f4.a.b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public void p1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.e.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.e.i(i6);
            B d0 = d0(i7);
            if (d0 != null && !d0.shouldIgnore() && (i4 = d0.mPosition) >= i2 && i4 < i5) {
                d0.addFlags(2);
                d0.addChangePayload(obj);
                i7.getLayoutParams().c = true;
            }
        }
        this.b.M(i2, i3);
    }

    public void q0() {
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    public void r() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            B d0 = d0(this.e.i(i2));
            if (!d0.shouldIgnore()) {
                d0.clearOldPosition();
            }
        }
        this.b.d();
    }

    public boolean r0() {
        AccessibilityManager accessibilityManager = this.A;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void removeDetachedView(View view, boolean z2) {
        B d0 = d0(view);
        if (d0 != null) {
            if (d0.isTmpDetached()) {
                d0.clearTmpDetachFlag();
            } else if (!d0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d0 + P());
            }
        }
        view.clearAnimation();
        y(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.m.Z0(this, this.f0, view, view2) && view2 != null) {
            X0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.m.o1(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((r) this.o.get(i2)).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.u != 0 || this.w) {
            this.v = true;
        } else {
            super/*android.view.View*/.requestLayout();
        }
    }

    public void s(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.H.onRelease();
            z2 = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.J.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.I.onRelease();
            z2 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.K.onRelease();
            z2 |= this.K.isFinished();
        }
        if (z2) {
            Z.O(this);
        }
    }

    public boolean s0() {
        return this.E > 0;
    }

    public void scrollBy(int i2, int i3) {
        o oVar = this.m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) {
            return;
        }
        boolean j2 = oVar.j();
        boolean k2 = this.m.k();
        if (j2 || k2) {
            if (!j2) {
                i2 = 0;
            }
            if (!k2) {
                i3 = 0;
            }
            c1(i2, i3, null);
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (g1(accessibilityEvent)) {
            return;
        }
        super/*android.view.View*/.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.i iVar) {
        this.m0 = iVar;
        Z.U(this, iVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        e1(gVar, false, true);
        M0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.g) {
            q0();
        }
        this.g = z2;
        super.setClipToPadding(z2);
        if (this.t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        S1.g.h(kVar);
        this.G = kVar;
        q0();
    }

    public void setHasFixedSize(boolean z2) {
        this.r = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.L;
        if (lVar2 != null) {
            lVar2.k();
            this.L.v(null);
        }
        this.L = lVar;
        if (lVar != null) {
            lVar.v(this.k0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.b.G(i2);
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.w) {
            n("Do not setLayoutFrozen in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.w = true;
                this.x = true;
                n1();
                return;
            }
            this.w = false;
            if (this.v && this.m != null && this.l != null) {
                requestLayout();
            }
            this.v = false;
        }
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.m) {
            return;
        }
        n1();
        if (this.m != null) {
            l lVar = this.L;
            if (lVar != null) {
                lVar.k();
            }
            this.m.h1(this.b);
            this.m.i1(this.b);
            this.b.c();
            if (this.q) {
                this.m.z(this, this.b);
            }
            this.m.A1(null);
            this.m = null;
        } else {
            this.b.c();
        }
        this.e.o();
        this.m = oVar;
        if (oVar != null) {
            if (oVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.b.P());
            }
            oVar.A1(this);
            if (this.q) {
                this.m.y(this);
            }
        }
        this.b.K();
        requestLayout();
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().n(z2);
    }

    public void setOnFlingListener(q qVar) {
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.g0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.b0 = z2;
    }

    public void setRecycledViewPool(t tVar) {
        this.b.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    public void setScrollState(int i2) {
        if (i2 == this.M) {
            return;
        }
        this.M = i2;
        if (i2 != 2) {
            o1();
        }
        I(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z zVar) {
        this.b.F(zVar);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().p(i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void t() {
        if (!this.t || this.C) {
            P1.o.a("RV FullInvalidate");
            A();
            P1.o.b();
            return;
        }
        if (this.d.p()) {
            if (!this.d.o(4) || this.d.o(11)) {
                if (this.d.p()) {
                    P1.o.a("RV FullInvalidate");
                    A();
                    P1.o.b();
                    return;
                }
                return;
            }
            P1.o.a("RV PartialInvalidate");
            j1();
            D0();
            this.d.w();
            if (!this.v) {
                if (l0()) {
                    A();
                } else {
                    this.d.i();
                }
            }
            l1(true);
            E0();
            P1.o.b();
        }
    }

    public final boolean t0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.i.set(0, 0, view.getWidth(), view.getHeight());
        this.j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.i);
        offsetDescendantRectToMyCoords(view2, this.j);
        char c2 = 65535;
        int i4 = this.m.X() == 1 ? -1 : 1;
        Rect rect = this.i;
        int i5 = rect.left;
        Rect rect2 = this.j;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + P());
    }

    public final void u(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String g0 = g0(context, trim);
            try {
                Class asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(g0).asSubclass(o.class);
                try {
                    constructor = asSubclass.getConstructor(E0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor((Class[]) null);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + g0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + g0, e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + g0, e5);
            } catch (ClassCastException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + g0, e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + g0, e7);
            } catch (InstantiationException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + g0, e8);
            }
        }
    }

    public void u0() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            this.e.i(i2).getLayoutParams().c = true;
        }
        this.b.s();
    }

    public void v(int i2, int i3) {
        setMeasuredDimension(o.m(i2, getPaddingLeft() + getPaddingRight(), Z.v(this)), o.m(i3, getPaddingTop() + getPaddingBottom(), Z.u(this)));
    }

    public void v0() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            B d0 = d0(this.e.i(i2));
            if (d0 != null && !d0.shouldIgnore()) {
                d0.addFlags(6);
            }
        }
        u0();
        this.b.t();
    }

    public final boolean w(int i2, int i3) {
        T(this.n0);
        int[] iArr = this.n0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    public void w0(int i2) {
        int g2 = this.e.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.e.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void x(View view) {
        int size;
        B d0 = d0(view);
        B0(view);
        g gVar = this.l;
        if (gVar != null && d0 != null) {
            gVar.onViewAttachedToWindow(d0);
        }
        if (this.B == null || r2.size() - 1 < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.B.get(size));
        throw null;
    }

    public void x0(int i2) {
        int g2 = this.e.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.e.f(i3).offsetTopAndBottom(i2);
        }
    }

    public void y(View view) {
        int size;
        B d0 = d0(view);
        C0(view);
        g gVar = this.l;
        if (gVar != null && d0 != null) {
            gVar.onViewDetachedFromWindow(d0);
        }
        if (this.B == null || r2.size() - 1 < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.B.get(size));
        throw null;
    }

    public void y0(int i2, int i3) {
        int j2 = this.e.j();
        for (int i4 = 0; i4 < j2; i4++) {
            B d0 = d0(this.e.i(i4));
            if (d0 != null && !d0.shouldIgnore() && d0.mPosition >= i2) {
                d0.offsetPosition(i3, false);
                this.f0.g = true;
            }
        }
        this.b.u(i2, i3);
        requestLayout();
    }

    public final void z() {
        int i2 = this.y;
        this.y = 0;
        if (i2 == 0 || !r0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        U1.b.c(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    public void z0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.e.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            B d0 = d0(this.e.i(i8));
            if (d0 != null && (i7 = d0.mPosition) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    d0.offsetPosition(i3 - i2, false);
                } else {
                    d0.offsetPosition(i6, false);
                }
                this.f0.g = true;
            }
        }
        this.b.v(i2, i3);
        requestLayout();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new w();
        this.b = new u();
        this.f = new androidx.recyclerview.widget.m();
        this.h = new a();
        this.i = new Rect();
        this.j = new Rect();
        this.k = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.u = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = new k();
        this.L = new androidx.recyclerview.widget.c();
        this.M = 0;
        this.N = -1;
        this.W = Float.MIN_VALUE;
        this.a0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.b0 = true;
        this.c0 = new A();
        this.e0 = B0 ? new e.b() : null;
        this.f0 = new y();
        this.i0 = false;
        this.j0 = false;
        this.k0 = new m();
        this.l0 = false;
        this.n0 = new int[2];
        this.p0 = new int[2];
        this.q0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new ArrayList();
        this.u0 = new b();
        this.v0 = new d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0, i2, 0);
            this.g = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.g = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.T = viewConfiguration.getScaledTouchSlop();
        this.W = c0.f(viewConfiguration, context);
        this.a0 = c0.j(viewConfiguration, context);
        this.U = viewConfiguration.getScaledMinimumFlingVelocity();
        this.V = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.L.v(this.k0);
        m0();
        o0();
        n0();
        if (Z.r(this) == 0) {
            Z.d0(this, 1);
        }
        this.A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.i(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4.b.h, i2, 0);
            String string = obtainStyledAttributes2.getString(f4.b.p);
            if (obtainStyledAttributes2.getInt(f4.b.j, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z3 = obtainStyledAttributes2.getBoolean(f4.b.k, false);
            this.s = z3;
            if (z3) {
                p0((StateListDrawable) obtainStyledAttributes2.getDrawable(f4.b.n), obtainStyledAttributes2.getDrawable(f4.b.o), (StateListDrawable) obtainStyledAttributes2.getDrawable(f4.b.l), obtainStyledAttributes2.getDrawable(f4.b.m));
            }
            obtainStyledAttributes2.recycle();
            u(context, string, attributeSet, i2, 0);
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, w0, i2, 0);
            z2 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public static class p extends ViewGroup.MarginLayoutParams {
        public B a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.getLayoutPosition();
        }

        public boolean b() {
            return this.a.isUpdated();
        }

        public boolean c() {
            return this.a.isRemoved();
        }

        public boolean d() {
            return this.a.isInvalid();
        }

        public p(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(p pVar) {
            super(pVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    public static class x extends m2.a {
        public static final Parcelable.Creator CREATOR = new a();
        public Parcelable c;

        public static class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public x[] newArray(int i) {
                return new x[i];
            }
        }

        public x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void c(x xVar) {
            this.c = xVar.c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }

        public x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.E(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
