package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiagnosticEventRequestOuterClass {

    public enum DiagnosticAdType implements Internal.EnumLite {
        DIAGNOSTIC_AD_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_AD_TYPE_FULLSCREEN(1),
        DIAGNOSTIC_AD_TYPE_BANNER(2),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_AD_TYPE_BANNER_VALUE = 2;
        public static final int DIAGNOSTIC_AD_TYPE_FULLSCREEN_VALUE = 1;
        public static final int DIAGNOSTIC_AD_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DiagnosticAdType findValueByNumber(int i) {
                return DiagnosticAdType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return DiagnosticAdType.forNumber(i) != null;
            }
        }

        DiagnosticAdType(int i) {
            this.value = i;
        }

        public static DiagnosticAdType forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_AD_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            }
            if (i != 2) {
                return null;
            }
            return DIAGNOSTIC_AD_TYPE_BANNER;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticAdType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class DiagnosticEvent extends GeneratedMessageLite implements DiagnosticEventOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 13;
        public static final int AD_TYPE_FIELD_NUMBER = 10;
        public static final int CUSTOM_EVENT_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticEvent DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 7;
        public static final int EVENT_TYPE_FIELD_NUMBER = 1;
        public static final int HEADER_BIDDING_TOKEN_NUMBER_FIELD_NUMBER = 12;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 8;
        public static final int INT_TAGS_FIELD_NUMBER = 6;
        public static final int IS_HEADER_BIDDING_FIELD_NUMBER = 11;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 9;
        public static final int REASON_DEBUG_FIELD_NUMBER = 15;
        public static final int REASON_FIELD_NUMBER = 14;
        public static final int STRING_TAGS_FIELD_NUMBER = 5;
        public static final int TIMESTAMPS_FIELD_NUMBER = 3;
        public static final int TIME_VALUE_FIELD_NUMBER = 4;
        private int adFormat_;
        private int adType_;
        private int bitField0_;
        private int eventId_;
        private int eventType_;
        private int headerBiddingTokenNumber_;
        private boolean isHeaderBidding_;
        private double timeValue_;
        private TimestampsOuterClass.Timestamps timestamps_;
        private MapFieldLite stringTags_ = MapFieldLite.emptyMapField();
        private MapFieldLite intTags_ = MapFieldLite.emptyMapField();
        private String customEventType_ = "";
        private ByteString impressionOpportunityId_ = ByteString.EMPTY;
        private String placementId_ = "";
        private String reason_ = "";
        private String reasonDebug_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements DiagnosticEventOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                DiagnosticEvent.access$4800((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdType() {
                copyOnWrite();
                DiagnosticEvent.access$4100((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCustomEventType() {
                copyOnWrite();
                DiagnosticEvent.access$2300((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                DiagnosticEvent.access$3300((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                DiagnosticEvent.access$2100((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearHeaderBiddingTokenNumber() {
                copyOnWrite();
                DiagnosticEvent.access$4500((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                DiagnosticEvent.access$3500((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIntTags() {
                copyOnWrite();
                DiagnosticEvent.access$3100((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public Builder clearIsHeaderBidding() {
                copyOnWrite();
                DiagnosticEvent.access$4300((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                DiagnosticEvent.access$3700((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                DiagnosticEvent.access$5000((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearReasonDebug() {
                copyOnWrite();
                DiagnosticEvent.access$5300((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStringTags() {
                copyOnWrite();
                DiagnosticEvent.access$3000((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public Builder clearTimeValue() {
                copyOnWrite();
                DiagnosticEvent.access$2900((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTimestamps() {
                copyOnWrite();
                DiagnosticEvent.access$2700((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean containsIntTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getIntTagsMap().containsKey(str);
            }

            public boolean containsStringTags(String str) {
                str.getClass();
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getStringTagsMap().containsKey(str);
            }

            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getAdFormat();
            }

            public int getAdFormatValue() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getAdFormatValue();
            }

            public DiagnosticAdType getAdType() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getAdType();
            }

            public int getAdTypeValue() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getAdTypeValue();
            }

            public String getCustomEventType() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getCustomEventType();
            }

            public ByteString getCustomEventTypeBytes() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getCustomEventTypeBytes();
            }

            public int getEventId() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getEventId();
            }

            public DiagnosticEventType getEventType() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getEventType();
            }

            public int getEventTypeValue() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getEventTypeValue();
            }

            public int getHeaderBiddingTokenNumber() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getHeaderBiddingTokenNumber();
            }

            public ByteString getImpressionOpportunityId() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getImpressionOpportunityId();
            }

            @Deprecated
            public Map getIntTags() {
                return getIntTagsMap();
            }

            public int getIntTagsCount() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getIntTagsMap().size();
            }

            public Map getIntTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getIntTagsMap());
            }

            public int getIntTagsOrDefault(String str, int i) {
                str.getClass();
                Map intTagsMap = ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getIntTagsMap();
                return intTagsMap.containsKey(str) ? ((Integer) intTagsMap.get(str)).intValue() : i;
            }

            public int getIntTagsOrThrow(String str) {
                str.getClass();
                Map intTagsMap = ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getIntTagsMap();
                if (intTagsMap.containsKey(str)) {
                    return ((Integer) intTagsMap.get(str)).intValue();
                }
                throw new IllegalArgumentException();
            }

            public boolean getIsHeaderBidding() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getIsHeaderBidding();
            }

            public String getPlacementId() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getPlacementId();
            }

            public ByteString getPlacementIdBytes() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getPlacementIdBytes();
            }

            public String getReason() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getReason();
            }

            public ByteString getReasonBytes() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getReasonBytes();
            }

            public String getReasonDebug() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getReasonDebug();
            }

            public ByteString getReasonDebugBytes() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getReasonDebugBytes();
            }

            @Deprecated
            public Map getStringTags() {
                return getStringTagsMap();
            }

            public int getStringTagsCount() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getStringTagsMap().size();
            }

            public Map getStringTagsMap() {
                return Collections.unmodifiableMap(((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getStringTagsMap());
            }

            public String getStringTagsOrDefault(String str, String str2) {
                str.getClass();
                Map stringTagsMap = ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getStringTagsMap();
                return stringTagsMap.containsKey(str) ? (String) stringTagsMap.get(str) : str2;
            }

            public String getStringTagsOrThrow(String str) {
                str.getClass();
                Map stringTagsMap = ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getStringTagsMap();
                if (stringTagsMap.containsKey(str)) {
                    return (String) stringTagsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public double getTimeValue() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getTimeValue();
            }

            public TimestampsOuterClass.Timestamps getTimestamps() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).getTimestamps();
            }

            public boolean hasAdFormat() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasAdFormat();
            }

            public boolean hasAdType() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasAdType();
            }

            public boolean hasCustomEventType() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasCustomEventType();
            }

            public boolean hasHeaderBiddingTokenNumber() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasHeaderBiddingTokenNumber();
            }

            public boolean hasImpressionOpportunityId() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasImpressionOpportunityId();
            }

            public boolean hasIsHeaderBidding() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasIsHeaderBidding();
            }

            public boolean hasPlacementId() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasPlacementId();
            }

            public boolean hasReason() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasReason();
            }

            public boolean hasReasonDebug() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasReasonDebug();
            }

            public boolean hasTimeValue() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasTimeValue();
            }

            public boolean hasTimestamps() {
                return ((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).hasTimestamps();
            }

            public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                DiagnosticEvent.access$2600((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            public Builder putAllIntTags(Map map) {
                copyOnWrite();
                DiagnosticEvent.access$3100((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putAllStringTags(Map map) {
                copyOnWrite();
                DiagnosticEvent.access$3000((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putIntTags(String str, int i) {
                str.getClass();
                copyOnWrite();
                DiagnosticEvent.access$3100((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).put(str, Integer.valueOf(i));
                return this;
            }

            public Builder putStringTags(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                DiagnosticEvent.access$3000((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).put(str, str2);
                return this;
            }

            public Builder removeIntTags(String str) {
                str.getClass();
                copyOnWrite();
                DiagnosticEvent.access$3100((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            public Builder removeStringTags(String str) {
                str.getClass();
                copyOnWrite();
                DiagnosticEvent.access$3000((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                DiagnosticEvent.access$4700((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                DiagnosticEvent.access$4600((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setAdType(DiagnosticAdType diagnosticAdType) {
                copyOnWrite();
                DiagnosticEvent.access$4000((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, diagnosticAdType);
                return this;
            }

            public Builder setAdTypeValue(int i) {
                copyOnWrite();
                DiagnosticEvent.access$3900((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setCustomEventType(String str) {
                copyOnWrite();
                DiagnosticEvent.access$2200((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCustomEventTypeBytes(ByteString byteString) {
                copyOnWrite();
                DiagnosticEvent.access$2400((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setEventId(int i) {
                copyOnWrite();
                DiagnosticEvent.access$3200((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setEventType(DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                DiagnosticEvent.access$2000((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventType);
                return this;
            }

            public Builder setEventTypeValue(int i) {
                copyOnWrite();
                DiagnosticEvent.access$1900((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setHeaderBiddingTokenNumber(int i) {
                copyOnWrite();
                DiagnosticEvent.access$4400((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                DiagnosticEvent.access$3400((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setIsHeaderBidding(boolean z) {
                copyOnWrite();
                DiagnosticEvent.access$4200((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                DiagnosticEvent.access$3600((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                DiagnosticEvent.access$3800((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setReason(String str) {
                copyOnWrite();
                DiagnosticEvent.access$4900((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) {
                copyOnWrite();
                DiagnosticEvent.access$5100((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setReasonDebug(String str) {
                copyOnWrite();
                DiagnosticEvent.access$5200((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setReasonDebugBytes(ByteString byteString) {
                copyOnWrite();
                DiagnosticEvent.access$5400((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTimeValue(double d) {
                copyOnWrite();
                DiagnosticEvent.access$2800((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, d);
                return this;
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                DiagnosticEvent.access$2500((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            private Builder() {
                super(DiagnosticEvent.access$1800());
            }

            public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                DiagnosticEvent.access$2500((DiagnosticEvent) ((GeneratedMessageLite.Builder) this).instance, (TimestampsOuterClass.Timestamps) builder.build());
                return this;
            }
        }

        public static final class a {
            public static final MapEntryLite a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.UINT32, 0);
        }

        public static final class b {
            public static final MapEntryLite a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        static {
            DiagnosticEvent diagnosticEvent = new DiagnosticEvent();
            DEFAULT_INSTANCE = diagnosticEvent;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEvent.class, diagnosticEvent);
        }

        private DiagnosticEvent() {
        }

        public static /* synthetic */ DiagnosticEvent access$1800() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$1900(DiagnosticEvent diagnosticEvent, int i) {
            diagnosticEvent.setEventTypeValue(i);
        }

        public static /* synthetic */ void access$2000(DiagnosticEvent diagnosticEvent, DiagnosticEventType diagnosticEventType) {
            diagnosticEvent.setEventType(diagnosticEventType);
        }

        public static /* synthetic */ void access$2100(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearEventType();
        }

        public static /* synthetic */ void access$2200(DiagnosticEvent diagnosticEvent, String str) {
            diagnosticEvent.setCustomEventType(str);
        }

        public static /* synthetic */ void access$2300(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearCustomEventType();
        }

        public static /* synthetic */ void access$2400(DiagnosticEvent diagnosticEvent, ByteString byteString) {
            diagnosticEvent.setCustomEventTypeBytes(byteString);
        }

        public static /* synthetic */ void access$2500(DiagnosticEvent diagnosticEvent, TimestampsOuterClass.Timestamps timestamps) {
            diagnosticEvent.setTimestamps(timestamps);
        }

        public static /* synthetic */ void access$2600(DiagnosticEvent diagnosticEvent, TimestampsOuterClass.Timestamps timestamps) {
            diagnosticEvent.mergeTimestamps(timestamps);
        }

        public static /* synthetic */ void access$2700(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearTimestamps();
        }

        public static /* synthetic */ void access$2800(DiagnosticEvent diagnosticEvent, double d) {
            diagnosticEvent.setTimeValue(d);
        }

        public static /* synthetic */ void access$2900(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearTimeValue();
        }

        public static /* synthetic */ Map access$3000(DiagnosticEvent diagnosticEvent) {
            return diagnosticEvent.getMutableStringTagsMap();
        }

        public static /* synthetic */ Map access$3100(DiagnosticEvent diagnosticEvent) {
            return diagnosticEvent.getMutableIntTagsMap();
        }

        public static /* synthetic */ void access$3200(DiagnosticEvent diagnosticEvent, int i) {
            diagnosticEvent.setEventId(i);
        }

        public static /* synthetic */ void access$3300(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearEventId();
        }

        public static /* synthetic */ void access$3400(DiagnosticEvent diagnosticEvent, ByteString byteString) {
            diagnosticEvent.setImpressionOpportunityId(byteString);
        }

        public static /* synthetic */ void access$3500(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearImpressionOpportunityId();
        }

        public static /* synthetic */ void access$3600(DiagnosticEvent diagnosticEvent, String str) {
            diagnosticEvent.setPlacementId(str);
        }

        public static /* synthetic */ void access$3700(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearPlacementId();
        }

        public static /* synthetic */ void access$3800(DiagnosticEvent diagnosticEvent, ByteString byteString) {
            diagnosticEvent.setPlacementIdBytes(byteString);
        }

        public static /* synthetic */ void access$3900(DiagnosticEvent diagnosticEvent, int i) {
            diagnosticEvent.setAdTypeValue(i);
        }

        public static /* synthetic */ void access$4000(DiagnosticEvent diagnosticEvent, DiagnosticAdType diagnosticAdType) {
            diagnosticEvent.setAdType(diagnosticAdType);
        }

        public static /* synthetic */ void access$4100(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearAdType();
        }

        public static /* synthetic */ void access$4200(DiagnosticEvent diagnosticEvent, boolean z) {
            diagnosticEvent.setIsHeaderBidding(z);
        }

        public static /* synthetic */ void access$4300(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearIsHeaderBidding();
        }

        public static /* synthetic */ void access$4400(DiagnosticEvent diagnosticEvent, int i) {
            diagnosticEvent.setHeaderBiddingTokenNumber(i);
        }

        public static /* synthetic */ void access$4500(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearHeaderBiddingTokenNumber();
        }

        public static /* synthetic */ void access$4600(DiagnosticEvent diagnosticEvent, int i) {
            diagnosticEvent.setAdFormatValue(i);
        }

        public static /* synthetic */ void access$4700(DiagnosticEvent diagnosticEvent, AdFormatOuterClass.AdFormat adFormat) {
            diagnosticEvent.setAdFormat(adFormat);
        }

        public static /* synthetic */ void access$4800(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearAdFormat();
        }

        public static /* synthetic */ void access$4900(DiagnosticEvent diagnosticEvent, String str) {
            diagnosticEvent.setReason(str);
        }

        public static /* synthetic */ void access$5000(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearReason();
        }

        public static /* synthetic */ void access$5100(DiagnosticEvent diagnosticEvent, ByteString byteString) {
            diagnosticEvent.setReasonBytes(byteString);
        }

        public static /* synthetic */ void access$5200(DiagnosticEvent diagnosticEvent, String str) {
            diagnosticEvent.setReasonDebug(str);
        }

        public static /* synthetic */ void access$5300(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.clearReasonDebug();
        }

        public static /* synthetic */ void access$5400(DiagnosticEvent diagnosticEvent, ByteString byteString) {
            diagnosticEvent.setReasonDebugBytes(byteString);
        }

        private void clearAdFormat() {
            this.bitField0_ &= -257;
            this.adFormat_ = 0;
        }

        private void clearAdType() {
            this.bitField0_ &= -33;
            this.adType_ = 0;
        }

        private void clearCustomEventType() {
            this.bitField0_ &= -2;
            this.customEventType_ = getDefaultInstance().getCustomEventType();
        }

        private void clearEventId() {
            this.eventId_ = 0;
        }

        private void clearEventType() {
            this.eventType_ = 0;
        }

        private void clearHeaderBiddingTokenNumber() {
            this.bitField0_ &= -129;
            this.headerBiddingTokenNumber_ = 0;
        }

        private void clearImpressionOpportunityId() {
            this.bitField0_ &= -9;
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearIsHeaderBidding() {
            this.bitField0_ &= -65;
            this.isHeaderBidding_ = false;
        }

        private void clearPlacementId() {
            this.bitField0_ &= -17;
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        private void clearReason() {
            this.bitField0_ &= -513;
            this.reason_ = getDefaultInstance().getReason();
        }

        private void clearReasonDebug() {
            this.bitField0_ &= -1025;
            this.reasonDebug_ = getDefaultInstance().getReasonDebug();
        }

        private void clearTimeValue() {
            this.bitField0_ &= -5;
            this.timeValue_ = 0.0d;
        }

        private void clearTimestamps() {
            this.timestamps_ = null;
            this.bitField0_ &= -3;
        }

        public static DiagnosticEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map getMutableIntTagsMap() {
            return internalGetMutableIntTags();
        }

        private Map getMutableStringTagsMap() {
            return internalGetMutableStringTags();
        }

        private MapFieldLite internalGetIntTags() {
            return this.intTags_;
        }

        private MapFieldLite internalGetMutableIntTags() {
            if (!this.intTags_.isMutable()) {
                this.intTags_ = this.intTags_.mutableCopy();
            }
            return this.intTags_;
        }

        private MapFieldLite internalGetMutableStringTags() {
            if (!this.stringTags_.isMutable()) {
                this.stringTags_ = this.stringTags_.mutableCopy();
            }
            return this.stringTags_;
        }

        private MapFieldLite internalGetStringTags() {
            return this.stringTags_;
        }

        private void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
            if (timestamps2 == null || timestamps2 == TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.timestamps_ = timestamps;
            } else {
                this.timestamps_ = (TimestampsOuterClass.Timestamps) ((TimestampsOuterClass.Timestamps.Builder) TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom(timestamps)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 256;
        }

        private void setAdFormatValue(int i) {
            this.bitField0_ |= 256;
            this.adFormat_ = i;
        }

        private void setAdType(DiagnosticAdType diagnosticAdType) {
            this.adType_ = diagnosticAdType.getNumber();
            this.bitField0_ |= 32;
        }

        private void setAdTypeValue(int i) {
            this.bitField0_ |= 32;
            this.adType_ = i;
        }

        private void setCustomEventType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customEventType_ = str;
        }

        private void setCustomEventTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customEventType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setEventId(int i) {
            this.eventId_ = i;
        }

        private void setEventType(DiagnosticEventType diagnosticEventType) {
            this.eventType_ = diagnosticEventType.getNumber();
        }

        private void setEventTypeValue(int i) {
            this.eventType_ = i;
        }

        private void setHeaderBiddingTokenNumber(int i) {
            this.bitField0_ |= 128;
            this.headerBiddingTokenNumber_ = i;
        }

        private void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 8;
            this.impressionOpportunityId_ = byteString;
        }

        private void setIsHeaderBidding(boolean z) {
            this.bitField0_ |= 64;
            this.isHeaderBidding_ = z;
        }

        private void setPlacementId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.placementId_ = str;
        }

        private void setPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        private void setReason(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.reason_ = str;
        }

        private void setReasonBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        private void setReasonDebug(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.reasonDebug_ = str;
        }

        private void setReasonDebugBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.reasonDebug_ = byteString.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        private void setTimeValue(double d) {
            this.bitField0_ |= 4;
            this.timeValue_ = d;
        }

        private void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.timestamps_ = timestamps;
            this.bitField0_ |= 2;
        }

        public boolean containsIntTags(String str) {
            str.getClass();
            return internalGetIntTags().containsKey(str);
        }

        public boolean containsStringTags(String str) {
            str.getClass();
            return internalGetStringTags().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEvent();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0002\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ဉ\u0001\u0004က\u0002\u00052\u00062\u0007\u0004\bည\u0003\tለ\u0004\nဌ\u0005\u000bဇ\u0006\fင\u0007\rဌ\b\u000eለ\t\u000fለ\n", new Object[]{"bitField0_", "eventType_", "customEventType_", "timestamps_", "timeValue_", "stringTags_", b.a, "intTags_", a.a, "eventId_", "impressionOpportunityId_", "placementId_", "adType_", "isHeaderBidding_", "headerBiddingTokenNumber_", "adFormat_", "reason_", "reasonDebug_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DiagnosticEvent.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return forNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        public int getAdFormatValue() {
            return this.adFormat_;
        }

        public DiagnosticAdType getAdType() {
            DiagnosticAdType forNumber = DiagnosticAdType.forNumber(this.adType_);
            return forNumber == null ? DiagnosticAdType.UNRECOGNIZED : forNumber;
        }

        public int getAdTypeValue() {
            return this.adType_;
        }

        public String getCustomEventType() {
            return this.customEventType_;
        }

        public ByteString getCustomEventTypeBytes() {
            return ByteString.copyFromUtf8(this.customEventType_);
        }

        public int getEventId() {
            return this.eventId_;
        }

        public DiagnosticEventType getEventType() {
            DiagnosticEventType forNumber = DiagnosticEventType.forNumber(this.eventType_);
            return forNumber == null ? DiagnosticEventType.UNRECOGNIZED : forNumber;
        }

        public int getEventTypeValue() {
            return this.eventType_;
        }

        public int getHeaderBiddingTokenNumber() {
            return this.headerBiddingTokenNumber_;
        }

        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Deprecated
        public Map getIntTags() {
            return getIntTagsMap();
        }

        public int getIntTagsCount() {
            return internalGetIntTags().size();
        }

        public Map getIntTagsMap() {
            return Collections.unmodifiableMap(internalGetIntTags());
        }

        public int getIntTagsOrDefault(String str, int i) {
            str.getClass();
            MapFieldLite internalGetIntTags = internalGetIntTags();
            return internalGetIntTags.containsKey(str) ? ((Integer) internalGetIntTags.get(str)).intValue() : i;
        }

        public int getIntTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite internalGetIntTags = internalGetIntTags();
            if (internalGetIntTags.containsKey(str)) {
                return ((Integer) internalGetIntTags.get(str)).intValue();
            }
            throw new IllegalArgumentException();
        }

        public boolean getIsHeaderBidding() {
            return this.isHeaderBidding_;
        }

        public String getPlacementId() {
            return this.placementId_;
        }

        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        public String getReason() {
            return this.reason_;
        }

        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8(this.reason_);
        }

        public String getReasonDebug() {
            return this.reasonDebug_;
        }

        public ByteString getReasonDebugBytes() {
            return ByteString.copyFromUtf8(this.reasonDebug_);
        }

        @Deprecated
        public Map getStringTags() {
            return getStringTagsMap();
        }

        public int getStringTagsCount() {
            return internalGetStringTags().size();
        }

        public Map getStringTagsMap() {
            return Collections.unmodifiableMap(internalGetStringTags());
        }

        public String getStringTagsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite internalGetStringTags = internalGetStringTags();
            return internalGetStringTags.containsKey(str) ? (String) internalGetStringTags.get(str) : str2;
        }

        public String getStringTagsOrThrow(String str) {
            str.getClass();
            MapFieldLite internalGetStringTags = internalGetStringTags();
            if (internalGetStringTags.containsKey(str)) {
                return (String) internalGetStringTags.get(str);
            }
            throw new IllegalArgumentException();
        }

        public double getTimeValue() {
            return this.timeValue_;
        }

        public TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
            return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        public boolean hasAdFormat() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasAdType() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasCustomEventType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasHeaderBiddingTokenNumber() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasImpressionOpportunityId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIsHeaderBidding() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasPlacementId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasReason() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasReasonDebug() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasTimeValue() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTimestamps() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DiagnosticEvent diagnosticEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(diagnosticEvent);
        }

        public static DiagnosticEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DiagnosticEventOrBuilder extends MessageLiteOrBuilder {
        boolean containsIntTags(String str);

        boolean containsStringTags(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        DiagnosticAdType getAdType();

        int getAdTypeValue();

        String getCustomEventType();

        ByteString getCustomEventTypeBytes();

        int getEventId();

        DiagnosticEventType getEventType();

        int getEventTypeValue();

        int getHeaderBiddingTokenNumber();

        ByteString getImpressionOpportunityId();

        @Deprecated
        Map getIntTags();

        int getIntTagsCount();

        Map getIntTagsMap();

        int getIntTagsOrDefault(String str, int i);

        int getIntTagsOrThrow(String str);

        boolean getIsHeaderBidding();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        String getReason();

        ByteString getReasonBytes();

        String getReasonDebug();

        ByteString getReasonDebugBytes();

        @Deprecated
        Map getStringTags();

        int getStringTagsCount();

        Map getStringTagsMap();

        String getStringTagsOrDefault(String str, String str2);

        String getStringTagsOrThrow(String str);

        double getTimeValue();

        TimestampsOuterClass.Timestamps getTimestamps();

        boolean hasAdFormat();

        boolean hasAdType();

        boolean hasCustomEventType();

        boolean hasHeaderBiddingTokenNumber();

        boolean hasImpressionOpportunityId();

        boolean hasIsHeaderBidding();

        boolean hasPlacementId();

        boolean hasReason();

        boolean hasReasonDebug();

        boolean hasTimeValue();

        boolean hasTimestamps();
    }

    public static final class DiagnosticEventRequest extends GeneratedMessageLite implements DiagnosticEventRequestOrBuilder {
        public static final int BATCH_FIELD_NUMBER = 1;
        private static final DiagnosticEventRequest DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private Internal.ProtobufList batch_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder implements DiagnosticEventRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllBatch(Iterable iterable) {
                copyOnWrite();
                DiagnosticEventRequest.access$6000((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addBatch(DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                DiagnosticEventRequest.access$5800((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, diagnosticEvent);
                return this;
            }

            public Builder clearBatch() {
                copyOnWrite();
                DiagnosticEventRequest.access$6100((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public DiagnosticEvent getBatch(int i) {
                return ((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance).getBatch(i);
            }

            public int getBatchCount() {
                return ((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance).getBatchCount();
            }

            public List getBatchList() {
                return Collections.unmodifiableList(((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance).getBatchList());
            }

            public Builder removeBatch(int i) {
                copyOnWrite();
                DiagnosticEventRequest.access$6200((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setBatch(int i, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                DiagnosticEventRequest.access$5700((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, diagnosticEvent);
                return this;
            }

            private Builder() {
                super(DiagnosticEventRequest.access$5600());
            }

            public Builder addBatch(int i, DiagnosticEvent diagnosticEvent) {
                copyOnWrite();
                DiagnosticEventRequest.access$5900((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, diagnosticEvent);
                return this;
            }

            public Builder setBatch(int i, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                DiagnosticEventRequest.access$5700((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, (DiagnosticEvent) builder.build());
                return this;
            }

            public Builder addBatch(DiagnosticEvent.Builder builder) {
                copyOnWrite();
                DiagnosticEventRequest.access$5800((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, (DiagnosticEvent) builder.build());
                return this;
            }

            public Builder addBatch(int i, DiagnosticEvent.Builder builder) {
                copyOnWrite();
                DiagnosticEventRequest.access$5900((DiagnosticEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, (DiagnosticEvent) builder.build());
                return this;
            }
        }

        static {
            DiagnosticEventRequest diagnosticEventRequest = new DiagnosticEventRequest();
            DEFAULT_INSTANCE = diagnosticEventRequest;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventRequest.class, diagnosticEventRequest);
        }

        private DiagnosticEventRequest() {
        }

        public static /* synthetic */ DiagnosticEventRequest access$5600() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$5700(DiagnosticEventRequest diagnosticEventRequest, int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEventRequest.setBatch(i, diagnosticEvent);
        }

        public static /* synthetic */ void access$5800(DiagnosticEventRequest diagnosticEventRequest, DiagnosticEvent diagnosticEvent) {
            diagnosticEventRequest.addBatch(diagnosticEvent);
        }

        public static /* synthetic */ void access$5900(DiagnosticEventRequest diagnosticEventRequest, int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEventRequest.addBatch(i, diagnosticEvent);
        }

        public static /* synthetic */ void access$6000(DiagnosticEventRequest diagnosticEventRequest, Iterable iterable) {
            diagnosticEventRequest.addAllBatch(iterable);
        }

        public static /* synthetic */ void access$6100(DiagnosticEventRequest diagnosticEventRequest) {
            diagnosticEventRequest.clearBatch();
        }

        public static /* synthetic */ void access$6200(DiagnosticEventRequest diagnosticEventRequest, int i) {
            diagnosticEventRequest.removeBatch(i);
        }

        private void addAllBatch(Iterable iterable) {
            ensureBatchIsMutable();
            AbstractMessageLite.addAll(iterable, this.batch_);
        }

        private void addBatch(DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(diagnosticEvent);
        }

        private void clearBatch() {
            this.batch_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureBatchIsMutable() {
            Internal.ProtobufList protobufList = this.batch_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.batch_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static DiagnosticEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeBatch(int i) {
            ensureBatchIsMutable();
            this.batch_.remove(i);
        }

        private void setBatch(int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.set(i, diagnosticEvent);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEventRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"batch_", DiagnosticEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DiagnosticEventRequest.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public DiagnosticEvent getBatch(int i) {
            return (DiagnosticEvent) this.batch_.get(i);
        }

        public int getBatchCount() {
            return this.batch_.size();
        }

        public List getBatchList() {
            return this.batch_;
        }

        public DiagnosticEventOrBuilder getBatchOrBuilder(int i) {
            return (DiagnosticEventOrBuilder) this.batch_.get(i);
        }

        public List getBatchOrBuilderList() {
            return this.batch_;
        }

        public static Builder newBuilder(DiagnosticEventRequest diagnosticEventRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(diagnosticEventRequest);
        }

        public static DiagnosticEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addBatch(int i, DiagnosticEvent diagnosticEvent) {
            diagnosticEvent.getClass();
            ensureBatchIsMutable();
            this.batch_.add(i, diagnosticEvent);
        }

        public static DiagnosticEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DiagnosticEventRequestOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEvent getBatch(int i);

        int getBatchCount();

        List getBatchList();
    }

    public enum DiagnosticEventType implements Internal.EnumLite {
        DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_EVENT_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENT_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DiagnosticEventType findValueByNumber(int i) {
                return DiagnosticEventType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return DiagnosticEventType.forNumber(i) != null;
            }
        }

        DiagnosticEventType(int i) {
            this.value = i;
        }

        public static DiagnosticEventType forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_EVENT_TYPE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return DIAGNOSTIC_EVENT_TYPE_CUSTOM;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticEventType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum DiagnosticEventsSeverity implements Internal.EnumLite {
        DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED(0),
        DIAGNOSTIC_EVENTS_SEVERITY_DEBUG(1),
        DIAGNOSTIC_EVENTS_SEVERITY_INFO(2),
        DIAGNOSTIC_EVENTS_SEVERITY_WARNING(3),
        DIAGNOSTIC_EVENTS_SEVERITY_ERROR(4),
        DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS(5),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS_VALUE = 5;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_DEBUG_VALUE = 1;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_ERROR_VALUE = 4;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_INFO_VALUE = 2;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED_VALUE = 0;
        public static final int DIAGNOSTIC_EVENTS_SEVERITY_WARNING_VALUE = 3;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DiagnosticEventsSeverity findValueByNumber(int i) {
                return DiagnosticEventsSeverity.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return DiagnosticEventsSeverity.forNumber(i) != null;
            }
        }

        DiagnosticEventsSeverity(int i) {
            this.value = i;
        }

        public static DiagnosticEventsSeverity forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_EVENTS_SEVERITY_UNSPECIFIED;
            }
            if (i == 1) {
                return DIAGNOSTIC_EVENTS_SEVERITY_DEBUG;
            }
            if (i == 2) {
                return DIAGNOSTIC_EVENTS_SEVERITY_INFO;
            }
            if (i == 3) {
                return DIAGNOSTIC_EVENTS_SEVERITY_WARNING;
            }
            if (i == 4) {
                return DIAGNOSTIC_EVENTS_SEVERITY_ERROR;
            }
            if (i != 5) {
                return null;
            }
            return DIAGNOSTIC_EVENTS_SEVERITY_ALWAYS;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticEventsSeverity valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class DiagnosticTag extends GeneratedMessageLite implements DiagnosticTagOrBuilder {
        public static final int CUSTOM_TAG_TYPE_FIELD_NUMBER = 2;
        private static final DiagnosticTag DEFAULT_INSTANCE;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 3;
        public static final int TAG_TYPE_FIELD_NUMBER = 1;
        private static final Internal.ListAdapter.Converter tagType_converter_ = new a();
        private int bitField0_;
        private int tagTypeMemoizedSerializedSize;
        private Object value_;
        private int valueCase_ = 0;
        private Internal.IntList tagType_ = GeneratedMessageLite.emptyIntList();
        private String customTagType_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements DiagnosticTagOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllTagType(Iterable iterable) {
                copyOnWrite();
                DiagnosticTag.access$400((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllTagTypeValue(Iterable iterable) {
                copyOnWrite();
                DiagnosticTag.access$800((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addTagType(DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                DiagnosticTag.access$300((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, diagnosticTagType);
                return this;
            }

            public Builder addTagTypeValue(int i) {
                copyOnWrite();
                DiagnosticTag.access$700((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder clearCustomTagType() {
                copyOnWrite();
                DiagnosticTag.access$1000((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                DiagnosticTag.access$1600((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                DiagnosticTag.access$1300((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTagType() {
                copyOnWrite();
                DiagnosticTag.access$500((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                DiagnosticTag.access$100((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getCustomTagType() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getCustomTagType();
            }

            public ByteString getCustomTagTypeBytes() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getCustomTagTypeBytes();
            }

            public int getIntValue() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getIntValue();
            }

            public String getStringValue() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getStringValue();
            }

            public ByteString getStringValueBytes() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getStringValueBytes();
            }

            public DiagnosticTagType getTagType(int i) {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getTagType(i);
            }

            public int getTagTypeCount() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getTagTypeCount();
            }

            public List getTagTypeList() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getTagTypeList();
            }

            public int getTagTypeValue(int i) {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getTagTypeValue(i);
            }

            public List getTagTypeValueList() {
                return Collections.unmodifiableList(((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getTagTypeValueList());
            }

            public ValueCase getValueCase() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).getValueCase();
            }

            public boolean hasCustomTagType() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).hasCustomTagType();
            }

            public boolean hasIntValue() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).hasIntValue();
            }

            public boolean hasStringValue() {
                return ((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance).hasStringValue();
            }

            public Builder setCustomTagType(String str) {
                copyOnWrite();
                DiagnosticTag.access$900((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCustomTagTypeBytes(ByteString byteString) {
                copyOnWrite();
                DiagnosticTag.access$1100((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setIntValue(int i) {
                copyOnWrite();
                DiagnosticTag.access$1500((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                DiagnosticTag.access$1200((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setStringValueBytes(ByteString byteString) {
                copyOnWrite();
                DiagnosticTag.access$1400((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTagType(int i, DiagnosticTagType diagnosticTagType) {
                copyOnWrite();
                DiagnosticTag.access$200((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, i, diagnosticTagType);
                return this;
            }

            public Builder setTagTypeValue(int i, int i2) {
                copyOnWrite();
                DiagnosticTag.access$600((DiagnosticTag) ((GeneratedMessageLite.Builder) this).instance, i, i2);
                return this;
            }

            private Builder() {
                super(DiagnosticTag.access$000());
            }
        }

        public enum ValueCase {
            STRING_VALUE(3),
            INT_VALUE(4),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 3) {
                    return STRING_VALUE;
                }
                if (i != 4) {
                    return null;
                }
                return INT_VALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public class a implements Internal.ListAdapter.Converter {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DiagnosticTagType convert(Integer num) {
                DiagnosticTagType forNumber = DiagnosticTagType.forNumber(num.intValue());
                return forNumber == null ? DiagnosticTagType.UNRECOGNIZED : forNumber;
            }
        }

        static {
            DiagnosticTag diagnosticTag = new DiagnosticTag();
            DEFAULT_INSTANCE = diagnosticTag;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticTag.class, diagnosticTag);
        }

        private DiagnosticTag() {
        }

        public static /* synthetic */ DiagnosticTag access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(DiagnosticTag diagnosticTag) {
            diagnosticTag.clearValue();
        }

        public static /* synthetic */ void access$1000(DiagnosticTag diagnosticTag) {
            diagnosticTag.clearCustomTagType();
        }

        public static /* synthetic */ void access$1100(DiagnosticTag diagnosticTag, ByteString byteString) {
            diagnosticTag.setCustomTagTypeBytes(byteString);
        }

        public static /* synthetic */ void access$1200(DiagnosticTag diagnosticTag, String str) {
            diagnosticTag.setStringValue(str);
        }

        public static /* synthetic */ void access$1300(DiagnosticTag diagnosticTag) {
            diagnosticTag.clearStringValue();
        }

        public static /* synthetic */ void access$1400(DiagnosticTag diagnosticTag, ByteString byteString) {
            diagnosticTag.setStringValueBytes(byteString);
        }

        public static /* synthetic */ void access$1500(DiagnosticTag diagnosticTag, int i) {
            diagnosticTag.setIntValue(i);
        }

        public static /* synthetic */ void access$1600(DiagnosticTag diagnosticTag) {
            diagnosticTag.clearIntValue();
        }

        public static /* synthetic */ void access$200(DiagnosticTag diagnosticTag, int i, DiagnosticTagType diagnosticTagType) {
            diagnosticTag.setTagType(i, diagnosticTagType);
        }

        public static /* synthetic */ void access$300(DiagnosticTag diagnosticTag, DiagnosticTagType diagnosticTagType) {
            diagnosticTag.addTagType(diagnosticTagType);
        }

        public static /* synthetic */ void access$400(DiagnosticTag diagnosticTag, Iterable iterable) {
            diagnosticTag.addAllTagType(iterable);
        }

        public static /* synthetic */ void access$500(DiagnosticTag diagnosticTag) {
            diagnosticTag.clearTagType();
        }

        public static /* synthetic */ void access$600(DiagnosticTag diagnosticTag, int i, int i2) {
            diagnosticTag.setTagTypeValue(i, i2);
        }

        public static /* synthetic */ void access$700(DiagnosticTag diagnosticTag, int i) {
            diagnosticTag.addTagTypeValue(i);
        }

        public static /* synthetic */ void access$800(DiagnosticTag diagnosticTag, Iterable iterable) {
            diagnosticTag.addAllTagTypeValue(iterable);
        }

        public static /* synthetic */ void access$900(DiagnosticTag diagnosticTag, String str) {
            diagnosticTag.setCustomTagType(str);
        }

        private void addAllTagType(Iterable iterable) {
            ensureTagTypeIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(((DiagnosticTagType) it.next()).getNumber());
            }
        }

        private void addAllTagTypeValue(Iterable iterable) {
            ensureTagTypeIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.tagType_.addInt(((Integer) it.next()).intValue());
            }
        }

        private void addTagType(DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.addInt(diagnosticTagType.getNumber());
        }

        private void addTagTypeValue(int i) {
            ensureTagTypeIsMutable();
            this.tagType_.addInt(i);
        }

        private void clearCustomTagType() {
            this.bitField0_ &= -2;
            this.customTagType_ = getDefaultInstance().getCustomTagType();
        }

        private void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void clearStringValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        private void clearTagType() {
            this.tagType_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        private void ensureTagTypeIsMutable() {
            Internal.IntList intList = this.tagType_;
            if (intList.isModifiable()) {
                return;
            }
            this.tagType_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static DiagnosticTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCustomTagType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customTagType_ = str;
        }

        private void setCustomTagTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customTagType_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setIntValue(int i) {
            this.valueCase_ = 4;
            this.value_ = Integer.valueOf(i);
        }

        private void setStringValue(String str) {
            str.getClass();
            this.valueCase_ = 3;
            this.value_ = str;
        }

        private void setStringValueBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
            this.valueCase_ = 3;
        }

        private void setTagType(int i, DiagnosticTagType diagnosticTagType) {
            diagnosticTagType.getClass();
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, diagnosticTagType.getNumber());
        }

        private void setTagTypeValue(int i, int i2) {
            ensureTagTypeIsMutable();
            this.tagType_.setInt(i, i2);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticTag();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001,\u0002ለ\u0000\u0003Ȼ\u0000\u00047\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "tagType_", "customTagType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DiagnosticTag.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getCustomTagType() {
            return this.customTagType_;
        }

        public ByteString getCustomTagTypeBytes() {
            return ByteString.copyFromUtf8(this.customTagType_);
        }

        public int getIntValue() {
            if (this.valueCase_ == 4) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        public String getStringValue() {
            return this.valueCase_ == 3 ? (String) this.value_ : "";
        }

        public ByteString getStringValueBytes() {
            return ByteString.copyFromUtf8(this.valueCase_ == 3 ? (String) this.value_ : "");
        }

        public DiagnosticTagType getTagType(int i) {
            DiagnosticTagType forNumber = DiagnosticTagType.forNumber(this.tagType_.getInt(i));
            return forNumber == null ? DiagnosticTagType.UNRECOGNIZED : forNumber;
        }

        public int getTagTypeCount() {
            return this.tagType_.size();
        }

        public List getTagTypeList() {
            return new Internal.ListAdapter(this.tagType_, tagType_converter_);
        }

        public int getTagTypeValue(int i) {
            return this.tagType_.getInt(i);
        }

        public List getTagTypeValueList() {
            return this.tagType_;
        }

        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        public boolean hasCustomTagType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        public boolean hasStringValue() {
            return this.valueCase_ == 3;
        }

        public static Builder newBuilder(DiagnosticTag diagnosticTag) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(diagnosticTag);
        }

        public static DiagnosticTag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticTag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticTag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticTag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticTag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DiagnosticTagOrBuilder extends MessageLiteOrBuilder {
        String getCustomTagType();

        ByteString getCustomTagTypeBytes();

        int getIntValue();

        String getStringValue();

        ByteString getStringValueBytes();

        DiagnosticTagType getTagType(int i);

        int getTagTypeCount();

        List getTagTypeList();

        int getTagTypeValue(int i);

        List getTagTypeValueList();

        DiagnosticTag.ValueCase getValueCase();

        boolean hasCustomTagType();

        boolean hasIntValue();

        boolean hasStringValue();
    }

    public enum DiagnosticTagType implements Internal.EnumLite {
        DIAGNOSTIC_TAG_TYPE_UNSPECIFIED(0),
        DIAGNOSTIC_TAG_TYPE_CUSTOM(1),
        UNRECOGNIZED(-1);

        public static final int DIAGNOSTIC_TAG_TYPE_CUSTOM_VALUE = 1;
        public static final int DIAGNOSTIC_TAG_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DiagnosticTagType findValueByNumber(int i) {
                return DiagnosticTagType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return DiagnosticTagType.forNumber(i) != null;
            }
        }

        DiagnosticTagType(int i) {
            this.value = i;
        }

        public static DiagnosticTagType forNumber(int i) {
            if (i == 0) {
                return DIAGNOSTIC_TAG_TYPE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return DIAGNOSTIC_TAG_TYPE_CUSTOM;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static DiagnosticTagType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private DiagnosticEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
