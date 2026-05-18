package I;

import android.view.Choreographer;
import android.view.View;
import b0.v1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements S, v1, Runnable, Choreographer.FrameCallback {
    public static final a g = new a(null);
    public static final int h = 8;
    public static long i;
    public final View a;
    public boolean c;
    public boolean e;
    public long f;
    public final d0.c b = new d0.c(new P[16], 0);
    public final Choreographer d = Choreographer.getInstance();

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, View view) {
            aVar.b(view);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = I.a.b()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                I.a.d(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I.a.a.b(android.view.View):void");
        }

        public a() {
        }
    }

    public static final class b implements Q {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public long a() {
            return Math.max(0L, this.a - System.nanoTime());
        }
    }

    public a(View view) {
        this.a = view;
        a.a(g, view);
    }

    public static final /* synthetic */ long b() {
        return i;
    }

    public static final /* synthetic */ void d(long j) {
        i = j;
    }

    public void a(P p) {
        this.b.b(p);
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this);
    }

    public void c() {
        this.e = true;
    }

    public void doFrame(long j) {
        if (this.e) {
            this.f = j;
            this.a.post(this);
        }
    }

    public void g() {
        this.e = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    public void run() {
        if (this.b.o() || !this.c || !this.e || this.a.getWindowVisibility() != 0) {
            this.c = false;
            return;
        }
        b bVar = new b(this.f + i);
        boolean z = false;
        while (this.b.p() && !z) {
            if (bVar.a() <= 0 || ((P) this.b.l()[0]).b(bVar)) {
                z = true;
            } else {
                this.b.u(0);
            }
        }
        if (z) {
            this.d.postFrameCallback(this);
        } else {
            this.c = false;
        }
    }

    public void e() {
    }
}
