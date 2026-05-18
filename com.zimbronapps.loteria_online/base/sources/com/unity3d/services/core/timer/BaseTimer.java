package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.lifecycle.IAppActiveListener;
import com.unity3d.services.core.lifecycle.LifecycleCache;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BaseTimer implements IBaseTimer {
    final Integer _delayMs;
    private final AtomicBoolean _hasPaused;
    private final AtomicBoolean _isRunning;
    private final LifecycleCache _lifecycleCache;
    Integer _remainingDurationMs;
    private ScheduledFuture _task;
    private ITimerListener _timerListener;
    private ScheduledExecutorService _timerService;
    final Integer _totalDurationMs;

    public class 1 implements IAppActiveListener {
        public 1() {
        }

        public void onAppStateChanged(boolean z) {
            if (z) {
                if (BaseTimer.access$000(BaseTimer.this).get()) {
                    BaseTimer.access$000(BaseTimer.this).getAndSet(false);
                    BaseTimer.this.resume();
                    return;
                }
                return;
            }
            if (BaseTimer.this.isRunning()) {
                BaseTimer.this.pause();
                BaseTimer.access$000(BaseTimer.this).getAndSet(true);
            }
        }
    }

    public class 2 implements Runnable {
        public 2() {
        }

        public void run() {
            BaseTimer baseTimer = BaseTimer.this;
            baseTimer._remainingDurationMs = Integer.valueOf(baseTimer._remainingDurationMs.intValue() - BaseTimer.this._delayMs.intValue());
            BaseTimer.this.onStep();
        }
    }

    public BaseTimer(Integer num, ITimerListener iTimerListener, LifecycleCache lifecycleCache) {
        this._delayMs = 1000;
        this._isRunning = new AtomicBoolean(false);
        this._hasPaused = new AtomicBoolean(false);
        this._totalDurationMs = num;
        this._remainingDurationMs = num;
        this._timerListener = iTimerListener;
        this._lifecycleCache = lifecycleCache;
        addLifecycleListener();
    }

    public static /* synthetic */ AtomicBoolean access$000(BaseTimer baseTimer) {
        return baseTimer._hasPaused;
    }

    private void addLifecycleListener() {
        LifecycleCache lifecycleCache = this._lifecycleCache;
        if (lifecycleCache == null) {
            return;
        }
        lifecycleCache.addActiveListener(new 1());
    }

    private void notifyListeners() {
        ITimerListener iTimerListener = this._timerListener;
        if (iTimerListener != null) {
            iTimerListener.onTimerFinished();
        }
    }

    private void schedule() {
        try {
            this._task = this._timerService.scheduleAtFixedRate(new 2(), this._delayMs.intValue(), this._delayMs.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | RejectedExecutionException | IllegalStateException | NullPointerException e) {
            DeviceLog.debug("ERROR: IntervalTimer failed to start due to exception " + e.getLocalizedMessage());
        }
    }

    public boolean isRunning() {
        return this._isRunning.get();
    }

    public void kill() {
        stop();
        this._timerListener = null;
    }

    public void onStep() {
        if (this._remainingDurationMs.intValue() <= 0) {
            notifyListeners();
            kill();
        }
    }

    public boolean pause() {
        boolean z;
        ScheduledFuture scheduledFuture = this._task;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z = false;
        } else {
            z = true;
            this._task.cancel(true);
            this._task = null;
        }
        this._isRunning.getAndSet(false);
        return z;
    }

    public void restart(ScheduledExecutorService scheduledExecutorService) {
        ScheduledExecutorService scheduledExecutorService2 = this._timerService;
        if (scheduledExecutorService2 == null || scheduledExecutorService2.isShutdown()) {
            this._timerService = scheduledExecutorService;
        }
        this._remainingDurationMs = this._totalDurationMs;
        schedule();
        this._isRunning.getAndSet(true);
    }

    public boolean resume() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z = false;
        } else {
            schedule();
            z = true;
        }
        this._isRunning.getAndSet(z);
        return z;
    }

    public void start(ScheduledExecutorService scheduledExecutorService) {
        if (this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService;
            schedule();
        }
    }

    public void stop() {
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this._timerService.shutdown();
            this._timerService = null;
        }
        this._isRunning.getAndSet(false);
    }

    public BaseTimer(Integer num, ITimerListener iTimerListener) {
        this(num, iTimerListener, CachedLifecycle.getLifecycleListener());
    }
}
