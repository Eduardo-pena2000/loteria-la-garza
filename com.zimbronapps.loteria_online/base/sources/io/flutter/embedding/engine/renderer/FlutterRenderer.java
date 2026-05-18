package io.flutter.embedding.engine.renderer;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FlutterRenderer implements TextureRegistry {
    public static boolean i = false;
    public static boolean j = false;
    public final FlutterJNI a;
    public Surface c;
    public final m h;
    public final AtomicLong b = new AtomicLong(0);
    public boolean d = false;
    public final Handler e = new Handler();
    public final Set f = new HashSet();
    public final List g = new ArrayList();

    @Keep
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_DEQUEUED_IMAGES = 2;
        private static final int MAX_IMAGES = 7;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        TextureRegistry.SurfaceProducer.a callback;
        private final long id;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        boolean notifiedDestroy = false;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque imageReaderQueue = new ArrayDeque();
        private final HashMap perImageReaders = new HashMap();
        private ArrayList lastDequeuedImage = new ArrayList();
        private b lastReaderDequeuedFrom = null;

        public class a {
            public final Image a;
            public final long b;

            public a(Image image, long j) {
                this.a = image;
                this.b = j;
            }
        }

        public class b {
            public final ImageReader a;
            public final ArrayDeque b = new ArrayDeque();
            public boolean c = false;

            public b(ImageReader imageReader) {
                this.a = imageReader;
                imageReader.setOnImageAvailableListener(new j(this), new Handler(Looper.getMainLooper()));
            }

            public static /* synthetic */ void a(b bVar, ImageReader imageReader) {
                bVar.g(imageReader);
            }

            public static /* synthetic */ ArrayDeque b(b bVar) {
                return bVar.b;
            }

            public boolean c() {
                return this.b.isEmpty() && ImageReaderSurfaceProducer.access$400(ImageReaderSurfaceProducer.this) != this;
            }

            public void d() {
                this.c = true;
                this.a.close();
                this.b.clear();
            }

            public a e() {
                if (this.b.isEmpty()) {
                    return null;
                }
                return (a) this.b.removeFirst();
            }

            public boolean f() {
                return this.b.isEmpty();
            }

            public final /* synthetic */ void g(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e) {
                    Q9.b.b("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.access$500(ImageReaderSurfaceProducer.this) || this.c) {
                    image.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                }
            }

            public a h(Image image) {
                if (this.c) {
                    return null;
                }
                a aVar = ImageReaderSurfaceProducer.this.new a(image, System.nanoTime());
                this.b.add(aVar);
                while (this.b.size() > 2) {
                    ((a) this.b.removeFirst()).a.close();
                }
                return aVar;
            }
        }

        public ImageReaderSurfaceProducer(long j) {
            this.id = j;
        }

        public static /* synthetic */ void a(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            imageReaderSurfaceProducer.lambda$dequeueImage$0();
        }

        public static /* synthetic */ b access$400(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            return imageReaderSurfaceProducer.lastReaderDequeuedFrom;
        }

        public static /* synthetic */ boolean access$500(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            return imageReaderSurfaceProducer.released;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (b bVar : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == bVar) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        bVar.d();
                    }
                    this.perImageReaders.clear();
                    if (this.lastDequeuedImage.size() > 0) {
                        Iterator it = this.lastDequeuedImage.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).a.close();
                        }
                        this.lastDequeuedImage.clear();
                    }
                    b bVar2 = this.lastReaderDequeuedFrom;
                    if (bVar2 != null) {
                        bVar2.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader29() {
            return R9.l.a(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        }

        private ImageReader createImageReader33() {
            h.a();
            ImageReader.Builder a2 = io.flutter.embedding.engine.renderer.g.a(this.requestedWidth, this.requestedHeight);
            io.flutter.embedding.engine.renderer.a.a(a2, 7);
            io.flutter.embedding.engine.renderer.b.a(a2, 34);
            io.flutter.embedding.engine.renderer.c.a(a2, 256L);
            return io.flutter.embedding.engine.renderer.d.a(a2);
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        b bVar = (b) this.imageReaderQueue.peekLast();
                        if (bVar.a.getSurface().isValid()) {
                            return bVar;
                        }
                    }
                    this.createNewReader = false;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = (b) this.perImageReaders.get(imageReader);
            if (bVar != null) {
                return bVar;
            }
            b createPerImageReader = createPerImageReader(imageReader);
            this.perImageReaders.put(imageReader, createPerImageReader);
            this.imageReaderQueue.add(createPerImageReader);
            return createPerImageReader;
        }

        private /* synthetic */ void lambda$dequeueImage$0() {
            if (this.released) {
                return;
            }
            FlutterRenderer.this.y();
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Q9.b.a("ImageReaderSurfaceProducer", "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.v(this);
            FlutterRenderer.h(FlutterRenderer.this).remove(this);
        }

        private void waitOnFence(Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
            } catch (IOException unused) {
            }
        }

        public Image acquireLatestImage() {
            a dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.a);
            return dequeueImage.a;
        }

        public ImageReader createImageReader() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                return createImageReader33();
            }
            if (i >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        public b createPerImageReader(ImageReader imageReader) {
            return new b(imageReader);
        }

        public double deltaMillis(long j) {
            return j / 1000000.0d;
        }

        public a dequeueImage() {
            a aVar;
            boolean z;
            synchronized (this.lock) {
                try {
                    Iterator it = this.imageReaderQueue.iterator();
                    aVar = null;
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        b bVar = (b) it.next();
                        a e = bVar.e();
                        if (e == null) {
                            aVar = e;
                        } else {
                            while (this.lastDequeuedImage.size() > 2) {
                                ((a) this.lastDequeuedImage.remove(0)).a.close();
                            }
                            this.lastDequeuedImage.add(e);
                            this.lastReaderDequeuedFrom = bVar;
                            aVar = e;
                        }
                    }
                    pruneImageReaderQueue();
                    Iterator it2 = this.imageReaderQueue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!((b) it2.next()).f()) {
                            z = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                FlutterRenderer.g(FlutterRenderer.this).post(new i(this));
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.g(FlutterRenderer.this).post(new f(this.id, FlutterRenderer.f(FlutterRenderer.this)));
            } finally {
                super.finalize();
            }
        }

        public Surface getForcedNewSurface() {
            this.createNewReader = true;
            return getSurface();
        }

        public int getHeight() {
            return this.requestedHeight;
        }

        public Surface getSurface() {
            return getActiveReader().a.getSurface();
        }

        public int getWidth() {
            return this.requestedWidth;
        }

        public boolean handlesCropAndRotation() {
            return false;
        }

        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i;
            synchronized (this.lock) {
                try {
                    Iterator it = this.imageReaderQueue.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i += b.b((b) it.next()).size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        public int numTrims() {
            int i;
            synchronized (this.lock) {
                i = this.numTrims;
            }
            return i;
        }

        public void onImage(ImageReader imageReader, Image image) {
            a h;
            synchronized (this.lock) {
                h = getOrCreatePerImageReader(imageReader).h(image);
            }
            if (h == null) {
                return;
            }
            FlutterRenderer.this.y();
        }

        public void onTrimMemory(int i) {
            if (i < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            cleanup();
            this.createNewReader = true;
        }

        public int pendingDequeuedImages() {
            return this.lastDequeuedImage.size();
        }

        public void pruneImageReaderQueue() {
            b bVar;
            while (this.imageReaderQueue.size() > 1 && (bVar = (b) this.imageReaderQueue.peekFirst()) != null && bVar.c()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(bVar.a);
                bVar.d();
            }
        }

        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.e(FlutterRenderer.this, this.id);
        }

        public void scheduleFrame() {
            FlutterRenderer.this.y();
        }

        public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
        }

        public void setSize(int i, int i2) {
            int max = Math.max(1, i);
            int max2 = Math.max(1, i2);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }

    @Keep
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j) {
            this.id = j;
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                Q9.b.a("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void waitOnFence(Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
            } catch (IOException unused) {
            }
        }

        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.g(FlutterRenderer.this).post(new f(this.id, FlutterRenderer.f(FlutterRenderer.this)));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        public long id() {
            return this.id;
        }

        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                Q9.b.b("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.y();
            }
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.e(FlutterRenderer.this, this.id);
        }
    }

    public class a implements m {
        public a() {
        }

        public void e() {
            FlutterRenderer.d(FlutterRenderer.this, false);
        }

        public void f() {
            FlutterRenderer.d(FlutterRenderer.this, true);
        }
    }

    public static final class b {
        public final Rect a;
        public final d b;
        public final c c;

        public b(Rect rect, d dVar, c cVar) {
            this.a = rect;
            this.b = dVar;
            this.c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);

        public final int a;

        c(int i) {
            this.a = i;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);

        public final int a;

        d(int i) {
            this.a = i;
        }
    }

    public final class e implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.b {
        public final long a;
        public final SurfaceTextureWrapper b;
        public boolean c;
        public TextureRegistry.b d;

        public e(long j, SurfaceTexture surfaceTexture) {
            this.a = j;
            this.b = new SurfaceTextureWrapper(surfaceTexture, new k(this));
            surfaceTexture().setOnFrameAvailableListener(new l(this), new Handler());
        }

        public static /* synthetic */ void a(e eVar, SurfaceTexture surfaceTexture) {
            eVar.d(surfaceTexture);
        }

        public static /* synthetic */ void b(e eVar) {
            eVar.c();
        }

        public final /* synthetic */ void c() {
        }

        public final /* synthetic */ void d(SurfaceTexture surfaceTexture) {
            if (this.c || !FlutterRenderer.f(FlutterRenderer.this).isAttached()) {
                return;
            }
            this.b.markDirty();
            FlutterRenderer.this.y();
        }

        public final void e() {
            FlutterRenderer.this.v(this);
        }

        public SurfaceTextureWrapper f() {
            return this.b;
        }

        public void finalize() {
            try {
                if (this.c) {
                    return;
                }
                FlutterRenderer.g(FlutterRenderer.this).post(new f(this.a, FlutterRenderer.f(FlutterRenderer.this)));
            } finally {
                super.finalize();
            }
        }

        public long id() {
            return this.a;
        }

        public void onTrimMemory(int i) {
            TextureRegistry.b bVar = this.d;
            if (bVar != null) {
                bVar.onTrimMemory(i);
            }
        }

        public void release() {
            if (this.c) {
                return;
            }
            Q9.b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.a + ").");
            this.b.release();
            FlutterRenderer.e(FlutterRenderer.this, this.a);
            e();
            this.c = true;
        }

        public void setOnFrameConsumedListener(TextureRegistry.a aVar) {
        }

        public void setOnTrimMemoryListener(TextureRegistry.b bVar) {
            this.d = bVar;
        }

        public SurfaceTexture surfaceTexture() {
            return this.b.surfaceTexture();
        }
    }

    public static final class f implements Runnable {
        public final long a;
        public final FlutterJNI b;

        public f(long j, FlutterJNI flutterJNI) {
            this.a = j;
            this.b = flutterJNI;
        }

        public void run() {
            if (this.b.isAttached()) {
                Q9.b.f("FlutterRenderer", "Releasing a Texture (" + this.a + ").");
                this.b.unregisterTexture(this.a);
            }
        }
    }

    public static final class g {
        public float a = 1.0f;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = -1;
        public final List u = new ArrayList();
        public final List v = new ArrayList();

        public static /* synthetic */ List a(g gVar) {
            return gVar.u;
        }

        public static /* synthetic */ List b(g gVar) {
            return gVar.v;
        }

        public void c(List list) {
            this.v.clear();
            this.v.addAll(list);
        }

        public void d(List list) {
            this.u.clear();
            this.u.addAll(list);
        }

        public boolean e() {
            int i = this.b;
            if (i == 0) {
                Q9.b.a("FlutterRenderer", "Width is zero. " + this.d + "," + this.e);
                return this.d > 0 || this.e > 0;
            }
            int i2 = this.c;
            if (i2 != 0) {
                return i > 0 && i2 > 0 && this.a > 0.0f;
            }
            Q9.b.a("FlutterRenderer", "Height is zero. " + this.f + "," + this.g);
            return this.f > 0 || this.g > 0;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.h = aVar;
        this.a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public static /* synthetic */ boolean d(FlutterRenderer flutterRenderer, boolean z) {
        flutterRenderer.d = z;
        return z;
    }

    public static /* synthetic */ void e(FlutterRenderer flutterRenderer, long j2) {
        flutterRenderer.G(j2);
    }

    public static /* synthetic */ FlutterJNI f(FlutterRenderer flutterRenderer) {
        return flutterRenderer.a;
    }

    public static /* synthetic */ Handler g(FlutterRenderer flutterRenderer) {
        return flutterRenderer.e;
    }

    public static /* synthetic */ List h(FlutterRenderer flutterRenderer) {
        return flutterRenderer.g;
    }

    public void A(g gVar) {
        if (gVar.e()) {
            Q9.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.b + " x " + gVar.c + "\nSize Constraints: " + gVar.d + "," + gVar.e + " x " + gVar.f + "," + gVar.g + "\nPadding - L: " + gVar.k + ", T: " + gVar.h + ", R: " + gVar.i + ", B: " + gVar.j + "\nInsets - L: " + gVar.o + ", T: " + gVar.l + ", R: " + gVar.m + ", B: " + gVar.n + "\nSystem Gesture Insets - L: " + gVar.s + ", T: " + gVar.p + ", R: " + gVar.q + ", B: " + gVar.q + "\nDisplay Features: " + g.a(gVar).size() + "\nDisplay Cutouts: " + g.b(gVar).size());
            int size = g.a(gVar).size() + g.b(gVar).size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i2 = 0; i2 < g.a(gVar).size(); i2++) {
                b bVar = (b) g.a(gVar).get(i2);
                F(iArr, i2 * 4, bVar.a);
                iArr2[i2] = bVar.b.a;
                iArr3[i2] = bVar.c.a;
            }
            int size2 = g.a(gVar).size() * 4;
            for (int i3 = 0; i3 < g.b(gVar).size(); i3++) {
                b bVar2 = (b) g.b(gVar).get(i3);
                F(iArr, (i3 * 4) + size2, bVar2.a);
                iArr2[g.a(gVar).size() + i3] = bVar2.b.a;
                iArr3[g.a(gVar).size() + i3] = bVar2.c.a;
            }
            this.a.setViewportMetrics(gVar.a, gVar.b, gVar.c, gVar.h, gVar.i, gVar.j, gVar.k, gVar.l, gVar.m, gVar.n, gVar.o, gVar.p, gVar.q, gVar.r, gVar.s, gVar.t, iArr, iArr2, iArr3, gVar.d, gVar.e, gVar.f, gVar.g);
        }
    }

    public void B(Surface surface, boolean z) {
        if (!z) {
            C();
        }
        this.c = surface;
        if (z) {
            this.a.onSurfaceWindowChanged(surface);
        } else {
            this.a.onSurfaceCreated(surface);
        }
    }

    public void C() {
        if (this.c != null) {
            this.a.onSurfaceDestroyed();
            if (this.d) {
                this.h.e();
            }
            this.d = false;
            this.c = null;
        }
    }

    public void D(int i2, int i3) {
        this.a.onSurfaceChanged(i2, i3);
    }

    public void E(Surface surface) {
        this.c = surface;
        this.a.onSurfaceWindowChanged(surface);
    }

    public final void F(int[] iArr, int i2, Rect rect) {
        iArr[i2] = rect.left;
        iArr[i2 + 1] = rect.top;
        iArr[i2 + 2] = rect.right;
        iArr[i2 + 3] = rect.bottom;
    }

    public final void G(long j2) {
        this.a.unregisterTexture(j2);
    }

    public TextureRegistry.SurfaceProducer a(TextureRegistry.c cVar) {
        if (i || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry c2 = c();
            p pVar = new p(c2.id(), this.e, this.a, c2);
            Q9.b.f("FlutterRenderer", "New SurfaceTextureSurfaceProducer ID: " + c2.id());
            return pVar;
        }
        long andIncrement = this.b.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        boolean z = cVar == TextureRegistry.c.b;
        q(andIncrement, imageReaderSurfaceProducer, z);
        if (z) {
            j(imageReaderSurfaceProducer);
        }
        this.g.add(imageReaderSurfaceProducer);
        Q9.b.f("FlutterRenderer", "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    public TextureRegistry.ImageTextureEntry b() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.b.getAndIncrement());
        Q9.b.f("FlutterRenderer", "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        q(imageTextureRegistryEntry.id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    public TextureRegistry.SurfaceTextureEntry c() {
        Q9.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return s(new SurfaceTexture(0));
    }

    public void i(m mVar) {
        this.a.addIsDisplayingFlutterUiListener(mVar);
        if (this.d) {
            mVar.f();
        }
    }

    public void j(TextureRegistry.b bVar) {
        l();
        this.f.add(new WeakReference(bVar));
    }

    public void k(n nVar) {
        this.a.addResizingFlutterUiListener(nVar);
    }

    public final void l() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (((TextureRegistry.b) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
    }

    public void m(ByteBuffer byteBuffer, int i2) {
        this.a.dispatchPointerDataPacket(byteBuffer, i2);
    }

    public boolean n() {
        return this.d;
    }

    public boolean o() {
        return this.a.getIsSoftwareRenderingEnabled();
    }

    public void p(int i2) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = (TextureRegistry.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.onTrimMemory(i2);
            } else {
                it.remove();
            }
        }
    }

    public final void q(long j2, TextureRegistry.ImageConsumer imageConsumer, boolean z) {
        this.a.registerImageTexture(j2, imageConsumer, z);
    }

    public final TextureRegistry.SurfaceTextureEntry r(long j2, SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        e eVar = new e(j2, surfaceTexture);
        Q9.b.f("FlutterRenderer", "New SurfaceTexture ID: " + eVar.id());
        t(eVar.id(), eVar.f());
        j(eVar);
        return eVar;
    }

    public TextureRegistry.SurfaceTextureEntry s(SurfaceTexture surfaceTexture) {
        return r(this.b.getAndIncrement(), surfaceTexture);
    }

    public final void t(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.a.registerTexture(j2, surfaceTextureWrapper);
    }

    public void u(m mVar) {
        this.a.removeIsDisplayingFlutterUiListener(mVar);
    }

    public void v(TextureRegistry.b bVar) {
        for (WeakReference weakReference : this.f) {
            if (weakReference.get() == bVar) {
                this.f.remove(weakReference);
                return;
            }
        }
    }

    public void w(n nVar) {
        this.a.removeResizingFlutterUiListener(nVar);
    }

    public void x() {
        Q9.b.f("FlutterRenderer", "restoreSurfaceProducers called; notifying SurfaceProducers");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public void y() {
        this.a.scheduleFrame();
    }

    public void z(boolean z) {
        this.a.setSemanticsEnabled(z);
    }
}
