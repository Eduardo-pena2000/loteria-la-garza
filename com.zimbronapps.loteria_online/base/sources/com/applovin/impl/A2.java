package com.applovin.impl;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b1;
import com.applovin.impl.d6;
import com.applovin.impl.m8;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a2 extends w1 implements AppLovinCommunicatorSubscriber {
    private final b2 M;
    private MediaPlayer N;
    private final View O;
    protected final AppLovinVideoView P;
    protected final com.applovin.impl.a Q;
    protected final com.applovin.impl.adview.g R;
    protected i0 S;
    protected final ImageView T;
    protected com.applovin.impl.adview.l U;
    protected final ProgressBar V;
    protected ProgressBar W;
    protected ImageView X;
    private final e Y;
    private final d Z;
    private final Handler a0;
    private final Handler b0;
    protected final b1 c0;
    protected final b1 d0;
    private final boolean e0;
    protected boolean f0;
    protected long g0;
    private int h0;
    private int i0;
    protected boolean j0;
    private boolean k0;
    private final AtomicBoolean l0;
    private final AtomicBoolean m0;
    private long n0;
    private long o0;

    public class a implements b1.b {
        final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public void a() {
            if (a2.this.S != null) {
                long seconds = this.a - TimeUnit.MILLISECONDS.toSeconds(r0.P.getCurrentPosition());
                if (seconds <= 0) {
                    a2.this.v = true;
                } else if (a2.this.Q()) {
                    a2.this.S.setProgress((int) seconds);
                }
            }
        }

        public boolean b() {
            return a2.this.Q();
        }
    }

    public class b implements b1.b {
        final /* synthetic */ Integer a;

        public b(Integer num) {
            this.a = num;
        }

        public void a() {
            a2 a2Var = a2.this;
            if (a2Var.j0) {
                a2Var.V.setVisibility(8);
            } else {
                a2.this.V.setProgress((int) ((a2Var.P.getCurrentPosition() / a2.this.g0) * this.a.intValue()));
            }
        }

        public boolean b() {
            return !a2.this.j0;
        }
    }

    public class c implements b1.b {
        final /* synthetic */ long a;
        final /* synthetic */ Integer b;
        final /* synthetic */ Long c;

        public c(long j, Integer num, Long l) {
            this.a = j;
            this.b = num;
            this.c = l;
        }

        public void a() {
            a2.this.W.setProgress((int) ((a2.this.r / this.a) * this.b.intValue()));
            a2.this.r += this.c.longValue();
        }

        public boolean b() {
            return a2.this.r < this.a;
        }
    }

    public class d implements m8.a {
        private d() {
        }

        public void a(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            a2.this.a("video_button");
        }

        public void b(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            a2.this.a(lVar.getAndClearLastClickEvent());
        }

        public void c(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            a2.this.J = true;
        }

        public void d(com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            a2.this.T();
        }

        public /* synthetic */ d(a2 a2Var, a aVar) {
            this();
        }

        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            k7.a(uri, a2.this.b().getController(), a2.this.b);
        }

        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            k7.c(uri, a2.this.b().getController().g(), a2.this.b);
        }
    }

    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        public void onClick(View view, MotionEvent motionEvent) {
            a2.this.a(motionEvent);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "Video completed");
            }
            a2.a(a2.this, true);
            a2 a2Var = a2.this;
            if (!a2Var.t) {
                a2Var.S();
            } else if (a2Var.h()) {
                a2.this.A();
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            a2.this.g("Video view error (" + i + "," + i2 + ")");
            a2.this.P.start();
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                a2.this.R();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                a2.this.E();
                return false;
            }
            a2.this.c0.b();
            a2 a2Var = a2.this;
            if (a2Var.R != null) {
                a2.c(a2Var);
            }
            a2.this.E();
            return false;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            a2.a(a2.this, mediaPlayer);
            mediaPlayer.setOnInfoListener(a2.b(a2.this));
            mediaPlayer.setOnErrorListener(a2.b(a2.this));
            float f = !a2.this.f0 ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            a2.this.u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            a2.this.d(mediaPlayer.getDuration());
            a2.this.O();
            com.applovin.impl.sdk.o oVar = a2.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + a2.a(a2.this));
            }
        }

        public /* synthetic */ e(a2 a2Var, a aVar) {
            this();
        }
    }

    public class f implements View.OnClickListener {
        private f() {
        }

        public void onClick(View view) {
            a2 a2Var = a2.this;
            if (view == a2Var.R) {
                a2Var.T();
                return;
            }
            if (view == a2Var.T) {
                a2Var.U();
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                a2.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(a2 a2Var, a aVar) {
            this();
        }
    }

    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new b2(this.a, this.d, this.b);
        this.X = null;
        e eVar = new e(this, null);
        this.Y = eVar;
        d dVar = new d(this, null);
        this.Z = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.a0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.b0 = handler2;
        b1 b1Var = new b1(handler, this.b);
        this.c0 = b1Var;
        this.d0 = new b1(handler2, this.b);
        boolean C0 = this.a.C0();
        this.e0 = C0;
        this.f0 = n7.e(this.b);
        this.i0 = -1;
        this.l0 = new AtomicBoolean();
        this.m0 = new AtomicBoolean();
        this.n0 = -2L;
        this.o0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        bVar.h().putString("video_view_address", e8.a((View) appLovinVideoView));
        View view = new View(activity);
        this.O = view;
        boolean z = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) kVar.a(x4.m1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.e0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.e0, activity, eVar));
            view.setOnTouchListener(new I());
        }
        f fVar = new f(this, null);
        if (bVar.d0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.U(), activity);
            this.R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.R = null;
        }
        if (a(this.f0, kVar)) {
            ImageView imageView = new ImageView(activity);
            this.T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            e(this.f0);
        } else {
            this.T = null;
        }
        String a0 = bVar.a0();
        if (StringUtils.isValidString(a0)) {
            m8 m8Var = new m8(kVar);
            m8Var.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.Z(), bVar, m8Var, activity);
            this.U = lVar;
            lVar.a(a0);
        } else {
            this.U = null;
        }
        if (C0) {
            com.applovin.impl.a aVar = new com.applovin.impl.a(activity, ((Integer) kVar.a(x4.k2)).intValue(), 16842874);
            this.Q = aVar;
            aVar.setColor(Color.parseColor("#75FFFFFF"));
            aVar.setBackgroundColor(Color.parseColor("#00000000"));
            aVar.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.Q = null;
        }
        int c2 = c();
        if (((Boolean) kVar.a(x4.U1)).booleanValue() && c2 > 0) {
            z = true;
        }
        if (this.S == null && z) {
            this.S = new i0(activity);
            int s = bVar.s();
            this.S.setTextColor(s);
            this.S.setTextSize(((Integer) kVar.a(x4.T1)).intValue());
            this.S.setFinishedStrokeColor(s);
            this.S.setFinishedStrokeWidth(((Integer) kVar.a(x4.S1)).intValue());
            this.S.setMax(c2);
            this.S.setProgress(c2);
            b1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(c2));
        }
        if (!bVar.k0()) {
            this.V = null;
            return;
        }
        Long l = (Long) kVar.a(x4.h2);
        Integer num = (Integer) kVar.a(x4.i2);
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
        this.V = progressBar;
        a(progressBar, bVar.j0(), num.intValue());
        b1Var.a("PROGRESS_BAR", l.longValue(), new b(num));
    }

    public static /* synthetic */ void C(a2 a2Var) {
        a2Var.K();
    }

    public static /* synthetic */ void D(a2 a2Var, String str) {
        a2Var.h(str);
    }

    public static /* synthetic */ void E(a2 a2Var) {
        a2Var.N();
    }

    public static /* synthetic */ void F(a2 a2Var) {
        a2Var.H();
    }

    public static /* synthetic */ void G(a2 a2Var) {
        a2Var.L();
    }

    public static /* synthetic */ void H(a2 a2Var, boolean z, long j) {
        a2Var.b(z, j);
    }

    public static /* synthetic */ void I(a2 a2Var) {
        a2Var.P();
    }

    public static /* synthetic */ void J(a2 a2Var) {
        a2Var.I();
    }

    public static /* synthetic */ boolean K(View view, MotionEvent motionEvent) {
        return a(view, motionEvent);
    }

    public static /* synthetic */ void L(a2 a2Var) {
        a2Var.J();
    }

    private void M() {
        com.applovin.impl.adview.l lVar;
        d8 b0 = this.a.b0();
        if (b0 == null || !b0.j() || this.j0 || (lVar = this.U) == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new C(this, lVar.getVisibility() == 4, b0.h()));
    }

    private void N() {
        if (this.j0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.i0 < 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.i0 + "ms for MediaPlayer: " + this.N);
        }
        this.P.seekTo(this.i0);
        this.P.start();
        this.c0.b();
        this.i0 = -1;
        a(new B(this), 250L);
    }

    private void P() {
        if (this.m0.compareAndSet(false, true)) {
            a(this.R, this.a.d0(), new F(this));
        }
    }

    private static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static /* synthetic */ e b(a2 a2Var) {
        return a2Var.Y;
    }

    public static /* synthetic */ void c(a2 a2Var) {
        a2Var.P();
    }

    private void e(boolean z) {
        if (o0.d()) {
            AnimatedVectorDrawable drawable = this.d.getDrawable(z ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (drawable != null) {
                this.T.setScaleType(ImageView.ScaleType.FIT_XY);
                this.T.setImageDrawable(drawable);
                drawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.T, z ? this.a.G() : this.a.Y(), this.b);
    }

    private void f(boolean z) {
        this.h0 = C();
        if (z) {
            this.P.pause();
        } else {
            this.P.stopPlayback();
        }
    }

    private /* synthetic */ void h(String str) {
        o8.a(this.U, str, "AppLovinFullscreenActivity", this.b);
    }

    public void A() {
        this.M.a(this.l);
        this.q = SystemClock.elapsedRealtime();
    }

    public void O() {
        long P;
        long millis;
        if (this.a.O() >= 0 || this.a.P() >= 0) {
            if (this.a.O() >= 0) {
                P = this.a.O();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.a;
                long j = this.g0;
                long j2 = j > 0 ? j : 0L;
                if (aVar.W0()) {
                    int h1 = (int) ((com.applovin.impl.sdk.ad.a) this.a).h1();
                    if (h1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(h1);
                    } else {
                        int r = (int) aVar.r();
                        if (r > 0) {
                            millis = TimeUnit.SECONDS.toMillis(r);
                        }
                    }
                    j2 += millis;
                }
                P = (long) (j2 * (this.a.P() / 100.0d));
            }
            c(P);
        }
    }

    public boolean Q() {
        return (this.v || this.j0 || !this.P.isPlaying()) ? false : true;
    }

    public void R() {
        AppLovinSdkUtils.runOnUiThread(new L(this));
    }

    public void S() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.a.d1());
        long M = this.a.M();
        if (M > 0) {
            this.r = 0L;
            Long l = (Long) this.b.a(x4.p2);
            Integer num = (Integer) this.b.a(x4.s2);
            ProgressBar progressBar = new ProgressBar(this.d, (AttributeSet) null, 16842872);
            this.W = progressBar;
            a(progressBar, this.a.L(), num.intValue());
            this.d0.a("POSTITIAL_PROGRESS_BAR", l.longValue(), new c(M, num, l));
            this.d0.b();
        }
        this.M.a(this.k, this.j, b(), this.W);
        a("javascript:al_onPoststitialShow(" + this.y + "," + this.z + ");", this.a.x());
        if (this.k != null) {
            if (this.a.r() >= 0) {
                a(this.k, this.a.r(), new G(this));
            } else {
                this.k.setVisibility(0);
            }
        }
        List arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.a.getAdEventTracker().b((View) b(), arrayList);
        p();
        this.j0 = true;
    }

    public void T() {
        this.n0 = SystemClock.elapsedRealtime() - this.o0;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.n0 + "ms");
        }
        D();
    }

    public void U() {
        MediaPlayer mediaPlayer = this.N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f2 = this.f0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f2, f2);
            boolean z = !this.f0;
            this.f0 = z;
            e(z);
            a(this.f0, 0L);
        } catch (Throwable unused) {
        }
    }

    public void d(long j) {
        this.g0 = j;
    }

    public void g(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.a);
        }
        if (this.l0.compareAndSet(false, true)) {
            if (((Boolean) this.b.a(x4.O0)).booleanValue()) {
                this.b.G().d(this.a, com.applovin.impl.sdk.k.o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
            if (appLovinAdDisplayListener instanceof l2) {
                ((l2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.a instanceof o7 ? "handleVastVideoError" : "handleVideoError";
            this.b.D().a(str2, str, this.a);
            Map hashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            this.b.g().a(d2.F, this.a, hashMap);
            a("media_error");
        }
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    public void m() {
        super.a(C(), this.e0, F(), this.n0);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.a.getAdIdNumber() && this.e0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !r0.a(i)) || this.k0 || this.P.isPlaying()) {
                    return;
                }
                g("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    public void r() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.b.a(x4.v6)).booleanValue()) {
                o8.b(this.U);
                this.U = null;
            }
            if (this.e0) {
                AppLovinCommunicator.getInstance(this.d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.r();
    }

    public void v() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.i0 = this.P.getCurrentPosition();
        this.P.pause();
        this.c0.c();
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Paused video at position " + this.i0 + "ms");
        }
    }

    public void w() {
        a((ViewGroup) null);
    }

    private /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.b();
        }
    }

    private /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
            com.applovin.impl.a aVar2 = this.Q;
            Objects.requireNonNull(aVar2);
            a(new K(aVar2), 2000L);
        }
    }

    private /* synthetic */ void J() {
        this.n0 = -1L;
        this.o0 = SystemClock.elapsedRealtime();
    }

    private /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    private /* synthetic */ void L() {
        this.q = SystemClock.elapsedRealtime();
    }

    public static /* synthetic */ MediaPlayer a(a2 a2Var) {
        return a2Var.N;
    }

    public int C() {
        long currentPosition = this.P.getCurrentPosition();
        if (this.k0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.g0) * 100.0f) : this.h0;
    }

    public void D() {
        this.y++;
        if (this.a.u()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            S();
        }
    }

    public void E() {
        AppLovinSdkUtils.runOnUiThread(new D(this));
    }

    public boolean F() {
        if (this.J && this.a.a1()) {
            return true;
        }
        return G();
    }

    public boolean G() {
        return C() >= this.a.f0();
    }

    public void b(boolean z) {
        super.b(z);
        if (z) {
            b(0L);
            if (this.j0) {
                this.d0.b();
                return;
            }
            return;
        }
        if (this.j0) {
            this.d0.c();
        } else {
            v();
        }
    }

    public static /* synthetic */ MediaPlayer a(a2 a2Var, MediaPlayer mediaPlayer) {
        a2Var.N = mediaPlayer;
        return mediaPlayer;
    }

    public static /* synthetic */ boolean a(a2 a2Var, boolean z) {
        a2Var.k0 = z;
        return z;
    }

    public void f() {
        super.f();
        this.M.a((View) this.U);
        this.M.a((View) this.R);
        if (!h() || this.j0) {
            A();
        }
    }

    public void a(ViewGroup viewGroup) {
        String str;
        this.M.a(this.T, this.R, this.U, this.Q, this.V, this.S, this.P, this.O, b(), this.j, this.X, viewGroup);
        if (o0.g() && (str = (String) this.b.n0().getExtraParameters().get("audio_focus_request")) != null) {
            A.a(this.P, Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.b.a(x4.X5)).booleanValue() || !a(!this.e0)) {
            this.P.setVideoURI(this.a.l0());
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.j;
            if (kVar != null) {
                kVar.b();
            }
            this.P.start();
            if (this.e0) {
                R();
            }
            b().renderAd(this.a);
            if (this.R != null) {
                this.b.q0().a(new r6(this.b, "scheduleSkipButton", new H(this)), d6.b.d, this.a.e0(), true);
            }
            super.c(this.f0);
        }
    }

    private /* synthetic */ void b(boolean z, long j) {
        if (z) {
            e8.a((View) this.U, j, (Runnable) null);
        } else {
            e8.b((View) this.U, j, (Runnable) null);
        }
    }

    public void e() {
        super.e();
        A();
    }

    public void b(long j) {
        a(new J(this), j);
    }

    public void a(String str, long j) {
        super.a(str, j);
        if (this.U == null || j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new E(this, str), j);
    }

    private void a(ProgressBar progressBar, int i, int i2) {
        progressBar.setMax(i2);
        progressBar.setPadding(0, 0, 0, 0);
        if (o0.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i));
        }
    }

    public void a(String str) {
        this.c0.a();
        this.d0.a();
        this.a0.removeCallbacksAndMessages((Object) null);
        this.b0.removeCallbacksAndMessages((Object) null);
        if (!((Boolean) this.b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    public void a(MotionEvent motionEvent) {
        Activity context;
        if (this.a.B0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri c0 = this.a.c0();
            if (c0 != null) {
                if (!((Boolean) this.b.a(x4.w)).booleanValue() || (context = this.d) == null) {
                    context = b() != null ? b().getContext() : com.applovin.impl.sdk.k.o();
                }
                this.b.k().trackAndLaunchVideoClick(this.a, c0, motionEvent, this, context);
                t2.a(this.E, this.a);
                this.z++;
                return;
            }
            return;
        }
        M();
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.k kVar) {
        if (!((Boolean) kVar.a(x4.Z1)).booleanValue()) {
            return false;
        }
        if (!((Boolean) kVar.a(x4.a2)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) kVar.a(x4.c2)).booleanValue();
    }
}
