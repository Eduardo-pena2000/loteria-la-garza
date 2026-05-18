package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.X;
import androidx.lifecycle.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.Z, androidx.lifecycle.h, j4.i, g.c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    X.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    J mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    A mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.t mLifecycleRegistry;
    p mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    j4.h mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray mSavedViewState;
    String mTag;
    p mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    X mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    J mChildFragmentManager = new K();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b();
    k.b mMaxState = k.b.e;
    androidx.lifecycle.A mViewLifecycleOwnerLiveData = new androidx.lifecycle.A();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList mOnPreAttachedListeners = new ArrayList();
    private final m mSavedStateAttachListener = new c();

    public class a extends g.d {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ h.a b;

        public a(AtomicReference atomicReference, h.a aVar) {
            this.a = atomicReference;
            this.b = aVar;
        }

        public void b(Object obj, G1.c cVar) {
            g.d dVar = (g.d) this.a.get();
            if (dVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            dVar.b(obj, cVar);
        }

        public void c() {
            g.d dVar = (g.d) this.a.getAndSet((Object) null);
            if (dVar != null) {
                dVar.c();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            p.this.startPostponedEnterTransition();
        }
    }

    public class c extends m {
        public c() {
            super(null);
        }

        public void a() {
            p.this.mSavedStateRegistryController.c();
            androidx.lifecycle.M.c(p.this);
            Bundle bundle = p.this.mSavedFragmentState;
            p.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            p.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ b0 a;

        public e(b0 b0Var) {
            this.a = b0Var;
        }

        public void run() {
            if (this.a.w()) {
                this.a.n();
            }
        }
    }

    public class f extends w {
        public f() {
        }

        public View c(int i) {
            View view = p.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + p.this + " does not have a view");
        }

        public boolean d() {
            return p.this.mView != null;
        }
    }

    public class g implements androidx.lifecycle.o {
        public g() {
        }

        public void onStateChanged(androidx.lifecycle.r rVar, k.a aVar) {
            View view;
            if (aVar != k.a.ON_STOP || (view = p.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements t.a {
        public h() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g.f apply(Void r3) {
            p pVar = p.this;
            Object obj = pVar.mHost;
            return obj instanceof g.g ? ((g.g) obj).getActivityResultRegistry() : pVar.requireActivity().getActivityResultRegistry();
        }
    }

    public class i implements t.a {
        public final /* synthetic */ g.f a;

        public i(g.f fVar) {
            this.a = fVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g.f apply(Void r1) {
            return this.a;
        }
    }

    public class j extends m {
        public final /* synthetic */ t.a a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ h.a c;
        public final /* synthetic */ g.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(t.a aVar, AtomicReference atomicReference, h.a aVar2, g.b bVar) {
            super(null);
            this.a = aVar;
            this.b = atomicReference;
            this.c = aVar2;
            this.d = bVar;
        }

        public void a() {
            String generateActivityResultKey = p.this.generateActivityResultKey();
            this.b.set(((g.f) this.a.apply(null)).l(generateActivityResultKey, p.this, this.c, this.d));
        }
    }

    public static class k {
        public View a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public ArrayList h;
        public ArrayList i;
        public Object j = null;
        public Object k;
        public Object l;
        public Object m;
        public Object n;
        public Object o;
        public Boolean p;
        public Boolean q;
        public float r;
        public View s;
        public boolean t;

        public k() {
            Object obj = p.USE_DEFAULT_TRANSITION;
            this.k = obj;
            this.l = null;
            this.m = obj;
            this.n = null;
            this.o = obj;
            this.r = 1.0f;
            this.s = null;
        }
    }

    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class m {
        public m() {
        }

        public abstract void a();

        public /* synthetic */ m(b bVar) {
            this();
        }
    }

    public static class n implements Parcelable {
        public static final Parcelable.Creator CREATOR = new a();
        public final Bundle a;

        public class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i) {
                return new n[i];
            }
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    public p() {
        L();
    }

    public static /* synthetic */ void H(p pVar) {
        pVar.M();
    }

    @Deprecated
    public static p instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final k I() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    public final int J() {
        k.b bVar = this.mMaxState;
        return (bVar == k.b.b || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.J());
    }

    public final p K(boolean z) {
        String str;
        if (z) {
            y2.c.j(this);
        }
        p pVar = this.mTarget;
        if (pVar != null) {
            return pVar;
        }
        J j2 = this.mFragmentManager;
        if (j2 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return j2.k0(str);
    }

    public final void L() {
        this.mLifecycleRegistry = new androidx.lifecycle.t(this);
        this.mSavedStateRegistryController = j4.h.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        O(this.mSavedStateAttachListener);
    }

    public final /* synthetic */ void M() {
        this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    public final g.d N(h.a aVar, t.a aVar2, g.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            O(new j(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public final void O(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    public final void P() {
        if (J.N0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        J j2;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (j2 = this.mFragmentManager) == null) {
            return;
        }
        b0 u = b0.u(viewGroup, j2);
        u.x();
        if (z) {
            this.mHost.h().post(new e(u));
        } else {
            u.n();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public w createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        p K = K(false);
        if (K != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(K);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            I2.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.b0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public p findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.o0(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final u getActivity() {
        A a2 = this.mHost;
        if (a2 == null) {
            return null;
        }
        return (u) a2.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final J getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        A a2 = this.mHost;
        if (a2 == null) {
            return null;
        }
        return a2.f();
    }

    public F2.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && J.N0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        F2.b bVar = new F2.b();
        if (application != null) {
            bVar.c(X.a.e, application);
        }
        bVar.c(androidx.lifecycle.M.a, this);
        bVar.c(androidx.lifecycle.M.b, this);
        if (getArguments() != null) {
            bVar.c(androidx.lifecycle.M.c, getArguments());
        }
        return bVar;
    }

    public X.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && J.N0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.Q(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.j;
    }

    public G1.v getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.l;
    }

    public G1.v getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.s;
    }

    @Deprecated
    public final J getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        A a2 = this.mHost;
        if (a2 == null) {
            return null;
        }
        return a2.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public androidx.lifecycle.k getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public I2.a getLoaderManager() {
        return I2.a.b(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.g;
    }

    public final p getParentFragment() {
        return this.mParentFragment;
    }

    public final J getParentFragmentManager() {
        J j2 = this.mFragmentManager;
        if (j2 != null) {
            return j2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.b;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.e;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.r;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        y2.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public final j4.f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.h) == null) ? new ArrayList() : arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.i) == null) ? new ArrayList() : arrayList;
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final p getTargetFragment() {
        return K(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        y2.c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.r getViewLifecycleOwner() {
        X x = this.mViewLifecycleOwner;
        if (x != null) {
            return x;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.y getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public androidx.lifecycle.Y getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (J() != k.b.b.ordinal()) {
            return this.mFragmentManager.I0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        L();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new K();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        J j2;
        return this.mHidden || ((j2 = this.mFragmentManager) != null && j2.Q0(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        J j2;
        return this.mMenuVisible && ((j2 = this.mFragmentManager) == null || j2.R0(this.mParentFragment));
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        J j2 = this.mFragmentManager;
        if (j2 == null) {
            return false;
        }
        return j2.U0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.e1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (J.N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        A a2 = this.mHost;
        Activity e2 = a2 == null ? null : a2.e();
        if (e2 != null) {
            this.mCalled = false;
            onAttach(e2);
        }
    }

    @Deprecated
    public void onAttachFragment(p pVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.T0(1)) {
            return;
        }
        this.mChildFragmentManager.G();
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        A a2 = this.mHost;
        Activity e2 = a2 == null ? null : a2.e();
        if (e2 != null) {
            this.mCalled = false;
            onInflate(e2, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.e1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            P();
            this.mChildFragmentManager.C();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.o(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.M(this);
            this.mChildFragmentManager.D();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.F(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.e1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.g(k.a.ON_CREATE);
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.H(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.e1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new X(this, getViewModelStore(), new o(this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (J.N0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.a0.b(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.b0.b(this.mView, this.mViewLifecycleOwner);
        j4.m.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.n(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.I();
        this.mLifecycleRegistry.g(k.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.J();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getCurrentState().b(k.b.c)) {
            this.mViewLifecycleOwner.a(k.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            I2.a.b(this).d();
            this.mPerformedCreateView = false;
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.M0()) {
                return;
            }
            this.mChildFragmentManager.I();
            this.mChildFragmentManager = new K();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.O(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.P(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.R();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(k.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.g(k.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.T(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean S0 = this.mFragmentManager.S0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != S0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(S0);
            onPrimaryNavigationFragmentChanged(S0);
            this.mChildFragmentManager.U();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.e1();
        this.mChildFragmentManager.f0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.t tVar = this.mLifecycleRegistry;
        k.a aVar = k.a.ON_RESUME;
        tVar.g(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.V();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.e1();
        this.mChildFragmentManager.f0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new d0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = this.mLifecycleRegistry;
        k.a aVar = k.a.ON_START;
        tVar.g(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.W();
    }

    public void performStop() {
        this.mChildFragmentManager.Y();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(k.a.ON_STOP);
        }
        this.mLifecycleRegistry.g(k.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.Z();
    }

    public void postponeEnterTransition() {
        I().t = true;
    }

    public final g.d registerForActivityResult(h.a aVar, g.b bVar) {
        return N(aVar, new h(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost != null) {
            getParentFragmentManager().a1(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final u requireActivity() {
        u activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final J requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final p requireParentFragment() {
        p parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState() {
        Parcelable bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.s1(bundle);
        this.mChildFragmentManager.G();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(k.a.ON_CREATE);
            }
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        I().q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        I().p = Boolean.valueOf(z);
    }

    public void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        I().c = i2;
        I().d = i3;
        I().e = i4;
        I().f = i5;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(G1.v vVar) {
        I().getClass();
    }

    public void setEnterTransition(Object obj) {
        I().j = obj;
    }

    public void setExitSharedElementCallback(G1.v vVar) {
        I().getClass();
    }

    public void setExitTransition(Object obj) {
        I().l = obj;
    }

    public void setFocusedView(View view) {
        I().s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.p();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.p();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        I();
        this.mAnimationInfo.g = i2;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        I().b = z;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        I().r = f2;
    }

    public void setReenterTransition(Object obj) {
        I().m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        y2.c.k(this);
        this.mRetainInstance = z;
        J j2 = this.mFragmentManager;
        if (j2 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            j2.m(this);
        } else {
            j2.q1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        I().k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        I().n = obj;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        I();
        k kVar = this.mAnimationInfo;
        kVar.h = arrayList;
        kVar.i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        I().o = obj;
    }

    @Deprecated
    public void setTargetFragment(p pVar, int i2) {
        if (pVar != null) {
            y2.c.l(this, pVar, i2);
        }
        J j2 = this.mFragmentManager;
        J j3 = pVar != null ? pVar.mFragmentManager : null;
        if (j2 != null && j3 != null && j2 != j3) {
            throw new IllegalArgumentException("Fragment " + pVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.K(false)) {
            if (pVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + pVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (pVar == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || pVar.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = pVar;
        } else {
            this.mTargetWho = pVar.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        y2.c.m(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            J j2 = this.mFragmentManager;
            j2.g1(j2.A(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        A a2 = this.mHost;
        if (a2 != null) {
            return a2.m(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (J.N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().c1(this, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !I().t) {
            return;
        }
        if (this.mHost == null) {
            I().t = false;
        } else if (Looper.myLooper() != this.mHost.h().getLooper()) {
            this.mHost.h().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @Deprecated
    public static p instantiate(Context context, String str, Bundle bundle) {
        try {
            p pVar = (p) z.d(context.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
            if (bundle != null) {
                bundle.setClassLoader(pVar.getClass().getClassLoader());
                pVar.setArguments(bundle);
            }
            return pVar;
        } catch (InstantiationException e2) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (IllegalAccessException e4) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InvocationTargetException e5) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        I().t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        J j3 = this.mFragmentManager;
        if (j3 != null) {
            this.mPostponedHandler = j3.A0().h();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final g.d registerForActivityResult(h.a aVar, g.f fVar, g.b bVar) {
        return N(aVar, new i(fVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        A a2 = this.mHost;
        if (a2 != null) {
            a2.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().b1(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        A a2 = this.mHost;
        if (a2 != null) {
            LayoutInflater k2 = a2.k();
            T1.u.a(k2, this.mChildFragmentManager.B0());
            return k2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
