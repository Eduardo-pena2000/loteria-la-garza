package com.revenuecat.purchases.utils;

import Ca.I;
import Da.Q;
import Da.S;
import Qa.l;
import Ya.h;
import Ya.o;
import Ya.r;
import Za.G;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventName;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class EventsFileHelper {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_EVENT_PROPERTY_SIZE = 80;
    private l debugEventCallback;
    private final l eventDeserializer;
    private final l eventSerializer;
    private final FileHelper fileHelper;
    private final String filePath;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.a;
        }

        public final void invoke(Throwable e) {
            t.g(e, "e");
            l debugEventCallback = EventsFileHelper.this.getDebugEventCallback();
            if (debugEventCallback != null) {
                DebugEventName debugEventName = DebugEventName.REMOVE_LINES_EXCEPTION;
                Map c = Q.c();
                String e2 = P.b(e.getClass()).e();
                if (e2 == null) {
                    e2 = "Unknown";
                }
                c.put("exceptionType", e2);
                String message = e.getMessage();
                if (message != null) {
                    c.put("message", G.q1(message, 80));
                }
                I i = I.a;
                debugEventCallback.invoke(new DebugEvent(debugEventName, Q.b(c)));
            }
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $block;
        final /* synthetic */ EventsFileHelper this$0;

        public static final class 1 extends u implements l {
            final /* synthetic */ EventsFileHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(EventsFileHelper eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            public final Event invoke(String line) {
                t.g(line, "line");
                return EventsFileHelper.access$mapToEvent(this.this$0, line);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, EventsFileHelper eventsFileHelper) {
            super(1);
            this.$block = lVar;
            this.this$0 = eventsFileHelper;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return I.a;
        }

        public final void invoke(h sequence) {
            t.g(sequence, "sequence");
            this.$block.invoke(r.z(sequence, new 1(this.this$0)));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $block;

        public static final class 1 extends u implements l {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(1);
            }

            public final JSONObject invoke(String it) {
                t.g(it, "it");
                return new JSONObject(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$block = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return I.a;
        }

        public final void invoke(h sequence) {
            t.g(sequence, "sequence");
            this.$block.invoke(r.z(sequence, 1.INSTANCE));
        }
    }

    public EventsFileHelper(FileHelper fileHelper, String filePath, l lVar, l lVar2) {
        t.g(fileHelper, "fileHelper");
        t.g(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventSerializer = lVar;
        this.eventDeserializer = lVar2;
    }

    public static final /* synthetic */ Event access$mapToEvent(EventsFileHelper eventsFileHelper, String str) {
        return eventsFileHelper.mapToEvent(str);
    }

    private final Event mapToEvent(String str) {
        l lVar = this.eventDeserializer;
        if (lVar == null) {
            l lVar2 = this.debugEventCallback;
            if (lVar2 != null) {
                lVar2.invoke(new DebugEvent(DebugEventName.DESERIALIZATION_ERROR, S.h()));
            }
            return null;
        }
        try {
            return (Event) lVar.invoke(str);
        } catch (IllegalArgumentException e) {
            l lVar3 = this.debugEventCallback;
            if (lVar3 != null) {
                DebugEventName debugEventName = DebugEventName.DESERIALIZATION_ERROR;
                Map c = Q.c();
                c.put("exceptionType", "IllegalArgumentException");
                String message = e.getMessage();
                if (message != null) {
                    c.put("message", G.q1(message, 80));
                }
                I i = I.a;
                lVar3.invoke(new DebugEvent(debugEventName, Q.b(c)));
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + str, e);
            return null;
        } catch (SerializationException e2) {
            l lVar4 = this.debugEventCallback;
            if (lVar4 != null) {
                DebugEventName debugEventName2 = DebugEventName.DESERIALIZATION_ERROR;
                Map c2 = Q.c();
                c2.put("exceptionType", "SerializationException");
                String message2 = e2.getMessage();
                if (message2 != null) {
                    c2.put("message", G.q1(message2, 80));
                }
                I i2 = I.a;
                lVar4.invoke(new DebugEvent(debugEventName2, Q.b(c2)));
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + str, e2);
            return null;
        }
    }

    public final synchronized void appendEvent(Event event) {
        String event2;
        try {
            t.g(event, "event");
            try {
                FileHelper fileHelper = this.fileHelper;
                String str = this.filePath;
                StringBuilder sb = new StringBuilder();
                l lVar = this.eventSerializer;
                if (lVar == null || (event2 = (String) lVar.invoke(event)) == null) {
                    event2 = event.toString();
                }
                sb.append(event2);
                sb.append('\n');
                fileHelper.appendToFile(str, sb.toString());
            } catch (Exception e) {
                l lVar2 = this.debugEventCallback;
                if (lVar2 != null) {
                    DebugEventName debugEventName = DebugEventName.APPEND_EVENT_EXCEPTION;
                    Map c = Q.c();
                    String e2 = P.b(e.getClass()).e();
                    if (e2 == null) {
                        e2 = "Unknown";
                    }
                    c.put("exceptionType", e2);
                    String message = e.getMessage();
                    if (message != null) {
                        c.put("message", G.q1(message, 80));
                    }
                    I i = I.a;
                    lVar2.invoke(new DebugEvent(debugEventName, Q.b(c)));
                }
                throw e;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clear(int i) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, i, new 1());
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to delete events file in " + this.filePath + '.');
            }
        }
    }

    public final synchronized double fileSizeInKB() {
        return this.fileHelper.fileSizeInKB(this.filePath);
    }

    public final l getDebugEventCallback() {
        return this.debugEventCallback;
    }

    public final synchronized void readFile(l block) {
        try {
            t.g(block, "block");
            if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(o.g());
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new 1(block, this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void readFileAsJson(l block) {
        try {
            t.g(block, "block");
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(o.g());
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new 1(block));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setDebugEventCallback(l lVar) {
        this.debugEventCallback = lVar;
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, l lVar, l lVar2, int i, k kVar) {
        this(fileHelper, str, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : lVar2);
    }
}
