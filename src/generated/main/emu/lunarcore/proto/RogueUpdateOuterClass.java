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

public final class RogueUpdateOuterClass {
  /**
   * Protobuf type {@code RogueUpdate}
   */
  public static final class RogueUpdate extends ProtoMessage<RogueUpdate> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 area_id = 7;</code>
     */
    private int areaId;

    /**
     * <code>optional uint32 LOKIGPFHHIN = 8;</code>
     */
    private int lOKIGPFHHIN;

    /**
     * <code>optional uint32 KPJNNFIINNB = 12;</code>
     */
    private int kPJNNFIINNB;

    private RogueUpdate() {
    }

    /**
     * @return a new empty instance of {@code RogueUpdate}
     */
    public static RogueUpdate newInstance() {
      return new RogueUpdate();
    }

    /**
     * <code>optional uint32 area_id = 7;</code>
     * @return whether the areaId field is set
     */
    public boolean hasAreaId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 area_id = 7;</code>
     * @return this
     */
    public RogueUpdate clearAreaId() {
      bitField0_ &= ~0x00000001;
      areaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 area_id = 7;</code>
     * @return the areaId
     */
    public int getAreaId() {
      return areaId;
    }

    /**
     * <code>optional uint32 area_id = 7;</code>
     * @param value the areaId to set
     * @return this
     */
    public RogueUpdate setAreaId(final int value) {
      bitField0_ |= 0x00000001;
      areaId = value;
      return this;
    }

    /**
     * <code>optional uint32 LOKIGPFHHIN = 8;</code>
     * @return whether the lOKIGPFHHIN field is set
     */
    public boolean hasLOKIGPFHHIN() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 LOKIGPFHHIN = 8;</code>
     * @return this
     */
    public RogueUpdate clearLOKIGPFHHIN() {
      bitField0_ &= ~0x00000002;
      lOKIGPFHHIN = 0;
      return this;
    }

    /**
     * <code>optional uint32 LOKIGPFHHIN = 8;</code>
     * @return the lOKIGPFHHIN
     */
    public int getLOKIGPFHHIN() {
      return lOKIGPFHHIN;
    }

    /**
     * <code>optional uint32 LOKIGPFHHIN = 8;</code>
     * @param value the lOKIGPFHHIN to set
     * @return this
     */
    public RogueUpdate setLOKIGPFHHIN(final int value) {
      bitField0_ |= 0x00000002;
      lOKIGPFHHIN = value;
      return this;
    }

    /**
     * <code>optional uint32 KPJNNFIINNB = 12;</code>
     * @return whether the kPJNNFIINNB field is set
     */
    public boolean hasKPJNNFIINNB() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 KPJNNFIINNB = 12;</code>
     * @return this
     */
    public RogueUpdate clearKPJNNFIINNB() {
      bitField0_ &= ~0x00000004;
      kPJNNFIINNB = 0;
      return this;
    }

    /**
     * <code>optional uint32 KPJNNFIINNB = 12;</code>
     * @return the kPJNNFIINNB
     */
    public int getKPJNNFIINNB() {
      return kPJNNFIINNB;
    }

    /**
     * <code>optional uint32 KPJNNFIINNB = 12;</code>
     * @param value the kPJNNFIINNB to set
     * @return this
     */
    public RogueUpdate setKPJNNFIINNB(final int value) {
      bitField0_ |= 0x00000004;
      kPJNNFIINNB = value;
      return this;
    }

    @Override
    public RogueUpdate copyFrom(final RogueUpdate other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        areaId = other.areaId;
        lOKIGPFHHIN = other.lOKIGPFHHIN;
        kPJNNFIINNB = other.kPJNNFIINNB;
      }
      return this;
    }

    @Override
    public RogueUpdate mergeFrom(final RogueUpdate other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAreaId()) {
        setAreaId(other.areaId);
      }
      if (other.hasLOKIGPFHHIN()) {
        setLOKIGPFHHIN(other.lOKIGPFHHIN);
      }
      if (other.hasKPJNNFIINNB()) {
        setKPJNNFIINNB(other.kPJNNFIINNB);
      }
      return this;
    }

    @Override
    public RogueUpdate clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      areaId = 0;
      lOKIGPFHHIN = 0;
      kPJNNFIINNB = 0;
      return this;
    }

    @Override
    public RogueUpdate clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueUpdate)) {
        return false;
      }
      RogueUpdate other = (RogueUpdate) o;
      return bitField0_ == other.bitField0_
        && (!hasAreaId() || areaId == other.areaId)
        && (!hasLOKIGPFHHIN() || lOKIGPFHHIN == other.lOKIGPFHHIN)
        && (!hasKPJNNFIINNB() || kPJNNFIINNB == other.kPJNNFIINNB);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(lOKIGPFHHIN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(kPJNNFIINNB);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(lOKIGPFHHIN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(kPJNNFIINNB);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueUpdate mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // areaId
            areaId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // lOKIGPFHHIN
            lOKIGPFHHIN = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // kPJNNFIINNB
            kPJNNFIINNB = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
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
        output.writeUInt32(FieldNames.areaId, areaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.lOKIGPFHHIN, lOKIGPFHHIN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.kPJNNFIINNB, kPJNNFIINNB);
      }
      output.endObject();
    }

    @Override
    public RogueUpdate mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1409553784:
          case -746472947: {
            if (input.isAtField(FieldNames.areaId)) {
              if (!input.trySkipNullValue()) {
                areaId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -567563551: {
            if (input.isAtField(FieldNames.lOKIGPFHHIN)) {
              if (!input.trySkipNullValue()) {
                lOKIGPFHHIN = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 303551777: {
            if (input.isAtField(FieldNames.kPJNNFIINNB)) {
              if (!input.trySkipNullValue()) {
                kPJNNFIINNB = input.readUInt32();
                bitField0_ |= 0x00000004;
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
    public RogueUpdate clone() {
      return new RogueUpdate().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueUpdate parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueUpdate(), data).checkInitialized();
    }

    public static RogueUpdate parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueUpdate(), input).checkInitialized();
    }

    public static RogueUpdate parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueUpdate(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueUpdate messages
     */
    public static MessageFactory<RogueUpdate> getFactory() {
      return RogueUpdateFactory.INSTANCE;
    }

    private enum RogueUpdateFactory implements MessageFactory<RogueUpdate> {
      INSTANCE;

      @Override
      public RogueUpdate create() {
        return RogueUpdate.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName areaId = FieldName.forField("areaId", "area_id");

      static final FieldName lOKIGPFHHIN = FieldName.forField("LOKIGPFHHIN");

      static final FieldName kPJNNFIINNB = FieldName.forField("KPJNNFIINNB");
    }
  }
}
