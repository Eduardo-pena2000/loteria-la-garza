package io.flutter.embedding.engine;

import T9.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Surface;
import android.view.SurfaceControl;
import androidx.annotation.Keep;
import da.o;
import ea.d;
import io.flutter.embedding.engine.a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.embedding.engine.renderer.n;
import io.flutter.plugin.platform.N;
import io.flutter.plugin.platform.u;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import io.flutter.view.j;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private a accessibilityDelegate;
    private U9.a deferredComponentManager;
    private d localizationPlugin;
    private Long nativeShellHolderId;
    private e platformMessageHandler;
    private u platformViewsController;
    private N platformViewsController2;
    private ca.u settingsChannel;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Set flutterUiResizeListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    public interface a {
        void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);

        void e(ByteBuffer byteBuffer, String[] strArr);

        void g();

        void i(String str);
    }

    public interface b {
        void a(long j);
    }

    public static class c {
        public FlutterJNI a() {
            return new FlutterJNI();
        }
    }

    public static /* synthetic */ void a(String str) {
        lambda$loadLibrary$0(str);
    }

    private static void asyncWaitForVsync(long j) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        bVar.a(j);
    }

    public static /* synthetic */ void b(long j, int i, int i2) {
        lambda$decodeImage$1(j, i, i2);
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return V9.c.a(byteBuffer, new S9.e(j));
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        e eVar = this.platformMessageHandler;
        if (eVar != null) {
            eVar.f(i, byteBuffer);
        }
    }

    private static /* synthetic */ void lambda$decodeImage$1(long j, int i, int i2) {
        nativeImageHeaderCallback(j, i, i2);
    }

    private static /* synthetic */ void lambda$loadLibrary$0(String str) {
        Q9.b.a("FlutterJNI", str);
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i, String str, boolean z);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, String str, int i);

    private native void nativeDispatchPlatformMessage(long j, String str, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i, int i2);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j, int i);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, ByteBuffer byteBuffer, int i2);

    private native boolean nativeIsSurfaceControlEnabled(long j);

    private native void nativeLoadDartDeferredLibrary(long j, int i, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j2);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j2, long j3);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j2, WeakReference weakReference, boolean z);

    private native void nativeRegisterTexture(long j, long j2, WeakReference weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, String str, String str2, String str3, AssetManager assetManager, List list, long j2);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetSemanticsEnabled(long j, boolean z);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3, int i16, int i17, int i18, int i19);

    private native FlutterJNI nativeSpawn(long j, String str, String str2, String str3, List list, long j2);

    private native void nativeSurfaceChanged(long j, int i, int i2);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, Surface surface);

    private native void nativeUnregisterTexture(long j, long j2);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        Iterator it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            ((a.b) it.next()).a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.i(str);
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.e(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    public void addResizingFlutterUiListener(n nVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.add(nVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("");
        }
        n.e();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        List arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i += 3) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            String str3 = strArr[i + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale c2 = this.localizationPlugin.c(arrayList);
        return c2 == null ? new String[0] : new String[]{c2.getLanguage(), c2.getCountry(), c2.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar != null) {
            return uVar.K();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        N n = this.platformViewsController2;
        if (n != null) {
            return n.o();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        N n = this.platformViewsController2;
        if (n != null) {
            return n.p();
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i, String str, boolean z) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        n.q();
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        uVar.N();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        Q9.b.g("FlutterJNI", "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i, int i2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i2);
            return;
        }
        Q9.b.g("FlutterJNI", "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i2);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, j.g gVar) {
        dispatchSemanticsAction(i, gVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("");
        }
        n.D();
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f, int i) {
        ca.u uVar = this.settingsChannel;
        DisplayMetrics a2 = uVar == null ? null : uVar.a(i);
        if (a2 != null) {
            return TypedValue.applyDimension(2, f, a2) / a2.density;
        }
        Q9.b.b("FlutterJNI", "getScaledFontSize called with configurationId " + String.valueOf(i) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i, long j) {
        e eVar = this.platformMessageHandler;
        if (eVar != null) {
            eVar.h(str, byteBuffer, i, j);
        } else {
            nativeCleanupMessageData(j);
        }
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        n.v();
    }

    @SuppressLint({"NewApi"})
    public void hidePlatformView2(int i) {
        ensureRunningOnMainThread();
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to hide a platform view");
        }
        n.w(i);
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j, int i) {
        if (initCalled) {
            Q9.b.g("FlutterJNI", "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j, i);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            } else {
                Q9.b.g("FlutterJNI", "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i, ByteBuffer byteBuffer, int i2) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i2);
            } else {
                Q9.b.g("FlutterJNI", "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    public void loadDartDeferredLibrary(int i, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    public void loadLibrary(Context context) {
        if (loadLibraryCalled) {
            Q9.b.g("FlutterJNI", "FlutterJNI.loadLibrary called more than once");
        }
        r5.c.a(new S9.d()).e(context, "flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    public void maybeResizeSurfaceView(int i, int i2) {
        Iterator it = this.flutterUiResizeListeners.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(i, i2);
        }
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        uVar.h0();
    }

    public void onDisplayOverlaySurface(int i, int i2, int i3, int i4, int i5) {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        uVar.j0(i, i2, i3, i4, i5);
    }

    public void onDisplayPlatformView(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        uVar.k0(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        n.C(i, i2, i3, i4, i5, i6, i7, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        uVar.l0();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            ((m) it.next()).e();
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i2);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j2, long j3) {
        nativeOnVsync(j, j2, j3);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Q9.b.g("FlutterJNI", "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j, TextureRegistry.ImageConsumer imageConsumer, boolean z) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference(imageConsumer), z);
    }

    public void registerTexture(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void removeResizingFlutterUiListener(n nVar) {
        ensureRunningOnMainThread();
        this.flutterUiResizeListeners.remove(nVar);
    }

    public void requestDartDeferredLibrary(int i) {
        Q9.b.b("FlutterJNI", "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i);
        }
    }

    public void setAccessibilityFeaturesInNative(int i) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public void setDeferredComponentManager(U9.a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void setLocalizationPlugin(d dVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = dVar;
    }

    public void setPlatformMessageHandler(e eVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = eVar;
    }

    public void setPlatformViewsController(u uVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = uVar;
    }

    public void setPlatformViewsController2(N n) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = n;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z);
        }
    }

    public void setSemanticsEnabledInNative(boolean z) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z);
    }

    public void setSemanticsTreeEnabled(boolean z) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar == null || z) {
            return;
        }
        aVar.g();
    }

    public void setSettingsChannel(ca.u uVar) {
        ensureRunningOnMainThread();
        this.settingsChannel = uVar;
    }

    public void setViewportMetrics(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, int[] iArr3, int i16, int i17, int i18, int i19) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        Q9.b.a("FlutterJNI", "Sending viewport metrics to the engine.");
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, iArr, iArr2, iArr3, i16, i17, i18, i19);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        n.L();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List list, long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j);
        Long l = nativeSpawn.nativeShellHolderId;
        Aa.c.b((l == null || l.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        N n = this.platformViewsController2;
        if (n == null) {
            throw new RuntimeException("");
        }
        n.M();
    }

    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i, float f, float f2, float f3) {
        displayWidth = f;
        displayHeight = f2;
        displayDensity = f3;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i, j.g gVar, Object obj) {
        ByteBuffer byteBuffer;
        int i2;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = o.a.a(obj);
            i2 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        dispatchSemanticsAction(i, gVar.a, byteBuffer, i2);
    }

    public void dispatchSemanticsAction(int i, int i2, ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i2, byteBuffer, i3);
    }
}
