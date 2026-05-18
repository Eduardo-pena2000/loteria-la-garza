package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a8;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b1;
import com.applovin.impl.c8;
import com.applovin.impl.e8;
import com.applovin.impl.f1;
import com.applovin.impl.k7;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.o7;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t7;
import com.applovin.impl.u7;
import com.applovin.impl.x4;
import com.applovin.impl.y7;
import com.applovin.impl.z7;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final b1 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private boolean isViewAttached;
    private int lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.b lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private MediaPlayer mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final o7 vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set videoProgressTrackers;
    private final e videoUiEventHandler;
    private final AppLovinVideoView videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    public class a extends com.applovin.impl.b {
        public a() {
        }

        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.access$100(AppLovinVastMediaView.this))) {
                AppLovinVastMediaView.access$400(AppLovinVastMediaView.this);
            }
        }

        public void onActivityResumed(Activity activity) {
            if (!activity.equals(AppLovinVastMediaView.access$100(AppLovinVastMediaView.this)) || AppLovinVastMediaView.access$200(AppLovinVastMediaView.this)) {
                return;
            }
            AppLovinVastMediaView.access$300(AppLovinVastMediaView.this);
        }
    }

    public class b implements b1.b {
        public b() {
        }

        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.access$900(AppLovinVastMediaView.this) - (AppLovinVastMediaView.access$800(AppLovinVastMediaView.this).getDuration() - AppLovinVastMediaView.access$800(AppLovinVastMediaView.this).getCurrentPosition()));
            int access$1000 = AppLovinVastMediaView.access$1000(AppLovinVastMediaView.this);
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.access$1100(AppLovinVastMediaView.this)).iterator();
            while (it.hasNext()) {
                y7 y7Var = (y7) it.next();
                if (y7Var.a(seconds, access$1000)) {
                    hashSet.add(y7Var);
                    AppLovinVastMediaView.access$1100(AppLovinVastMediaView.this).remove(y7Var);
                }
            }
            AppLovinVastMediaView.access$1200(AppLovinVastMediaView.this, hashSet);
            if (access$1000 >= 25 && access$1000 < 50) {
                AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).getAdEventTracker().x();
                return;
            }
            if (access$1000 >= 50 && access$1000 < 75) {
                AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).getAdEventTracker().y();
            } else if (access$1000 >= 75) {
                AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).getAdEventTracker().C();
            }
        }

        public boolean b() {
            return !AppLovinVastMediaView.access$1400(AppLovinVastMediaView.this);
        }
    }

    public class c implements View.OnClickListener {
        private c() {
        }

        public void onClick(View view) {
            Uri c;
            u7 l1 = AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).l1();
            if (l1 == null || (c = l1.c()) == null) {
                return;
            }
            com.applovin.impl.sdk.o oVar = AppLovinVastMediaView.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                AppLovinVastMediaView.this.logger.a("AppLovinVastMediaView", "Industry icon clicked, opening URL: " + c);
            }
            AppLovinVastMediaView.access$2500(AppLovinVastMediaView.this, o7.d.INDUSTRY_ICON_CLICK);
            if (!AppLovinVastMediaView.this.nativeAd.isCustomTabsEnabled()) {
                k7.a(c, view.getContext(), AppLovinVastMediaView.this.sdk);
                return;
            }
            f1 z = AppLovinVastMediaView.this.sdk.z();
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            z.a(c, appLovinVastMediaView.nativeAd, appLovinVastMediaView.sdk.u0());
        }

        public /* synthetic */ c(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    public class d implements AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        public void onClick(View view, MotionEvent motionEvent) {
            Uri c0;
            AppLovinVastMediaView.access$2500(AppLovinVastMediaView.this, o7.d.VIDEO_CLICK);
            AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).getAdEventTracker().v();
            if (AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).B0() && (c0 = AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).c0()) != null) {
                com.applovin.impl.sdk.o oVar = AppLovinVastMediaView.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    AppLovinVastMediaView.this.logger.a("AppLovinVastMediaView", "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.k().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).b(motionEvent));
                AppLovinVastMediaView.this.nativeAd.handleNativeAdClick(c0, null, (!((Boolean) AppLovinVastMediaView.this.sdk.a(x4.w)).booleanValue() || AppLovinVastMediaView.access$100(AppLovinVastMediaView.this) == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.access$100(AppLovinVastMediaView.this));
            }
        }

        public /* synthetic */ d(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener {
        private e() {
        }

        public static /* synthetic */ void a(e eVar) {
            eVar.a();
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            com.applovin.impl.sdk.o oVar = AppLovinVastMediaView.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                AppLovinVastMediaView.this.logger.a("AppLovinVastMediaView", "Video completed");
            }
            AppLovinVastMediaView.access$1402(AppLovinVastMediaView.this, true);
            AppLovinVastMediaView.access$2200(AppLovinVastMediaView.this);
            if (AppLovinVastMediaView.access$2300(AppLovinVastMediaView.this) != null) {
                e8.a((View) AppLovinVastMediaView.access$2300(AppLovinVastMediaView.this), 250L, (Runnable) new o(this));
            } else {
                AppLovinVastMediaView.access$2400(AppLovinVastMediaView.this);
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            AppLovinVastMediaView.access$2100(AppLovinVastMediaView.this, "Video view error (" + i + "," + i2 + ")");
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i != 3) {
                return false;
            }
            AppLovinVastMediaView.access$1900(AppLovinVastMediaView.this).b();
            if (AppLovinVastMediaView.access$1800(AppLovinVastMediaView.this)) {
                return false;
            }
            AppLovinVastMediaView.access$2000(AppLovinVastMediaView.this);
            return false;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinVastMediaView.access$1502(AppLovinVastMediaView.this, mediaPlayer);
            AppLovinVastMediaView.access$1500(AppLovinVastMediaView.this).setOnInfoListener(AppLovinVastMediaView.access$1600(AppLovinVastMediaView.this));
            AppLovinVastMediaView.access$1500(AppLovinVastMediaView.this).setOnErrorListener(AppLovinVastMediaView.access$1600(AppLovinVastMediaView.this));
            float f = !AppLovinVastMediaView.access$1700(AppLovinVastMediaView.this) ? 1 : 0;
            AppLovinVastMediaView.access$1500(AppLovinVastMediaView.this).setVolume(f, f);
            AppLovinVastMediaView.access$902(AppLovinVastMediaView.this, AppLovinVastMediaView.access$1500(r4).getDuration());
            AppLovinVastMediaView.access$1300(AppLovinVastMediaView.this).getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.access$900(AppLovinVastMediaView.this)), n7.e(AppLovinVastMediaView.this.sdk));
            com.applovin.impl.sdk.o oVar = AppLovinVastMediaView.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                AppLovinVastMediaView.this.logger.a("AppLovinVastMediaView", "MediaPlayer prepared: " + AppLovinVastMediaView.access$1500(AppLovinVastMediaView.this));
            }
            if (AppLovinVastMediaView.access$1800(AppLovinVastMediaView.this)) {
                AppLovinVastMediaView.access$800(AppLovinVastMediaView.this).start();
            }
        }

        public /* synthetic */ e(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }

        private /* synthetic */ void a() {
            AppLovinVastMediaView.access$800(AppLovinVastMediaView.this).seekTo(0);
        }
    }

    public class f implements View.OnClickListener {
        private f() {
        }

        public static /* synthetic */ void a(f fVar) {
            fVar.a();
        }

        public void onClick(View view) {
            if (view == AppLovinVastMediaView.access$2600(AppLovinVastMediaView.this)) {
                if (AppLovinVastMediaView.access$800(AppLovinVastMediaView.this).isPlaying()) {
                    AppLovinVastMediaView.access$202(AppLovinVastMediaView.this, true);
                    AppLovinVastMediaView.access$400(AppLovinVastMediaView.this);
                    return;
                } else {
                    AppLovinVastMediaView.access$202(AppLovinVastMediaView.this, false);
                    AppLovinVastMediaView.access$300(AppLovinVastMediaView.this);
                    return;
                }
            }
            if (view != AppLovinVastMediaView.access$2700(AppLovinVastMediaView.this)) {
                if (view == AppLovinVastMediaView.access$2300(AppLovinVastMediaView.this)) {
                    e8.b((View) AppLovinVastMediaView.access$2300(AppLovinVastMediaView.this), 250L, (Runnable) new p(this));
                }
            } else {
                if (AppLovinVastMediaView.access$1500(AppLovinVastMediaView.this) == null) {
                    return;
                }
                try {
                    AppLovinVastMediaView.access$1702(AppLovinVastMediaView.this, !AppLovinVastMediaView.access$1700(r4));
                    float f = !AppLovinVastMediaView.access$1700(AppLovinVastMediaView.this) ? 1 : 0;
                    AppLovinVastMediaView.access$1500(AppLovinVastMediaView.this).setVolume(f, f);
                    AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                    AppLovinVastMediaView.access$2800(appLovinVastMediaView, AppLovinVastMediaView.access$1700(appLovinVastMediaView));
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ f(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }

        private /* synthetic */ void a() {
            AppLovinVastMediaView.access$1402(AppLovinVastMediaView.this, false);
            AppLovinVastMediaView.access$2900(AppLovinVastMediaView.this).set(false);
            AppLovinVastMediaView.this.sdk.e().a(AppLovinVastMediaView.access$3000(AppLovinVastMediaView.this));
            AppLovinVastMediaView.access$300(AppLovinVastMediaView.this);
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, Context context) {
        super(appLovinNativeAdImpl, kVar, context);
        e eVar = new e(this, null);
        this.videoUiEventHandler = eVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new b1(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new a();
        o7 vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean C0 = vastAd.C0();
        this.isVideoStream = C0;
        if (C0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.r1()) {
            this.industryIconImageView = u7.a(vastAd.l1().e(), context, kVar);
            int dpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.W4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) kVar.a(x4.Y4)).intValue()));
            this.industryIconImageView.setOnClickListener(new c(this, null));
            addView(this.industryIconImageView);
        }
        if (((Boolean) kVar.a(x4.d5)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            int i = 0;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) kVar.a(x4.c5)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            f fVar = new f(this, null);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int dpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.a5)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2, dpToPx2));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                i = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.Z4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            }
            int dpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.b5)).intValue());
            this.videoWidgetLinearLayout.setPadding(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
            int i2 = dpToPx3 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2 + i + i2, Math.max(dpToPx2, i) + i2, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) kVar.a(x4.e5)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(-16777216);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new f(this, null));
            ImageView imageView2 = new ImageView(getContext());
            int dpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.f5)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(dpToPx4, dpToPx4, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(getContext());
        this.videoView = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.f0, getContext(), new d(this, null)));
        addView(appLovinVideoView);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(appLovinVideoView);
        hashSet.addAll(vastAd.a(o7.d.VIDEO, z7.a));
    }

    public static /* synthetic */ Activity access$100(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.viewActivity;
    }

    public static /* synthetic */ int access$1000(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.getVideoPercentViewed();
    }

    public static /* synthetic */ Set access$1100(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.videoProgressTrackers;
    }

    public static /* synthetic */ void access$1200(AppLovinVastMediaView appLovinVastMediaView, Set set) {
        appLovinVastMediaView.maybeFireTrackers(set);
    }

    public static /* synthetic */ o7 access$1300(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.vastAd;
    }

    public static /* synthetic */ boolean access$1400(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.videoWasCompleted;
    }

    public static /* synthetic */ boolean access$1402(AppLovinVastMediaView appLovinVastMediaView, boolean z) {
        appLovinVastMediaView.videoWasCompleted = z;
        return z;
    }

    public static /* synthetic */ MediaPlayer access$1500(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.mediaPlayer;
    }

    public static /* synthetic */ MediaPlayer access$1502(AppLovinVastMediaView appLovinVastMediaView, MediaPlayer mediaPlayer) {
        appLovinVastMediaView.mediaPlayer = mediaPlayer;
        return mediaPlayer;
    }

    public static /* synthetic */ e access$1600(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.videoUiEventHandler;
    }

    public static /* synthetic */ boolean access$1700(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.isVideoMuted;
    }

    public static /* synthetic */ boolean access$1702(AppLovinVastMediaView appLovinVastMediaView, boolean z) {
        appLovinVastMediaView.isVideoMuted = z;
        return z;
    }

    public static /* synthetic */ boolean access$1800(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.isViewAttached;
    }

    public static /* synthetic */ b1 access$1900(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.countdownManager;
    }

    public static /* synthetic */ boolean access$200(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.isVideoPausedByUser;
    }

    public static /* synthetic */ void access$2000(AppLovinVastMediaView appLovinVastMediaView) {
        appLovinVastMediaView.pauseVideo();
    }

    public static /* synthetic */ boolean access$202(AppLovinVastMediaView appLovinVastMediaView, boolean z) {
        appLovinVastMediaView.isVideoPausedByUser = z;
        return z;
    }

    public static /* synthetic */ void access$2100(AppLovinVastMediaView appLovinVastMediaView, String str) {
        appLovinVastMediaView.handleMediaError(str);
    }

    public static /* synthetic */ void access$2200(AppLovinVastMediaView appLovinVastMediaView) {
        appLovinVastMediaView.finishVideo();
    }

    public static /* synthetic */ FrameLayout access$2300(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.replayIconContainer;
    }

    public static /* synthetic */ void access$2400(AppLovinVastMediaView appLovinVastMediaView) {
        appLovinVastMediaView.showMediaImageView();
    }

    public static /* synthetic */ void access$2500(AppLovinVastMediaView appLovinVastMediaView, o7.d dVar) {
        appLovinVastMediaView.maybeFireTrackers(dVar);
    }

    public static /* synthetic */ ImageView access$2600(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.playPauseButtonImageView;
    }

    public static /* synthetic */ ImageView access$2700(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.muteButtonImageView;
    }

    public static /* synthetic */ boolean access$2800(AppLovinVastMediaView appLovinVastMediaView, boolean z) {
        return appLovinVastMediaView.populateMuteImage(z);
    }

    public static /* synthetic */ AtomicBoolean access$2900(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.automaticResumeHandled;
    }

    public static /* synthetic */ void access$300(AppLovinVastMediaView appLovinVastMediaView) {
        appLovinVastMediaView.maybeHandleResume();
    }

    public static /* synthetic */ com.applovin.impl.b access$3000(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.lifecycleCallbacksAdapter;
    }

    public static /* synthetic */ void access$400(AppLovinVastMediaView appLovinVastMediaView) {
        appLovinVastMediaView.maybeHandlePause();
    }

    public static /* synthetic */ AppLovinVideoView access$800(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.videoView;
    }

    public static /* synthetic */ long access$900(AppLovinVastMediaView appLovinVastMediaView) {
        return appLovinVastMediaView.videoDurationMillis;
    }

    public static /* synthetic */ long access$902(AppLovinVastMediaView appLovinVastMediaView, long j) {
        appLovinVastMediaView.videoDurationMillis = j;
        return j;
    }

    private void areCachedAdResourcesMissing(boolean z) {
        if (n7.a(z, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    private void finishVideo() {
        maybeFireTrackers(o7.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.k().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    private int getVideoPercentViewed() {
        int currentPosition = this.videoView.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    private void handleMediaError(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.b("AppLovinVastMediaView", str);
        }
        maybeFireTrackers(o7.d.ERROR, t7.n);
        this.vastAd.getAdEventTracker().b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            this.sdk.D().a("handleVastVideoError", str, this.vastAd);
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.b("AppLovinVastMediaView", "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.f0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.k("AppLovinVastMediaView", "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    private void maybeFireTrackers(Set set) {
        maybeFireTrackers(set, t7.b);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.r1()) {
                maybeFireTrackers(o7.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(o7.d.IMPRESSION);
            maybeFireTrackers(o7.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().g();
            this.vastAd.setHasShown(true);
            this.sdk.k().trackImpression(this.vastAd);
            this.viewActivity = com.applovin.impl.d.a(e8.b((View) this));
            this.sdk.e().a(this.lifecycleCallbacksAdapter);
            this.videoView.start();
            this.countdownManager.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new b());
        }
    }

    private void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(o7.d.VIDEO, "pause");
            this.vastAd.getAdEventTracker().z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    private void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(o7.d.VIDEO, "resume");
            this.vastAd.getAdEventTracker().A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a("AppLovinVastMediaView", "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.videoView.start();
                this.countdownManager.b();
                this.lastVideoPositionFromPauseMillis = -1;
            } else if (com.applovin.impl.sdk.o.a()) {
                this.logger.a("AppLovinVastMediaView", "Invalid last video position");
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    private void pauseVideo() {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a("AppLovinVastMediaView", "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.videoView.getCurrentPosition();
        this.videoView.pause();
        this.countdownManager.c();
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a("AppLovinVastMediaView", "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    private boolean populateMuteImage(boolean z) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (o0.d()) {
            AnimatedVectorDrawable drawable = getContext().getDrawable(z ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (drawable != null) {
                this.muteButtonImageView.setImageDrawable(drawable);
                drawable.start();
                return true;
            }
        }
        Uri G = z ? this.vastAd.G() : this.vastAd.Y();
        if (G == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, G, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        areCachedAdResourcesMissing(!this.isVideoStream);
        this.videoView.setVideoURI(this.vastAd.l0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener((View.OnClickListener) null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener((View.OnClickListener) null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener((View.OnClickListener) null);
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
            this.videoView.stopPlayback();
        }
        this.videoView.setOnTouchListener((View.OnTouchListener) null);
        this.viewActivity = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages((Object) null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    public String getCommunicatorId() {
        return "AppLovinVastMediaView";
    }

    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        this.isViewAttached = true;
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.isViewAttached = false;
        maybeHandlePause();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !r0.a(i)) || this.videoWasCompleted || this.videoView.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    private void maybeFireTrackers(o7.d dVar) {
        maybeFireTrackers(dVar, t7.b);
    }

    private void maybeFireTrackers(o7.d dVar, String str) {
        maybeFireTrackers(dVar, str, t7.b);
    }

    private void maybeFireTrackers(o7.d dVar, t7 t7Var) {
        maybeFireTrackers(dVar, "", t7Var);
    }

    private void maybeFireTrackers(o7.d dVar, String str, t7 t7Var) {
        maybeFireTrackers(this.vastAd.a(dVar, str), t7Var);
    }

    private void maybeFireTrackers(Set set, t7 t7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        c8 q1 = this.vastAd.q1();
        Uri d2 = q1 != null ? q1.d() : null;
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a("AppLovinVastMediaView", "Firing " + set.size() + " tracker(s): " + set);
        }
        a8.a(set, seconds, d2, t7Var, this.sdk);
    }
}
