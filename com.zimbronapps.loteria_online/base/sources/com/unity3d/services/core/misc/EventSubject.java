package com.unity3d.services.core.misc;

import com.unity3d.services.core.timer.IIntervalTimer;
import com.unity3d.services.core.timer.IIntervalTimerFactory;
import com.unity3d.services.core.timer.IIntervalTimerListener;
import java.util.Queue;
import java.util.concurrent.Executors;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class EventSubject {
    private IEventListener _eventListener;
    Queue _eventQueue;
    IIntervalTimer _intervalTimer;

    public class 1 implements IIntervalTimerListener {
        public 1() {
        }

        public void onNextIntervalTriggered() {
            EventSubject.this.sendNextEvent();
        }
    }

    public EventSubject(Queue queue, Integer num, IIntervalTimerFactory iIntervalTimerFactory) {
        this._eventQueue = queue;
        this._intervalTimer = iIntervalTimerFactory.createTimer(num, Integer.valueOf(queue.size()), new 1());
    }

    private void killTimer() {
        IIntervalTimer iIntervalTimer = this._intervalTimer;
        if (iIntervalTimer != null) {
            iIntervalTimer.kill();
            this._intervalTimer = null;
        }
    }

    private void startTimer() {
        IIntervalTimer iIntervalTimer = this._intervalTimer;
        if (iIntervalTimer != null) {
            iIntervalTimer.start(Executors.newSingleThreadScheduledExecutor());
        }
    }

    public boolean eventQueueIsEmpty() {
        return this._eventQueue.isEmpty();
    }

    public void sendNextEvent() {
        IEventListener iEventListener = this._eventListener;
        if (iEventListener != null) {
            iEventListener.onNextEvent(this._eventQueue.remove());
        }
        if (this._eventQueue.size() <= 0) {
            unsubscribe();
        }
    }

    public void subscribe(IEventListener iEventListener) {
        Queue queue = this._eventQueue;
        if (queue == null || queue.size() <= 0 || this._intervalTimer == null || iEventListener == null) {
            return;
        }
        this._eventListener = iEventListener;
        startTimer();
    }

    public void unsubscribe() {
        killTimer();
        this._eventListener = null;
    }
}
