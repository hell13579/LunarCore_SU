// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class RogueBuffInfoOuterClass {
  /**
   * Protobuf type {@code RogueBuffInfo}
   */
  public static final class RogueBuffInfo extends ProtoMessage<RogueBuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .RogueBuff rogue_buff = 1;</code>
     */
    private final RepeatedMessage<RogueBuffOuterClass.RogueBuff> rogueBuff = RepeatedMessage.newEmptyInstance(RogueBuffOuterClass.RogueBuff.getFactory());

    private RogueBuffInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueBuffInfo}
     */
    public static RogueBuffInfo newInstance() {
      return new RogueBuffInfo();
    }

    /**
     * <code>repeated .RogueBuff rogue_buff = 1;</code>
     * @return whether the rogueBuff field is set
     */
    public boolean hasRogueBuff() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .RogueBuff rogue_buff = 1;</code>
     * @return this
     */
    public RogueBuffInfo clearRogueBuff() {
      bitField0_ &= ~0x00000001;
      rogueBuff.clear();
      return this;
    }

    /**
     * <code>repeated .RogueBuff rogue_buff = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueBuff()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueBuffOuterClass.RogueBuff> getRogueBuff() {
      return rogueBuff;
    }

    /**
     * <code>repeated .RogueBuff rogue_buff = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueBuffOuterClass.RogueBuff> getMutableRogueBuff() {
      bitField0_ |= 0x00000001;
      return rogueBuff;
    }

    /**
     * <code>repeated .RogueBuff rogue_buff = 1;</code>
     * @param value the rogueBuff to add
     * @return this
     */
    public RogueBuffInfo addRogueBuff(final RogueBuffOuterClass.RogueBuff value) {
      bitField0_ |= 0x00000001;
      rogueBuff.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueBuff rogue_buff = 1;</code>
     * @param values the rogueBuff to add
     * @return this
     */
    public RogueBuffInfo addAllRogueBuff(final RogueBuffOuterClass.RogueBuff... values) {
      bitField0_ |= 0x00000001;
      rogueBuff.addAll(values);
      return this;
    }

    @Override
    public RogueBuffInfo copyFrom(final RogueBuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueBuff.copyFrom(other.rogueBuff);
      }
      return this;
    }

    @Override
    public RogueBuffInfo mergeFrom(final RogueBuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueBuff()) {
        getMutableRogueBuff().addAll(other.rogueBuff);
      }
      return this;
    }

    @Override
    public RogueBuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueBuff.clear();
      return this;
    }

    @Override
    public RogueBuffInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueBuff.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueBuffInfo)) {
        return false;
      }
      RogueBuffInfo other = (RogueBuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueBuff() || rogueBuff.equals(other.rogueBuff));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < rogueBuff.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(rogueBuff.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * rogueBuff.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(rogueBuff);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueBuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 10: {
            // rogueBuff
            tag = input.readRepeatedMessage(rogueBuff, tag);
            bitField0_ |= 0x00000001;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedMessage(FieldNames.rogueBuff, rogueBuff);
      }
      output.endObject();
    }

    @Override
    public RogueBuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 655607117:
          case -1124785256: {
            if (input.isAtField(FieldNames.rogueBuff)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(rogueBuff);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueBuffInfo clone() {
      return new RogueBuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueBuffInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueBuffInfo(), data).checkInitialized();
    }

    public static RogueBuffInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuffInfo(), input).checkInitialized();
    }

    public static RogueBuffInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueBuffInfo messages
     */
    public static MessageFactory<RogueBuffInfo> getFactory() {
      return RogueBuffInfoFactory.INSTANCE;
    }

    private enum RogueBuffInfoFactory implements MessageFactory<RogueBuffInfo> {
      INSTANCE;

      @Override
      public RogueBuffInfo create() {
        return RogueBuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueBuff = FieldName.forField("rogueBuff", "rogue_buff");
    }
  }
}
